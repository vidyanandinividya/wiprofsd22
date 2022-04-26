package w5_d5;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {

	private AtomicInteger i=new AtomicInteger();
	int j=0;
	Lock lockForI=new ReentrantLock();
	Lock lockForJ=new ReentrantLock();
	 public void incrementi()
	{
		 //Get Lock
		// lockForI.lock();
		//i++;
		//lockForI.unlock();
		//Release Lock
		 i.incrementAndGet();
		
	}
	
	public void incrementj()
	{
		//Get Lock
		lockForJ.lock();
		j++;
		lockForJ.unlock();
		//Release Lock
		
	}
	public int getJ()
	{
		return j;
	}
}
