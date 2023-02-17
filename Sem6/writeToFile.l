%{
#include<stdio.h>
int ch=0,words=1,spaces=0,lines=0,tabs=0;
%}
%%
[A-Za-z0-9] {ch++;}
[ ] {spaces++; words++;}
\n {words++; lines++;}
\t {tabs++;}
%%

int yywrap(){return 1;}

int main(){
extern FILE *yyin,*yyout;
yyin = fopen("input.txt","r");
yyout = fopen("output.txt","w");
yylex();
fprintf(yyout,"\nNo. of characters: %d",ch);
fprintf(yyout,"\nNo. of words: %d",words);
fprintf(yyout,"\nNo. of spaces: %d",spaces);
fprintf(yyout,"\nNo. of lines: %d",lines);
fprintf(yyout,"\nNo. of tabs: %d",tabs);
}


