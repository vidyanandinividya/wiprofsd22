package w5_d1;

public class ExceptionCallStackDemo {
	
	void fn1()
	{
		System.out.println(10/0);
		System.out.println("fn1");
	}
	void fn2()
	{
		fn1();
		System.out.println("fn2");
	}
	void fn3()
	{
		try
		{
			fn2();
			System.out.println("fn3");
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae.getMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionCallStackDemo ecd=new ExceptionCallStackDemo();
		ecd.fn3();
		System.out.println("exception call stack");

	}

}
