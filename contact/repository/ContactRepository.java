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
	public void connectToDb()
	{
	try{
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("connecting to database");
	}
	catch(ClassNotFoundException e)
	{
		e.printStackTrace();
	}
	}
	public void createContact(Contact contact,ContactView contactV)throws Exception
	{
	connectToDb();
	try{
	Connection con=null;
	PreparedStatement ps=null;	
	con=DriverManager.getConnection(DB_URL,USER,PASS);
	System.out.println("creating database");
	String sql;
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
	public void readContact(ArrayList<Contact>contacts)throws Exception
	{
	try{	
	Connection con=null;
	Statement stmt=null;
	con=DriverManager.getConnection(DB_URL,USER,PASS);
	stmt=con.createStatement();
	String sql;
	sql="select * from contact";
	ResultSet rs=stmt.executeQuery(sql);
	while(rs.next())
	{
		Contact contact=new Contact();
		String contact_name=rs.getString("contact_name");
		String contact_number=rs.getString("contact_number");
		System.out.println("contact_name:"+contact_name);
		System.out.println("contact_number:"+contact_number);
		contact.setName(contact_name);
		contact.setNum(contact_number);
		contacts.add(contact);
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
	public void updateContact()
	{
	}
	public void deleteContact()
	{
	}
}