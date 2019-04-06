
## Driver Programs

**Files**

- connect-four-driver.rkt
- connect-four-graphical-driver.rkt

Both driver programs have four aguments they work with. They could be fashioned into command line arguments, but for now the source can be edited to modify them. The graphical driver allows you to edit the arguments via the menu bar.

Below is an working example for unix based operating systems. In the first exe/arg pair the executable is the interpreter for racket with the file to run provided as an argument, and the second exe/arg pair uses a compiled racket program.

```
(define exe-1 "/usr/local/bin/racket")
(define args-1 '("connect-four-naive.rkt"))
(define exe-2 "connect-four-scoring-2")
(define args-2 '())
```

**Compiling Racket Player Programs**

`raco exe connect-four-naive.rtk`
`raco exe connect-four-scoring.rtk`
`raco exe connect-four-scoring-2.rtk`  

## Player Programs

Julia, python, and racket may all be interpreted. The locations of each interpreter can be found using the following:
`which julia`
`which python3`
`which racket`

#### Racket

There are three racket programs. The naive implementaiton simply chooses a random column. The scoring program employs an actual algorithm, and scoring-2 builds on it, so it performs better.

- connect-four-naive.rkt  
- connect-four-scoring.rkt  
- connect-four-scoring-2.rkt  

#### Python & Julia

The driver should be able to run programs other than just racket. Two examples have been given in python and julia.

- connect-four-naive.py  
- connect-four-naive.jl   

