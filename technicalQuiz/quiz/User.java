package com.lxisoft.technicalQuiz.quiz;
public class User
{   private String userId,userName,userPassword;
	
	public void  setUserId(String id)
	{
		this.userId=id;
	}
	public String getUserId()
	{
		return this.userId;
	}
	public void setUserName(String name)
	{
		this.userName=name;
	}
	public String getUserName()
	{
		return this.userName;
	}
	public void setUserPassword(String password)
	{
		this.userPassword=password;
	}
	public String getUserPassword()
	{
		return this.userPassword;
	}
}