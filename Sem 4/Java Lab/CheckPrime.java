/*
Problem Statement:
-> Write a program in java to check whether the input number is prime or not.
Dated: March.22.2022 (Tuesday)
By: Satyam Kumar
GitHub: github.com/satyam62622
*/
import java.util.Scanner;
public class CheckPrime {
public static void main(String args[]) {
	int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("Please input any number to check whether it is prime or not: ");
	num=sc.nextInt();
	int i=2;
	int flag=0;
	while(i<=(num/2))
	{
		if(num%i==0)
			{flag=1;break;}
		i++;
	}
	if(flag==0)
		System.out.println("Number is prime.");
	else
		System.out.println("Number is NOT prime.");
}
}
