package w5_d5.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskDaoImpl implements TaskDao {
	Scanner sc=new Scanner(System.in);
	private List<Task> tasks;
	TaskDaoImpl() {
		tasks= new ArrayList<Task>();
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
			tasks.add(task);
		}
		showTask();
		
	}

	@Override
	public void showTask() {
		for(Task t : tasks)
		{
			System.out.println(t);
		}
		
	}
	@Override
	public void showTask(int id) {
		for(Task t : tasks)
		{
			if(t.getTaskId()==id)
			{
				System.out.println(t);
			}
		}
		
	}
	@Override
	public void showTask(String uname) {
		
		for(Task t : tasks)
		{
			if(t.getAssignedTo()!=null && t.getAssignedTo().equals(uname) )
			{
				System.out.println(t);
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
		for(Task t : tasks)
		{
			if(t.getTaskId()==id)
			{
				t.setTaskText(newText);
			}
		}
		showTask(id);
		
		
	}

	@Override
	public void deleteTask() {
		System.out.println("Enter the task id to delete");
		int id=sc.nextInt();
		boolean taskFound = false;
		for(Task t : tasks)
		{
			if(t.getTaskId()==id) {
				taskFound = true;
				tasks.remove(t);
				break;
			}
		}
		System.out.println(taskFound ?  "Task deleted successfully" : "Task Not found");
		showTask(id);
		
	}

	@Override
	public void searchTask() {
		System.out.println("Enter the task id to find");
		int id=sc.nextInt();
		boolean taskFound = false;
		for(Task t : tasks)
		{
			if(t.getTaskId()==id) {
				taskFound = true;
				showTask(id);
			}
		}
		if(!taskFound)
			System.out.println("Task not found");
		
		
	}

	@Override
	public void assignTask() {
		showTask();
		System.out.println("Enter the task id to assign");
		int id=sc.nextInt();
		for(User u : UserDaoImpl.users)
		{
			if(u instanceof Visitor)
			{
				System.out.println(u);
			}
		}
		System.out.println("Enter user name to assign");
		String uname=sc.next();
		for(Task t : tasks)
		{
			if(t.getTaskId()==id)
			{
				t.setAssignedTo(uname);
			}
		}
		showTask(id);
		
	}

	

}
