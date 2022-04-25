package w5_d4.Lab;
import java.util.Scanner;
public class Sprint11 {
private static User currentUser;
private static UserDao userDao=new UserDaoImpl();
private static TaskDao taskDao=new TaskDaoImpl();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int opt;
		do {
			
			if(currentUser == null) {
				System.out.println("1.Register User (Client/Visitor)");
				System.out.println("2.Login");
				System.out.print("Enter your option");
				opt=sc.nextInt();
				switch(opt)
				{
				case 1:
					userDao.registerUser();
					break;
				case 2:
					currentUser=userDao.loginUser();
					break;
				default:
					System.out.println("invalid choice");
				}
			} 
			else {
				System.out.println("Task Menu");
				if(currentUser instanceof Visitor) {
					System.out.println("1.Show My Task");
					System.out.println("2.Log out");
					System.out.print("Enter your option");
					opt=sc.nextInt();
					switch(opt)
					{
					case 1:
						taskDao.showTask(currentUser.getUsername());
						break;
					case 2:
						currentUser=null;
						break;
					default:
						System.out.println("invalid choice");
					}
					
				} else {
					
					System.out.println("1.Add Task");
					System.out.println("2.Search Task");
					System.out.println("3.Update Task");
					System.out.println("4.Delete Task");
					System.out.println("5. Assign Task");
					System.out.println("6.Log Out");
					System.out.print("Enter your option");
					opt=sc.nextInt();
					switch(opt)
					{
					case 1:
						taskDao.addTask();
						break;
					case 2:
						taskDao.searchTask();
						break;
					case 3:
						taskDao.updateTask();
						break;
					case 4:
						taskDao.deleteTask();
						break;
					case 5:
						taskDao.assignTask();
						break;
					case 6:
						currentUser=null;
						break;
					default:
						System.out.println("invalid choice");
					}
				}
			}
			
			
			
			}while(opt!=0);
		
	}

}
