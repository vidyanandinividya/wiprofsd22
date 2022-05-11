package w4_d4.lab4;

import java.util.ArrayList;
import java.util.List;

public class AggregationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sportPersons sp1=new sportPersons("abc");
		sportPersons sp2=new sportPersons("Virat");
		sportPersons sp3=new sportPersons("Dhoni");
		Country india=new Country("India");
		List<sportPersons> listsp=new ArrayList<>();
		listsp.add(sp1);
		listsp.add(sp2);
		listsp.add(sp3);
		india.setSp(listsp);
		System.out.println(india.getName()+"\t"+india.getSp());

	}

}
