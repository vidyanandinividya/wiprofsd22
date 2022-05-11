package w5_d4.Lab;

public class Task {
	private int taskId;
	private String taskTitle;
	private String taskText;
	private String assignedTo;
	private static int count=1;
	public int getTaskId() {
		return taskId;
	}
	public String getTaskTitle() {
		return taskTitle;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public void setTaskTitle(String taskTitle) {
		this.taskTitle = taskTitle;
	}
	public void setTaskText(String taskText) {
		this.taskText = taskText;
	}
	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}
	public String getTaskText() {
		return taskText;
	}
	public String getAssignedTo() {
		return assignedTo;
	}
	
	
	public Task() {
		super();
		this.taskId=count;
		count++;
	}
@Override
public String toString()
	{
		return taskId+"\t"+taskTitle+"\t"+taskText+"\t"+assignedTo;
	}
	
	

}
