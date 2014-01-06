/*****************************************
 *   Library is under GPL License (GPL)
 *   Copyright (c) 2014 Thorsten Niehues
 ****************************************/
/**
 * @class htwg.spray.CommandHelper
 * Spray Connection Factory
 *
 * @author Thorsten Niehues
 */

var htwg = htwg || {};
htwg.spray = htwg.spray || {};

htwg.spray.CommandHelper = function($){

    /**
     * Scope duplicator / parent this
     *
     * @var
     * @access private
     * @type object
     */
    var that = this;

    this.makeAndExecuteShapeCommandAdd = function(shapeType, shapeX, shapeY, canvas){
        var figure = htwg.spray.shapeFactory.drawShape(shapeType);
        figure.setPosition(shapeX,shapeY);

        // create a command for the undo/redo support
        var command = new draw2d.command.CommandAdd(canvas, figure, shapeX, shapeY);
        canvas.getCommandStack().execute(command);

        if ( htwg.spray.utils.notifyEcore ){
            htwg.spray.websocketEcore.send({"type":"ecore", "command":"createObj", "domainObj":shapeType});
        }
    }
}