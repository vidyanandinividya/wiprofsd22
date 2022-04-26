package w5_d5;

public class DeadLockDemo {

	public static void main(String[] args) {
		final String s1="wipro";
		final String s2="GL";
		Thread t1=new Thread() {
			public void run()
			{
				synchronized(s1)
				{
					System.out.println("Thread1: Locked s1");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				synchronized(s2)
				{
					System.out.println("Thread1: Locked s2");
				}
			}
				
			}
		};
		Thread t2=new Thread() {
			public void run()
			{
				synchronized(s1)
				{
					System.out.println("Thread2: Locked s1");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				synchronized(s2)
				{
					System.out.println("Thread2: Locked s2");
				}
			}
				
			}
		};
		t1.start();
		t2.start();
	}

}
