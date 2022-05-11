package extra_topics;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable
{
	int eid;
	String ename;
	transient int salary;
	public Employee(int eid, String ename,int salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary=salary;
	}
	
}
public class SerializationDemo {

	public static void main(String[] args) {
		try {
		Employee e1=new Employee(1, "John",100);
		Employee e2=new Employee(2, "Jerry",200);
		Employee e3=new Employee(3, "tom",300);
		Employee e4=new Employee(4, "Annie",400);
		
			FileOutputStream fis=new FileOutputStream("emp.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fis);
			oos.writeObject(e1);
			oos.writeObject(e2);
			oos.writeObject(e3);
			oos.writeObject(e4);
			oos.flush();
			oos.close();
			System.out.println("Serialized");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
