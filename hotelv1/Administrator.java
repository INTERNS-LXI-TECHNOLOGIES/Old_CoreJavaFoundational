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
	public void deleteFood(ArrayList <String> foodItems) throws Exception
	{
		
		System.out.print("which one you want to delete:");
		String  n=scan.next();
		//System.out.println(n);
		System.out.println(foodItems.size());
		//System.out.println(foodItems.get(0));
				
				for(int i=0;i<foodItems.size();i++)
				{
				if(n.equals(foodItems.get(i)))
				{
					for(int j=0;j<3;j++){
				foodItems.remove(i);
					}
					
				}
				}
			//System.out.println(foodItems.size());
			
	}
	public void editFood(ArrayList <String> foodItems)throws Exception
	{
		System.out.println(foodItems.size());
				System.out.print("which one you want to edit:");
				String edit=scan.next();
				//System.out.println(edit);
				for(int i=0;i<foodItems.size();i++)
				{	
					if(edit.equals(foodItems.get(i)))
					{
						//System.out.println(foodItems.get(i));
						//String name=foodItems.get(i);
						System.out.print("changed one:");
						String n=scan.next();
						
						foodItems.set(foodItems.indexOf(foodItems.get(i)),n);
						System.out.println(foodItems.get(i));
						break;
					}
				}
	}
}
		