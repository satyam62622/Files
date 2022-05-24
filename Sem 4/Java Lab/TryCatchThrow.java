//May,24,2022

class DemoException extends Exception{

		DemoException(String s)
		{
			super(s);
		}
	}

class Demo1
{
	int i;
	void func(int a,int b) throws DemoException
	{
		if(b==0)
		{
			throw new DemoException("\0Exception");
		}
		else
		{
			i=a/b;
		}
	}
}

public class TryCatchThrow {
public static void main(String[] Args) {
	Demo1 D=new Demo1();
	
	try {
		D.func(2,8);
		D.func(3, 0);
	}
	catch(DemoException De) {
		System.out.println("Divide by Zero");
		System.out.println(De);
		System.out.println(De.getMessage());
	}
}
}

