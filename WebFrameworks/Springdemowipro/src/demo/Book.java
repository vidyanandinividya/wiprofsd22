package demo;

public class Book {
	private String name;
	private String type;
	public Book()
	{
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", type=" + type + "]";
	}
	

}
