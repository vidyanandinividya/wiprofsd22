package w4_d4.lab4;

public class Engine extends Part{
	private String engineType;
	
public Engine()
{
	}
	/*public Engine(String engineType,String identifier, String manufacturer, String description) {
		super(identifier, manufacturer, description);
		// TODO Auto-generated constructor stub
		this.engineType=engineType;
	}*/

	public String getEngineType() {
		return engineType;
	}
	@Override
	public void print()
	{
		super.print();
		System.out.println("Print from child class");
	}
	
	

}
