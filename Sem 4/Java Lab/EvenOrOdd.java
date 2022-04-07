/*
Problem Statement:
-> Write a program in java to check whether the input number is even or odd.
Dated: March.22.2022 (Tuesday)
By: Satyam Kumar
GitHub: github.com/satyam62622
*/
import java.util.Scanner;
public class EvenOrOdd {
public static void main(String [] Args) {
	Scanner sc=new Scanner(System.in);
	int num;
	System.out.println("Please input a number to check whether it is even or odd: ");
	num=sc.nextInt();
	if(num%2==0)
		System.out.println("Number is even.");
	else
		System.out.println("Number is odd.");
}
}

