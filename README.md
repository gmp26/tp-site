# tp-site

generated using Luminus version "2.9.10.79"

FIXME

## Prerequisites

You will need [Leiningen][1] 2.0 or above installed.

[1]: https://github.com/technomancy/leiningen

## Mysqld setup

The java jdbc driver has to connect to mysql through tcp so it is necessary to configure the mysqld without the skip-networking option.
On darwin ports this is something like
```
sudo port unload mysql56-server
# make edits in /opt/local/etc/mysql56/my.cnf
sudo port load mysql56-server
```

## Testing clj

Run `lein test` to run tests once.

Run `lein test-refresh` to run tests whenever a file is edited

## Testing cljs

Install karma first.
```(bash)
npm init  # add node_modules to .gitignore
npm install karma karma-cljs-test --save-dev
```
Once only...
```
npm install -g karma-cli
```
then as needed
```
npm install karma-chrome-launcher karma-firefox-launcher --save-dev
npm install karma-safari-launcher karma-opera-launcher --save-dev
npm install karma-ie-launcher --save-dev
```
then to run tests continuously
```
lein doo chrome firefox
```
The doo aliases :browsers and :all have been defined to allow testing with multiple browsers. 
:browsers tests Firefox and Chrome. :all adds in safari.
```
lein doo browsers
```
## Running

To start a web server for the application, run:

    lein run

## License

Copyright © 2016 FIXME
