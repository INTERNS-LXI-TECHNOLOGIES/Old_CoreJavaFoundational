package com.lxisoft.admin;
import com.lxisoft.fooditem.*;
import java.util.Scanner;
public class Admin
{

	String userName="admin";
	String password="admin123";
	
	Scanner scan= new Scanner(System.in);
	
	FoodItem item=new FoodItem();
	
	public void adminLogin()
	{
		
	int n,s;
	
	System.out.print("Username:");
	String u=scan.next();
	System.out.print("Password:");
	String p=scan.next();
	if(u.equals(userName) && p.equals(password))
	{
		System.out.println(" ");
		System.out.println("Access granted");
		System.out.println(" ");
		do
			{
			  System.out.println("------------------------------------------------------------------");
              System.out.println("                        FOOD  /                                   ");
			  System.out.println("                             / ORDERING                           ");
			  System.out.println("------------------------------------------------------------------");
			  System.out.println("  ");
			  System.out.println("1.ADD ITEM");
			  System.out.println("2.VIEW FOOD MENU");
			  System.out.println("2.VIEW ORDERS");
			  System.out.println("3.CALULATE TOTALBILL");
			  System.out.println("4.VIEW BILLS");
			  System.out.println("  ");
			  System.out.print("Enter your choice:");
			  n=scan.nextInt();
			  
			  switch(n)
			  {
				  case 1:System.out.println("You can add now...");
				  System.out.println(" ");
				 /* System.out.print("No.of Items:");
				  s=scan.nextInt();
				  for(int i=0;i<s;i++)
				  {*/
				  item.addItem();
				  
				  System.out.println(" ");
				  
		          System.out.println("ITEM DETAILS");
		          System.out.println("------------");
				  
				  item.viewItem();
				  
				  
				  break;
				  case 2:/*System.out.println("FOOD MENU");
		                 System.out.println("------------------------------------------------------------------");*/
						 System.out.println("Temporarly not reachable....!!!");
				  break;
				  case 3:System.out.println("Temporarly not reachable....!!!");
				  break;
				  case 4:System.out.println("Temporarly not reachable....!!!");
				  break;
				  case 5:System.out.println("Temporarly not reachable....!!!");
				  break;
				  default:System.out.println("Invalid choice made...please try again...!!!");
			
			  }
			}while(n>5);
	
	}
	else if(u!=userName && p.equals(password))
	{
		System.out.println("Invalid username...!!!");
	}
	else if(p!=password && u.equals(userName))
	{
		System.out.println("Incorrect password");
	}
	else
	{
		System.out.println("Invalid username & password...Please try again...!!!");
	}
	}
	}
	
	