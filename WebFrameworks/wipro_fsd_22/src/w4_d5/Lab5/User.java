package w4_d5.Lab5;

public class User< T> {
	private int userId;
	private String username;
	private String password;
	private String emailId;
	private static int countUser=1;
	public <T>User()
	{
		this.userId=countUser;
		countUser++;
		
	}
	public int getUserId() {
		return userId;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	@Override
	public String toString()
	{
		return userId+"\t"+username+"\t"+password+"\t"+emailId;
	}
	

}
