package w4_d5;

import java.util.ArrayList;
import java.util.List;

public class Organization {
	private String name;
	List<Employee> employeeList;
	public Organization(String name)
	{
		this.name=name;
	}
	public void setEmployeeList()
	{
		Employee e1=new Employee("Hary");
		Employee e2=new Employee("John");
		Employee e3=new Employee("Alie");
		ArrayList<Employee> employees=new ArrayList<Employee>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		this.employeeList=employees;
	}
	public String getName()
	{
		return this.name;
	}
	public List<String> getEmployeeList()
	{
		List<Employee> emp=this.employeeList;
		List<String> names=new ArrayList<String>();
		for(Employee e:emp)
		{
			names.add(e.getName());
		}
		return names;
	}
	

}
