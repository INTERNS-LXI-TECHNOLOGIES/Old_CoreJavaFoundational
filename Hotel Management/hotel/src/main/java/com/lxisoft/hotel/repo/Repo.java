package com.lxisoft.hotel.repo;
import java.sql.*;
public class Repo{
	public Connection c;
	public Repo(){
		try{
		Class.forName("com.mysql.jdbc.Driver");
		c = DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}