package com.lxisoft.hotelv1;
import java.util.Scanner;
public class Administrator
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
	public void adminDetails()
	{
		username="administ";
		password="admin";
	}
	public void addFoods()
	{	
		System.out.println("Enter the food details");	
	}
	public void deleteFoods()
	{
		System.out.print("which one you want to delete:");
		
	}
}
		