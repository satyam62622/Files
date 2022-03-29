/*

Problem Statement:

Using switch statement write a menu driven program, to calculate maturity amount of a bank deposit.
1) Term Deposit -> principalAmount,rateOfIntrest,time(in years)
2) Rucurring Deposit -> monthlyInstallments, rateOfInterest, timeInMonths.

Dated: March.29.2022 (Tuesday)
By: Satyam Kumar
GitHub: github.com/satyam62622

*/

import java.util.Scanner;
public class MaturityAmount{
public static void main(String[] Args){
Scanner sc=new Scanner(System.in);

int principalAmount,time;
byte choice;
double amount,rateOfInterest;
do{
System.out.println("Input your choice 1/2 to calculate: \n1)Term Deposit\n2)Recurring Deposit\n");
choice=sc.nextByte();
switch(choice)
{
case 1:
System.out.println("Input principal amount, rate of interest and time(in years):\n");
principalAmount=sc.nextInt();
rateOfInterest=sc.nextDouble();
time=sc.nextInt();
amount= principalAmount*Math.pow((1+rateOfInterest/100),time);
System.out.println("Term Deposit Amount: "+amount);
break;
case 2:
System.out.println("Input monthly installments,rate of Interest and time(in months): \n");
principalAmount=sc.nextInt();
rateOfInterest=sc.nextDouble();
time=sc.nextInt();
amount=principalAmount*time+principalAmount*time*((time+1)/2)*rateOfInterest/100*(1/12);
System.out.println("Recurring Deposit Amount: "+amount);
break;
default:
System.out.println("Oops!!your choice doesn't match any of the above choice");
}
System.out.println("Calculate more??input(1) or Exit.");
choice=sc.nextByte();
}while(choice==1);
}
}
