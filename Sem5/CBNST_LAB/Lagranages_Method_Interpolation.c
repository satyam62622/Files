#include<stdio.h>
int main()
{
int n,i,j;
printf("Input number of entities in dataset: ");
scanf("%d",&n);
double data[2][n],x,nume=1,deno=1,ans=0;
printf("Please input x and y in dataset:\n");
for(i=0;i<2;i++)
for(j=0;j<n;j++)
scanf("%lf",&data[i][j]);

printf("Input the value of x to find its y: ");
scanf("%lf",&x);

for(i=0;i<n;i++)
{
nume=1;deno=1;
//finding numerator:
for(j=0;j<n;j++)
{
if(i==j)
continue;
else
{
nume*=(x-data[0][j]);
deno*=(data[0][i]-data[0][j]);
}
}
ans+=(nume/deno)*data[1][i];
}

printf("\nAnswer: %lf",ans);
}
