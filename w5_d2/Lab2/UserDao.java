package w5_d2.Lab2;

public interface UserDao {
	void registerUser();
	User loginUser() throws UnauthorizedLogin;
	
}
