

/*
Problem Statement:
-> Write a program in java to count number of digits in a number(including concept of classes and objects).
Dated: April.12.2022 (Tuesday)
By: Satyam Kumar
GitHub: github.com/satyam62622
*/

import java.util.Scanner;
class Count{
	public void countDigits()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please input any number:");
		int n,count=0;
		n=sc.nextInt();
		while(n!=0)
		{
			count++;
			n/=10;
		}
		System.out.println("No. of Digits in the given number: "+count);
	}

}


public class NumberOfDigits {
public static void main(String[] Args)
{
	Count obj=new Count();
	obj.countDigits();
}
}

