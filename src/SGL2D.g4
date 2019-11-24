grammar SGL2D;
start :
    | expression (NEWLINE expression)*
    |EOF
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
    : ENVIRONMENT ARROW (XINT | YINT)*
    ;

goal
    : GOAL ARROW (XINT | YINT | COLOR)*
    ;

player
    : PLAYER ARROW (XINT | YINT | COLOR)*
    ;

sprite
    : SPRITE WORD ARROW (COLOR | SOLID)*
    ;

counter
    : COUNTER COUNTERINDEX ARROW (BOOLEAN | INT | WINONZERO | GAMEOVERONZERO)*
    ;

event
    : EVENT (PLAYER | WORD) ARROW (action)*
    ;

set
    : SET WORD ARROW (position | range | NEWLINE)*
    ;

newline
    : NEWLINE
    ;

position
    : XINT YINT
    | YINT XINT
    ;

range
    : '('position ',' position')'
    ;

action
    : incCounter1
    | decCounter1
    | incCounter2
    | decCounter2
    | incCounter3
    | decCounter3
    | incSpriteCounter
    | decSpriteCounter
    | setSpriteCounter
    | moveToRandomOnZero
    | transformOnZeroCounter
    | gameOverOnZeroCounter
    | winOnZeroCounter
    | moveToRandom
    | transformToSprite
    | movePlayerTo
    | playerIncCounter1
    | playerIncCounter2
    | playerIncCounter3
    | playerDecCounter1
    | playerDecCounter2
    | playerDecCounter3
    | playerIncSpriteCounter
    | playerDecSpriteCounter
    | gameOver
    | win
    ;

incCounter1
    : INCCOUNTERONE (INT)*
    ;

decCounter1
    : DECCOUNTERONE (INT)*
    ;

incCounter2
    : INCCOUNTERTWO (INT)*
    ;

decCounter2
    : DECCOUNTERTWO (INT)*
    ;

incCounter3
    : INCCOUNTERTHREE (INT)*
    ;

decCounter3
    : DECCOUNTERTHREE (INT)*
    ;

incSpriteCounter
    : INCSPRITECOUNTER (INT)*
    ;

decSpriteCounter
    : DECSPRITECOUNTER (INT)*
    ;

setSpriteCounter
    : SETSPRITECOUNTER (INT)*
    ;

transformOnZeroCounter
    : TRANSFORMONZERO
    ;

gameOverOnZeroCounter
    : GAMEOVERONZERO
    ;

winOnZeroCounter
    : WINONZERO
    ;

moveToRandom
    : MOVETORANDOM
    ;

moveToRandomOnZero
    : MOVETORANDOMONZERO
    ;

transformToSprite
    : TRANSFORMTOSPRITE
    ;

movePlayerTo
    : MOVEPLAYERTO (XINT | YINT)*
    ;

playerIncCounter1
    : PLAYERINCCOUNTERONE (INT)*
    ;

playerIncCounter2
    : PLAYERINCCOUNTERTWO (INT)*
    ;

playerIncCounter3
    : PLAYERINCCOUNTERTHREE (INT)*
    ;

playerDecCounter1
    : PLAYERDECCOUNTERONE (INT)*
    ;

playerDecCounter2
    : PLAYERDECCOUNTERTWO (INT)*
    ;

playerDecCounter3
    : PLAYERDECCOUNTERTHREE (INT)*
    ;

playerIncSpriteCounter
    : PLAYERINCSPRITECOUNTER (INT)*
    ;

playerDecSpriteCounter
    : PLAYERDECSPRITECOUNTER (INT)*
    ;

gameOver
    : GAMEOVER
    ;

win
    : WIN
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
                        G R E Y |
                        G R A Y);
fragment ACTIONS    : (I N C C O U N T E R '1' EQUALS |
                        D E C C O U N T E R '1' EQUALS |
                        I N C C O U N T E R '2' EQUALS |
                        D E C C O U N T E R '2' EQUALS |
                        I N C C O U N T E R '3' EQUALS |
                        D E C C O U N T E R '3' EQUALS |
                        I N C S P R I T E C O U N T E R EQUALS |
                        D E C S P R I T E C O U N T E R EQUALS |
                        S E T S P R I T E C O U N T E R EQUALS |
                        T R A N S F O R M O N Z E R O C O U N T E R EQUALS WORD |
                        G A M E O V E R O N Z E R O C O U N T E R |
                        W I N O N Z E R O C O U N T E R |
                        M O V E T O R A N D O M EQUALS WORD |
                        T R A N S F O R M T O S P R I T E EQUALS WORD |
                        M O V E P L A Y E R T O EQUALS |
                        G A M E O V E R |
                        W I N);

INCCOUNTERONE       : I N C C O U N T E R '1' EQUALS;
DECCOUNTERONE       : D E C C O U N T E R '1' EQUALS;
INCCOUNTERTWO       : I N C C O U N T E R '2' EQUALS;
DECCOUNTERTWO       : D E C C O U N T E R '2' EQUALS;
INCCOUNTERTHREE     : I N C C O U N T E R '3' EQUALS;
DECCOUNTERTHREE     : D E C C O U N T E R '3' EQUALS;
INCSPRITECOUNTER    : I N C S P R I T E C O U N T E R EQUALS;
DECSPRITECOUNTER    : D E C S P R I T E C O U N T E R EQUALS;
SETSPRITECOUNTER    : S E T S P R I T E C O U N T E R EQUALS;
MOVETORANDOMONZERO  : M O V E T O R A N D O M O N Z E R O EQUALS WORD;
TRANSFORMONZERO     : T R A N S F O R M O N Z E R O C O U N T E R EQUALS WORD;
GAMEOVERONZERO      : G A M E O V E R O N Z E R O C O U N T E R;
WINONZERO           : W I N O N Z E R O C O U N T E R;
MOVETORANDOM        : M O V E T O R A N D O M EQUALS WORD;
TRANSFORMTOSPRITE   : T R A N S F O R M T O S P R I T E EQUALS WORD;
MOVEPLAYERTO        : M O V E P L A Y E R T O EQUALS;
PLAYERINCCOUNTERONE : P L A Y E R I N C C O U N T E R '1' EQUALS;
PLAYERINCCOUNTERTWO : P L A Y E R I N C C O U N T E R '2' EQUALS;
PLAYERINCCOUNTERTHREE : P L A Y E R I N C C O U N T E R '3' EQUALS;
PLAYERINCSPRITECOUNTER : P L A Y E R I N C S P R I T E C O U N T E R EQUALS;
PLAYERDECCOUNTERONE : P L A Y E R D E C C O U N T E R '1' EQUALS;
PLAYERDECCOUNTERTWO : P L A Y E R D E C C O U N T E R '2' EQUALS;
PLAYERDECCOUNTERTHREE : P L A Y E R D E C C O U N T E R '3' EQUALS;
PLAYERDECSPRITECOUNTER : P L A Y E R D E C S P R I T E C O U N T E R EQUALS;
GAMEOVER            : G A M E O V E R;
WIN                 : W I N;

ENVIRONMENT         : E N V I R O N M E N T;
GOAL                : G O A L;
PLAYER              : P L A Y E R;
SPRITE              : S P R I T E;
COUNTER             : C O U N T E R;
EVENT               : E V E N T;
SET                 : S E T;
COUNTERINDEX        : ( C O U N T E R '1' | C O U N T E R '2' | C O U N T E R '3');
ARROW               : '>';
INT                 : '-'?'0'..'9'+;
XINT                : X EQUALS '0'..'9'+;
YINT                : Y EQUALS '0'..'9'+;
COLOR               : C O L O R EQUALS ROYGBIV;
SOLID               : S O L I D EQUALS BOOLEAN;
COMMAND             : ACTIONS;
WHITESPACE          : ' ' -> skip;
BOOLEAN             : (T R U E | F A L S E);
WORD                : (LOWERCASE | UPPERCASE | '_')+ ;
NEWLINE             : ('\r'? '\n' | '\r')+ ;