package com.lxisoft.hotelv1;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
public class Administrator
{
	Scanner scan=new Scanner(System.in);
	private String username;
	private String password;
	int noOfFood;
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
	//System.out.println("Enter the food details");
	//System.out.print("Enter the number of food items:");
	//noOfFood=scan.nextInt();
	System.out.println("   Food Details   ");
	Food foods=new Food();
			System.out.print("Food item:");
			foods.setName(scan.next());
			System.out.print("Count:");
			foods.setFoodCount(scan.nextInt());
			System.out.print("Price:");
			foods.setFoodPrice(scan.nextInt());
			return foods;
	}
	public void deleteFood(ArrayList <Food> foods) throws Exception
	{
		//Food foods=new Food(); 
		
		System.out.print("which one you want to delete:");
		String  n=scan.next();
		//String n=administrator.deleteFood();
				for(int i=0;i<foods.size();i++)
				{
				if(n.equals(foods.get(i).getName()))
				{
					// pos=i;
				foods.remove(i);
				}
				}
				//foods.remove(pos
		/*if((n)==(foods.getSNo()))
		{
			System.out.println("delete food");
			
		}*/
	}
	public String editFood()
	{
		System.out.print("which one you want to edit:");
		String edit=scan.next();
			
		return edit;
	}
}
		