import "../core/document"

// function: foo

spray.foo = function () {
  var inner = "bar"
  var elem = spray.document.createElement("div");
  elem.id = "foo";
  elem.innerHTML = inner;
  spray.document.body.appendChild(elem);
  return inner;
}

// class: FooBar

spray.FooBar = function (arg1, arg2) {
  this.arg1 = arg1;
  this.arg2 = arg2;
}

spray.FooBar.prototype.mymethod = function (x) {
  return x + this.arg1 + this.arg2;
}