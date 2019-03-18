package com.lxisoft.hotelv1;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
public class AdministratorController
{
	Scanner scan=new Scanner(System.in);
	private Administrator administrator;
	private AdministratorView av;
	public void setAdministrator(Administrator administrator)
	{
		this.administrator=administrator;
	}
	public Administrator getAdministrator()
	{
		return administrator;
	}
	public void setAv(AdministratorView av)
	{
		this.av=av;
	}
	public AdministratorView getAv()
	{
		return av;
	}
public void adminDetails()throws Exception
	{
		administrator=new Administrator();
		av=new AdministratorView();
		administrator.setUsername("administ");
		administrator.setPassword("admin");
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