package com.lxisoft.hotel.controller;
import com.lxisoft.hotel.services.*;
/**
*<h1>Controller Class For User</h1>
<p>
*This class is used for getting data from View class and senting data to UserService Class.
*@author Mohammed Anish
*@version 1.1
*/
public class UserController{
	UserService u = new UserService();
	/**
	*this method is used for rsenting registration details to UserService class
	*@param email email id of user
	*@param mobno user mobile no
	*@param password password 
	*@return true if entered pattern is correct else false
	*@throws Exception
	*/
	public boolean registerUser(String email,String mobno,String password) throws Exception{
	 return	u.registerUser(email,mobno,password);
	}
	/**
	*this method is used for senting email id for checking and return email from UserService
	*@param email email id for checking
	*@return email id from database else null
	*@throws Exception 
	*/
	public String login(String email) throws Exception{
		return u.login(email);
	}
}