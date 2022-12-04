#include<stdio.h>
#include<math.h>

double calFx(double);

int main()
{
double x,result=0,uL,lL,h;
int n,i;

//printf("Input the value of x: ");
//scanf("%lf",&x);
printf("Input number of intervals: ");
while(1){
scanf("%d",&n);
if(n%3==0)
break;
else
printf("Please input number of intervals which is multiple of 3 for applying Simpsons 3/8: ");
}
printf("Lower Limit?");
scanf("%lf",&lL);
printf("Upper Limit?");
scanf("%lf",&uL);

h=(uL-lL)/n;


double y[n+1];
for(i=0;i<=n;i++)
y[i]=calFx(i*h);

for(i=0;i<=n;i++)
{
if(i==0 || i==n)
result+=y[i];

else if(i%3==0)
result+=(2*y[i]);

else
result+=(3*y[i]);
}

result*=((3*h)/8);
printf("\nResult: %lf",result);
}

double calFx(double x)
{
return sin(x);
}
