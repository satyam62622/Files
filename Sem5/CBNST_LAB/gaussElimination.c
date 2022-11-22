#include<stdio.h>
int main()
{
int n,i,j,k;
float A[20][20],X[20],q,s=0.0;
printf("Enter order of matrix:");
scanf("%d",&n);
printf("Enter elements of augmented matrix: ");
for(i=1;i<=n;i++)
    for(j=1;j<=n+1;j++)
    scanf("%f",&A[i][j]);

    //upper triangular:
    for(i=1;i<=n-1;i++)
    {
        for(j=i+1;j<=n;j++)
        {
            q=A[j][i]/A[i][i];
            for(k=1;k<=n+1;k++)
                A[j][k]=A[j][k]-q*A[i][k];
        }
    }

    //backward substitution:

    X[n]=A[n][n+1]/A[n][n];
    for(i=n-1;i>=1;i--)
    {
        s=0.0;
        for(j=i+1;j<=n;j++)
            s=s+A[i][j]*X[j];
        X[i]=(A[i][n+1]-s)/A[i][i];
    }

    printf("\nSolution: ");
    for(i=1;i<=n;i++)
    {
        printf("\nX%d=%f\t",i,X[i]);
    }
    return 0;
}
