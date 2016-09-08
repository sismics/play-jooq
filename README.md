# play-jooq plugin

This plugin adds [JOOQ](http://http://www.jooq.org/) support to Play! Framework 1 applications.

# How to use

####  Add the dependency to your `dependencies.yml` file

```
require:
    - jooq -> jooq 0.1

repositories:
    - sismics:
        type:       http
        artifact:   "http://release.sismics.com/repo/play/[module]-[revision].zip"
        contains:
            - jooq -> *

```
####  Run the `play deps` command

# License

This software is released under the terms of the Apache License, Version 2.0. See `LICENSE` for more
information or see <https://opensource.org/licenses/Apache-2.0>.
