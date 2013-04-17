# spray.js

## General

To gather the dependencies, type:

    npm install

To generate the compact `spray.js` out of `src/*`, type:

    make spray.js

### Testsuite

The suite uses [vows](http://vowsjs.org), a BDD testframework.
To run the tests, type:

  * All tests
  
        npm test

  * Specific test (must be configured in `package.json`!)
    
        npm run-script test:package