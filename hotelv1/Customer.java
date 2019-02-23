package com.lxisoft.hotelv1;
import java.util.Scanner;
public class Customer
{	
	Scanner scan=new Scanner(System.in);
	private String username;
	private String password;
	public void setUsername(String username)
	{
		this.username=username;
	}
	public String getUsername()
	{
		return username;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
	public String getPassword()
	{
		return password;
	}
	public void userDetails()
	{
		username="user";
		password="user";
	}
	public String selectFood()
	{
	
	String food=scan.next();
	return food;
	}
}