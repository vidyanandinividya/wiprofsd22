package w5_d1;

public class ExceptionExample {

	public static void main(String[] args) {
		System.out.println(excep1());
		//excep1();

	}
	private static String excep1()
	{
		try
		{
			String str=null;
			return str.toString();
			//System.out.println(str);
		}
		finally
		{
			return "Hello world";
		}
	}

}
