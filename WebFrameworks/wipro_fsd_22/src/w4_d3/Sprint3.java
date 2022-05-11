package w4_d3;

import java.util.Scanner;
public class Sprint3 {
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int opt;
		Operation op=new Operation();
		do
		{
			System.out.println("Task Menu");
			System.out.println("1.Add Task");
			System.out.println("2.Search Task");
			System.out.println("3.Update Task");
			System.out.println("4.Delete Task");
			System.out.print("Enter your option");
			opt=sc.nextInt();
			switch(opt)
			{
			case 1:
				System.out.print("Enter the number of task");
				int size=sc.nextInt();
				System.out.println("Enter Task Details:");
				for(int i=0;i<size;i++)
				{
					Task task=new Task();
					System.out.print("Enter Task Title");
					task.setTaskTitle(sc.next());
					System.out.print("Enter Task Text");
					task.setTaskText(sc.next());
					System.out.print("Enter the name the task to be assigned");
					task.setAssignedTo(sc.next());
					op.addTask(task);
				}
				op.showAllTask();
				break;
			case 2:
				System.out.println("Search Task Menu");
				System.out.println("1.Search By Id");
				System.out.println("2.Search By Task Title");
				System.out.println("3.Search By Task text");
				System.out.println("Enter your choice");
				int choice=sc.nextInt();
				if(choice==1)
				{
					System.out.println("Enter the task id to find");
					Task task=op.searchTaskById(sc.nextInt());
					if(task!=null)
					{
						System.out.println(task.toString());
						
						
					}
					else
					{
						System.out.println("The Task ID is not exist");
					}
					
				}
				else if(choice==2)
				{
					System.out.println("Enter the Task Titke to find");
					Task task=op.searchTaskByTitle(sc.next());
					if(task!=null)
					{
						System.out.println(task.toString());
						
					}
					else
					{
						System.out.println("The Task Title is not exist");
					}
					
				}
				else if(choice==3)
				{
					System.out.println("Enter the Task Text to find");
					Task task=op.searchTaskByText(sc.next());
					if(task!=null)
					{
						System.out.println(task.toString());
					}
					else
					{
						System.out.println("The Task Text is not exist");
					}
				}
				else
				{
					System.out.println("Enter the Valid Choice");
				}
				break;
			case 3:
				System.out.println("Enter the task id to find");
				int id=sc.nextInt();
				Task task=op.searchTaskById(id);
				op.showTaskById(id);
				if(task!=null)
				{
					System.out.println("1.Update Task Title");
					System.out.println("2.Update Task Text");
					System.out.println("3.Update Task Assigned");
					System.out.println("Enter your choice");
					int option=sc.nextInt();
					switch(option)
					{
					case 1:
						System.out.println("Enter the new Task Title");
						
						if(op.updateTaskById(id, sc.next(),option)!=null)
						{
							System.out.println("Task Title updated Successfully");
						}
						break;
					case 2:
						System.out.println("Enter the new Task Text");
						
						if(op.updateTaskById(id, sc.next(),option)!=null)
						{
							System.out.println("Task Text updated Successfully");
						}
						break;
					case 3:
						System.out.println("Enter the new Assigned to name");
						
						if(op.updateTaskById(id, sc.next(),option)!=null)
						{
							System.out.println("Task Text updated Successfully");
						}
						break;
					default:
						System.out.println("Wrong option");
						
					}
				
				}
				break;
			case 4:
				System.out.println("Enter the id to delete");
				if(op.deleteTask(sc.nextInt()))
				{
					System.out.println("Successfully deleted Task");
				}
				else
				{
					System.out.println("Id is not available");
				}
				break;
			default:
				System.out.println("Enter the valid option");
			}
			
		}while(opt!=0);
		
	}
		
}