package com.lxisoft.hotel.repo;
import java.sql.*;
/**
*<h1>Repo Class For User</h1>
<p>
*This is the class where database operations are done for User.
*@author Mohammed Anish
*@version 1.1
*/
public class UserRepo{
	Repo r = new Repo();
	/**
	*this method is for registring user and store user date to database
	*@param email email id of user
	*@param mabno mobile number of user
	*@param password password of user
	*@throws Exception
	*/
	public void registerUser(String email,String mobno,String password) throws Exception{
		PreparedStatement p = r.c.prepareStatement("insert into user(email,password,mobno) values(?,?,?)");
		p.setString(1,email);
		p.setString(2,password);
		p.setString(3,mobno);
		p.execute();
	}
	/**
	*this method is for getting the passowrd for given email id
	*@param email email id to search
	*@return password of given email id  
	*@throws Exception
	*/
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