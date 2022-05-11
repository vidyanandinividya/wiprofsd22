package wiprofsd;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("beans.xml");
		EmployeeDao dao=(EmployeeDao)app.getBean("edao");
		EmployeeDao dao1=(EmployeeDao)app.getBean("edao1");
		Employee e1=new Employee();
		/*e1.setEid(2);
		e1.setEname("Annie");
		e1.setAge(26);
		int count=dao.addEmployee(e1);
		System.out.println(count+"record added");*/
		/*List<Employee> emplist=dao.getAllEmployees();
		for(Employee emp:emplist)
		{
			System.out.println(emp);
		}*/
		Employee e2=new Employee();
		e2.setEid(3);
		e2.setEname("Annie");
		e2.setAge(23);
		dao1.performMultiActions(e2);
		

	}

}
