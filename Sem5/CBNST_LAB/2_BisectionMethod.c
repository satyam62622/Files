/**Bisection Method: */

#include<stdio.h>
//f(x)= x^3-4*x-9= x*x*x-4*x-9
double calF(double);
int main(){
double a,b,x,fa,fb,fc,avg;

while(1){
printf("Please input a and b(range):");
scanf("%lf %lf",&a,&b);
fa=calF(a);
fb=calF(b);
if(a>b || fa*fb>0)
    continue;
else
    break;
}

do{
avg=(a+b)/2.0;
fc=calF(avg);
if(fc<0)
    a=avg;
else
    b=avg;
fa=calF(a);
fb=calF(b);
}while(fa<-0.00001 && fb>0.00001);

printf("Real root of the equation is: %.5lf",avg);
}

double calF(double x){
return x*x*x-4*x-9;
}

