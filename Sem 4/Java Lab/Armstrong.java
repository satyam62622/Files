/*
Problem Statement:
-> Write a program in java to check whether the input number is Armstrong or Not.
Dated: March.22.2022 (Tuesday)
By: Satyam Kumar
GitHub: github.com/satyam62622
*/

import java.util.Scanner;
public class Armstrong {
public static void main(String[] Args) {
	Scanner sc=new Scanner(System.in);
	int num,result=0,temp,no_of_digits=0,d;
	System.out.println("Please input any number to check whether it is an Armstrong: ");
	num=sc.nextInt();
	temp=num;
	while(temp!=0)
	{
		no_of_digits++;
		temp=temp/10;
	}
	temp=num;
	while(temp!=0)
	{
		d=temp%10;
		result=result+(int)Math.pow(d,no_of_digits);
		temp=temp/10;
	}
	if(result==num)
		System.out.println("Number is Armstrong.");
	else
		System.out.println("Number is NOT Armstrong.");
}
}

