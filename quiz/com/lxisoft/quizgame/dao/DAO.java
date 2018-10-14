package com.lxisoft.quizgame.dao;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DAO
{
	public static Connection getConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","root");
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
			return null;
	}
	public static Statement getStatement(Connection con)
	{
		try
		{
			if(con!=null)
				return con.createStatement();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
			return null;
	}
	public static ResultSet getResultSet(String query,Statement stmt) throws SQLException
	{
		if(stmt!=null)
		{
			return stmt.executeQuery(query);
		}
		return null;
	}
}