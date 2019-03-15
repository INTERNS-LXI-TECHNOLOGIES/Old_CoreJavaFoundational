package com.lxisoft.hotelv1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.util.Comparator;
import java.io.*;
public class HotelView
{
Scanner scan=new Scanner(System.in);
HotelController	controller=new HotelController();
public void authentication()throws Exception
{	
controller=new HotelController();
File file=new File("foodsdetail.txt");
FileWriter fw=new FileWriter(file,true);
		//System.out.println(file.exists());
		//bw.write("pizza");
			System.out.println("FOOD PALACE");
			
		controller.readFromFile();
		do
		{
			System.out.println("Login \n 1.Admin \n 2.User \n");
			switch(scan.nextInt())
			{
			case 1:
				controller.getHotel().getAdministrator().adminDetails();
				System.out.print("Username :");
				if(scan.next().equals(controller.getHotel().getAdministrator().getUsername()))
				{
				System.out.print("Password :");
				if(scan.next().equals(controller.getHotel().getAdministrator().getPassword()))
				{	
			//readFromFile();
			
				adminOptions();
				}
				else
				{
					System.out.println("Password is incorrect");
				}
				}
				else
				{
				System.out.println("Username is incorrect");
				}
				break;
			case 2:
				
				controller.getHotel().getCustomer().userDetails();
				System.out.print("Username :");
				if(scan.next().equals(controller.getHotel().getCustomer().getUsername()))
				{
				System.out.print("Password :");
				if(scan.next().equals(controller.getHotel().getCustomer().getPassword()))
				{
					//readFromFile();
				controller.foodOrdering();
				}
				else
				{
					System.out.println("Password is incorrect");
				}
				}
				else
				{
				System.out.println("Username is incorrect");
				}
				break;
				default:System.out.println("Wrong choice");
				break;
				}
				System.out.println("Login page press 2");
		}while(scan.nextInt()==2);
}	
public void adminOptions()throws Exception
{
		File file=new File("foodsdetail.txt");
		FileWriter fw=new FileWriter(file,true);
		//foods=new ArrayList <Food>();
		//readFromFile();
		do{
			System.out.println("1.Add \n2.Delete\n3.Edit");
			switch(scan.nextInt())
			{
			case 1:	
				do{
				
				controller.getHotel().getFoods().add(controller.getHotel().getAdministrator().addFood());
				file.delete();
				//foods.set(0);
				//writeToFile();
				System.out.println("To add food again press 1");
				}while(scan.nextInt()==1);
				
				//foodDetails();
				
			
				controller.writeToFile();
				controller.getHotel().getFoods().clear();
				controller.readFromFile();
			 // foods.clear();
				break;
			case 2:
				
				controller.getHotel().getAdministrator().deleteFood(controller.getHotel().getFoods());
				//file.delete();
				controller.arraylistToFile();
				controller.getHotel().getFoods().clear();
				controller.readFromFile();
				//foodItems.clear();
				break;
			case 3:
						
				controller.getHotel().getAdministrator().editFood(controller.getHotel().getFoods());
				file.delete();
				controller.arraylistToFile();
				controller.getHotel().getFoods().clear();
				controller.readFromFile();
			//	foodItems.clear();
				break;	
				default:System.out.println("Wrong choice");
				break;				
			}
			
			System.out.println("Again do any operation press 1");
		}while(scan.nextInt()==1);
		
}
}