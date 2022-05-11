package w5_d5;

import java.io.File;

public class FileInfoDemo {

	public static void main(String[] args) {
		File file=new File("file1.txt");
		if(file.exists())
		{
			System.out.println("File Name:"+file.getName());
			System.out.println("Absolute Path:"+file.getAbsolutePath());
			System.out.println("Writable?"+file.canWrite());
			System.out.println("File size in bytes:"+file.length());
		}
		else
		{
			System.out.println("File does not exist");
		}
	}

}
