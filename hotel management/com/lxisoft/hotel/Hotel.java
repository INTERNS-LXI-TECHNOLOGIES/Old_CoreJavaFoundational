package com.lxisoft.hotel;
import com.lxisoft.admin.*;
import com.lxisoft.customer.*;
import com.lxisoft.fooditem.*;
import java.util.*;
public class Hotel
{

Admin admin=new Admin();
Customer customer=new Customer();

Scanner scan=new Scanner(System.in);
/*
private ArrayList<FoodItem> items=new ArrayList<FoodItem>();

public void setFoodItem(ArrayList<FoodItem> items)
{
	this.items=items;
}

public ArrayList<FoodItem> getFoodItem()
{
	return items;
}*/

FoodItem[] foodItems;

	public void homePage()
		{
			int ch;
			do
			{
			  System.out.println("------------------------------------------------------------------");
              System.out.println("                        FOOD  /                                   ");
			  System.out.println("                             / ORDERING                           ");
			  System.out.println("------------------------------------------------------------------");
			  System.out.println("  ");
			  System.out.println("1.ADMIN LOGIN");
			  System.out.println("2.CUSTOMER LOGIN");
			  System.out.println("  ");
			  System.out.print("Enter your choice:");
			  ch=scan.nextInt();
			  
			  switch(ch)
			  {
				  case 1:adminLogin();
				  break;
				  case 2:customer.customerLogin();
				  break;
			      default:System.out.println("Invalid choice made...please try again...!!!");
			
			  }
			}while(ch>2);
			
		}
		public void adminLogin()
		{
						
				System.out.print("Username:");
				String u=scan.next();
				System.out.print("Password:");
				String p=scan.next();
				if(u.equals(admin.getUserName()) && p.equals(admin.getPassword()))
						{
							System.out.println(" ");
							System.out.println("Access granted");
							System.out.println(" ");
							admin.adminPage(foodItems);
							
						}
			   else if(u!=admin.getUserName() && p.equals(admin.getPassword()))
							{
								System.out.println("Invalid username...!!!");
							}
			   else if(p!=admin.getPassword() && u.equals(admin.getUserName()))
							{
								System.out.println("Incorrect password");
							}
			   else
							{
								System.out.println("Invalid username & password...Please try again...!!!");
							}
	}
	
										
}