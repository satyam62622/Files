/** Regula- Falsi: */

//f(x)=x^3-4x-9 => x*x*x-4*x-9

#include<stdio.h>
double calFunc(double);
double calX2(double,double,double,double);
double calFunc(double);

int main(){
double fx0,fx1,fx2,x0,x1,x2;

while(1)
{
    printf("Input a and b(range): ");
    scanf("%lf %lf",&x0,&x1);
    fx0=calFunc(x0);
    fx1=calFunc(x1);
    if(x0>=x1 || fx0*fx1>0)
        continue;
    else
        break;
}
do{
    fx0=calFunc(x0);
    fx1=calFunc(x1);
    x2=calX2(x0,x1,fx0,fx1);
    fx2=calFunc(x2);
    if(fx2<0)
        x0=x2;
    else
        x1=x2;
}while(fx2>0.00001 || fx2<-0.00001);
printf("Root of the equation is: %.4lf",x2);
}

double calX2(double x0,double x1,double fx0,double fx1){
return x0-(((x1-x0)/(fx1-fx0))*fx0);
}

double calFunc(double x){
return x*x*x-4*x-9;
}
