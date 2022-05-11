package demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import demo.model.EmployeeVO;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

	@Override
	public List<EmployeeVO> getAllEmployees() {
		List<EmployeeVO> employees=new ArrayList<>();
		EmployeeVO vo1=new EmployeeVO();
		vo1.setId(1);
		vo1.setFirstname("John");
		vo1.setLastname("Thomas");
		employees.add(vo1);
		EmployeeVO vo2=new EmployeeVO();
		vo2.setId(2);
		vo2.setFirstname("Henry");
		vo2.setLastname("Porter");
		employees.add(vo2);
		return employees;
		
	}

}
