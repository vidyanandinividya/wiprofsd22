package w5_d5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFileDemo {

	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("file2.txt");
			fw.write("Great Learning Wipro");
			fw.close();
			System.out.println("Successfullt wrote to the file");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File file=new File("file2.txt");
		try {
			Scanner sc=new Scanner(file);
			while(sc.hasNextLine())
			{
				String data=sc.nextLine();
				System.out.println(data);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File file1=new File("file1.txt");
		if(file1.exists())
		{
			file1.delete();
			System.out.println("File deleted successfully");
		}
		else
		{
			System.out.println("Unexpected error occurs");
		}
		
		

	}

}
