package w4_d3;

class Person
{
	
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<1 || age>100)
		{
			System.out.println("Invalid age");
		}
		this.age = age;
	}
	
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();
		p1.setAge(10);
		p1.setName("John");
		
				

	}

}
