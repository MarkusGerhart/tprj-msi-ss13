
spray = {};

spray.UmlClassLabled = draw2d.SVGFigure.extend({

    NAME:"spray.UmlClassLabled",
    
    MyPortLocator1 : draw2d.layout.locator.PortLocator.extend({
        init:function() {
          this._super();
        },    
        relocate:function(index, port) {
            var w = port.getParent().getWidth();
            var h = port.getParent().getHeight();
            if (index == 1) {
                this.applyConsiderRotation(port,w/2, 0);
            } else {
                this.applyConsiderRotation(port,w/2, h);
            }
        }
    }),

    MyPortLocator2 : draw2d.layout.locator.PortLocator.extend({
        init:function() {
          this._super();
        },    
        relocate:function(index, port) {
            var w = port.getParent().getWidth();
            var h = port.getParent().getHeight();
            if (index == 1) {
                this.applyConsiderRotation(port,0, h/2);
            } else {
                this.applyConsiderRotation(port,w, h/2);
            }
        }
    }),

    MyPortLocator3 : draw2d.layout.locator.PortLocator.extend({
        init:function() {
          this._super();
        },    
        relocate:function(index, port) {
            var w = port.getParent().getWidth();
            var h = port.getParent().getHeight();
            this.applyConsiderRotation(port,0, 0);
        }
    }),

    LabelLocator: draw2d.layout.locator.Locator.extend({
        init: function(parent) {
            this._super(parent);
        },
        relocate: function(index, target) {
            target.setPosition(2,2);
        }
    }),

    /**
     * @constructor
     * Create a new instance
     */
    init:function(width, height){
        if(typeof width === "undefined"){
            width = 50;
            height= 50;
        }
        
        this._super(width,height);
        this.inputLocator = new this.MyPortLocator1();
        this.portLocator2 = new this.MyPortLocator2();
        this.portLocator3 = new this.MyPortLocator3(); 
        this.createPort("input", this.inputLocator);
        this.createPort("input", this.inputLocator);
        this.createPort("output", this.portLocator2);
        this.createPort("output", this.portLocator2);
        this.createPort("hybrid", this.portLocator3);
        this.createPort("hybrid", this.portLocator3);
        this.setBackgroundColor("#f0f0ff");

        console.log(this.getPorts());

        this.labelClass();
    },

    labelClass:function() {
      this.label = new draw2d.shape.basic.Label("I'm a Label");
      this.label.setColor("#0d0d0d");
      this.label.setFontColor("#0d0d0d");
      
      // add the new decoration to the connection with a position locator.
      //
      this.addFigure(this.label, new this.LabelLocator(this));
      
      this.label.installEditor(new draw2d.ui.LabelInplaceEditor());
    },

    getSVG: function(){
         return '<svg xmlns="http://www.w3.org/2000/svg" version="1.1">'+
                  '<path d="M0 0 L200 0 L200 100 L0 100 L0 0" stroke="#1B1B1B" fill="none"/>' +
                  '<line x1="0"  y1="50" x2="200"  y2="50" stroke="#010101" />'+
                '</svg>';
    },
    
    /**
     * @method
     * propagate all attributes like color, stroke,... to the shape element
     **/
     repaint : function(attributes)
     {
         if (this.repaintBlocked===true || this.shape === null){
             return;
         }

         if(typeof attributes === "undefined" ){
             attributes = {};
         }

         // redirect the backgroundColor to an internal SVG node.
         // In this case only a small part of the shape are filled with the background color
         // and not the complete rectangle/bounding box
         //
         attributes["fill"] = "none";
         if( this.bgColor!=null){
             this.svgNodes[0].attr({fill: this.bgColor.hash()});
         }
         
         this._super(attributes);
     }

});