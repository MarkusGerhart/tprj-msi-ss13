draw2d.layout.locator.CustomPortLocator = draw2d.layout.locator.PortLocator.extend({
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
            //tmpX = this.portX + parent.getWidth() - this.initWidth;
            var percentX = this.portX / this.initWidth;
            tmpX = parent.getWidth() * percentX;
        }

        var tmpY = this.portY;
        if (this.scaleY === true) {
            percentY = this.portY / this.initHeight;
            //console.log("percentY: " + percentY);
            tmpY = parent.getHeight() * percentY;
            //console.log("tmpY: " + tmpY);
        }

        this.applyConsiderRotation(port, tmpX, tmpY);
    }
})