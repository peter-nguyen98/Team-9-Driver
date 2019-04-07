## Team 9 Connect-Four Driver

This is the driver for the software engineering programming assignment.  
TODO: Update description later. 

### Driver Requirements
TODO: Define "driver" using requirements, or link to requirements doc

### Building and Running the Program

Right now, the process is as easy as:
`gradle build`
`gradle run`

We will add some command line arguments later.
I'm also looking into creating an executable jar file (currently doesn't work because of dependency issue I think)

### Examples

Our job with this assignment is to just build the driver. The player programs can be found under examples (see file hierarchy below). The racket examples are easiest to demonstrate 1) how to run a compiled player program, 2) how to run an interpreted player program, and 3) how to specify different programs against one another.

The examples directory has its own `README` for more details.

### File Hierarchy 

```
├── README.md  
├── build  
│   └── ConnectFour 
│       └── *.class  
├── makefile  
└── src  
    ├── ConnectFour  
    │   ├── Board.java  
    │   ├── Driver.java  
    │   ├── Main.java  
    │   └── Player.java  
    └── examples  
        ├── README.md  
        ├── connect-four-driver.rkt  
        ├── connect-four-graphical-driver.rkt  
        ├── connect-four-naive.jl  
        ├── connect-four-naive.py  
        ├── connect-four-naive.rkt  
        ├── connect-four-scoring-2.rkt  
        └── connect-four-scoring.rkt  
```
Note: The file hierarchy may not be updated with every change and that's ok. It should be updated before submitting though.
