LOCALE ?= en_US

all: \
	spray.js

.PHONY: clean all test

test:
	@npm test

spray.js: $(shell node_modules/.bin/smash --list src/spray.js)
	@rm -f $@
	node_modules/.bin/smash src/spray.js | node_modules/.bin/uglifyjs - -b indent-level=2 -o $@
	@chmod a-w $@
