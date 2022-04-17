package day2;
import java.util.Scanner;


public class Task {

	int []task=new int[5];
	int choice;
	Scanner sc=new Scanner(System.in);
	
	public void input()
	{
		
		do
		{
			System.out.println("Menu");
			System.out.println("1.Add");
			System.out.println("2.Update");
			System.out.println("3.Delete");
			System.out.println("4.Search");
			System.out.println("0.Exit");
			System.out.println("Enter the choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
					add();
					display();
					break;
			case 2:
					update();
					display();
					break;
			case 3:
					delete();
					display();
					break;
			case 4:
					//search();
					break;
			case 0:
				System.exit(choice);
				break;
			default:
				System.out.println("Enter the valid option");
			}
			
			
		}while(choice!=0);

	}
	void add()
	{
		for(int i=0;i<task.length;i++)
		{
			System.out.println("Enter the task");
			task[i]=sc.nextInt();
		}
	}
	void display()
	{
		for(int i=0;i<task.length;i++)
		{
			System.out.println(task[i]);
			
		}
	}
	void update()
	{
		System.out.println("Enter the old value of task you want to update");
		int utask=sc.nextInt();
		for(int i=0;i<task.length;i++)
		{
			if(task[i]==utask)
			{
				System.out.println("Enter the new value");
				utask=sc.nextInt();
				task[i]=utask;
			}
		}
		
	}
	void delete()
	{
		System.out.println("Enter the task you want to delete");
		int utask=sc.nextInt();
		for(int i=0;i<task.length;i++)
		{
			if(task[i]==utask)
			{
				int j=i;
				task[i]=task[i+1];
				
			}
			
		}
		
	}
}
