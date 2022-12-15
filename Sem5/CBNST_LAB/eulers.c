#include<stdio.h>
double fxy(double x,double y){
return x+y;
}

int main()
{
    double x0,y0,x,y,h;
    int n;
    scanf("%lf %lf %lf %lf",&x0,&y0,&h,&x);
    n=(int)((x-x0)/h);
    printf("\nn: %d",n);
    int i,j;
    for(i=1;i<=n;i++)
    {
        y=y0+h*fxy(x0,y0);
        y0=y;
        x0=x0+h;
    }

    printf("\nans: %lf",y);
}
