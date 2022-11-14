//tan10
#include<stdio.h>
#include<math.h>

double calF(double);
double calDF(double);
double calX2(double,double,double);

int main()
{
double x1,x2,Fx1,DFx1;

printf("Input first approximation: ");
scanf("%lf",&x1);

do
{
Fx1=calF(x1);
DFx1=calDF(x1);

if(DFx1==0)
{
    printf("differentiation is becoming zero. Input another approximation.");
    scanf("%lf",&x1);
}
else
    {
    x2=calX2(x1,Fx1,DFx1);
    x1=x2;
    printf("\n%.10lf",x2);
    }
}while(Fx1>0.00000000001 || Fx1<-0.0000000001);

printf("\n\nResult: %.10lf",x2);
}

double calF(double x)
{
return x-tan(10);
}

double calDF(double x)
{
return 1;

}

double calX2(double x1,double Fx1,double DFx1)
{
return x1-Fx1/DFx1;
}
