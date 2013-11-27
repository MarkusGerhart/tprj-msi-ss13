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
        var type = $(droppedDomNode).attr('id')
        var figure = htwg.spray.factory.drawShape(type);
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
            }
        });
    },

    setModel: function(){
        this.clear();
        var entities = this.model.entities;
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

        console.log(this.model);
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
