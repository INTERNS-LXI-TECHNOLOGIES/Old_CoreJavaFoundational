package com.lxisoft.hotel.model;
/**
*<h1>Model Class For User</h1>
<p>
*This class is a Model class for User.
*@author Mohammed Anish
*@version 1.1
*/
public class User{
	private String emailid;
	private String mobno;
	private String password;
	/**
	*this method is a setter method for setting email id
	*@param emailid email id of user
	*/
	public void setEmailid(String emailid){
		this.emailid = emailid;
	}
	/**
	*this method is a getter method for email id
	*@return email id
	*/
	public String getEmailid(){
		return emailid;
	}
	/**
	*this method is a setter method for setting mobile no
	*@param mobno mobile no of user 
	*/
	public void setMobno(String mobno){
		this.mobno = mobno;
	}
	/**
	*this method is a getter method for mobile no
	*@return mobile no
	*/
	public String getMobno(){
		return mobno;
	}
	/**
	*this method is a setter method for setting password
	*@param password password for login
	*/
	public void setPassword(String password){
		this.password = password;
	}
	/**
	*this method is a getter method for password
	*@return password
	*/
	public String getPassword(){
		return password;
	}
}