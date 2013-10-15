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
        var node=null;
        var that=this;
        $.each(json, function(i, element){
            var o = that.unmarshalElement(canvas, element);
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
    },

    test:function() {
        console.log("test");
    },


    unmarshalElement : function(canvas, element) {
        var o = eval("new "+element.type+"()");
		var source= null;
		var target = null;
        var that = this;
        o.setPersistentAttributes(element);

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
				that.setChildren(canvas, o, val);
			}
		}
		if(source!==null && target!==null){
			o.setSource(source);
			o.setTarget(target);
		}
		// o.setPersistentAttributes(element);
		return o;
	},

	setChildren : function(canvas, parent, childs) {
        var that = this;
        $.each(childs, function(i, element){
            //var label = new draw2d.shape.basic.Label(e.label);
            var child = that.unmarshalElement(canvas, element);
            var locator =  eval("new "+element.locator+"()");
            locator.setParent(parent);
            locator.setPos(parent, child.x, child.y);
            parent.addFigure(child, locator);
        });
    }
});
