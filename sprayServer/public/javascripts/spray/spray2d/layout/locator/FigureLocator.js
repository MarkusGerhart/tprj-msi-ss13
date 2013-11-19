/*****************************************
 *   Library is under GPL License (GPL)
 *   Copyright (c) 2013 Simon Schneeberger
 ****************************************/
/**
 * @class spray2d.layout.locator.FigureLocator
 *
 * @author Simon Schneeberger
 * @extend spray2d.layout.locator.Locator
 */

var spray2d = spray2d || {};
spray2d.layout = spray2d.layout || {};
spray2d.layout.locator = spray2d.layout.locator || {};

spray2d.layout.locator.FigureLocator= draw2d.layout.locator.Locator.extend({
    NAME : "spray2d.layout.locator.FigureLocator",

    x : 0,
    y : 0,

    /**
     * @constructor
     * Constructs a locator with associated parent.
     *
     * @param {draw2d.Figure} parent the parent associated with the locator
     */
    init: function(parent)
    {
        this._super(parent);
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
                        var positionX = target.getPosition().x;
                        var positionY = target.getPosition().y;
                        target.setPosition(parseInt(target.parent.getWidth()/target.getPositionRatioToRoot().x),
                                           parseInt(target.parent.getHeight()/target.getPositionRatioToRoot().y));
                        break;
                    case "Rectangle":
                        var positionX = target.getPosition().x;
                        var positionY = target.getPosition().y;
                        target.setPosition(parseInt(target.parent.getWidth()/target.getPositionRatioRoot().x),
                                           parseInt(target.parent.getHeight()/target.getPositionRatioRoot().y));
                        break;
                    case "Ellipse":
                        var positionX = target.getPosition().x;
                        var positionY = target.getPosition().y;
                        target.setPosition(parseInt(target.parent.getWidth()/target.getPositionRatioRoot().x),
                                           parseInt(target.parent.getHeight()/target.getPositionRatioRoot().y));
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
