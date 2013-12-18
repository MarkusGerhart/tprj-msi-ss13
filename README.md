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
	echo 'export PATH=$HOME/local/bin:$PATH' >> ~/.bashrc
	. ~/.bashrc
	mkdir ~/local
	mkdir ~/node-latest-install
	cd ~/node-latest-install
	curl http://nodejs.org/dist/node-latest.tar.gz | tar xz --strip-components=1
	./configure --prefix=~/local
	make install # ok, fine, this step probably takes more than 30 seconds...
	curl https://npmjs.org/install.sh | sh

### General

To gather the dependencies, type:

    cd sprayServer/public/javascripts/spray

    npm install

To generate the compact `spray.js` out of `src/*`, type:

    cd sprayServer/public/javascripts/spray
    
    make spray.js

Now is in sprayServer/public/javascripts/spray the
complete spray.js file.

### Testsuite

The suite uses [vows](http://vowsjs.org), a BDD testframework.
To run the tests, type:

  * All tests
  
        npm test

  * Specific test (must be configured in `package.json`!)
    
        npm run-script test:package
