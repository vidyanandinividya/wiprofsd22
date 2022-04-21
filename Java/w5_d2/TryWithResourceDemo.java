package w5_d2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

class MyResource implements AutoCloseable
{

	@Override
	public void close() throws Exception {
		System.out.println("Resource Closed");
		
	}
	
	public void doSomething()
	{
		System.out.println("MyResource-->Do Something");
	}

}

class MyResource1 implements AutoCloseable
{
	@Override
	public void close() throws Exception {
		System.out.println("MyResource1 Closed");
		
	}
	
	public void doSomething()
	{
		System.out.println("MyResource1-->Do Something");
	}
}

public class TryWithResourceDemo {

	public static void main(String[] args) {
		/*Scanner sc=null;
		try
		{
			sc=new Scanner(new File("test.txt"));
			while(sc.hasNext())
			{
				System.out.println(sc.nextLine());
			}
		}
		catch(FileNotFoundException fnf)
		{
			System.out.println(fnf.getMessage());
		}
		finally
		{
			if(sc!=null)
			{
				sc.close();
			}
		}*/
		
		//Try with  default resource 
		
		/*try(Scanner sc=new Scanner(new File("test.txt"));
			PrintWriter pw=new PrintWriter(new File("test.txt")))
		{
			while(sc.hasNext())
			{
				System.out.println(sc.nextLine());
			}
		}
		catch(FileNotFoundException fnf)
		{
			System.out.println(fnf.getMessage());
		}*/
final MyResource mr=new MyResource();
MyResource1 mr1=new MyResource1();
		try(mr;mr1)
		{
			mr.doSomething();
			mr1.doSomething();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
