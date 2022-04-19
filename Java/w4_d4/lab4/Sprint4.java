package w4_d4.lab4;

import java.util.Scanner;

public class Sprint4 {
	private static User curretnUser;
	private static userDAO userDao=new UserDaoImpl();
	private static taskDao taskdao=new TaskDaoImpl();
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int opt=0;
		do
		{
			if(curretnUser==null)
			{
				System.out.println("1.Register User (Client/Visitor)");
				System.out.println("2.Login");
				System.out.println("Enter Your Choice");
				opt=sc.nextInt();
				switch(opt)
				{
				case 1:
					userDao.registerUser();
					break;
				case 2:
					curretnUser=userDao.loginUser();
					break;
				default:
					System.out.println("Invalid choice");
				}
			}
			else
			{
				System.out.println("Task Menu");
				if(curretnUser instanceof Visitor)
				{
					System.out.println("1.Show My Task");
					System.out.println("2.Log out");
					System.out.println("Enter Your Choice");
					opt=sc.nextInt();
					switch(opt)
					{
					case 1:
						taskdao.show(curretnUser.getUsername());
						break;
					case 2:
						curretnUser=null;
						break;
					default:
						System.out.println("Invalid choice");
					}
					
				}
				else
				{
					System.out.println("1.Add Task");
					System.out.println("2.Search Task");
					System.out.println("3.Update Task");
					System.out.println("4.Delete Task");
					System.out.println("5.Assign Task");
					System.out.println("6.Log out");
					
					System.out.println("Enter Your Choice");
					opt=sc.nextInt();
					switch(opt)
					{
					case 1:
						taskdao.addTask();
						break;
					case 2:
						taskdao.searchTask();
						break;
					case 3:
						taskdao.updateTask();
						break;
					case 4:
						taskdao.deleteTask();
						break;
					case 5:
						taskdao.assignTask();
						break;
					case 6:
						curretnUser=null;
						break;
					default:
						System.out.println("Invalid choice");
					}
				}
			}
		}while(opt!=0);
	}

}
