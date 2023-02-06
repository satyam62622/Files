%{
#include<stdio.h>
int n=1;
%}
%%
\n {n++;}
. {}
"print" {printf("No. of Lines: %d",n);}
%%

int main()
{
printf("Please input string: ");
yylex();
}

int yywrap(){}
