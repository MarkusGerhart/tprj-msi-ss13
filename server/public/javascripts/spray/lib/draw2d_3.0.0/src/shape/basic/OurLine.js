draw2d.shape.basic.OurLine = draw2d.shape.basic.Line.extend({
    NAME : "draw2d.shape.basic.OurLine",

   setPersistentAttributes : function(memento)
   {
       this._super(memento);

       if(typeof memento.startX !=="undefined"){
           this.startX = memento.startX;
       } else {
           console.log("memento.startX  is undefined !? : " + memento.startX);
       }
       if(typeof memento.startY !=="undefined"){
           this.startY = memento.startY;
       }
       if(typeof memento.endX !=="undefined"){
           this.endX   = memento.endX;
       }
       if(typeof memento.endY !=="undefined"){
           this.endY   = memento.endY;
       }
   }
});