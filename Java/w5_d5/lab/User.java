package w5_d5.lab;

import java.time.LocalDateTime;

public class User {
	private int userId;
	private String username;
	private String password;
	private String emailId;
	private LocalDateTime lastLoggedIn;
	private static int countUser=1;
	public User()
	{
		this.userId=countUser;
		countUser++;
		this.lastLoggedIn = LocalDateTime.now();
		
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
	public void setLastLoggedIn(LocalDateTime lastLoggedIn ) {
		this.lastLoggedIn=lastLoggedIn;
	}
	
	public LocalDateTime getLastLoggedIn() {
		return this.lastLoggedIn;
	}
	
	
	@Override
	public String toString()
	{
		return userId+"\t"+username+"\t"+password+"\t"+emailId;
	}
	

}
