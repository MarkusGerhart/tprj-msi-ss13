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
        //console.log(this.NAME + " total x:" + x);
        //console.log(this.NAME + " total y:" + y);
        this.x = x - parent.getX();
        this.y = y - parent.getY();
        //console.log(this.NAME + " relativ x:" + this.x);
        //console.log(this.NAME + " relativ y:" + this.y);
    },

    init: function(parent) {
        this._super(parent);
    },

    relocate: function(index, target) {
        //console.log(this.NAME + " x:" + this.x);
        //console.log(this.NAME + " y:" + this.y);
        //console.log(this.NAME + " parent x:" + this.getParent().getX() + " parent y:" + this.getParent().getY());
		//console.log(this.NAME + " x:" + this.x + " y:" + this.y);
        target.setPosition(this.x, this.y);
    }
});
