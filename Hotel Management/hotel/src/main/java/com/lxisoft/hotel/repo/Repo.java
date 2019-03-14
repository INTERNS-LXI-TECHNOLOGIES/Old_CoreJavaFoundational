package com.lxisoft.hotel.repo;
import java.sql.*;
/**
*<h1>Repo initializing class</h1>
<p>
*by creating object of this class connection to database will open.
*@author Mohammed Anish
*@version 1.1
*/
public class Repo{
	public static Connection c;
	static{
		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		c = DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}