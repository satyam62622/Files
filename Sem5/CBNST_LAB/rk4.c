#include<stdio.h>
#include<math.h>

double fxy(double x,double y){
return x*x+y*y;
}

int main()
{

double x0,y0,h,x,y,fdx;
double k[4]={0},f;
printf("Input x0: ");
scanf("%lf",&x0);
printf("Input y0: ");
scanf("%lf",&y0);
printf("Input x: ");
scanf("%lf",&x);


h= (x-x0)/5;
printf("\nh: %lf",h);
int n= (int)((x-x0)/h);

int i,j;
for(i=1;i<=5;i++)
{
f=0;
k[0] = h*fxy(x0,y0);
//printf(" %lf",k[0]);
for(j=1;j<4;j++)
{
x = x0 + ((j+1)/2) * (h/2);

if(j==3)
y = y0 + k[j-1];
else
y = y0 + k[j-1]/2;

k[j] = h* fxy(x,y);
//printf(" %lf",k[j]);
}

for(j=0;j<4;j++)
{
if(j==0 || j==3)
f += k[j];
else
f += 2*k[j];
}
f/=6;

fdx = y0+f;
y0=y;
x0=x;
}

printf("\n\n%lf",fdx);
}
