package com.lxisoft.moviescript.cast;
import com.lxisoft.moviescript.person.Person;
import java.sql.*;
import java.util.Random;

public class Cast extends Person
{
	private String characterName;
	private String tableName;
	private int tableSize;
	
	public String getCharacterName()
	{
		return characterName;
	}
	public void setCharacterName(String characterName)
	{
		this.characterName=characterName;
	}
	public String getTableName()
	{
		return tableName;
	}
	public void setTableName(String tableName)
	{
		this.tableName=tableName;
	}
	public int getTableSize()
	{
		return tableSize;
	}
	public void setTableSize(int tableSize)
	{
		this.tableSize=tableSize;
	}
	public String getDialogue()
	{
		Connection con=null;
		Statement stmt=null;
		ResultSet result=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/moviescript","root","root");
			Random r=new Random();
			int rand=r.nextInt(tableSize)+1;
			String query="select dialogue from "+tableName+" where slNo="+rand;
			stmt=con.createStatement();
			result=stmt.executeQuery(query);
			result.next();
			return result.getString("dialogue");
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println("Error  "+e);
		}
		finally
		{
			try
			{
				if(result!=null)
					result.close();
				if(stmt!=null)
					stmt.close();
				if(con!=null)
					con.close();
			}
			catch(SQLException se)
			{
				se.printStackTrace();
			}
		}
		return null;
	}
}

