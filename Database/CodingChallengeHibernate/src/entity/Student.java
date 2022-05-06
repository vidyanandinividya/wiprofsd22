package entity;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int student_id;
	private String name;
	private String email;
	@OneToOne(mappedBy="student",cascade=CascadeType.ALL)
	private Address adress;
	@OneToMany(mappedBy="student",cascade= {CascadeType.PERSIST,
			CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
	private List<Course> courses;
	public Student() {
		super();
	}
	public Student(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Address getAdress() {
		return adress;
	}
	public void setAdress(Address adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", name=" + name + ", email=" + email + "]";
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	
	
	
	
	
}
