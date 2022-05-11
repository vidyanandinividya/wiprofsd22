package w4_d4.lab4;

import java.util.ArrayList;
import java.util.List;

public class AssociationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor p1=new Professor("John");
		Professor p2=new Professor("Jack");
		
		Department it=new Department("IT");
		List<Professor> staff_it=new ArrayList<Professor>();
		staff_it.add(p1);
		staff_it.add(p2);
		
		it.setStaff(staff_it);
		System.out.println("The staff of Department\t"+ it.getName()+"\tis\t"+it.getStaff());
		

	}

}
