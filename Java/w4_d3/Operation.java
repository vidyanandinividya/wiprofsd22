package w4_d3;

import java.util.Arrays;

public class Operation {
	private Task[] task;
	private int index;
	Operation()
	{
		index=0;
		task=new Task[5];
	}
	public void addTask(Task t)
	{
		task[index++]=t;
	}
	public void showAllTask()
	{
		for(int i=0;i<task.length;i++)
		{
			if(task[i]!=null)
			{
				System.out.println(task[i]);
			}
		}
	}
	public void showTaskById(int id)
	{
		for(int i=0;i<task.length;i++)
		{
			if(task[i].getTaskId()==id)
			{
				System.out.println(task[i]);
				break;
			}
		}
	}
	public Task searchTaskById(int id)
	{
		Task tasks=null;
		for(int i=0;i<task.length;i++)
		{
			if(task[i]!=null && task[i].getTaskId()==id)
			{
			
					tasks=task[i];
				
			}
		}
		return tasks;
	}
	public Task searchTaskByTitle(String title)
	{
		Task tasks=null;
		for(int i=0;i<task.length;i++)
		{
			if(task[i]!=null && task[i].getTaskTitle().equals(title))
			{
				
					tasks=task[i];
				
			}
		}
		return tasks;
	}
	public Task searchTaskByText(String text)
	{
		Task tasks=null;
		for(int i=0;i<task.length;i++)
		{
			if(task[i]!=null && task[i].getTaskText().equals(text))
			{
				
					tasks=task[i];
				
			}
		}
		return tasks;
	}
	public Task updateTaskById(int id,String updateValue,int updateOption )
	{
		Task tasks=null;
		for(int i=0;i<task.length;i++)
		{
			if(task[i]!=null && task[i].getTaskId()==id)
			{
					tasks=task[i];
					break;
			}
		}
		switch(updateOption)
		{
			case 1:
				tasks.setTaskTitle(updateValue);
				break;
			case 2:
				tasks.setTaskText(updateValue);
				break;
			case 3:
				tasks.setAssignedTo(updateValue);
				break;
		}
		
		return tasks;
	}
	public boolean deleteTask(int id)
	{
		boolean status=false;
		for(int i=0;i<task.length;i++)
		{
			if(task[i]!=null)
			{
				if(task[i].getTaskId()==id)
				{
					task[i]=null;
					status=true;
				}
			}
		}
		return status;
		
	}

}
