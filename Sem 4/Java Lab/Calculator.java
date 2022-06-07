import java.util.Scanner;

class MyCalculator{
	void power(int x,int y)throws Exception
	{
		if(x<0 || y<0) throw new Exception("This is exception");
		System.out.println(x*y);
		
	}
}


public class Calculator {
	public static void main(String[] Args) {
		Scanner sc=new Scanner(System.in);
		int p,n;
		System.out.println("Input n: ");n=sc.nextInt();
		System.out.println("Input p: ");p=sc.nextInt();
MyCalculator obj=new MyCalculator();
try{obj.power(n,p);}
catch(Exception e)
{
	System.out.println(e);
	System.out.println("Number should be positive");
}
	}
}
