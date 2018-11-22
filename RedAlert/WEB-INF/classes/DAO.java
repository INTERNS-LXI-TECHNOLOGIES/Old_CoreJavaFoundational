import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DAO
{
	ResultSet getResult;
	public static Connection getConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/RedAlert","root","root");
		}
		catch(Exception e)
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
		catch(Exception e)
		{
		System.out.println(e);
		}
		return null;
	}
	public static ResultSet getResult(Statement stmt,String query) throws SQLException
	{
		if(stmt!=null)
		{
		 //getResult=stmt.executeQuery(query);
		return stmt.executeQuery(query);
		}
		return null;
	}
}