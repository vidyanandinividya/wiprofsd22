package w5_d1;

public class ExceptionEx1 {
	public static void main(String args[])
	{
		System.out.println("Value of X"+test());
	}
	private static int test()
	{
		int x=10;
		try{
			return x;}
		catch(Exception e)
		{
			x=20;
			System.out.println(e.getMessage()+x);
			return x;
		}
		finally
		{
			x=30;
			System.out.println("The value of X is:"+x);
			return x;
		}
		
	}

}
