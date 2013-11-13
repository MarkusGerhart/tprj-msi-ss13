draw2d.layout.locator.CustomPortLocator = draw2d.layout.locator.PortLocator.extend({
    init:function( ){
      this._super();
    },

    setPortY:function(_portY) {
        this.portY = _portY;
    },

    relocate:function(index, port){
        var parent = port.getParent();
        //var calcY = (8+18.5*index)*parent.scaleY;
        var calcY = 10;
        //this.applyConsiderRotation(port, 1, calcY);
        this.applyConsiderRotation(port, 1, this.portY);
    }
})