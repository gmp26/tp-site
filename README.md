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

## Running

To start a web server for the application, run:

    lein run

## License

Copyright © 2016 FIXME
