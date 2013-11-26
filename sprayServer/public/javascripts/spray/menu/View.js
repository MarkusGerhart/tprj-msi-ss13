var htwg = htwg || {};
htwg.spray = htwg.spray || {};

// class: View

htwg.spray.View = draw2d.Canvas.extend({


    init:function(id){
        this._super(id);

        this.setScrollArea("#"+id);

        this.currentDropConnection = null;

        this.model = [];
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
                     height: 100,
                     label: "default"
                   }
        },
        {
           name: "PI_Vessel_Horizontal",
           id: 2,
           params: { x: 250,
                     y: 100,
                     width: 100,
                     height: 50,
                     label: "default",
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

        console.log(this.figures.data);

        $.each(this.figures.data,function(i,figure){

            if ( typeof figure == "object" ){
                var userData = figure.getUserData();

                //TODO: recursive labeling..
                var params = { "x": figure.getX(),
                               "y": figure.getY(),
                               "width": figure.getWidth(),
                               "height": figure.getHeight()};

                that.model.entities.push({"name":userData.name,
                                     "id": figure.getId(),
                                     "params":params});
            }
        });
    },

    setModel: function(){
        this.clear();
        var entities = this.model.entities;
        var that = this;

        console.log(entities);

        $.each(entities,function(i,entity){

            var figure = htwg.spray.factory.drawShape(entity.name);
            figure.setPosition(entity.params.x,entity.params.y);
            figure.setDimension(entity.params.width, entity.params.height);
            that.addFigure(figure);

        });
    }
});
