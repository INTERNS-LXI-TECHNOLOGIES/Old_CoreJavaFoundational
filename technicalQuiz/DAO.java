package com.lxisoft.technicalQuiz;
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
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","root");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
	}
}