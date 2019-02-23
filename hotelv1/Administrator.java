package com.lxisoft.hotelv1;
import java.util.Scanner;
import java.io.*;
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
	public Food addFood() throws Exception
	{	
	
	Food foods=new Food();
			System.out.print("Food item:");
			foods.setName(scan.next());
			System.out.print("Count:");
			foods.setFoodCount(scan.nextInt());
			System.out.print("Price:");
			foods.setFoodPrice(scan.nextInt());
			return foods;
	}
	public String deleteFood()
	{
		//Food foods=new Food(); 
		System.out.print("which one you want to delete:");
		String  n=scan.next();
		/*if((n)==(foods.getSNo()))
		{
			System.out.println("delete food");
			
		}*/
		return n;
		
	}
	public String editFood()
	{
		System.out.print("which one you want to edit:");
		String edit=scan.next();
			
		return edit;
	}
}
		