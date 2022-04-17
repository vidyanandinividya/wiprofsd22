package day2;

public class Student {
	String name,emailId;
	int grade;
	public Student(String name, String emailId, int grade) {
		//super();
		this.name = name;
		this.emailId = emailId;
		this.grade = grade;
	}
	

	public String getName() {
		return name;
	}


	public String getEmailId() {
		return emailId;
	}


	public int getGrade() {
		return grade;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student []st=new Student[3];
		st[0]=new Student("peter","p@gmail.com",3);
		st[1]=new Student("john","john@gmail.com",4);
		st[2]=new Student("lisa","lisa@gmail.com",5);
		for(int i=0;i<st.length;i++)
		{
			System.out.print(st[i].getName()+"\t"+st[i].getEmailId()+"\t"+st[i].getGrade());
			System.out.println();
		}
		

	}

}
