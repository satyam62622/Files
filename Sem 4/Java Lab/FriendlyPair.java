/*

Problem Statement:

-> Write a program in java to check whether the input numbers are friendly numbers or not.

Dated: March.29.2022 (Tuesday)
By: Satyam Kumar
GitHub: github.com/satyam62622

*/

import java.util.Scanner;
public class FriendlyPair{
public static void main(String[] Args){
Scanner sc=new Scanner(System.in);

int num1,num2,i;
double sum1=0,sum2=0;
System.out.println("Input two numbers to check whether they are a friendly pair or not: ");
num1=sc.nextInt();
num2=sc.nextInt();

for(i=1;i<=(num1+1)/2;i++)
if(num1%i==0)
sum1+=i;

for(i=1;i<=(num2+1)/2;i++)
if(num2%i==0)
sum2+=i;

if(sum1/num1==sum2/num2)
System.out.println("It is a  Friendly pair.");
else
System.out.println("It is NOT a Frindly pair.");
}
}
