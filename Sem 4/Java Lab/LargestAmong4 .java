/*
Problem Statement:
-> Write a program in java to find largest among 4 numbers.
Dated: March.22.2022 (Tuesday)
By: Satyam Kumar
GitHub: github.com/satyam62622
*/

import java.util.Scanner;
public class LargestAmong4 {
public static void main(String [] Args) {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[4],i,largest;
	//int num[]=new int[4];
	System.out.println("Please input 4 numbers: ");
	for(i=0;i<4;i++) {
		arr[i]=sc.nextInt();
	}
	largest=arr[0];
	for(i=1;i<4;i++) {
		if(arr[i]>largest)
			largest=arr[i];
	}
		System.out.println("Largest among the numbers is: "+largest);
}
}

