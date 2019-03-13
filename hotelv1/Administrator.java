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
	public void deleteFood(ArrayList <Food> foods) throws Exception
	{
		
		System.out.print("which one you want to delete:");
		String  n=scan.next();
		//System.out.println(n);
		System.out.println(foods.size());
		//System.out.println(foods.get(0).getName());
				
				for(int i=0;i<foods.size();i++)
				{
				//System.out.println(foods.get(i).getName());	
				if(n.equals(foods.get(i).getName()))
				{
					
				foods.remove(i);
					
				}
				}
	}
	public void editFood(ArrayList <Food> foods)throws Exception
	{
				System.out.print("which one you want to edit:");
				String edit=scan.next();
				System.out.println(foods.size());
				//System.out.println(edit);
				for(int i=0;i<foods.size();i++)
				{	
					if(edit.equals(foods.get(i).getName()))
					{
						//System.out.println(foodItems.get(i));
						//String name=foodItems.get(i);
						System.out.println("change name press 1");
						while(scan.nextInt()==1){
						System.out.print("changed food name:");
						String n=scan.next();
						foods.get(i).setName(n);}
					
					System.out.println("change food count press 2");
						while(scan.nextInt()==2){
						System.out.print("changed food count:");
						int c=scan.nextInt();
						foods.get(i).setFoodCount(c);
						}
					System.out.println("change name press 3");
						while(scan.nextInt()==3){
						System.out.print("changed food price:");
						int p=scan.nextInt();
						foods.get(i).setFoodPrice(p);
						}
					}
				}
	}
}
		