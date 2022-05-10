import java.util.Scanner;
public class MethodOverloading {
public static void main(String [] Args) {
	Scanner sc=new Scanner(System.in);
	byte choice;
	System.out.println("Please input choice:\n1) Two Sum. \n2) Sort and Merge.");
	choice=sc.nextByte();
	switch(choice)
	{
	case 1:
	System.out.println("Please input array limit: ");
	byte n;
	int num;
	n=sc.nextByte();
	int X[]=new int[n];
	System.out.println("Please input array elements: ");
	for(int i=0;i<n;i++)
		X[i]=sc.nextInt();
	System.out.println("Please input num: ");
	num=sc.nextInt();
	Arr obj=new Arr();
	obj.arrf(X, num);
	break;
	////////////////////////////////////////////////////////////////
	case 2:
	int sizeA,sizeB;
	System.out.println("Please input limit of A: ");
	sizeA=sc.nextInt();
	System.out.println("Please input limit of B: ");
	sizeB=sc.nextInt();
	int A[]=new int[sizeA];
	int B[]=new int[sizeB];
	System.out.println("Please input A elements: ");
	for(int i=0;i<A.length;i++)
		A[i]=sc.nextInt();
	System.out.println("Please input B2 elements: ");
	for(int i=0;i<B.length;i++)
		B[i]=sc.nextInt();
	Arr obj2 =new Arr(A,B);
	obj2.arrf(A, sizeA, B, sizeB);
	break;
	default: System.out.println("Wrong choice input.");
	}
}
}


class Arr{
	
	Arr(){};
	
	Arr(int A[],int B[])
	{
		sort(A);
		sort(B);
	}
	
	void sort(int aRRY[])
	{
		int temp;
		for(int i=0;i<aRRY.length-1;i++)
			for(int j=0;j<aRRY.length-1-i;j++)
			{
				
				if(aRRY[j]>aRRY[j+1])
				{
					temp=aRRY[j];
					aRRY[j]=aRRY[j+1];
					aRRY[j+1]=temp;
				}
			}

	}
	
	void arrf(int X[],int num) {
		for(int i=0;i<X.length;i++)
		{
			for(int j=i+1;j<X.length;j++)
				if(X[i]+X[j]==num)
					System.out.println("["+X[i]+","+X[j]+"]");
		}
	}
	
	void arrf(int A[],int sizeA,int B[],int sizeB)
	{
		int i=0,j=0,k=0;
		int Array[]=new int[sizeA+sizeB];
		while(i<sizeA && j<sizeB)
		{
			if(A[i]<B[j])
			{
				Array[k]=A[i];
				i++;
				k++;
			}
			else
			{
				Array[k]=B[j];
				j++;
				k++;
			}
		}
		while(i<sizeA)
		{
			Array[k]=A[i];
			k++;
			i++;	
		}
		while(j<sizeB)
		{
			Array[k]=B[j];
			k++;
			j++;
		}
	System.out.println("New Array: ");
	for(int l=0;l<Array.length;l++)
		System.out.print("  "+Array[l]);
	}
}
