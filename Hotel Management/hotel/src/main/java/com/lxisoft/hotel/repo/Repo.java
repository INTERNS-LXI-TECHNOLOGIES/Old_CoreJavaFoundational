package com.lxisoft.hotel.repo;
import java.sql.*;
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