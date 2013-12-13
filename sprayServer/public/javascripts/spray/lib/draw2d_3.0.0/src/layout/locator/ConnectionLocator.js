/*****************************************
 *   Library is under GPL License (GPL)
 *   Copyright (c) 2012 Andreas Herz
 ****************************************//**
 * @class draw2d.layout.locator.ConnectionLocator
 * 
 * Repositions a Figure attached to a Connection when the 
 * Connection is moved. Provides for alignment at the start 
 * (source), middle, or end (target) of the Connection.
 *
 * @author Andreas Herz
 * @extend draw2d.layout.locator.Locator
 */
draw2d.layout.locator.ConnectionLocator= draw2d.layout.locator.Locator.extend({
    NAME : "draw2d.layout.locator.ConnectionLocator",

    x : 0,
    y : 0,

    /**
     * @constructor
     * Default constructor for a Locator which can layout a figure in context of a 
     * {@link grapiti.Connector}
     * 
     * @param {draw2d.Figure} parentShape the base or parent figure for the locator
     */
    init:function( parentShape)
    {
      this._super(parentShape);
    },

    setPos:function(parent, x, y) {
        //console.log(this.NAME + " total x:" + x);
        //console.log(this.NAME + " total y:" + y);
        this.x = x - parent.getX();
        this.y = y - parent.getY();
        //console.log(this.NAME + " relativ x:" + this.x);
        //console.log(this.NAME + " relativ y:" + this.y);
    },

    /**
     * @method
     * Relocates the given Figure.
     *
     * @param {Number} index child index of the target
     * @param {draw2d.Figure} target The figure to relocate
     **/
    relocate:function(index, target)
    {
        var userData = target.getUserData();

        if ( userData != null ){
            if ( userData.hasOwnProperty('type')){
                switch ( userData.type ){
                    case "Label":
                        var startX = target.parent.getStartPoint().x;
                        var startY = target.parent.getStartPoint().y;

                        var endX = target.parent.getEndPoint().x;
                        var endY = target.parent.getEndPoint().y;

                        var diffX = endX - startX;
                        var diffY = endY - startY;

                        var newPosX = diffX * userData.offset;
                        var newPosY = diffY * userData.offset;

                        target.setPosition(startX + newPosX, startY + newPosY);
                        break;
                    case "Rectangle":
                        var startX = target.parent.getStartPoint().x;
                        var startY = target.parent.getStartPoint().y;

                        var endX = target.parent.getEndPoint().x;
                        var endY = target.parent.getEndPoint().y;

                        var diffX = endX - startX;
                        var diffY = endY - startY;

                        var newPosX = diffX * userData.offset;
                        var newPosY = diffY * userData.offset;

                        target.setPosition(startX + newPosX, startY + newPosY);
                        break;
                    case "Ellipse":
                        var startX = target.parent.getStartPoint().x;
                        var startY = target.parent.getStartPoint().y;

                        var endX = target.parent.getEndPoint().x;
                        var endY = target.parent.getEndPoint().y;

                        var diffX = endX - startX;
                        var diffY = endY - startY;

                        var newPosX = diffX * userData.offset;
                        var newPosY = diffY * userData.offset;

                        target.setPosition(startX + newPosX, startY + newPosY);
                        break;
                    case "Line":
                        var startX = target.parent.getStartPoint().x;
                        var startY = target.parent.getStartPoint().y;

                        var endX = target.parent.getEndPoint().x;
                        var endY = target.parent.getEndPoint().y;

                        var diffX = endX - startX;
                        var diffY = endY - startY;

                        var newPosX = diffX * userData.offset;
                        var newPosY = diffY * userData.offset;

                        target.setStartPoint(startX + newPosX + target.getAbsoluteStartPoint().x,startY + newPosY + target.getAbsoluteStartPoint().y);
                        target.setEndPoint(startX + newPosX + target.getAbsoluteEndPoint().x,startY + newPosY + target.getAbsoluteEndPoint().y);
                        break;
                    default: target.setPosition(target.getPosition().x,target.getPosition().y);
                }
            }
        }
        else{
            target.setPosition(target.getPosition().x,target.getPosition().y);
            target.repaint();
        }
    }
    
});