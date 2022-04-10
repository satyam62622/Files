import java.util.Scanner;
public class ReplaceZeroes {
    public static void main(String[] Args){
        Scanner sc=new Scanner(System.in);
        int num,newNum=0,r,i=1;
        System.out.println("Please input any number: ");
        num=sc.nextInt();
        while(num!=0)
        {
            r=num%10;
	    if(r==0)
	    r=1;
            newNum+=r*i;
	    i=i*10;
            num/=10;
        }
        System.out.println("New Number: "+newNum);
    }
}
