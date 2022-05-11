package w5_d3;

import java.util.HashSet;
import java.util.Set;

class Student
{
	int id;

	public Student(int id) {
		super();
		this.id = id;
	}
	@Override
	public int hashCode()
	{
		return id;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		return this.id==((Student)obj).id;
	}
}
public class HashSetDemo {

	public static void main(String[] args) {
		Set <Student> students=new HashSet<Student>();
		System.out.println(students.add(new Student(10)));
		System.out.println(students.add(new Student(20)));
		System.out.println(students.add(new Student(30)));
		System.out.println(students.add(new Student(10)));
		System.out.println(students.add(new Student(20)));
		System.out.println(students.size());

	}

}
