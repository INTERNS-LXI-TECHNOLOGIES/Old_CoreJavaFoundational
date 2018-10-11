package com.lxisoft.technicalQuiz.quiz;
import com.lxisoft.technicalQuiz.DAO;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*; 
public class UserController
{
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
		return DAO.getResult(stmt,query);
		}
		
		catch(Exception se)
		{
			se.printStackTrace();
			return null;
		}
		//return null;
	}

	public void databaseValues(ResultSet result)
	{
		try
		{
			while(result.next())
			{
				
				String id=result.getString("userId");
				String name=result.getString("userName");
				String password=result.getString("userPassword");
				System.out.println("name="+name);

			}
		
		}
		catch(SQLException se)
		{
			se.printStackTrace();	
		}
	}
}
