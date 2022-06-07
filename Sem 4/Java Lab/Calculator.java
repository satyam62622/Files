/*
Problem Statement:
-> Create a class MyCalculator which consists of a single method power(int, int).
This method takes two integers, n and p, as parameters and finds np .
 If either n or p  is negative, then the method must throw an exception which says "n and p should be non-negative". 

 Input Format 
Each line of the input contains two integers, n and p . 

Output Format 

Each line of the output contains the result ,if neither of n and  p is negative. 

Otherwise the output contains "n and p should be non-negative". 

Sample Input 
 3 5 
 2 4
 0 0
 -1 -2
 -1 3 
Sample Output
 243 
 16
 java.lang.Exception: n and p should not be zero.
 java.lang.Exception: n or p should not be negative.
 java.lang.Exception: n or p should not be negative.


Explanation 
In the first two cases, both n and p are positive. So, the power function returns the answer correctly. 

In the third case, both n and p are zero. So, the exception, "n and p should not be zero.” is printed.

 In the last two cases, at least one out of n and p is negative. So, the exception, "n or p should not be negative.” is printed for these two cases.
Dated: June.07.2022 (Tuesday)
By: Satyam Kumar
GitHub: github.com/satyam62622
*/

import java.util.Scanner;

class MyCalculator{
	void power(int x,int y)throws Exception
	{
		if(x==0 && y==0) throw new Exception("n and p should not be zero.");
		System.out.println(x*y);
		if(x<0 || y<0) throw new Exception("n or p should not be negative.");
		
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
}
	}
}
