test nbb
-----

Repo for testing the use of nbb with Deno

In the config file I added the following options:

* lock: for save the correct version of dependencies
* nodeModulesDir: for generate node_modules directory with the dependencies
* imports: for list the dependencies that we use of npm

notice the import with "npm:/" that help Deno to find the clojure imports.

At the same time I add several tasks for help to develop and distribute your program

* update_cache: this task update the lock file and the node_modules directory
* nbb: launch the nbb command for example `deno task nbb examples.cljs`
* nbb_compile: generate the bundle of your program and after that launch the deno compile command.

