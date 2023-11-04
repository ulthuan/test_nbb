test nbb
-----

Repo for testing the use of nbb with Deno

In the config file I added the option of lock file and the "node_modules" directory flag

With that options activated is the same as launch the example in this way:

`deno run --node-modules-dir --lock run_bb.ts`

if you delete the config file and launch the example without the before flags you see that the example don't work and with the flags works properly
