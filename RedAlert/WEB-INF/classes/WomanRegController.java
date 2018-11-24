import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.*;
import java.util.*;
public class WomanRegController
{
		
	public void saveWomanDetails(int age)
	{	
		
		Connection con=DAO.getConnection();
		//Statement  stmt=DAO.getStatement(con);


		
		
		try
		{
		WomanRegServlet wrs=new WomanRegServlet();
		
		PreparedStatement ps = con.prepareStatement("INSERT INTO woman(name,age,location) VALUES ( ?, ?, ?)");
		ps.setInt(2, age);
        ps.setString(1,"manu");
        ps.setString(3,"palakkad");
        int i = ps.executeUpdate();

		
	
		}
		
		catch(Exception se)
		{
			se.printStackTrace();
			
		}
	
	}
	
	
	
	
}
