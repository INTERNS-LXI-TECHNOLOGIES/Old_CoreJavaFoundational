package com.lxisoft.quiztask.user;

public class User
{
	private String userName;
	private String password;
	
	public User(String userName,String password)
	{
		this.userName=userName;
		this.password=password;
	}
	public String getUserName()
	{
		return userName;
	}
	public boolean login(String password)
	{
		if(this.password.equals(password))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}