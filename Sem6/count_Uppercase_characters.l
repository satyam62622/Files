%{
#include<stdio.h>
int uc=0;
%}
%%
[A-Z] {uc++;
	printf("%c is an Uppercase Character\n",*yytext);}
. {}
\n printf("No. of Uppercase Characters: %d",uc);

%%

int main()
{
printf("input any string: ");
yylex();
}
int yywrap(){}
