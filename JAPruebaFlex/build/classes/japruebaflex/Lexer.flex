package japruebaflex;
import static japruebaflex.Token.*;
%%
%class Lexer
%type Token
LETRA = [A-Za-z_]
D = [0-9]
ALPHA_NUMERICO = ({LETRA} | {D})*
RESERV = ("public"|"static"|"void")
WHITE = [ \t\r\n]
%{
public String lexema;
%}
%%
{WHITE} {/*Ignore*/}
"=" {return ASSIGN;}
"+" {return SUMA;}
"-" {return RESTA;}
"/" {return DIV;}
{RESERV} {lexema=yytext(); return RESERVADA;}
{ALPHA_NUMERICO} {lexema=yytext(); return ID;}
("(-"{D}+")")|{D}+ {lexema=yytext(); return INT;}
. {return ERROR;}
