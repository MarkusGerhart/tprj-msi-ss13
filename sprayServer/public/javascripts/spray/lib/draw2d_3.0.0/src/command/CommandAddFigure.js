/*****************************************
 *   Library is under GPL License (GPL)
 *   Copyright (c) 2014 Thorsten Niehues
 ****************************************/
/**
 * @class draw2d.command.CommandAddFigure
 *
 * Command to add a figure with CommandStack support.
 *
 * @extends draw2d.command.Command
 */
draw2d.command.CommandAddFigure = draw2d.command.Command.extend({

    /**
     * @constructor
     * Create a add command for the given figure.
     *
     * @param {draw2d.Canvas} canvas the canvas to use
     * @param {draw2d.Figure} figure the figure to add
     */
    init: function(parent, figure, locator, oldParent, oldLocator)
    {
        this._super("Add Figure");
        this.figure = figure;
        this.parent = parent;
        //this.x = x;
        //this.y = y;
        this.locator = locator;
        console.log("figure.getCanvas(): " + figure.getCanvas());
        this.oldCanvas = figure.getCanvas();
        this.oldParent = oldParent;
        console.log("oldParent: " + oldParent);
        this.oldLocator = oldLocator;
    },

    /**
     * @method
     * Execute the command the first time
     *
     **/
    execute:function()
    {
        this.parent.addFigure(this.figure, this.locator);
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
        if (this.oldParent != null) {
            console.log("add figure to old parent");
            this.oldParent.addFigure(this.figure, this.oldLocator);
        } else if (this.oldCanvas != null) {
            console.log("add figure to old canvas");
            this.oldCanvas.addFigure(this.figure);
            this.parent.removeChild(this.figure);
        }
        //this.canvas.removeFigure(this.figure);
        //this.parent.removeChild(this.figure);
    }

});