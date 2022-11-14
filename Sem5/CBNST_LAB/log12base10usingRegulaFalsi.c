//find log12(base10)
// => loge12/loge10
//x=log12/log10
//fx= x-log12/log10

#include<stdio.h>
#include<math.h>
double calF(double x)
{
return (x- log10(12));
}

double calX2(double x0,double x1, double fx0,double fx1)
{
    return (x0- ((x1-x0)/(fx1-fx0))*fx0);
}

int main()
{
double x0,x1,x2,fx0,fx1,fx2;
printf("Please input x0 and x1: ");
while(1){

    scanf("%lf %lf",&x0,&x1);
    fx0=calF(x0);
    fx1=calF(x1);

    if(fx0*fx1<0 && x0<x1)
        break;
    else
        printf("Input another values: ");
}

do
{
x2 = calX2(x0,x1,fx0,fx1);
fx2=calF(x2);
if(fx2>0)
    {x1=x2;
        fx1=calF(x1);}
else if(fx2<0){
    x0=x2;
    fx0=calF(x0);}

}while(fx2<(-0.0000000001) || fx2>0.0000000001);
printf("\n\nresult: %.10lf",x2);
}

