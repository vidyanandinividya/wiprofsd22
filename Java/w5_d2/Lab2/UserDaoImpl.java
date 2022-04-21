package w5_d2.Lab2;

import java.util.Scanner;

public class UserDaoImpl implements UserDao {
	Scanner sc=new Scanner(System.in);
	public static User users[];
	private int index;
	
	public UserDaoImpl()
	{	users=new User[5];
		index=0;
	}
	public void addUser(User us)
	{
		users[index++]=us;
	}
	//User us=new User();
	@Override
	public void registerUser() {
		System.out.println("Do you want to register as a 1.client or 2.visitor?");
		int choice=sc.nextInt();
		User us = choice == 1 ? new User<Client>() : new User<Visitor>();
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
	public User loginUser() throws UnauthorizedLogin{
		User result=null;
			System.out.println("Enter username");
			String uname=sc.next();
			System.out.println("Enter password");
			String pwd=sc.next();
			for(int i=0;i<users.length;i++)
			{
				if(users[i]!=null)
				{
				if(users[i].getUsername().equals(uname) && users[i].getPassword().equals(pwd))
				{
					System.out.println("Logged in  User"+users[i].getUsername());
					result=users[i];
					
					
				}
				else
				{
					throw new UnauthorizedLogin("Unauthorized login found");
				}
				}
			}
			return result;
	}
}
		

	


