var assert = require("assert");

assert = module.exports = Object.create(assert);

assert.isArray = function(actual, message) {
  if (!Array.isArray(actual)) {
    assert.fail(actual, null, message || "expected {actual} to be an Array", null, assert.isArray);
  }
};


/**
 * If there are additional custom asserts needed.
*/
