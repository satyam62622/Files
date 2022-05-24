
//May,24,2022


class Demo{
	void Demofunc(int a,int b) {
		int i;
		i=a+b;System.out.println(i);
		try{i=a/b;System.out.println(i);}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		i=a-b;System.out.println(i);
		i=a*b;System.out.println(i);
	}
}


public class ExceptionHandling {

	public static void main(String[] args) {
Demo obj=new Demo();
obj.Demofunc(2, 0);

	}

}

