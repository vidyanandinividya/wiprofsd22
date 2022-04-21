package w5_d2.Lab2;

import java.util.Scanner;

public class TaskDaoImpl implements TaskDao {
	Scanner sc=new Scanner(System.in);
	private Task[] tasks;
	private int index;
	TaskDaoImpl()
	{
		index=0;
		tasks=new Task[5];
	}

	@Override
	public void addTask() {
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
			tasks[index++]=task;
		}
		showTask();
		
	}

	@Override
	public void showTask() {
		for(int i=0;i<tasks.length;i++)
		{
			if(tasks[i]!=null)
			{
				System.out.println(tasks[i]);
			}
		}
		
	}
	@Override
	public void showTask(int id) {
		for(int i=0;i<tasks.length;i++)
		{
			if(tasks[i]!=null && tasks[i].getTaskId()==id)
			{
				System.out.println(tasks[i]);
			}
		}
		
	}
	@Override
	public void showTask(String uname) {
		
		for(int i=0;i<tasks.length;i++)
		{
			if(tasks[i]!=null && tasks[i].getAssignedTo()!=null && tasks[i].getAssignedTo().equals(uname) )
			{
				System.out.println(tasks[i]);
			}
		}
		
	}

	@Override
	public void updateTask() {
		System.out.println("Enter the task id to find");
		int id=sc.nextInt();
		showTask(id);
		System.out.println("Enter the new task Text");
		String newText=sc.next();
		for(int i=0;i<tasks.length;i++)
		{
			if(tasks[i]!=null && tasks[i].getTaskId()==id)
			{
				tasks[i].setTaskText(newText);
			}
		}
		showTask(id);
		
		
	}

	@Override
	public void deleteTask() {
		System.out.println("Enter the task id to delete");
		int id=sc.nextInt();
		
		
		for(int i=0;i<tasks.length;i++)
		{
			if(tasks[i]!=null && tasks[i].getTaskId()==id)
			{
		
					tasks[i]=null;
					System.out.println("Task deleted");
					
			}
			else
			{
				System.out.println("Task id is not available");
			}
		}
		showTask(id);
		
	}

	@Override
	public void searchTask() {
		System.out.println("Enter the task id to find");
		int id=sc.nextInt();
		for(int i=0;i<tasks.length;i++)
		{
			if(tasks[i].getTaskId()==id)
			{
				showTask(id);
			}
			else
			{
				System.out.println("Task ID is not available");
			}
		}
		
		
	}

	@Override
	public void assignTask() {
		showTask();
		System.out.println("Enter the task id to assign");
		int id=sc.nextInt();
		for(int i=0;i<UserDaoImpl.users.length;i++)
		{
			if(UserDaoImpl.users[i]!=null && UserDaoImpl.users[i] instanceof Visitor)
			{
				System.out.println(UserDaoImpl.users[i]);
			}
		}
		System.out.println("Enter user name to assign");
		String uname=sc.next();
		for(int i=0;i<tasks.length;i++)
		{
			if(tasks[i]!=null && tasks[i].getTaskId()==id)
			{
				tasks[i].setAssignedTo(uname);
			}
		}
		showTask(id);
		
	}

	

}
