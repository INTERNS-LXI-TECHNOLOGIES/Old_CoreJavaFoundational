package com.lxisoft.contact.repository;
import com.lxisoft.contact.view.*;
import com.lxisoft.contact.model.*;
import com.lxisoft.contact.controller.*;
import java.util.ArrayList;
import java.sql.*;
public class ContactRepository
{
	static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
	static final String DB_URL="jdbc:mysql://localhost/contact_db";
	static final String USER="root";
	static final String PASS="root";
	Connection con=null;
	Statement stmt=null;
	PreparedStatement ps=null;
	String sql;
	public  ContactRepository()
	{
		try{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("connecting to database");
			
		con=DriverManager.getConnection(DB_URL,USER,PASS);
		System.out.println("creating database");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void createContact(Contact contact,ContactView contactV)throws Exception
	{
	try{
	sql="INSERT INTO contact(contact_name,contact_number)values(?,?)";
	ps=con.prepareStatement(sql);
	ps.setString(1,contact.getName());
	ps.setString(2,contact.getNum());
	ps.executeUpdate();
	ps.close();
	con.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	public void readContact()throws Exception
	{
		try{	
		stmt=con.createStatement();
		sql="select * from contact";
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next())
		{
			Contact contact=new Contact();
			String contact_name=rs.getString("contact_name");
			String contact_number=rs.getString("contact_number");
			System.out.println("contact_name:"+contact_name);
			System.out.println("contact_number:"+contact_number);
		}
			
		rs.close();
		stmt.close();
		con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void updateContact(ContactView contactV,ContactController contactC,String name,String editName)throws Exception
	{	
		try
		{	
		sql="update contact  set contact_name='"+editName+"' WHERE contact_name='"+name+"'";
		ps=con.prepareStatement(sql);
		ps.executeUpdate(sql);
		ps.close();
		con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void deleteContact(ContactController contactC,ContactView contactV,String name)throws Exception
	{
		try
		{
		System.out.println(name);
		sql="DELETE FROM contact WHERE contact_name='"+name+"'";
		ps=con.prepareStatement(sql);
		ps.executeUpdate(sql);
		ps.close();
		con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}