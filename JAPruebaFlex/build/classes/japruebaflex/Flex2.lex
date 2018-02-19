package japruebaflex;
import static japruebaflex.TokenBoda.*;
%%
%class Boda
%type TokenBoda
PALABRA = \"([A-Za-z ])*\"
NUMERO= ([0-9])+
GENERO = ("M"|"F")
SEPARADOR = ","
INI = "BODA_INI"
FIN = "BODA_FIN"
RESERVADA = ({PALABRA} {SEPARADOR} {NUMERO} {SEPARADOR} {GENERO})
WHITE = [ \t\r\n]
%{
public String lexema;
%}
%%
{WHITE} {/*Ignore*/}
{NUMERO} {lexema=yytext(); return NUMERO;}
{PALABRA} {lexema=yytext(); return PALABRA;}
{GENERO} {lexema=yytext(); return GENERO;}
{SEPARADOR} {lexema=yytext(); return RESERVA;}
{INI} {lexema=yytext(); return RESERVA;}
{FIN} {lexema=yytext(); return RESERVA;}
. {return ERROR;}

