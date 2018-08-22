import java.sql.*;
public class TestConnectivity
{
	public static void main(String args[]) throws Exception
	{
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost/student";
		String user="root";
		String pass="root";
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Connecting to database...");
        Connection con = DriverManager.getConnection(url,user,pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select id, username from stud ");
		while (rs.next())
		{
			System.out.println("Id= " + rs.getInt("id") + " UserName= " + rs.getString("username"));
		}
		st.close();
		con.close();
 

		
	}	
}	