package w5_d2;


public class ExceptionDemo {

	private static void divide(int num1,int num2) throws ArithmeticException,NullPointerException
	{
	
		if(num2==0)
		{
			throw new ArithmeticException("Divide by Zero");
		}
		else
		{
			System.out.println("Result:"+num1/num2);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		divide(10,0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae.getMessage());
		}
		
			
	}
	
	

}
