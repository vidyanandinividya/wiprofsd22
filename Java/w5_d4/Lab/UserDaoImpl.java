package w5_d4.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserDaoImpl implements UserDao {
	Scanner sc=new Scanner(System.in);
	public static List<User> users;
	public UserDaoImpl()
	{	users = new ArrayList<User>();
	}
	public void addUser(User us)
	{
		users.add(us);
	}
	@Override
	public void registerUser() {
		System.out.println("Do you want to register as a 1.client or 2.visitor?");
		int choice=sc.nextInt();
		User us = choice == 1 ? new Client() : new Visitor();
		System.out.println("Enter user name");
		us.setUsername(sc.next());
		System.out.println("Enter user email id");
		us.setEmailId(sc.next());
		System.out.println("Enter user password");
		us.setPassword(sc.next());
		addUser(us);
		System.out.println(us.toString());
	}

	@Override
	public User loginUser() {
		User result=null;
			System.out.println("Enter username");
			String uname=sc.next();
			System.out.println("Enter password");
			String pwd=sc.next();
			for(User u : users)
			{
				if(u.getUsername().equals(uname) && u.getPassword().equals(pwd))
				{
					System.out.println("Logged in  User:\t"+u.getUsername());
					result=u;
					
					
				}
			}
			return result;
	}
}
		

	


