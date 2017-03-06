package org.compi2.codigo3d.parser;

import java_cup.runtime.Symbol;


%%
%cupsym sym
%class scanner
%cup
%public
%unicode
%line
%column
%char
%ignorecase

%init{
    
%init}

%{
    
   
%}

entero =                0 | [1-9][0-9]*
decimal =               (0 | [1-9][0-9]*)[.](0*[1-9][0-9]*) 
id =                    [a-zA-ZÑñ]+([0-9])*
cadena =                [\"] ([^\"])+ [\"] 
caracter =                ['] [a-zA-ZÑñ] ['] 

%%

null                       {}

                        /*--------------Simbolos aritmeticos-------------*/

"+"                {System.out.println("+");return new Symbol(sym.mas, yychar,yyline);}
"-"                {System.out.println("-");return new Symbol(sym.menos, yychar,yyline);}
"/"                {System.out.println("/");return new Symbol(sym.dividido, yychar,yyline);}
"*"                {System.out.println("*");return new Symbol(sym.por, yychar,yyline);}
"^"                {System.out.println("^");return new Symbol(sym.pot, yychar,yyline);}

"("                        {System.out.println("(");return new Symbol(sym.para, yychar,yyline);}
")"                        {System.out.println(")");return new Symbol(sym.parc, yychar,yyline);}


"||"                       {System.out.println("or");return new Symbol(sym.or, yychar,yyline);}
"&&"                       {System.out.println("and");return new Symbol(sym.and, yychar,yyline);}
"<"                        {System.out.println("menor");return new Symbol(sym.menor, yychar,yyline);}
">"                        {System.out.println("mayor");return new Symbol(sym.mayor, yychar,yyline);}
"<="                       {System.out.println("menorigual");return new Symbol(sym.menorigual, yychar,yyline);}
">="                       {System.out.println("mayorigual");return new Symbol(sym.mayorigual, yychar,yyline);}
"=="                       {System.out.println("igualigual");return new Symbol(sym.igualigual, yychar,yyline);}
"!="                       {System.out.println("noigual");return new Symbol(sym.noigual, yychar,yyline);}
"!"                        {System.out.println("not");return new Symbol(sym.not, yychar,yyline);}

                            /*--------Expresiones regulares---------*/

{decimal}                  {System.out.println("decimal");return new Symbol(sym.decimal, yychar,yyline,new String(yytext()));}
{entero}                   {System.out.println("entero");return new Symbol(sym.entero, yychar,yyline,new String(yytext()));}
{id}                       {System.out.println("id");return new Symbol(sym.id, yychar,yyline,new String(yytext()));}
{cadena}                   {System.out.println("cadena");return new Symbol(sym.cadena, yychar,yyline,new String(yytext()));}
{caracter}                 {System.out.println("caracter");return new Symbol(sym.caracter, yychar,yyline,new String(yytext()));}


/* BLANCOS */
[ \t\r\f\n]+       { /* Se ignoran */}

.   { System.out.println("!!!!!!!!!!!!!!!!!!!!!!\nError lexico: "+yytext()+"\n!!!!!!!!!!!!!!!!!!!!!!");}
