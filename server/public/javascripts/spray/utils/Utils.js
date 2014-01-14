/*****************************************
 *   Library is under GPL License (GPL)
 *   Copyright (c) 2013 Simon Schneeberger
 ****************************************/
/**
 * @class htwg.spray.Utils
 * Spray Utils
 *
 * @author Simon Schneeberger
 */

var htwg = htwg || {};
htwg.spray = htwg.spray || {};

htwg.spray.Utils = function($){

    /**
     * Scope duplicator / parent this
     *
     * @var
     * @access private
     * @type object
     */
    var that = this;
    this.notifyEcore = true;
    this.canvas = htwg.spray.view;
    this.model = [];
    this.labels = [];
    this.connectionLabels = [];

    this.getModel = function(){

        this.model = { "entities":[],
                       "connections":[]};

        $.each(this.canvas.figures.data,function(i,figure){

            if ( figure != null && typeof figure == "object" ){
                console.log("sprayName: " + figure['sprayName']);

                var userData = figure.getUserData();

                var params = { "x": figure.getX(),
                    "y": figure.getY(),
                    "width": figure.getWidth(),
                    "height": figure.getHeight()};

                that.getAllLabels( figure );
                var entity = {"name":figure.sprayName,
                    "id": figure.getId(),
                    "params":params};

                if ( that.labels.length > 0 ){
                    entity["labels"] = that.labels;
                }

                entity['compartments'] = new Array();
                that.getCompartments(figure, entity['compartments']);

                that.model.entities.push(entity);
                that.labels = [];

                $.each(figure.hybridPorts.data, function(i,port){
                    if ( typeof port == "object" ){
                        var conns = port.getConnections();
                        $.each(conns.data,function(j,conn){
                            that.getConnectionAsJSON(conn, figure);
                        });
                    }
                });
            }
        });

        //console.log(JSON.stringify(this.model));
    },

    // This method is only necessary because the generator does not use set/getPersistentAttributes
    // Thorsten Niehues recommended strongly to use that function but the idea was rejected by Simon Schneeberger
    // The method is very dirty but in case the project is used then the generator should be rewritten anyway
    this.getCompartments = function(figure, compartments) {
        for (var j=0; j<figure.getChildren().getSize(); j++) {
            var child = figure.getChildren().get(j);
            this.getCompartments(child, compartments);

            var element = child.getPersistentAttributes();

            if (typeof child['sprayName'] !== 'undefined' && child['groupId'] !== 'undefined') {
                element['sprayName'] = child['sprayName'];
                element['groupId'] = child['groupId'];
                compartments.push(element);

                //console.log("compartments: " + JSON.stringify(compartments));
            }
        }
    },

    this.getConnectionAsJSON = function(conn, figure){
        if ( typeof conn == "object" ){

            //important to retrieve the real source port
            var sourcePortID = conn.getSource().getId();
            var sourceParentObj = conn.getSource().getParent();
            var sourceAnchorID = -1;

            $.each(sourceParentObj.hybridPorts.data,function(q,sourcePort){
                if ( typeof sourcePort == "object" && sourcePort.getId() == sourcePortID ){
                    sourceAnchorID = q;
                }
            });

            var targetPortID = conn.getTarget().getId();
            var targetParentObj = conn.getTarget().getParent();
            var targetAnchorID = -1;

            $.each(targetParentObj.hybridPorts.data,function(p,targetPort){
                if ( typeof targetPort == "object" && targetPort.getId() == targetPortID ){
                    targetAnchorID = p;
                }
            });

            if ( targetAnchorID > -1 && sourceAnchorID > -1 ){

                var alreadyInserted = false;
                $.each(this.model.connections, function(i,existingConn){
                    if ( typeof existingConn == "object" && existingConn.hasOwnProperty("id") && existingConn.id == conn.getId() ){
                        alreadyInserted = true;
                    }
                });

                if ( !alreadyInserted ){
                    var connections = {};
                    connections["name"] = conn.getUserData().name;
                    connections["id"] = conn.getId();
                    connections["from"] = {"id":sourceParentObj.getId(),
                        "anchor":sourceAnchorID};
                    connections["to"] = {"id":targetParentObj.getId(),
                        "anchor":targetAnchorID};

                    this.getAllLabels( conn );
                    if ( this.labels.length > 0 ){
                        connections["labels"] = this.labels;
                    }

                    this.labels = [];
                    this.model.connections.push(connections);
                }
            }
        }
    },

    this.setModel = function(){
        this.canvas.clear();
        this.notifyEcore = false;
        var entities = this.model.entities;
        var connections = this.model.connections;
        var oldSelectedConn = $("#selectedConnection").val();

        $.each(entities,function(i,entity){
            console.log("add figure to model");

            var figure = htwg.spray.shapeFactory.drawShape(entity.name);
            figure.setPosition(entity.params.x,entity.params.y);
            figure.setDimension(entity.params.width, entity.params.height);
            figure.setId(entity.id);

            that.canvas.addFigure(figure);

            if ( entity.hasOwnProperty("labels") && entity.labels.length > 0 ){
                that.labels = $.extend(true, [], entity.labels);
                that.setAllLabels(figure);
                that.labels = [];
            }
        });

        $.each(connections, function(i,conn){
            $("#selectedConnection").val(conn.name);
            var c = new draw2d.Connection(draw2d.Connection.DEFAULT_ROUTER);
            var sourceFigure = that.canvas.getFigure(conn.from.id);
            var targetFigure = that.canvas.getFigure(conn.to.id);
            c.setSource(sourceFigure.getHybridPort(conn.from.anchor));
            c.setTarget(targetFigure.getHybridPort(conn.to.anchor));
            c.setId(conn.id);
            that.canvas.addFigure(c);

            if ( conn.hasOwnProperty("labels") && conn.labels.length > 0 ){
                that.labels = $.extend(true, [], conn.labels);
                that.setAllLabels(c);
                that.labels = [];
            }
        });

        $("#selectedConnection").val(oldSelectedConn);

        /* Add the compartments.
         * This is very dirty but when the generator is rewritten then this method is not needed any more
         * (rewrite the generator to read pure JSON and use setPersistentAttributes like in the JSON examples of draw2d)
         * as strongly recommended by Thorsten Niehues
         */
        $.each(entities,function(i,entity){
            var figure = that.canvas.getFigure(entity.id);
            for (var j=0; j<entity['compartments'].length; j++) {
                var child = entity['compartments'][j];
                if (child['type'] == 'spray2d.shape.basic.BoundingBox') continue;
                var o = eval("new " + child['type'] + "()");
                o.setPersistentAttributes(child);
                o.setBackgroundColor("#ffffff");
                figure.addFigure(o, new spray2d.layout.locator.FigureLocator());
                o.setDraggable(true);
            }
        });

        this.notifyEcore = true;
    },

    this.getAllLabels = function(figure){

        $.each(figure.getChildren().data, function(i,child){
            if ( typeof child == "object" ){
                if ( child.hasOwnProperty("figure")){
                    child = child.figure;
                }
                var userData = child.getUserData();
                if ( userData != null && userData.hasOwnProperty("type") && userData.type == "Label" ){
                    that.labels.push({"id":child.getId(),
                        "text":child.getText()});
                }
                else if ( child.getChildren().data.length > 0 ) {
                    that.getAllLabels(child)
                }
            }
        });
    },

    this.setAllLabels = function(figure){

        $.each(figure.getChildren().data, function(i,child){
            if ( typeof child == "object" ){
                if ( child.hasOwnProperty("figure")){
                    child = child.figure;
                }
                var userData = child.getUserData();
                if ( userData != null && userData.hasOwnProperty("type") && userData.type == "Label" ){
                    var label = that.labels.shift();
                    child.setText(label.text);
                }
                else if ( child.getChildren().data.length > 0 ) {
                    that.setAllLabels(child)
                }
            }
        });
    },

    this.getIndexFromID = function(id){
        var result = -1;
        //intense calculations, caching would not be a good solution because if a element is removed
        //you have to re-index cached index
        $.each(this.canvas.figures.data, function(i,figure){
            if ( figure && figure.getId() == id ){
                result =  i;
                return;
            }
        });
        return result;
    }

    this.getIndexFromParentID = function(id, parent){
        var result = -1;
        $.each(parent.getChildren(), function(i,figure){
            if ( figure.getId() == id ){
                result =  i;
                return;
            }
        });
        return result;
    }
}