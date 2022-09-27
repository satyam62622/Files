/**Newton-Raphson Method: */



//      f(x)= x^3-4x-9 => x*x*x-4*x-9
//=>   f'(x)= 3x^2-4   => 3*x*x-4


#include<stdio.h>
double calFx(double);
double calDfx(double);
double calx2(double,double,double);

//Main:

int main(){
double x1,x2;
printf("Input First approximation: ");
scanf("%lf",&x2);

double fx=1,dfx=1;

do
{
x1=x2;

fx=calFx(x1);
dfx=calDfx(x1);

if(dfx)
x2=calx2(x1,fx,dfx);

else
{
printf("Roots could not be found using this initial value of x. Input another initial approximation.");
scanf("%lf",&x2);
}

}while(x1-x2>0.0001 || x2-x1>0.0001);

printf("Root of the equation: %0.3lf",x2);
return 0;
}

//Funtions:

double calFx(double x)
{
return x*x*x-4*x-9;
}


double calDfx(double x)
{
return 3*x*x-4;
}

double calx2(double x1,double fx,double dfx)
{
return x1-fx/(double)dfx;
}
