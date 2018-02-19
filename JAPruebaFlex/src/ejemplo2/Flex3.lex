package ejemplo2;
import static ejemplo2.CongresoToken.*;
%%
%class Congreso
%type CongresoToken
IDENTIFICADOR= ([0-9])+
DIA = ("Lunes" | "Martes" | "Miércoles"|"Jueves"|"Viernes"|"Sábado"|"Domingo")
DESCANSO = "Break"
SEPARADOR = ","
WHITE = [ \t\r\n]

%{
public String lexema;
%}
%%
{WHITE} {/*Ignore*/}
{IDENTIFICADOR} {lexema=yytext(); return IDENTIFICADOR;}
{DIA} {lexema=yytext(); return DIA;}
{DESCANSO} {lexema=yytext(); return DESCANSO;}
{SEPARADOR} {lexema=yytext(); return SEPARADOR;}
. {return ERROR;}
