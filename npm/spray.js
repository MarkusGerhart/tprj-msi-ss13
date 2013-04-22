spray = function() {
  var spray = {
    version: "0.0.0"
  };
  spray.foo = function() {
    var inner = "bar";
    var elem = document.createElement("div");
    elem.id = "foo";
    elem.innerHTML = inner;
    document.body.appendChild(elem);
    return inner;
  };
  return spray;
}();