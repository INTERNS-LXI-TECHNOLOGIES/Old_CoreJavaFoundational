package com.lxisoft.quizgamev2.signup;
public class Signup_model
{
	private String userName,userId,userPass;
	
	//////////////////////////////////////userID///////////////////////////
	public void setUserid(String userId)
	{
		this.userId=userId;
	}
	public String getUserid()
	{
		return userId;
	}
	//////////////////////////////////////username///////////////////////////
	public void setUsername(String userName)
	{
		this.userName=userName;
	}
	public String getUsername()
	{
		return userName;
	}
	/////////////////////////////////////password////////////////////////
	public void setUserpass(String userPass)
	{
		this.userPass=userPass;
	}
	public String getUserpass()
	{
		return userPass;
	}
	
}