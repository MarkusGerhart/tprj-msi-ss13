/*****************************************
 *   Library is under GPL License (GPL)
 *   Copyright (c) 2013 Simon Schneeberger
 ****************************************/
/**
 * @class htwg.spray.View
 * View
 *
 * @author Simon Schneeberger
 */

var htwg = htwg || {};
htwg.spray = htwg.spray || {};

htwg.spray.View = draw2d.Canvas.extend({


    init:function(id){
        this._super(id);

        this.setScrollArea("#"+id);

        this.currentDropConnection = null;

        this.model = [];
        this.labels = [];
    },

    /**
     * @method
     * Called if the DragDrop object is moving around.<br>
     * <br>
     * Graphiti use the jQuery draggable/droppable lib. Please inspect
     * http://jqueryui.com/demos/droppable/ for further information.
     *
     * @param {HTMLElement} droppedDomNode The dragged DOM element.
     * @param {Number} x the x coordinate of the drag
     * @param {Number} y the y coordinate of the drag
     *
     * @template
     **/
    onDrag:function(droppedDomNode, x, y )
    {
    },

    /**
     * @method
     * Called if the user drop the droppedDomNode onto the canvas.<br>
     * <br>
     * Graphiti use the jQuery draggable/droppable lib. Please inspect
     * http://jqueryui.com/demos/droppable/ for further information.
     *
     * @param {HTMLElement} droppedDomNode The dropped DOM element.
     * @param {Number} x the x coordinate of the drop
     * @param {Number} y the y coordinate of the drop
     * @private
     **/
    onDrop : function(droppedDomNode, x, y)
    {
        var type = $(droppedDomNode).attr('lang')
        var figure = htwg.spray.shapeFactory.drawShape(type);

		// TODO Thorsten : set appropriate allowed connections
		figure.setConnectTo(new Array("PI_Pipe", "PI_Source_Exhaust_Start","PI_Source_Exhaust_End"));
		figure.setConnectFrom(new Array("PI_Pipe","PI_Source_Exhaust_Start","PI_Source_Exhaust_End"));
		console.log("figure " + figure.NAME + " connectTo " + figure.getConnectTo());

        figure.setPosition(x,y);
        this.addFigure(figure);

        // create a command for the undo/redo support
        var command = new draw2d.command.CommandAdd(this, figure, x, y);
        this.getCommandStack().execute(command);
    },


    //alle parent shapes holen und in folgende struktur bringen:
    /*

    var model = {
      entities: [
        {  name: "PI_Vessel_Vertical",
           id: 1,
           params: { x: 50,
                     y: 300,
                     width: 50,
                     height: 100
                   },
           labels: [
               {
                  id: xy,
                  text: "default"
               },
               {
                  id: 34,
                  text: "hallo"
               }
           ]
        },
        {
           name: "PI_Vessel_Horizontal",
           id: 2,
           params: { x: 250,
                     y: 100,
                     width: 100,
                     height: 50
                   }
        }
      ],
       connections: [
         {  name: "PI_Source_Exhaust",
            from: { id: 1,
                    anchor: 0},
            to: { id: 2,
                  anchor: 1}
        },
        };
    */
    getModel: function(){

        var that = this;
        this.model = { "entities":[],
                       "connections":[]};

        $.each(this.figures.data,function(i,figure){

            if ( typeof figure == "object" ){
                var userData = figure.getUserData();

                var params = { "x": figure.getX(),
                               "y": figure.getY(),
                               "width": figure.getWidth(),
                               "height": figure.getHeight()};

                that.getAllLabels( figure );
                var entity = {"name":userData.name,
                              "id": figure.getId(),
                              "params":params};

                if ( that.labels.length > 0 ){
                    entity["labels"] = that.labels;
                }

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

        console.log(JSON.stringify(this.model));
    },

    getConnectionAsJSON: function(conn, figure){
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

                    /*TODO: name should be the connection name (e.g. PI_Source_Exhaust) from Spray Model
                            The type manhattan or freeform should then be set in the factory! */
                    connections["name"] = "Manhattan";
                    connections["id"] = conn.getId();
                    connections["from"] = {"id":sourceParentObj.getId(),
                        "anchor":sourceAnchorID};
                    connections["to"] = {"id":targetParentObj.getId(),
                        "anchor":targetAnchorID};

                    this.model.connections.push(connections);
                }
            }
        }
    },

    setModel: function(){
        this.clear();
        var entities = this.model.entities;
        var connections = this.model.connections;
        var that = this;

        $.each(entities,function(i,entity){

            var figure = htwg.spray.factory.drawShape(entity.name);
            figure.setPosition(entity.params.x,entity.params.y);
            figure.setDimension(entity.params.width, entity.params.height);
            figure.setId(entity.id);

            if ( entity.hasOwnProperty("labels") && entity.labels.length > 0 ){
                that.labels = $.extend(true, [], entity.labels);
                that.setAllLabels(figure);
            }
            that.addFigure(figure);

        });

        $.each(connections, function(i,conn){
            /*TODO: name should be the connection name (e.g. PI_Source_Exhaust) from Spray Model
                    The type manhattan or freeform should then be set in the factory! */
            var c = new draw2d.Connection();
            c.setRouter(new draw2d.layout.connection.ManhattanConnectionRouter());

            var sourceFigure = that.getFigure(conn.from.id);
            var targetFigure = that.getFigure(conn.to.id);
            c.setSource(sourceFigure.getHybridPort(conn.from.anchor));
            c.setTarget(targetFigure.getHybridPort(conn.to.anchor));
            c.setId(conn.id);
            that.addFigure(c);
        });
    },

    getAllLabels: function(figure){

        var that = this;

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

    setAllLabels: function(figure){

        var that = this;

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
    }

});
