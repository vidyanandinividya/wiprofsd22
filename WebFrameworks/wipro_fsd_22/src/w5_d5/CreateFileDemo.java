package w5_d5;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo {

	public static void main(String[] args) {
		File file=new File("file1.txt");
		try {
			if(file.createNewFile())
			{
				System.out.println("File created:"+file.getName());
				
			}
			else
			{
				System.out.println("File already Exists");
				System.out.println("Path:"+file.getPath());
				System.out.println("Parent:"+file.getParent());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("An error occured");
			e.printStackTrace();
		}

	}

}
