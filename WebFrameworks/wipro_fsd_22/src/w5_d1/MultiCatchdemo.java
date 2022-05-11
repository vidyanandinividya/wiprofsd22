package w5_d1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter num1:");
			int num1=sc.nextInt();
			if(2%num1==0)
			System.out.println("The number is a factor of 2");
		}
		catch(ArithmeticException|InputMismatchException ae)
		{
			System.out.println(ae.getMessage());
		}
		finally
		{
			
				System.out.println("Relese resource");
			
		}

	}

}
