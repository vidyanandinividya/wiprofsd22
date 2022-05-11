package w4_d4.lab4;

import java.util.ArrayList;
import java.util.List;

public class Department {
private String name;
List<Professor> staff;
public Department(String name) {
	super();
	this.name = name;
}
public String getName() {
	return name;
}
public List<String> getStaff() {
	List<String> professor_names=new ArrayList<String>();
	for(Professor prof:this.staff)
	{
		professor_names.add(prof.getName());
	}
	return professor_names;
}
public void setStaff(List<Professor> staff)
{
	this.staff=staff;
}
}
