function save() {
	alert(data[0]['title']);
}

var width = 960,
    height = 50,
    margin = {top: 5, right: 40, bottom: 20, left: 120};

/*d3.json("readme.json", function(data) {
  var vis = d3.select("#chart").selectAll("svg")
    .data(data)
    .enter().append("svg")
      .attr("class", "bullet")
      .attr("width", width)
      .attr("height", height)
    .append("g")
      .attr("transform", "translate(" + margin.left + "," + margin.top + ")");

  var title = vis.append("g")
      .attr("text-anchor", "end")
      .attr("transform", "translate(-6," + (height - margin.top - margin.bottom) / 2 + ")");

  title.append("text")
      .attr("class", "title")
      .text(function(d) { return d.title; })
      .call(make_editable, "title");

  title.append("text")
      .attr("class", "subtitle")
      .attr("dy", "1em")
      .text(function(d) { return d.subtitle; })
      .call(make_editable, "subtitle");

});*/

var data = [{"title":"new text :P",}];

var vis = d3.select("#chart").selectAll("svg").data(data).enter()
//var vis = d3.select("#chart")
	.append("svg")
      .attr("class", "bullet")
      .attr("width", width)
      .attr("height", height)
    .append("g")
      .attr("transform", "translate(" + margin.left + "," + margin.top + ")");

  var title = vis.append("g")
      .attr("text-anchor", "end")
      .attr("transform", "translate(-6," + (height - margin.top - margin.bottom) / 2 + ")");

  title.append("text")
      .attr("class", "title")
      //.text(function(d) { return d.title; })
	.text("click me !")
      .call(make_editable, "title");

  /*title.append("text")
      .attr("class", "subtitle")
      .attr("dy", "1em")
      .text(function(d) { return d.subtitle; })
      .call(make_editable, "subtitle");*/


function make_editable(d, field)
{
    console.log("make_editable", arguments);

    this
      .on("mouseover", function() {
        d3.select(this).style("fill", "red");
      })
      .on("mouseout", function() {
        d3.select(this).style("fill", null);
      })
      .on("click", function(d) {
        var p = this.parentNode;
        console.log(this, arguments);

        // inject a HTML form to edit the content here...

        // bug in the getBBox logic here, but don't know what I've done wrong here;
        // anyhow, the coordinates are completely off & wrong. :-((
        var xy = this.getBBox();
        var p_xy = p.getBBox();

        xy.x -= p_xy.x;
        xy.y -= p_xy.y;

        var el = d3.select(this);
        var p_el = d3.select(p);

        var frm = p_el.append("foreignObject");

        var inp = frm
            .attr("x", xy.x)
            .attr("y", xy.y)
            .attr("width", 300)
            .attr("height", 25)
            .append("xhtml:form")
                    .append("input")
                        .attr("value", function() {
                            // nasty spot to place this call, but here we are sure that the <input> tag is available
                            // and is handily pointed at by 'this':
                            this.focus();

                            return d[field];
                        })
                        .attr("style", "width: 294px;")
                        // make the form go away when you jump out (form looses focus) or hit ENTER:
                        .on("blur", function() {
                            console.log("blur", this, arguments);

                            var txt = inp.node().value;

                            d[field] = txt;
                            el
                                .text(function(d) { return d[field]; });

                            // Note to self: frm.remove() will remove the entire <g> group! Remember the D3 selection logic!
                            p_el.select("foreignObject").remove();
                        })
                        .on("keypress", function() {
                            console.log("keypress", this, arguments);

                            // IE fix
                            if (!d3.event)
                                d3.event = window.event;

                            var e = d3.event;
                            if (e.keyCode == 13)
                            {
								if (typeof(e.cancelBubble) !== 'undefined') // IE
                                  e.cancelBubble = true;
                                if (e.stopPropagation)
                                  e.stopPropagation();
                                e.preventDefault();

                                var txt = inp.node().value;

                                d[field] = txt;
                                el
                                    .text(function(d) { return d[field]; });

                                // odd. Should work in Safari, but the debugger crashes on this instead.
                                // Anyway, it SHOULD be here and it doesn't hurt otherwise.
                                p_el.select("foreignObject").remove();
                            }
                        });
      });
}
