package w5_d1;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Try block");
			try
			{
				System.out.println("Enter num1:");
				int num1=sc.nextInt();
				System.out.println("Enter num2:");
				int num2=sc.nextInt();
				System.out.println("Result:"+num1/num2);
			}
			catch(ArithmeticException ae)
			{
				System.out.println(ae.getMessage());
			}
			try
			{
				int arr[]=new int[4];
				arr[4]=12;
			}
			catch(ArrayIndexOutOfBoundsException aio)
			{
				System.out.println(aio.getMessage());
			}
		
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}

}
