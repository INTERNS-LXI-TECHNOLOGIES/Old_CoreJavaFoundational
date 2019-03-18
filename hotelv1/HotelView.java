package com.lxisoft.hotelv1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.util.Comparator;
import java.io.*;
public class HotelView
{
Scanner scan=new Scanner(System.in);

public void authentication(AdministratorController ac,CustomerController cc,HotelController controller,ArrayList <Food> foods,CashierView cashier)throws Exception
{	
File file=new File("foodsdetail.txt");
FileWriter fw=new FileWriter(file,true);
		//System.out.println(file.exists());
		//bw.write("pizza");
			System.out.println("FOOD PALACE");
			ac=new AdministratorController();
		cc=new CustomerController();
			foods=new ArrayList <Food>();
			//controller=new HotelController();
		controller.readFromFile(foods);
		do
		{
			System.out.println("Login \n 1.Admin \n 2.User \n");
			switch(scan.nextInt())
			{
			case 1:
				ac.adminDetails();
				System.out.print("Username :");
				if(scan.next().equals(ac.getAdministrator().getUsername()))
				{
				System.out.print("Password :");
				if(scan.next().equals(ac.getAdministrator().getPassword()))
				{	
			//readFromFile();
			
				adminOptions(controller,foods,ac);
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
			
				cc.userDetails();
				System.out.print("Username :");
				if(scan.next().equals(cc.getCustomer().getUsername()))
				{
				System.out.print("Password :");
				if(scan.next().equals(cc.getCustomer().getPassword()))
				{
					//readFromFile();
				controller.foodOrdering(foods,cc,cashier);
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
public void adminOptions(HotelController controller,ArrayList <Food> foods,AdministratorController ac)throws Exception
{
		File file=new File("foodsdetail.txt");
		FileWriter fw=new FileWriter(file,true);
		//controller=new HotelController();
		
		//readFromFile();
		do{
			System.out.println("1.Add \n2.Delete\n3.Edit");
			switch(scan.nextInt())
			{
			case 1:	
				do{
				foods.add(ac.getAv().addFood());
				file.delete();
				//foods.set(0);
				//writeToFile();
				System.out.println("To add food again press 1");
				}while(scan.nextInt()==1);
				
				//foodDetails();
				
			
				controller.writeToFile(foods);
				foods.clear();
				controller.readFromFile(foods);
			 // foods.clear();
				break;
			case 2:
				
				ac.deleteFood(foods);
				//file.delete();
				controller.arraylistToFile(foods);
				foods.clear();
				controller.readFromFile(foods);
				//foodItems.clear();
				break;
			case 3:
						
				ac.editFood(foods);
				file.delete();
				controller.arraylistToFile(foods);
				foods.clear();
				controller.readFromFile(foods);
			//	foodItems.clear();
				break;	
				default:System.out.println("Wrong choice");
				break;				
			}
			
			System.out.println("Again do any operation press 1");
		}while(scan.nextInt()==1);
		
}	
}