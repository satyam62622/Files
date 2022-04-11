/*
Problem Statement:
-> Write a java program to arrange an array into ZigZag form.
Dated: April.05.2022 (Tuesday)
By: Satyam Kumar
GitHub: github.com/satyam62622
*/

import java.util.Scanner;
public class ZigzagArray{
public static void main(String[] Args)
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Please input array limit: ");
n=sc.nextInt();

byte arr[]=new byte[n];
byte temp;
System.out.println("Please input array elements: ");

for(int i=0;i<n;i++)
arr[i]=sc.nextByte();

for(int i=0;i<n-1;i++)
{
if(i%2==0)
{
if(arr[i]>=arr[i+1])
{
temp=arr[i];
arr[i]=arr[i+1];
arr[i+1]=temp;
}
}

else
{
if(arr[i]<arr[i+1])
{
temp=arr[i];
arr[i]=arr[i+1];
arr[i+1]=temp;
}
}
}

System.out.println("ZigZag Array: \n");
for(int i=0;i<n;i++)
System.out.println(arr[i]+"  ");
}
}
