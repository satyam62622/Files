/*
Problem Statement:
-> Write a program in java to reverse a number.
Dated: March.22.2022 (Tuesday)
By: Satyam Kumar
GitHub: github.com/satyam62622
*/

import java.util.Scanner;
public class ReversedNumber {
public static void main(String[] Args) {
	Scanner sc=new Scanner(System.in);
	int num,reversed=0,r;
	System.out.println("Input any number to reverse it: ");
	num=sc.nextInt();
	while(num!=0) {
		r=num%10;
		reversed=10*reversed+r;
		num=num/10;
	}
	System.out.println("Reversed number is: "+reversed);
	
		
}

}

