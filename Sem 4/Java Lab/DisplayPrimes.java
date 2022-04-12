import java.util.Scanner;

public class DisplayPrimes {
	public static void main(String[] Args) {		
Scanner sc=new Scanner(System.in);
System.out.println("Please input range(x and y): ");
int x,y;
x=sc.nextInt();y=sc.nextInt();

FindPrimes obj=new FindPrimes();
obj.findAll(x,y);
}
}


class FindPrimes{
	void findAll(int x,int y)
	{
		System.out.println("Listing prime numbers in this range: ");
		for(int i=x;i<=y;i++)
		{
			int flag=0;
			for(int j=2;j<=(i+1)/2;j++)
			{
				if(i%j==0)
					{flag=1;break;}
			}
			if(i>1 && flag==0)
				System.out.println(i);
		}
	}
}
