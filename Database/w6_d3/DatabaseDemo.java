package w6_d3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DatabaseDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String dbURL="jdbc:mysql://localhost:3306/SampleDB";
		String username="root";
		String password="rootroot";
		
		try(Connection conn=DriverManager.getConnection(dbURL,username,password))
		{
			//Code to execute SQL queries 
			//INSERT Statement
			/*String sql="INSERT INTO Users(username,password,fullname,email) values(?,?,?,?)";
			PreparedStatement statement=conn.prepareStatement(sql);
			System.out.println("Enter user name");
			String uname=sc.next();
			System.out.println("Enter password");
			String pwd=sc.next();
			System.out.println("Enter full name");
			String fname=sc.next();
			System.out.println("Enter email id");
			String email=sc.next();
			statement.setString(1,uname);
			statement.setString(2,pwd);
			statement.setString(3,fname);
			statement.setString(4,email);
			int result=statement.executeUpdate();
			if(result>0)
			{
				System.out.println("A new user has inserted successfully");
			}*/
			
	//SELECT Statement
			/*String sql="SELECT * from Users";
			Statement statement=conn.createStatement();
			ResultSet rs=statement.executeQuery(sql);
			
			while(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String pass=rs.getString(3);
				String fullname=rs.getString("fullname");
				String email=rs.getString("email");
				
				System.out.println(id + "\t"+name+"\t"+pass+"\t"+fullname+"\t"+email);
				
			}*/
			//UPDATE Statement
			
			/*String sql="UPDATE Users SET password=? where user_id=?";
			PreparedStatement statement=conn.prepareStatement(sql);
			System.out.println("Enter updated password");
			String pwd=sc.next();
			
			System.out.println("Enter user id");
			int uid=sc.nextInt();
			statement.setString(1,pwd);
			statement.setInt(2, uid);
			int result=statement.executeUpdate();
			if(result>0)
			{
				System.out.println("Password updated");
			}*/
			//DELETE Statement
			String sql="DELETE FROM Users where user_id=?";
			PreparedStatement statement=conn.prepareStatement(sql);
			System.out.println("Enter user id");
			int uid=sc.nextInt();
			statement.setInt(1,uid);
			int result=statement.executeUpdate();
			if(result>0)
			{
				System.out.println("data deleted");
			}
			
			
			
		}
			
	
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		

	}

}
