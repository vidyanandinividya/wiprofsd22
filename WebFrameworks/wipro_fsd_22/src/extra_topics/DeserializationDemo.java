package extra_topics;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) {
		try
		{
			ObjectInputStream ois=new ObjectInputStream
					(new FileInputStream("emp.txt"));
			Employee e1=(Employee)ois.readObject();
			Employee e2=(Employee)ois.readObject();
			Employee e3=(Employee)ois.readObject();
			Employee e4=(Employee)ois.readObject();
			System.out.println(e1.eid+"\t"+e1.ename+"\t"+e1.salary);
			System.out.println(e2.eid+"\t"+e2.ename+"\t"+e2.salary);
			System.out.println(e3.eid+"\t"+e3.ename+"\t"+e3.salary);
			System.out.println(e4.eid+"\t"+e4.ename+"\t"+e4.salary);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
