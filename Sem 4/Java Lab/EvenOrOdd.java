import java.util.Scanner;
public class EvenOrOdd {
public static void main(String [] Args) {
	Scanner sc=new Scanner(System.in);
	int num;
	System.out.println("Please input a number to check whether it is even or odd: ");
	num=sc.nextInt();
	if(num%2==0)
		System.out.println("Number is even.");
	else
		System.out.println("Number is odd.");
}
}

