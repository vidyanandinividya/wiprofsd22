package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int emp_id;
	private String empname;
	private String empemail;
	
	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Employee_Project", 
        joinColumns = @JoinColumn(name = "Emp_id"), 
        inverseJoinColumns = { @JoinColumn(name = "project_id") })
    private List<Project> projects = new ArrayList<Project>();

	public Employee() {
		super();
	}

	public Employee(String empname, String empemail) {
		super();
		this.empname = empname;
		this.empemail = empemail;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpemail() {
		return empemail;
	}

	public void setEmpemail(String empemail) {
		this.empemail = empemail;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", empname=" + empname + ", empemail=" + empemail + "]";
	}
	

}
