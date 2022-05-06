package entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String city;
	private String state;
	private int phone;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="student_id", unique=true)
	private Student student;
	

	public Address() {
		super();
	}


	public Address(String city, String state, int phone) {
		super();
		this.city = city;
		this.state = state;
		this.phone = phone;
		
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public int getPhone() {
		return phone;
	}


	public void setPhone(int phone) {
		this.phone = phone;
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", phone=" + phone + ", student=" + student + "]";
	}
	
	
}
