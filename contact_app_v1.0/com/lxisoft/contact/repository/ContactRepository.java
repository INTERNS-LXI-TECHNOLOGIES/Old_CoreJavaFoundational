package com.lxisoft.contact.repository;
import java.util.*;
import java.util.logging.*;
import com.lxisoft.contact.model.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;

/**
*This class is the repository class for Contact
*
*@author Arya Vineesh
*
*@version 1.0
*
*Date Modified:24/07/2019
*/
public class ContactRepository
{
	Connection con;
	PreparedStatement ps;
	
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(ContactRepository.class.getName());
	
	public ContactRepository()
	{
		log.setLevel(Level.SEVERE);
		try
		{
			//Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/phonebook","root","root");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}	
	}
	
	public int insertIntoDb(Contact contact)
	{
		int status=0;
		try
		{
			String insertQuery="insert into contact(name,number,place,email) values(?,?,?,?)";
			ps=con.prepareStatement(insertQuery);
			ps.setString(1,contact.getName());
			ps.setInt(2,contact.getPhoneNumber());
			ps.setString(3,contact.getPlace());
			ps.setString(4,contact.getEmail());
			status=ps.executeUpdate();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}	
	
	public int updateDB(Contact contact)
	{
		int status=0;
		try
		{
			
			String updateQuery="update contact set number=?,place=?,email=? where name=?";
			ps=con.prepareStatement(updateQuery);
			
			ps.setInt(1,contact.getPhoneNumber());
			ps.setString(2,contact.getPlace());
			ps.setString(3,contact.getEmail());
			ps.setString(4,contact.getName());
			status=ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	
	public int deleteFromDb(String name)
	{
		int status=0;
		try
		{
			String deleteQuery="delete from contact where name=?";
			ps=con.prepareStatement(deleteQuery);
			ps.setString(1,name);
			status=ps.executeUpdate();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return status;
	}
	
	public ArrayList<Contact> searchContactFromDb(String name)
	{
		
		ArrayList<Contact> contactList=new ArrayList<Contact>();
		Contact contact;
		ResultSet rs;
		try
		{
			String selectQuery="select * from contact where name=?";
			ps=con.prepareStatement(selectQuery);
			ps.setString(1,name);
			rs=ps.executeQuery();
			while(rs.next())
			{
				contact=new Contact();
				int number=rs.getInt("number");
				String place=rs.getString("place");
				String email=rs.getString("email");

				contact.setName(name);
				contact.setPhoneNumber(number);
				contact.setPlace(place);
				contact.setEmail(email);
				contactList.add(contact);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return contactList;
	}

	public ArrayList<Contact> selectContactFromDb()
	{
		
		ArrayList<Contact> contactList=new ArrayList<Contact>();
		Contact contact;
		ResultSet rs;
		try
		{
			String selectQuery="select * from contact";
			ps=con.prepareStatement(selectQuery);
			rs=ps.executeQuery();
			while(rs.next())
			{
				contact=new Contact();
				String name=rs.getString("name");
				int number=rs.getInt("number");
				String place=rs.getString("place");
				String email=rs.getString("email");

				contact.setName(name);
				contact.setPhoneNumber(number);
				contact.setPlace(place);
				contact.setEmail(email);
				contactList.add(contact);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return contactList;
	}
}