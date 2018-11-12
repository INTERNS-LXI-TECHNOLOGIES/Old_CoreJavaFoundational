package com.lxisoft.customer;
import java.sql.*;
import java.util.Scanner;

class Customer
{
	public static void main(String[] args)
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Scanner scan=new Scanner(System.in);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","root");
		//Statement stmt=con.createStatement("Select * from customer");
		
		PreparedStatement prepStmt=con.prepareStatement("Insert into customer values(?,?)");
		System.out.println("Enter customer Id");
		int id=scan.nextInt();
		System.out.println("Enter customer name");
		String name=scan.next();
		
		prepStmt.setInt(1,id);
		prepStmt.setString(2,name);
		
		int status=prepStmt.executeUpdate();
		System.out.print(status);
		
		PreparedStatement prepared=con.prepareStatement("select * from customer");
		ResultSet rs=prepared.executeQuery();
		
		
		while(rs.next())
		{
		System.out.println(rs.getInt("customer_id")+rs.getString("customer_name"));
		}
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}