# Reproduction sample for odd `*input*` behavior

The desire is to write code that can be called with `bb -I --stream` so that it
will operate on each line's data in turn. The reason the code is organized this
way is so I can do development in clojure (with my editor and a prepl
connection) and then run the code with bb when completed.

The problem is that running the script with the `-cp` arg produces different
results than with the uberscript.

Running this with bb's `-cp` arg:

```
cat names.edn | bb -I --stream -cp src "(ns user (:require [testinput])) (apply testinput/-main *command-line-args*)"
Bob
Bob
```

Running with uberscript:

```
$ bb -cp src -m testinput --uberscript testinput.clj
$ cat names.edn | bb -I --stream -f testinput.clj
Bob
Marcia
```
