spray.document = document;
spray.window = window;

spray.require = function (dep) {
  return window[dep];
}