package com.lxisoft.customer;
import java.sql.*;
class Customer
{
	public static void main(String[] args)
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","root");
		Statement stmt=con.createStatement();
		ResultSet result=stmt.executeQuery("Select * from customer");
		//System.out.println(result.getInt("customer_id"));
		while(result.next())
		{
		System.out.println(result.getInt("customer_id")+result.getString("customer_name"));
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}