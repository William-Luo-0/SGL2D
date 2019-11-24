# SGL2D

SGL2D is our CPSC311 Term Project. This application takes in a SGL2D syntax file and generates a game application based on our specification. 

## How to use SGL2D

### To implement our most simple game:

The file would consists of lines of expressions:

EBNF rules:
digits = ("1" | "2" | "3" | "4" | "5" | "6" | "7" | "8" | "9")+

roygbiv = "red" | "orange" | "yellow" | "green" | "blue" | "indigo" | "violet" | "black" | "white" | "grey"

Define an environment:

environment > x=digits y=digits -> defines an environment of X*Y grid size

otherwise defaults to x=0, y=0

Define a goal:

goal > x=digits y=digits color=roygbiv -> defines a goal at coordinate (X,Y) with the respective color

otherwise defaults to x=0, y=0, color=black

Define a player:

player > x=digits y=digits color=roygbiv -> defines a goal at coordinate (X,Y) with the respective color

otherwise defaults to x=0, y=0, color=black

### Examples:

environment > x=4 y=4   --> would define an environment of 4x4 grid size

player > x=1 y=1 color=blue  --> would define a player (marked as blue) as 


## Configuring your environment for development

To start using this project you need to get your computer configured:

1. Install IntelliJ: https://www.jetbrains.com/idea/

2. Install ANTLR v4 plugin into intelliJ: https://plugins.jetbrains.com/plugin/7358-antlr-v4-grammar-plugin

3. Install ANTLR 4.7.2-complete library: https://www.antlr.org/download.html

##
