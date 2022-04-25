package w5_d4;

class Printer
{
	//synchronized void printDocuments(int numOfCopies,String docName)
	synchronized void printDocuments(int numOfCopies,String docName)
	{
		for(int i=1;i<numOfCopies;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Printing"+docName+" "+i);
		}
	}}
class MyThread extends Thread
{
	Printer pRef;
	MyThread(Printer p)
	{
		pRef=p;
	}
	@Override
	public void run()
	{
		synchronized(pRef)
		{
		pRef.printDocuments(5,"Doc1");
		}
	}
	
}
class YourThread extends Thread
{
	Printer pRef;
	YourThread(Printer p)
	{
		pRef=p;
	}
	@Override
	public void run()
	{
		synchronized (pRef) {
			pRef.printDocuments(5,"Doc2");
		}
		
	}
	
}

public class SyncDemo {

	public static void main(String[] args) {
		
		//we have only one single object of printer
		Printer printer=new Printer();
		MyThread mThread=new MyThread(printer); //MyThread is having reference to the printer object
		YourThread yThread=new YourThread(printer);//YourThread is having reference to the printer object
		//scenario is that we have multiple thread working on the same Printer object
		//if multiple threads are going to work on the same single object we must synchronize them
		
		mThread.start();
		/*try {
			mThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		yThread.start();
	}

}
