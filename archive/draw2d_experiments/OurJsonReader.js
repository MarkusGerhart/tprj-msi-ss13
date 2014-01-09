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
        this.draw2dObjects = new Array();
        $.each(json, function(i, element){
            var o = that.unmarshalElement(canvas, element);
            canvas.addFigure(o);
            that.draw2dObjects[i] = o;
        });
        
        // recalculate all crossings and repaint the connections with 
        // possible crossing decoration
        canvas.calculateConnectionIntersection();
        canvas.getLines().each(function(i,line){
            line.svgPathString=null;
            line.repaint();
        });
        canvas.linesToRepaintAfterDragDrop = canvas.getLines().clone();

        return this.draw2dObjects;
    },

    test:function() {
        console.log("test");
    },


    unmarshalElement : function(canvas, element) {
        var o = eval("new "+element.type+"()");
        o.setPersistentAttributes(element);

		if (element.type == "draw2d.shape.basic.Line") { return o; }

		var source= null;
		var target = null;
        var that = this;

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
            var child = that.unmarshalElement(canvas, element);

			var locator =  eval("new "+element.locator+"()");
            locator.setParent(parent);

			if (element.locator == "draw2d.layout.locator.LocatorA") {
				//console.log("setPos locatorA");
	            locator.setPos(parent, child.x, child.y);
			} else {
				//console.log("setPos locatorLine");
                //console.log("startx : " + child.startX + " startY : " + child.startY + " endX:" + child.endX + " endY:" + child.endY);
				locator.setPos(parent, child.startX, child.startY, child.endX, child.endY, child);
			}

			//if (element.type == "draw2d.shape.basic.Line") { return; }
			parent.addFigure(child, locator);
        });
    }
});
