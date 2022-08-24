/**Take constants from user and print roots of quadratic equation.
    ->If roots are imaginary, print in the form: x+iy .
*/
#include<iostream>
#include<math.h>
using namespace std;
int main()
{
double a,b,c;
double d,r1,r2,rp,ip;
cout<<"a: ";
cin>>a;
cout<<"b: ";
cin>>b;
cout<<"c: ";
cin>>c;
d= b*b - 4*a*c;

if(d>=0)
{
r1= ((-1)*b + sqrt(d))/(2*a);
r2= ((-1)*b - sqrt(d))/(2*a);
cout<<"Roots are real: \n"<<r1<<"\t"<<r2;
}
else
{
cout<<"Roots are imaginary: \n";
d=(-1)*d;
rp=((double)(-1)*b)/(2*a);
ip=(sqrt(d))/(2*a);
cout<<rp<<"+i"<<ip<<"\t"<<rp<<"-i"<<ip;
}
}
