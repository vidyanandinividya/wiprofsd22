package demo.model;

import java.io.Serializable;

public class EmployeeVO implements Serializable {
	
	private static final long serialVersionUID=1L;
	
	private Integer id;
	private String firstname;
	private String lastname;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	@Override
	public String toString() {
		return "EmployeeVO [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	

}
