package wiprofsd;

public class Validation {
	
	public void validate() //business logic
	{
		System.out.println("validation stuff");
	}
	public void validate(int age) throws Exception //business logic
	{
		if(age<18)
		{
			throw new ArithmeticException("Not valid Age");
		}
		else
		{
			System.out.println("Vote Confirmed");
		}
	}

}
