spray = function() {
  var spray = {
    version: "0.0.0"
  };
  spray.document = document;
  spray.window = window;
  spray.foo = function() {
    var inner = "bar";
    var elem = spray.document.createElement("div");
    elem.id = "foo";
    elem.innerHTML = inner;
    spray.document.body.appendChild(elem);
    return inner;
  };
  return spray;
}();