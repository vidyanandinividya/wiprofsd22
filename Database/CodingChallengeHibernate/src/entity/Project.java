package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Project {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int project_id;
	private String project_name;
	@ManyToMany(mappedBy="projects")
    private List<Employee> emps = new ArrayList<Employee>();
	public Project() {
		super();
	}
	public Project(String project_name) {
		super();
		this.project_name = project_name;
	}
	public int getProject_id() {
		return project_id;
	}
	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public List<Employee> getEmps() {
		return emps;
	}
	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}
	@Override
	public String toString() {
		return "Project [project_id=" + project_id + ", project_name=" + project_name + "]";
	}
	

}
