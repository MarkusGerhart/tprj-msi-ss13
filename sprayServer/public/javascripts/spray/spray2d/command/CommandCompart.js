/*****************************************
 *   Library is under GPL License (GPL)
 *   Copyright (c) 2013 Thorsten Niehues
 ****************************************/
/**
 * @class spray2d.layout.locator.CustomPortLocator
 *
 * @author Thorsten Niehues
 * @extend draw2d.layout.locator.Locator
 */

var spray2d = spray2d || {};
spray2d.command = spray2d.command || {};

spray2d.command.CommandCompart = draw2d.command.Command.extend({
    NAME : 'spray2d.command.CommandCompart',
    /**
     * @constructor
     * Create a add command for the given figure.
     *
     * @param {draw2d.Canvas} canvas the canvas to use
     * @param {draw2d.Figure} figure the figure to add
     */
    init: function(parent, figure, x, y)
    {
        this._super("Compart Command");
        this.figure = figure;
        this.parent = parent;

        this.x = x;
        this.y = y;
    },

    /**
     * @method
     * Execute the command the first time
     *
     **/
    execute:function()
    {
        var p = this.parent;
        while (p.getParent() != null) { p = p.getParent() }
        var locator = new spray2d.layout.locator.FigureLocator(p);
        locator.setPos(p, this.x, this.y);
        this.parent.addFigure(this.figure, locator);
        this.figure.setDraggable(true);

        console.log("add " + this.figure.NAME + " to " + this.parent.NAME);
        console.log("add " + this.figure['sprayName'] + " to " + this.parent['sprayName']);
        console.log("allowed childs: " + this.parent.allowedCompartmentChilds);

        var p = this.parent;
        var f = this.figure;
        this.figure.children.each(function(i,e){
            if (typeof(e.figure.NAME) != "undefined") {
                p.addFigure(e.figure, new spray2d.layout.locator.FigureLocator());
                e.figure.setDraggable(true);
                e.figure['sprayName'] = f['sprayName'];
                e.figure['groupId'] = f.id;
            }
        });
    },

    /**
     * @method
     * Redo the command after the user has undo this command
     *
     **/
    redo:function()
    {
        this.execute();
    },

    /**
     * @method
     * Undo the command
     *
     **/
    undo:function()
    {
        function removeChildrenFromParent() {
            var f = this.figure;
            f.getParent().children.each(function (i, e) {
                if (typeof(e.figure['groupId']) != "undefined" && f['groupId'] == e.figure['groupId']) {
                    console.log("e.figure.Name : " + e.figure.NAME);
                    console.log("remove child width ID: " + e.figure['groupId']);
                    f.getParent().removeChild(e.figure);
                } else {
                    if (typeof(e.figure['groupId']) == "undefined") {
                        console.log("e.figure['groupId'] is undefined");
                    } else {
                        console.log("e.figure['groupId'] : " + e.figure['groupId'] + " is different");
                    }
                }
            });
            this.figure.getParent().removeChild(this.figure);
        }
        removeChildrenFromParent.call(this);

        function createdRemovedElementsFromFactory() {
            //var fNew = htwg.spray.commandHelper.makeAndExecuteShapeCommandAdd(this.figure['sprayName'], 10, 10, htwg.spray.view);
            var fNew = htwg.spray.shapeFactory.drawShape(this.figure['sprayName']);
            htwg.spray.view.addFigure(fNew);

            // update the commandAdd in order for undo to work
            this.figure.getCommandAdd().updateFigure(fNew);

            this.figure = fNew;
        }
        createdRemovedElementsFromFactory.call(this);

        var myFigure = this.figure;
        function updateFigureInCommandMove() {
            var previousCmd = htwg.spray.view.getCommandStack().getPreviousCommandFromUndoStack();
            if (typeof previousCmd.NAME === 'undefined' || previousCmd.NAME != 'draw2d.command.CommandCollection') {
                console.log("Internal ERROR : unexpected command. Expected 'draw2d.command.CommandCollection'");
                return;
            }
            var oldCmds = previousCmd.getCommands();
            if (oldCmds.getSize() != 1) {
                console.log("WARN : command collection size is not 1");
            }
            var oldCmd = oldCmds.get(0);
            console.log("oldCmd.NAME : " + oldCmd.NAME);
            if (typeof oldCmd.NAME === 'undefined' || oldCmd.NAME != "draw2d.command.CommandMove") {
                console.log("Internal ERROR : unexpected command. Expected 'draw2d.command.CommandMove'");
                return;
            }

            oldCmd.updateFigure(this.figure);
        }
        updateFigureInCommandMove.call(this);

        // undo the move figure (so the compartment goes back to it's old position
        htwg.spray.view.getCommandStack().undo();
    }

});