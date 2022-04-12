import java.util.Scanner;
public class FactorialArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
System.out.println("Please input array limit: ");
int n=sc.nextInt();
int []Arr=new int[n];
System.out.println("Please input array elements: ");
for(int i=0;i<n;i++)
	Arr[i]=sc.nextInt();
int fact;
Factorial obj=new Factorial();
for(int i=0;i<n;i++)
{
	fact=obj.findFact(Arr[i]);
	System.out.println("Factorial of "+Arr[i]+" = "+fact);
}
}
}

class Factorial{
	int  findFact(int n)
	{
		int fact=1;
		while(n!=0)
		{
			fact*=n;
			n--;
		}
		return fact;
	}
}

