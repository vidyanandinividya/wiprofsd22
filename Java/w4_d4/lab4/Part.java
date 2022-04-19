package w4_d4.lab4;

public class Part {
	private String identifier;
	private String manufacturer;
	private String description;
	/*public Part(String identifier, String manufacturer, String description) {
		super();
		this.identifier = identifier;
		this.manufacturer = manufacturer;
		this.description = description;
	}*/
	public String getIdentifier() {
		return identifier;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public String getDescription() {
		return description;
	}
	protected void print()
	{
		System.out.println("Print from Parent class");
	}
	

}
