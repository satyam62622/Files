import java.util.Scanner;
public class TotalPatterns{
public static void main(String[] Args){

Scanner sc=new Scanner(System.in);
byte n,total=0;

System.out.println("Please input array limit: ");
n=sc.nextByte();
byte arr[]=new byte[n];

System.out.println("Please input array elements: ");
for(int i=0;i<n;i++)
arr[i]=sc.nextByte();

for(int i=0;i<n;i++)		//loop1
{ //System.out.println("next i " + i); 
if(arr[i]==0)
for(int j=i+1;j<n;j++)		//loop2
{
if(arr[j]==0)
{
total++;
i=j;
i--;
//System.out.println(i);
break;
}				//if statement teminates
}				//loop1 terminates
}				//loop2 terminates

System.out.println("Total number of patterns: "+total);
}
}
