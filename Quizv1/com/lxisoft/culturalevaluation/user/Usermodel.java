package com.lxisoft.culturalevaluation.user;
public class Usermodel
{
	private String username,password;
	public void setUsername(String username)
	{
		this.username=username;
	}
	public void setPassword(String password)
	{
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
	public void loaduserFile()
	{
		String file="D:/workspace/Team1/Quiz/doc.txt";
	}
	public void userLogin()
	{
		
	}
}