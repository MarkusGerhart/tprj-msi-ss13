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

    /**
     * @constructor
     * Create a add command for the given figure.
     *
     * @param {draw2d.Canvas} canvas the canvas to use
     * @param {draw2d.Figure} figure the figure to add
     */
    init: function(parent, figure)
    {
        this._super("Add Figure");
        this.figure = figure;
        this.parent = parent;
        //this.x = x;
        //this.y = y;
        /*this.locator = locator;
        console.log("figure.getCanvas(): " + figure.getCanvas());
        this.oldCanvas = figure.getCanvas();
        this.oldParent = oldParent;
        console.log("oldParent: " + oldParent);
        this.oldLocator = oldLocator;*/
    },

    /**
     * @method
     * Execute the command the first time
     *
     **/
    execute:function()
    {
        this.parent.addFigure(this.figure, new spray2d.layout.locator.FigureLocator());
        this.figure.setDraggable(true);

        console.log("add " + this.figure.NAME + " to " + this.NAME);
        console.log("add " + this.figure['sprayName'] + " to " + this['sprayName']);
        console.log("allowed childs: " + this.allowedCompartmentChilds);

        var p = this.parent;
        var f = this.figure;
        this.figure.children.each(function(i,e){
            if (typeof(e.figure.NAME) != "undefined") {
                console.log("e.figure.Name : " + e.figure.NAME);

                p.addFigure(e.figure, new spray2d.layout.locator.FigureLocator());
                e.figure.setDraggable(true);
                e.figure['sprayName'] = f['sprayName'];
                e.figure['groupId'] = f.id;
                console.log("groupId: " + e.figure['groupId']);
            } else {
                console.log("e.figure.NAME is undefined");
                console.log("e : " + e);
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
        htwg.spray.commandHelper.makeAndExecuteShapeCommandAdd(this.figure['sprayName'], 10, 10, htwg.spray.view);

        var f = this.figure;
        f.getParent().children.each(function(i,e){
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

});