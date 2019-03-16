package com.lxisoft.hotelv1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.util.Comparator;
import java.io.*;
public class HotelView
{
Scanner scan=new Scanner(System.in);

public void authentication(Administrator administrator,Customer customer)throws Exception
{	
File file=new File("foodsdetail.txt");
FileWriter fw=new FileWriter(file,true);
		//System.out.println(file.exists());
		//bw.write("pizza");
			System.out.println("FOOD PALACE");
			administrator=new Administrator();
			customer=new Customer();
		//controller.readFromFile();
		do
		{
			System.out.println("Login \n 1.Admin \n 2.User \n");
			switch(scan.nextInt())
			{
			case 1:
				administrator.adminDetails();
				System.out.print("Username :");
				if(scan.next().equals(administrator.getUsername()))
				{
				System.out.print("Password :");
				if(scan.next().equals(administrator.getPassword()))
				{	
			//readFromFile();
			
				//adminOptions(administrator);
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
				
				customer.userDetails();
				System.out.print("Username :");
				if(scan.next().equals(customer.getUsername()))
				{
				System.out.print("Password :");
				if(scan.next().equals(customer.getPassword()))
				{
					//readFromFile();
				//controller.foodOrdering();
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
/*public void adminOptions()throws Exception
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
				
				controller.getHotel().getFoods().add(dministrator().addFood());
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
		
}*/
}