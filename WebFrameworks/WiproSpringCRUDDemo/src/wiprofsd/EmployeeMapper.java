package wiprofsd;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs, int arg1) throws SQLException {
		Employee e=new Employee();
		e.setEid(rs.getInt("eid"));
		e.setEname(rs.getString("ename"));
		e.setAge(rs.getInt("age"));
		return e;
	}

}
