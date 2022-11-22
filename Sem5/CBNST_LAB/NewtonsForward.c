#include<stdio.h>

int fact(int n)
{
if(n<=1)
return 1;
return n*fact(n-1);
}

int main()
{
int n,i,j,k;
printf("please input the number of entities in dataset: ");
scanf("%d",&n);
double table[n][n+1];

//input dataset:
printf("Input values of x: and y: ");
for(i=0;i<n;i++)
{
scanf("%lf %lf",&table[i][0],&table[i][1]);
}

//completing the table:
for(j=2;j<=n;j++)
{
for(i=0;i<n-j+1;i++)
{
table[i][j]=table[i+1][j-1]-table[i][j-1];
}
}
printf("\n");

/*
//printing the table:
for(i=0;i<n;i++)
{
for(j=0;j<=n;j++)
printf("%lf\t",table[i][j]);
printf("\n");
}
*/


double result=0,p,query;
i=0,j=0;
printf("Input the value of x to find f(x):");
scanf("%lf",&query);
p=(query-table[i][j])/(table[i+1][j]-table[i][j]);


/*
//printing initial value of p:
printf("\n%lf",p);
*/


//calculating result:
result=table[i][j+1];

for(j=2;j<=n;j++)
{
result += (p * table[i][j])/(fact(j-1));
p*=(p-1);
}

printf("\n\nResult is: %lf",result);
}
