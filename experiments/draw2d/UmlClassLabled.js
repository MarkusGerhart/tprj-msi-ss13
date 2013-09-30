
spray = {};

spray.UmlClassLabled = draw2d.SVGFigure.extend({

    NAME:"spray.UmlClassLabled",
    
	MyClassNameHolder : draw2d.shape.basic.Rectangle.extend({
		onDoubleClick:function() {
			//this.classLabel.onDoubleClick();
		}
	}),
	
    MyPortLocator1 : draw2d.layout.locator.PortLocator.extend({
        init:function() {
          this._super();
        },    
        relocate:function(index, port) {
            var w = port.getParent().getWidth();
            var h = port.getParent().getHeight();
			
            if (index == 1) {
                this.applyConsiderRotation(port,w/2, -50);
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
			
			if (index % 2 == 1) {
                this.applyConsiderRotation(port,0, h/2);
            } else {
                this.applyConsiderRotation(port,w, h/2);
            }
        }
    }),

    
	
	LabelLocator: draw2d.layout.locator.Locator.extend({
        init: function(parent) {
            this._super(parent);
        },
        relocate: function(index, target) {
            target.setPosition(2,-35);
        }
    }),

	LabelLocatorAttributes: draw2d.layout.locator.Locator.extend({
        init: function(parent) {
            this._super(parent);
        },
        relocate: function(index, target) {
            target.setPosition(2, 40);
        }
    }),
	
	LabelLocatorMethods: draw2d.layout.locator.Locator.extend({
        init: function(parent) {
            this._super(parent);
        },
        relocate: function(index, target) {
            target.setPosition(2, this.getParent().getHeight()-30);
        }
    }),
	
	RectLocator: draw2d.layout.locator.Locator.extend({
        init: function(parent) {
            this._super(parent);
        },
        relocate: function(index, target) {
            target.setPosition(0, -50);
			target.setDimension(this.getParent().getWidth(), 50);
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
        
		this.createPort("hybrid", new this.MyPortLocator1());
        this.createPort("hybrid", new this.MyPortLocator1());
        this.createPort("hybrid", new this.MyPortLocator2());
        this.createPort("hybrid", new this.MyPortLocator2());
        
		this.setBackgroundColor("#f0f0ff");

        console.log(this.getPorts());

		//this.line();
        
		this.labelAttributes();
		this.labelMethods();
		
		
		this.rectangle();
		this.labelClass();
    },
	
	line:function() {
		var line1 =  new draw2d.shape.basic.Line();
		line1.setStartPoint(50,50);
		line1.setEndPoint(150,50);

		this.addFigure(line1, new this.LabelLocator(this));
	},

    labelClass:function() {
      this.label = new draw2d.shape.basic.Label("<enter class name>");
      this.label.setColor("#0d0d0d");
      this.label.setFontColor("#0d0d0d");
      
      // add the new decoration to the connection with a position locator.
      //
      this.addFigure(this.label, new this.LabelLocator(this));
      
      //this.label.installEditor(new draw2d.ui.LabelInplaceEditor());
	  this.label.installEditor(new draw2d.ui.LabelInplaceEditor({
		   // called after the value has been set to the LabelFigure
		   onCommit: $.proxy(function(value){
			   //alert("new value set to:"+value);
		   },this),
		   // called if the user abort the operation
		   onCancel: function(){
		   }
		}));
    },
	
	labelAttributes:function() {
      this.label = new draw2d.shape.basic.Label("Attribute");
      this.label.setColor("#0d0d0d");
      this.label.setFontColor("#0d0d0d");
      
      // add the new decoration to the connection with a position locator.
      //
      this.addFigure(this.label, new this.LabelLocatorAttributes(this));
      
      this.label.installEditor(new draw2d.ui.LabelInplaceEditor());
    },
	
	labelMethods:function() {
      this.label = new draw2d.shape.basic.Label("Method");
      this.label.setColor("#0d0d0d");
      this.label.setFontColor("#0d0d0d");
      
      // add the new decoration to the connection with a position locator.
      //
      this.addFigure(this.label, new this.LabelLocatorMethods(this));
      
      this.label.installEditor(new draw2d.ui.LabelInplaceEditor());
    },
	
	rectangle:function() {
		this.rect = new this.MyClassNameHolder();
		this.rect.setDimension(50, 50);
		this.rect.setBackgroundColor("#f0f0ff");
		this.addFigure(this.rect, new this.RectLocator(this));
	},

    getSVG: function(){
         return '<svg xmlns="http://www.w3.org/2000/svg" version="1.1">'+
                  '<path d="M0 0 L200 0 L200 100 L0 100 L0 0" stroke="#1B1B1B" fill="none"/>' +
                  //'<line x1="0"  y1="50" x2="200"  y2="50" stroke="#010101" />'+
                '</svg>';
    },
	
	onDoubleClick:function() {},
    
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