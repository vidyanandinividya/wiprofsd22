package w5_d4;

/*class MyTask
{
 void executeTask()
 {
	 for(int j=0;j<5;j++)
		{
			System.out.println("Priniting j #"+j);
		} 
 }
}*/

class CA
{
	}

//MyTask IS-A Thread
class MyTask extends CA implements Runnable
{
@Override
 public void run()
 {
	 for(int j=0;j<5;j++)
		{
			System.out.println("Priniting j #"+j);
		} 
 }
}

class YourTask extends Thread
{
@Override
 public void run()
 {
	 for(int k=0;k<5;k++)
		{
			System.out.println("Priniting k #"+k);
		} 
 }
}

public class ThreadDemo {

	//main method represents main thread
	public static void main(String[] args) {
		//whatever we write here will be executed by main thread
		//threads always executes the jobs in sequence
		//Execution Context
		
		//Job 1
		System.out.println("Application Started");
		
		//Job 2
		MyTask task=new MyTask();
		
		//task.executeTask();
		//task.start();
		MyTask mt=new MyTask();
		Thread t=new Thread(mt);
		t.setDaemon(true);
		t.start();
		System.out.println(t.isDaemon());
		
		
		new Thread(new MyTask()).start();
		new YourTask().start();
		//Job 3
		for(int i=0;i<5;i++)
		{
			System.out.println("Priniting i #"+i);
		}
		
		//Job4
		System.out.println("Application Finished");

	}

}
