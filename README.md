# Teamprojekt MSI SS13 & WS13/14

## Starting the server

You need to have installed the Playframework 2.1. (http://www.playframework.com)
To start the play server type:

    cd sprayServer

    play run

The webpage is shown at http://localhost:9000/.

## Build spray.js

Located in sprayServer/public/javascripts/spray.
You need node.js's packetmanager npm. (https://npmjs.org)

### General

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