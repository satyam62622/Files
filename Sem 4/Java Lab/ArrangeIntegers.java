import java.util.Scanner;
public class ArrangeIntegers{
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
if(arr[i]>0)
for(int j=i+1;j<n;j++)
{
if(arr[j]<=0)
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
break;
}
}

System.out.println("Arranged Array: ");
for(int i=0;i<n;i++)
System.out.println(arr[i]+"\t");
}
}
