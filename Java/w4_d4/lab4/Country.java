package w4_d4.lab4;

import java.util.ArrayList;
import java.util.List;

public class Country {
	private String name;
	List<sportPersons> sp;
	public Country(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public List<String> getSp() {
		List<sportPersons> listsp=this.sp;
		List<String> names=new ArrayList<String>();
		for(sportPersons sp1:listsp)
		{
			names.add(sp1.getName());
		}
		return names;
	}
	public void setSp(List<sportPersons> sp) {
		this.sp = sp;
	}
	

}
