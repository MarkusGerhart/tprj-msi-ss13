spray = function() {
  var spray = {
    version: "0.0.0"
  };
  spray.document = document;
  spray.window = window;
  spray.require = function(dep) {
    return window[dep];
  };
  var d3 = spray.require("d3");
  spray.foo = function() {
    var inner = "bar";
    var elem = spray.document.createElement("div");
    elem.id = "foo";
    elem.innerHTML = inner;
    spray.document.body.appendChild(elem);
    return inner;
  };
  spray.FooBar = function(arg1, arg2) {
    this.arg1 = arg1;
    this.arg2 = arg2;
  };
  spray.FooBar.prototype.mymethod = function(x) {
    return x + this.arg1 + this.arg2;
  };
  return spray;
}();