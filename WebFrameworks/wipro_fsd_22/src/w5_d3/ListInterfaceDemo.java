package w5_d3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(1,"John");
		Employee e2=new Employee(4,"Jack");
		Employee e3=new Employee(2,"Hary");
		Employee e4=new Employee(3,"Annie");
		List<Employee> employees=new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.forEach(e->System.out.println(e.empId+"\t"));
		Collections.sort(employees);
		employees.forEach(e->System.out.println(e.empId+"\t"+e.empName));
		
		
		
	}

}
