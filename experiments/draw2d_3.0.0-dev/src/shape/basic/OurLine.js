draw2d.shape.basic.OurLine = draw2d.shape.basic.Line.extend({
    NAME : "draw2d.shape.basic.OurLine",

   setPersistentAttributes : function(memento)
   {
       this._super(memento);

       if(typeof memento.startX !=="undefined"){
           //this.startX = memento.startX;
            this.start = new draw2d.geo.Point(memento.startX, memento.startY);
            this.end   = new draw2d.geo.Point(memento.endX, memento.endY);
       } else {
           console.log("memento.startX  is undefined !? : " + memento.startX);
       }
   }
});
