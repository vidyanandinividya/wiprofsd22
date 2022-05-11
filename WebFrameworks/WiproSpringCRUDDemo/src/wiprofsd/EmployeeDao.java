package wiprofsd;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class EmployeeDao {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	private PlatformTransactionManager ptm;
	
	public PlatformTransactionManager getPtm() {
		return ptm;
	}
	public void setPtm(PlatformTransactionManager ptm) {
		this.ptm = ptm;
	}
	public DataSource getDataSource() {
		return dataSource;
	}
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		jdbcTemplate=new JdbcTemplate(this.dataSource);
	}
	
	public int addEmployee(Employee e)
	{
		int count=0;
		String query="insert into employee values(?,?,?)";
		count=jdbcTemplate.update(query,e.getEid(),e.getEname(),e.getAge());
		return count;
	}
	public List<Employee> getAllEmployees()
	{
		String sql="SELECT * from employee";
		List<Employee> listemp=jdbcTemplate.query(sql,new EmployeeMapper());
		return listemp;
	}
	public void performMultiActions(Employee e)
	{
		System.out.println("Performing Multiple Actions");
		TransactionDefinition td=new DefaultTransactionDefinition();
		TransactionStatus ts=ptm.getTransaction(td);
		try
		{
			String query="insert into employee values(?,?,?)";
			int count=jdbcTemplate.update(query,e.getEid(),e.getEname(),e.getAge());
			System.out.println(count+"record added");
			String sql="Select * from employee where age=(select max(age) from employee)";
			List<Employee> empAge=jdbcTemplate.query(sql, new EmployeeMapper());
			System.out.println("max age"+empAge);
			ptm.commit(ts);
		}
		catch(Exception ex)
		{
			System.out.println("TRansaction Failed"+ex.getMessage());
			ptm.rollback(ts);
		}
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	

}
