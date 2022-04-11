/*
Problem Statement:
-> Write a java program to find total number of patterns 0(1+)0 in a given string.
Dated: April.05.2022 (Tuesday)
By: Satyam Kumar
GitHub: github.com/satyam62622
*/

import java.util.Scanner;
public class TotalPatterns{
public static void main(String[] Args){

Scanner sc=new Scanner(System.in);
int n,total=0;
String str;
System.out.println("Please input string:");
str=sc.nextLine();
n=str.length();


for(int i=0;i<n;i++)		//loop1
{  
if(str.charAt(i)=='0')
for(int j=i+1;j<n;j++)		//loop2
{
if(str.charAt(j)=='0')
{
total++;
i=j;
i--;
break;
}				//if statement teminates
}				//loop1 terminates
}				//loop2 terminates

System.out.println("Total number of patterns: "+total);
}
}