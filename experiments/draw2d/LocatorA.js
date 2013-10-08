/*****************************************
 *   Library is under GPL License (GPL)
 *   Copyright (c) 2012 Andreas Herz
 ****************************************//**
 * @class draw2d.layout.locator.LocatorA
 * 
 * Controls the location of an IFigure. 
 *
 * @author Andreas Herz
 */
draw2d.layout.locator.LocatorA= draw2d.layout.locator.Locator.extend({
    NAME : "draw2d.layout.locator.LocatorA",

    setPos:function(parent, x, y) {
        console.log("x:" + x);
        this.x = x - parent.getX();
        this.y = y - parent.getY();
    },

    init: function(parent) {
        this._super(parent);
    },

    relocate: function(index, target) {
        console.log("x:" + this.x);
        target.setPosition(this.x, this.y);
    }
});