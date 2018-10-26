package com.lxisoft.technicalQuiz.quiz;
import com.lxisoft.technicalQuiz.DAO;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.*;
import com.lxisoft.technicalQuiz.quiz.User; 
public class UserController
{
		User user;
	public ResultSet getAllUserDetails()
	{	
		Connection con=DAO.getConnection();
		Statement  stmt=DAO.getStatement(con);
		String query=" select * from userdata ";
		
		
		try
		{
		//DAO.getResult(stmt,query1);
		PreparedStatement ps = con.prepareStatement("INSERT INTO userData VALUES ( ?, ?, ?)");
		ps.setString(1, "4");
        ps.setString(2,"manoj2");
        ps.setString(3,"1893");
        int i = ps.executeUpdate();
		//PreparedStatement ps1 = con.prepareStatement("select userPassword from userData where userName= ?)");
	    //ps.setString(1,"manoj2");
		// int j = ps.executeUpdate();
		return DAO.getResult(stmt,query);
		}
		
		catch(Exception se)
		{
			se.printStackTrace();
			return null;
		}
		//return null;
	}
	public void passwordAuthentication(ResultSet result)
	{
		user=new User();
		Scanner scan =new Scanner(System.in);
		System.out.println("enter user name");
		String userName=scan.next();
		user.setUserName(userName);
		try
		{
			while(result.next())
			{
				
				String id=result.getString("userId");
				String name=result.getString("userName");
				String password=result.getString("userPassword");
		
				if(name.equals(user.getUserName()))
				{	
				System.out.println("enter the password");
				String userPassword=scan.next();
				user.setUserPassword(password);
					
				if(userPassword.equals(user.getUserPassword()))
					{
						System.out.println("Successfully logged in");
					}
					else
					{
					System.out.println("Authentication failed");
					}

				}
				
			}
		
		}
		catch(SQLException se)
		{
			se.printStackTrace();	
		}
	}
	
}
