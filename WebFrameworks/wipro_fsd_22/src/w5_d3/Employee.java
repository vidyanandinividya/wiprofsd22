package w5_d3;

public class Employee  implements Comparable<Employee>{
int empId;
String empName;
public Employee(int empId,String empName)
{
	this.empId=empId;
	this.empName=empName;
}
@Override
public int compareTo(Employee e) {
	if(empId==e.empId)
		return 0; //if the current object is equal to the specified object
	else if(empId>e.empId)
		return 1; //if the current object is greater than specified object
	else
		return -1; //if the current object is less then specified object
}
		
}
