%{
#include<stdio.h>
int c=0;
%}
%%
. {c++;}
\n {printf("No. of Characters: %d",c);}
%%

int main(){
printf("Please input any string: ");
yylex();
}

int yywrap(){}
