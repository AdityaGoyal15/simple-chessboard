# Simple Chessboard

## About

Simple Chessboard is a basic program which takes a piece type and its current position in the 8*8 board as input via
console. It computes all possible moves of the input piece type based on the current position and print those
positions as output in the console. Currently, only three types of pieces are supported which are Pawn, King and Queen.

## Build Chessboard

To build chessboard in Windows machine, execute following command from the terminal-

```commandline
gradlew clean build
```

To build chessboard in Linux/MacOS machine, execute following command from the terminal-

```shell
./gradlew clean build
```

## Run Chessboard

To run the Simple Chessboard program, start the main class and when asked, provide the piece type (e.g. pawn, king,
queen) and current position (e.g. E1, B5, C6) via console. The program will compute the all possible next positions 
of the given piece based on its current position and print them in the console. 