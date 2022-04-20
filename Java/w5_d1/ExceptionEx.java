package w5_d1;

import java.io.IOException;

public class ExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(test());
		

	}
	private static void test1()
	{
		try
		{}
		catch(ArithmeticException ioe)
		{}
	}
	
	private static boolean test()
	{
		boolean flag=false;
		try
		{
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Finally");
		}
		System.out.println("Out side try-catch-finally");
		return flag;
	}

}
