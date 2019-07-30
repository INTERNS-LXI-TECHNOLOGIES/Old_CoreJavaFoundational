package com.lxisoft.contact.RepoImpl;
import com.lxisoft.contact.Model.*;
//import com.lxisoft.contact.Repo.*;
import java.util.*;
import java.sql.*;

public class RepoImpl
{
 	//PreparedStatement ps;
	Connection con;	
	ResultSet rs;	
	public ArrayList<Contact> contactList=new ArrayList<Contact>();
	public  RepoImpl()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting to a selected database...");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contact_db","root","root");
			System.out.println("Creating database......");
			System.out.println(con);
		}
		catch(Exception se)
		{
			//System.out.println("Creating database......Exception");
      		se.printStackTrace();
   		}
	}
	//public void createContact(String name,String number)
	public void createContact(Contact contact)
	{
		try
		{
			PreparedStatement ps;
			String sql="INSERT INTO CONTACTLIST(Name,Contact_No) VALUES(?,?)";
			//System.out.println(con);
			ps=con.prepareStatement(sql);
			// ps.setString(1,name);
			// ps.setString(2,number);
			ps.setString(1,contact.getName());
			ps.setString(2,contact.getNumber());
			ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println("Creating database......Exception");
			e.printStackTrace();
		}
	}

	public ArrayList<Contact> viewContact()
	{
		try
		{
			PreparedStatement ps;
			String sql="SELECT * FROM CONTACTLIST";
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next())
			{
				Contact contact=new Contact();
				contact.setId(rs.getInt("id"));
				contact.setName(rs.getString("Name"));
				contact.setNumber(rs.getString("Contact_No"));
				contactList.add(contact);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return contactList;
	}

	//public void updateContact(int idn,String newName,String newNumber)
	public void updateContact(int id,Contact contact)
	{
		try
		{
			PreparedStatement ps;
			String sql="UPDATE CONTACTLIST SET Name=?,Contact_No=? WHERE id="+id+"";
			ps=con.prepareStatement(sql);
			//ps.setInt(1,idn);
			// ps.setString(1,newName);
			// ps.setString(2,newNumber);
			ps.setString(1,contact.getName());
			ps.setString(2,contact.getNumber());
			ps.executeUpdate();
		}
		catch(SQLException es)
		{
			es.printStackTrace();
		}
	}

	public void deleteContact( int id)
	{
		try
		{
			PreparedStatement ps;
			String sql="DELETE FROM CONTACTLIST WHERE id="+id+"";
			ps=con.prepareStatement(sql);
			ps.executeUpdate();
		}
		catch(SQLException es)
		{
			es.printStackTrace();
		}
	}

	public ArrayList<Contact> searchContact(String name)
	{
		try
		{
			PreparedStatement ps;
			String sql="SELECT * FROM CONTACTLIST WHERE Name=?";
			ps=con.prepareStatement(sql);
			ps.setString(1,name);
			rs=ps.executeQuery();
			while(rs.next())
			{
				Contact contact=new Contact();
				contact.setId(rs.getInt("id"));
				contact.setName(rs.getString("Name"));
				contact.setNumber(rs.getString("Contact_No"));
				contactList.add(contact);
			}
 		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return contactList;
	}
}