package w5_d4;

class Thread2 extends Thread
{
int total;
@Override
public void run()
{
	synchronized(this)
	{
		for(int i=0;i<=10;i++)
		{
			total+=i;
		}
		notify();
	}
	
	}
}

public class Thread1 {

	public static void main(String[] args) {
		
Thread2 obj=new Thread2();
obj.start();
synchronized(obj)
{
	try
	{
		System.out.println("Waiting for Thread2 to complete");
		obj.wait();
	}
	catch(InterruptedException ie)
	{
		System.out.println(ie.getMessage());
	}
	System.out.println("Total is:"+obj.total);
	
}
	}

}
