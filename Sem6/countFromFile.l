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
extern FILE *yyin;
yyin = fopen("input.txt","r");
yylex();
printf("\nNo. of characters: %d",ch);
printf("\nNo. of words: %d",words);
printf("\nNo. of spaces: %d",spaces);
printf("\nNo. of lines: %d",lines);
printf("\nNo. of tabs: %d",tabs);
}


