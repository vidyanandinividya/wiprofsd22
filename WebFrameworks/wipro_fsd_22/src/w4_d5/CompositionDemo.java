package w4_d5;

public class CompositionDemo {

	public static void main(String[] args) {
		Organization wipro=new Organization("WIPRO");
		wipro.setEmployeeList();
		System.out.println(wipro.getName()+"\t"+wipro.getEmployeeList());

	}

}
