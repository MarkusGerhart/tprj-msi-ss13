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
spray2d.layout = spray2d.layout || {};
spray2d.layout.locator = spray2d.layout.locator || {};

spray2d.layout.locator.CustomPortLocator = draw2d.layout.locator.PortLocator.extend({
    init:function(portX, portY){
        this.portX = portX;
        this.portY = portY;
        this._super();
    },

    setScalable:function(parent) {
        this.initWidth = parent.getWidth();
        this.initHeight = parent.getHeight();
        this.scaleY = true;
    },

    relocate:function(index, port){
        var parent = port.getParent();

        var tmpX = this.portX;
        if (tmpX != 0 && typeof this.initWidth !== "undefined") {
            var percentX = this.portX / this.initWidth;
            tmpX = parent.getWidth() * percentX;
        }

        var tmpY = this.portY;
        if (this.scaleY === true) {
            percentY = this.portY / this.initHeight;
            tmpY = parent.getHeight() * percentY;
        }

        this.applyConsiderRotation(port, tmpX, tmpY);
    }
})