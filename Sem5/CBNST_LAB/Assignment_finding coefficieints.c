#include<stdio.h>
#include"findingCoefficients.h"
int main()
{
char eq[50];
printf("Input polynomial equation: ");
scanf("%s",&eq);
findCoefficients(eq);
}
