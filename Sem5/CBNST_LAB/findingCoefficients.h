//finding coefficient of polynomial equation..
void findCoefficients(char str[])
{
int n=2; //size of the array will atleast be 2;
int i=0;
while(str[i]!='=')
{
//finding size of array:
if(str[i]=='x' && str[i+1]=='^')
{n=(int)str[i+2]-48+1;break;}
i++;
}
//printf("%d",n);
int coefficients[2][n];
//intializing:
for(i=0;i<n;i++)
{
    coefficients[0][i]=i;
    coefficients[1][i]=0;
}

//calculating coefficients:
i=0;
int num=0,sign=1;
while(str[i]!='\0' && str[i]!= '=')
{
    if(str[i]=='-')
        sign=-1;
    else if(str[i]=='+')
        sign=1;
    else if(str[i]>48 && str[i]<58)
        num=num*10+sign*((int)str[i]-48);
    else if(str[i]=='x' && str[i+1]=='^')
    {
        coefficients[1][(int)str[i+2]-48]=num;
        num=0;
        i+=2;
    }
    i++;
}
if(num!=0)
        coefficients[1][0]=num;
//printing the coefficient matrix:
//here first row shows the power of x, and second row shows corresponding coefficient.
int j=0;
for(i=0;i<2;i++)
{
for(j=0;j<n;j++)
    printf("\t%d",coefficients[i][j]);
printf("\n");
}
}

