package com.lxisoft.quiz.repository;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
public class QuizDatabaseConnection
{
	Connection con;
	ResultSet rs;
	PreparedStatement ps;
	int a;
	public QuizDatabaseConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","root");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}	
	}
	public int manipulate(String query)
	{
		try
		{
			ps=con.prepareStatement(query);
			
			a=ps.executeUpdate();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return a;
	}
	public ResultSet select(String query)
	{
		try
		{
			ps=con.prepareStatement(query);
			rs=ps.executeQuery();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return rs;
	}
	

}