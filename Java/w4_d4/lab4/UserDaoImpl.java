package w4_d4.lab4;

import java.util.Scanner;

public class UserDaoImpl implements userDAO {
	Scanner sc=new Scanner(System.in);
	public static User users[];
	private int index;
	
	public UserDaoImpl()
	{
		users=new User[5];
		index=0;
	}
	public void addUser(User us)
	{
		users[index++]=us;
	}

	@Override
	public void registerUser() {
		System.out.println("Do you want to register as a 1.Client or 2.Visitor?");
		int choice=sc.nextInt();
		User us=choice==1?new Client():new Visitor();
		System.out.println("Enter user name");
		us.setUsername(sc.next());
		System.out.println("Enter password");
		us.setPassword(sc.next());
		System.out.println("Enter email id");
		us.setEmailId(sc.next());
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
		for(int i=0;i<users.length;i++)
		{
			if(users[i]!=null)
			{
				if(users[i].getUsername().equals(uname) && users[i].getPassword().equals(pwd))
				{
					System.out.println("Logged in user :"+users[i].getUsername());
					result=users[i];
				}
			}
		}
		
		return result;
	}

}
