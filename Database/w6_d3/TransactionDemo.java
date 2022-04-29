package w6_d3;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;


/*
 * when a new order is saved (a new row inserted into the table orders), the monthly sales also get 
 * updated(a corresponding row gets updated in the table monthly_sales).
 * so these two statements (save order and update sales) should be grouped into a transaction
 * */

public class TransactionDemo {
	String dbURL="jdbc:mysql://localhost:3306/SampleDB";
	String username="root";
	String password="rootroot";
	Connection conn;
	void connect()
	{
	try
		{
		conn=DriverManager.getConnection(dbURL,username,password);
		}
	
	catch(Exception ex)
		{
		System.out.println(ex.getMessage());
		}
	}
	void disconnect()
	{
	try
		{
		conn.close();
		System.out.println("Connection Closed");
		}
	
	catch(Exception ex)
		{
		System.out.println(ex.getMessage());
		}
	}
	public void saveOrder(int productId,Date orderdate,float amount,int reportmonth)
	{
		PreparedStatement order=null;
		PreparedStatement sale=null;
		try
		{
			conn.setAutoCommit(false);
			String saveorder="INSERT INTO orders (product_id,order_date,amount) values(?,?,?)";
			order=conn.prepareStatement(saveorder);
			order.setInt(1, productId);
			order.setDate(2, orderdate);
			order.setFloat(3, amount);
			
			int result=order.executeUpdate();
			Savepoint savepoint=conn.setSavepoint();
			
			String updateTotal="UPDATE monthly_sales set total_amount=total_amount+? where product_id=? and report_month=?";
			sale=conn.prepareStatement(updateTotal);
			sale.setFloat(1,amount);
			sale.setInt(2, productId);
			sale.setInt(3, reportmonth);
			sale.executeUpdate();
			
			conn.commit();
			System.out.println("Transaction Successfull");
		}
		catch(SQLException ex)
		{
			if(conn!=null)
			{
				try
				{
					conn.rollback();
					System.out.println("Transaction Rolled Back");
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
				
			}
		}
		finally
		{
			try
			{
				if(order!=null)
				{
					order.close();
				}
				if(sale!=null)
				{
					sale.close();
				}
				conn.setAutoCommit(true);
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			
		}
	}


	public static void main(String[] args) {
		TransactionDemo td=new TransactionDemo();
		int productId=1;
		int reportMonth=4;
		Date date=new Date(System.currentTimeMillis());
		float amount=600;
		td.connect();
		td.saveOrder(productId, date, amount, reportMonth);
		td.disconnect();
		
	}

}
