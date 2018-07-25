package com.lxisoft.culturalevaluation.user;
public class Usermodel
{
	private String username,password;
	public Usermodel(String username,String password)
	{
		this.username=username;
		this.password=password;
	}
	public String getUsername()
	{
		return username;
	}
	public String getPassword()
	{
		return password;
	}
}