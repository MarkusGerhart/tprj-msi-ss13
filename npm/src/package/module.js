spray.document = document;
spray.window = window;

spray.foo = function () {
  var inner = "bar"
  var elem = document.createElement("div");
  elem.id = "foo";
  elem.innerHTML = inner;
  document.body.appendChild(elem);
  return inner;
}