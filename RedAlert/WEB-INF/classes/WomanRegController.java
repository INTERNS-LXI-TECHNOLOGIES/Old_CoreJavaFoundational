import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.*;
import java.util.*;
public class WomanRegController
{
		
	public void getWomanDetails()
	{	
		
		Connection con=DAO.getConnection();
		//Statement  stmt=DAO.getStatement(con);


		
		
		try
		{
	
		PreparedStatement ps = con.prepareStatement("INSERT INTO woman VALUES ( ?, ?, ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		ps.setString(2, "14");
        ps.setString(1,"manoj3");
        ps.setString(3,"palakkad");
        int i = ps.executeUpdate();

		
	
		}
		
		catch(Exception se)
		{
			se.printStackTrace();
			
		}
	
	}
	
	
	
	
}
