package com.lxisoft.hotel.controller;
import com.lxisoft.hotel.services.*;
public class UserController{
	UserService u = new UserService();
	public boolean registerUser(String email,String mobno,String password) throws Exception{
	 return	u.registerUser(email,mobno,password);
	}
	public String login(String email) throws Exception{
		return u.login(email);
	}
}