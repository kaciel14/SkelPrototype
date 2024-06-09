package skelprototype;
import java_cup.runtime.Symbol;

%%
%class LexicoCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char

L=[a-zA-Z_]+
D = [0-9]+
F = [0-9]{1,2}

espacio = [ \t\r\n]+
%{
     private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}

%%

/* espacios */
{espacio} {/*Ignore*/}

/* Comillas */
( "\"" ) {return new Symbol(sym.Comillas, yychar, yyline, yytext());}

/* reservadas*/

(@import) {return new Symbol(sym.Import, yychar, yyline, yytext());}

(@class) {return new Symbol(sym.Clase, yychar, yyline, yytext());}

(@void) {return new Symbol(sym.MetodoVacio, yychar, yyline, yytext());}

(@return) {return new Symbol(sym.MetodoRetorno, yychar, yyline, yytext());}

(return) {return new Symbol(sym.Retorno, yychar, yyline, yytext());}

/* tipos de datos*/
(int) {return new Symbol(sym.Entero, yychar, yyline, yytext());}

(dec) {return new Symbol(sym.Decimal, yychar, yyline, yytext());}

(bool) {return new Symbol(sym.Booleano, yychar, yyline, yytext());}

(char) {return new Symbol(sym.Caracter, yychar, yyline, yytext());}

(String) {return new Symbol(sym.Cadena, yychar, yyline, yytext());}

(turn) {return new Symbol(sym.Asigna, yychar, yyline, yytext());}

(if) {return new Symbol(sym.If, yychar, yyline, yytext());}

(else) {return new Symbol(sym.Else, yychar, yyline, yytext());}

/* simbolos*/
"+" {return new Symbol(sym.Suma, yychar, yyline, yytext());}

"-" {return new Symbol(sym.Resta, yychar, yyline, yytext());}

"\*" {return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());}

"/" {return new Symbol(sym.Division, yychar, yyline, yytext());}

"%" {return new Symbol(sym.Residuo, yychar, yyline, yytext());}

"(" {return new Symbol(sym.ParentesisApertura, yychar, yyline, yytext());}

")" {return new Symbol(sym.ParentesisCierre, yychar, yyline, yytext());}

"{" {return new Symbol(sym.LlaveApertura, yychar, yyline, yytext());}

"}" {return new Symbol(sym.LlaveCierre, yychar, yyline, yytext());}

("=" | "<" | ">" | "<=" | ">=" | "!=") {return new Symbol(sym.Relacional, yychar, yyline, yytext());}

"&&" {return new Symbol(sym.AND, yychar, yyline, yytext());}

"||" {return new Symbol(sym.OR, yychar, yyline, yytext());}

"!" {return new Symbol(sym.NOT, yychar, yyline, yytext());}

";" {return new Symbol(sym.FinDeLinea, yychar, yyline, yytext());}

"@" {return new Symbol(sym.Arroba, yychar, yyline, yytext());}

"," {return new Symbol(sym.Coma, yychar, yyline, yytext());}

"." {return new Symbol(sym.Punto, yychar, yyline, yytext());}

(true|false) {return new Symbol(sym.TrueFalse, yychar, yyline, yytext());}

/* valores */
{L}({L}|{D})* {return new Symbol(sym.Identificador, yychar, yyline, yytext());}

("(-"{D}+")")|{D}+ {return new Symbol(sym.Numero, yychar, yyline, yytext());}

("(-"{D}+"."{D}{1,2}")")|({D}+"."{F}) {return new Symbol(sym.NumeroDecimal, yychar, yyline, yytext());}

("\""{L}*({espacio}*{L}*)*"\"") {return new Symbol(sym.Texto, yychar, yyline, yytext());}

 . {return new Symbol(sym.ERROR, yychar, yyline, yytext());}