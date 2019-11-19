grammar SGL2D;
start :
    expression EOF
    ;

/*
 *  Parser Rules
 */

expression
    :
    | environment
    | goal
    | player
    | sprite
    | counter
    | event
    | set
    | newline
    ;

environment
    : ENVIRONMENT ARROW (XINT | YINT)* (NEWLINE expression)?
    ;

goal
    : GOAL ARROW (XINT | YINT | COLOR)* (NEWLINE expression)?
    ;

player
    : PLAYER ARROW (XINT | YINT | COLOR)* (NEWLINE expression)?
    ;

sprite
    : SPRITE WORD ARROW (COLOR | SOLID)* (NEWLINE expression)?
    ;

counter
    : COUNTER ('1' | '2' | '3') ARROW (BOOLEAN | INT)* (NEWLINE expression)?
    ;

event
    : EVENT (SPRITE WORD | GOAL) ARROW COMMAND* (NEWLINE expression)?
    ;

set
    : SET (SPRITE WORD | GOAL) ARROW (position|range)+ (NEWLINE expression)?
    ;

newline
    : NEWLINE expression
    ;

position
    : XINT YINT
    | YINT XINT
    ;

range
    : '('position ',' position')'
    ;
/*
 *  Lexer Rules
 */

 // Fragments are reusable building  blocks for lexer rules.
fragment A          : ('A'|'a') ;
fragment B          : ('B'|'b') ;
fragment C          : ('C'|'c') ;
fragment D          : ('D'|'d') ;
fragment E          : ('E'|'e') ;
fragment F          : ('F'|'f') ;
fragment G          : ('G'|'g') ;
fragment H          : ('H'|'h') ;
fragment I          : ('I'|'i') ;
fragment J          : ('J'|'j') ;
fragment K          : ('K'|'k') ;
fragment L          : ('L'|'l') ;
fragment M          : ('M'|'m') ;
fragment N          : ('N'|'n') ;
fragment O          : ('O'|'o') ;
fragment P          : ('P'|'p') ;
fragment Q          : ('Q'|'q') ;
fragment R          : ('R'|'r') ;
fragment S          : ('S'|'s') ;
fragment T          : ('T'|'t') ;
fragment U          : ('U'|'u') ;
fragment V          : ('V'|'v') ;
fragment W          : ('W'|'w') ;
fragment X          : ('X'|'x') ;
fragment Y          : ('Y'|'y') ;
fragment Z          : ('Z'|'z') ;
fragment EQUALS     : '=';
fragment LOWERCASE  : [a-z] ;
fragment UPPERCASE  : [A-Z] ;
fragment ROYGBIV    : (R E D |
                        O R A N G E |
                        Y E L L O W |
                        G R E E N |
                        B L U E |
                        I N D I G O |
                        V I O L E T |
                        B L A C K |
                        W H I T E |
                        G R E Y);
fragment ACTIONS    : (I N C C O U N T E R '1' EQUALS INT |
                        D E C C O U N T E R '1' EQUALS INT |
                        I N C C O U N T E R '2' EQUALS INT |
                        D E C C O U N T E R '2' EQUALS INT |
                        I N C C O U N T E R '3' EQUALS INT |
                        D E C C O U N T E R '3' EQUALS INT |
                        I N C S P R I T E C O U N T E R EQUALS INT |
                        D E C S P R I T E C O U N T E R EQUALS INT |
                        S E T S P R I T E C O U N T E R EQUALS INT |
                        T R A N S F O R M O N Z E R O C O U N T E R EQUALS WORD |
                        G A M E O V E R O N Z E R O C O U N T E R |
                        W I N O N Z E R O C O U N T E R |
                        M O V E T O R A N D O M EQUALS WORD |
                        T R A N S F O R M T O S P R I T E EQUALS WORD |
                        M O V E P L A Y E R T O EQUALS (XINT | YINT)* |
                        G A M E O V E R
                        W I N);

ENVIRONMENT         : E N V I R O N M E N T;
GOAL                : G O A L;
PLAYER              : P L A Y E R;
SPRITE              : S P R I T E;
COUNTER             : C O U N T E R;
EVENT               : E V E N T;
SET                 : S E T;
ARROW               : '>';
INT                 : '-'?'0'..'9'+;
XINT                : X EQUALS '0'..'9'+;
YINT                : Y EQUALS '0'..'9'+;
COLOR               : C O L O U? R EQUALS ROYGBIV;
SOLID               : S O L I D EQUALS BOOLEAN;
COMMAND             : ACTIONS;
WHITESPACE          : ' ' -> skip;
BOOLEAN             : (T R U E | F A L S E | T | F);
WORD                : (LOWERCASE | UPPERCASE | '_')+ ;
NEWLINE             : ('\r'? '\n' | '\r')+ ;