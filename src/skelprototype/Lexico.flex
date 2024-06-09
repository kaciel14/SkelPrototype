package skelprototype;
import static skelprototype.MyTokens.*;

%%
%class Lexico
%type MyTokens
L=[a-zA-Z_]+
D = [0-9]+
F = [0-9]{1,2}

espacio = [ \t\r\n]+
%{
    public String lexeme;
%}

%%

/* espacios */
{espacio} {/*Ignore*/}



/* reservadas*/
(@import) {lexeme = yytext(); return Import;}

(@class) {lexeme = yytext(); return Clase;}

(@void) {lexeme = yytext(); return MetodoVacio;}

(@return) {lexeme = yytext(); return MetodoRetorno;}

(return) {lexeme = yytext(); return Retorno;}


/* tipos de datos*/
(int) {return Entero;}

(dec) {return Decimal;}

(bool) {return Booleano;}

(char) {return Caracter;}

(String) {return Cadena;}

/* palabras */

(turn) {return Asigna;}

(if) {return If;}

(else) {return Else;}

/* simbolos*/
"+" {return Suma;}

"-" {return Resta;}

"\*" {return Multiplicacion;}

"/" {return Division;}

"%" {return Residuo;}

"(" {return ParentesisApertura;}

")" {return ParentesisCierre;}

"{" {return LlaveApertura;}

"}" {return LlaveCierre;}


("=" | "<" | ">" | "<=" | ">=" | "!=") {lexeme = yytext(); return Relacional;}

"&&" {lexeme = yytext(); return AND;}

"||" {lexeme = yytext(); return OR;}

"!" {return NOT;}

";" {return FinDeLinea;}

"@" {return Arroba;}

"," {return Coma;}

"." {return Punto;}

(true|false) {lexeme = yytext(); return TrueFalse;}

/* valores */
{L}({L}|{D})* {lexeme = yytext(); return Identificador;}

("(-"{D}+")")|{D}+ {lexeme = yytext(); return Numero;}

("(-"{D}+"."{D}{1,2}")")|({D}+"."{F}) {lexeme = yytext(); return NumeroDecimal;}

("\""{L}*({espacio}*{L}*)*"\"") {lexeme = yytext(); return Texto;}

/* Comillas */
( "\"" ) {return Comillas;}

 . {return ERROR;}





