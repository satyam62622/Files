
/*
Problem Statement:
-> Write a program in java to find smallest and largest number in a given array (including concept of classes and objects).
Dated: April.12.2022 (Tuesday)
By: Satyam Kumar
GitHub: github.com/satyam62622
*/

import java.util.Scanner;
public class SmallestLargestArray {
	public static void main(String[] Args) {
		
Scanner sc=new Scanner(System.in);
System.out.println("Please input array limit: ");
int n;
n=sc.nextInt();
int Arr[]=new int[n];
System.out.println("Please input array elements: ");
for(int i=0;i<n;i++)
	Arr[i]=sc.nextInt();
FindNums obj=new FindNums();
obj.findSL(Arr,n);
}
	
}

class FindNums{
	void findSL(int [] Arr,int n)
	{
		int small=Arr[0],large=Arr[0];
		for(int i=1;i<n;i++)
		{if(Arr[i]<small)
				small=Arr[i];
			if(Arr[i]>large)
				large=Arr[i];
			}
		System.out.println("Smallest: "+small+" Largest: "+large);
	}
}
