draw2d.io.json.OurJsonReader = draw2d.io.Reader.extend({
    
    init: function(){
        this._super();
    },
    
    
    /**
     * @method
     * 
     * Restore the canvas from a given JSON object.
     * 
     * @param {draw2d.Canvas} canvas the canvas to restore
     * @param {Object} document the json object to load.
     */
    unmarshal: function(canvas, json){
        /*var node=null;
        $.each(json, function(i, element){
            var o = this.unmarshalElement(canvas, element);
            canvas.addFigure(o);
        });*/

        if (canvas == null) return;

        var node=null;
        $.each(json, function(i, element){
            //draw2d.io.json.OurJsonReader.unmarshalElement(canvas, element);
            //this.test();
            //this.unmarshal(null, null);

            var o = eval("new "+element.type+"()");
            var source= null;
            var target=null;
            for(i in element){
                var val = element[i];
                if(i === "source"){
                    node = canvas.getFigure(val.node);
                    source = node.getPort(val.port);
                }
                else if (i === "target"){
                    node = canvas.getFigure(val.node);
                    target = node.getPort(val.port);
                }
            }
            if(source!==null && target!==null){
                o.setSource(source);
                o.setTarget(target);
            }
            o.setPersistentAttributes(element);
            canvas.addFigure(o);
        });
        
        // recalculate all crossings and repaint the connections with 
        // possible crossing decoration
        canvas.calculateConnectionIntersection();
        canvas.getLines().each(function(i,line){
            line.svgPathString=null;
            line.repaint();
        });
        canvas.linesToRepaintAfterDragDrop = canvas.getLines().clone();

        this.test();
        this.unmarshalElement(canvas, null);
    },

    test:function() {
        console.log("test");
    },


    unmarshalElement : function(canvas, element) {
        console.log("unmarshalElement");

		/*var o = eval("new "+element.type+"()");
		var source= null;
		var target=null;
		for(i in element){
			var val = element[i];
			if(i === "source"){
				node = canvas.getFigure(val.node);
				source = node.getPort(val.port);
			}
			else if (i === "target"){
				node = canvas.getFigure(val.node);
				target = node.getPort(val.port);
			}
			else if (i === "children") {
				setChildren(canvas, o, val);
			}
		}
		if(source!==null && target!==null){
			o.setSource(source);
			o.setTarget(target);
		}
		o.setPersistentAttributes(element);
		return o;*/
	},

	setChilden : function(canvas, parent, childs) {
        // and restore all children of the JSON document instead.
        //
        $.each(childs.children, $.proxy(function(i,e){
            /*//var label = new draw2d.shape.basic.Label(e.label);
			var label = draw2d.shape.basic.Rectangle();
            //var locator =  eval("new "+e.locator+"()");
			*/
			
			var locator = draw2d.layout.locator.LocatorA();
			var obj = unmarshalElement(canvas, e);
            locator.setParent(parent);
            parent.addFigure(obj, locator);
        },parent));
    }
});
