import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.*;
import java.util.*;
public class WomanRegController
{
		
	public void saveWomanDetails(String name,String location,int age,String email,String password)
	{	
		
		Connection con=DAO.getConnection();
		//Statement  stmt=DAO.getStatement(con);


		
		
		try
		{
		WomanRegServlet wrs=new WomanRegServlet();
		
		PreparedStatement ps = con.prepareStatement("INSERT INTO woman(name,age,location,email,password) VALUES ( ?, ?, ?,?,?)");
		ps.setInt(2, age);
        ps.setString(1,name);
        ps.setString(3,location);
		ps.setString(4,email);
		ps.setString(5,password);
        int i = ps.executeUpdate();

		
	
		}
		
		catch(Exception se)
		{
			se.printStackTrace();
			
		}
	
	}
	
	
	
	
}
