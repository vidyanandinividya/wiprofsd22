package w5_d2;

class InvalidProduct extends Exception
{
	public InvalidProduct(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}

public class CustomeExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			productCheck(35);
		}
		catch(InvalidProduct ip)
		{
			System.out.println(ip.getMessage());
		}

	}
	private static void productCheck(int weight) throws InvalidProduct
	{
		if(weight<60)
		{
			throw new InvalidProduct("Invalid Product");
		}
		else
		{
			System.out.println("Valid Product");
		}
	}

}
