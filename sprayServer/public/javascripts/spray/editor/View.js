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

        this.installEditPolicy(new spray2d.policy.canvas.CompartmentSelectionPolicy());
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
        var figure = htwg.spray.shapeFactory.drawShape(type);

        figure.setPosition(x,y);
        this.addFigure(figure);

        // create a command for the undo/redo support
        var command = new draw2d.command.CommandAdd(this, figure, x, y);
        this.getCommandStack().execute(command);

        if ( htwg.spray.utils.notifyEcore ){
            htwg.spray.websocketEcore.send({"type":"ecore", "command":"createObj", "domainObj":type});
        }
    }
});
