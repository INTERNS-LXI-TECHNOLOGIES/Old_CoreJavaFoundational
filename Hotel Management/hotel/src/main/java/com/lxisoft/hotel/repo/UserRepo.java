package com.lxisoft.hotel.repo;
import java.sql.*;
public class UserRepo{
	Repo r = new Repo();
	public void registerUser(String email,String mobno,String password) throws Exception{
		PreparedStatement p = r.c.prepareStatement("insert into user(email,password,mobno) values(?,?,?)");
		p.setString(1,email);
		p.setString(2,password);
		p.setString(3,mobno);
		p.execute();
	}
	public String login(String email) throws Exception{
		String login = null;
		Statement s = r.c.createStatement();
		ResultSet r = s.executeQuery("select password from user where email = '"+email+"'");
		while(r.next()){
		login = r.getString(1);
		}
		return login;
	}
}