package com.lxisoft.hotel;
import com.lxisoft.admin.*;
import com.lxisoft.fooditem.*;
import com.lxisoft.customer.*;
import com.lxisoft.bill.*;
import java.util.*;
public class Hotel
{
Admin admin=new Admin();
Customer customer=new Customer();
public ArrayList<FoodItem> foodItems=new ArrayList<FoodItem>();

Scanner scan=new Scanner(System.in);

public void homePage()
{
	int ch,y;
	do
	{
		
		      System.out.println("  ");
			  System.out.println("1.ADMIN LOGIN");
			  System.out.println("2.FOOD MENU");
			  System.out.println("3.CUSTOMER LOGIN");
			  System.out.println("  ");
			  System.out.print("Enter your choice:");
			  ch=scan.nextInt();
			   switch(ch)
			  {
				  case 1:admin.logAdmin(foodItems);
				  break;
				  case 2:foodMenu();
				  break;
				  case 3:customer.logUser(foodItems);
				  viewBill();
				  break;
				   default:System.out.println("Invalid choice made...please try again...!!!");
			
			  }
			  System.out.print("Do you want to continue...?Yes=1/No=0:");
			  y=scan.nextInt();
			}while(y==1);



}

	/*public void logAdmin()
	{
        System.out.println("                          ADMIN LOGGIN                           ");
		System.out.println("-----------------------------------------------------------------");
	    System.out.print("Username:");
		String userName=scan.next();
		System.out.print("Password:");
		String password=scan.next();
		if(userName.equals(admin.getUserName()) && password.equals(admin.getPassword()))
		{
		   System.out.println(" ");
		   System.out.println("Access granted");
		   System.out.println(" ");
		   admin.adminPage(foodItems);  
		}
		 else if(userName!=admin.getUserName() && password.equals(admin.getPassword()))
							{
								System.out.println("Invalid username...!!!");
							}
			   else if(password!=admin.getPassword() && userName.equals(admin.getUserName()))
							{
								System.out.println("Incorrect password");
							}
			   else
							{
								System.out.println("Invalid username & password...Please try again...!!!");
							}
	}*/
	
	public void foodMenu()
	{
	System.out.println(" ");
	System.out.println("                               FOOD MENU                               ");
	System.out.println("-----------------------------------------------------------------------");
	System.out.println("FoodItem                                                           Price");
	System.out.println("-----------------------------------------------------------------------");
	
	for(FoodItem f:foodItems)
	{
		
		System.out.println(f.getName()+"                                          "+f.getPrice());
	}
	}
	/*
	String item;
	int value;
	public void placeOrder()
	{
		
			
			 System.out.println(" ");
			 System.out.print("choose anything: ");
			 item=scan.next();
			 System.out.print("How many......?:");
			 value=scan.nextInt();
			 
		
	}*/
	
	public void printOrderedItem()
	{
		System.out.println("  ");
		for(int i=0;i<foodItems.size();i++)
		{
			if((customer.item).equals(foodItems.get(i).getName()))
			{
				System.out.println(foodItems.get(i).getName()+" "+"X"+" "+customer.value+"                                      "+foodItems.get(i).getPrice());
			}
		}
	}
	/*
	public void printValue()
	{
		System.out.println(value);
	}*/
	
	public int printItemPrice()
	{
		int price=0;
		System.out.println("  ");
		for(int i=0;i<foodItems.size();i++)
		{
			if((customer.item).equals(foodItems.get(i).getName()))
			{
			 price=foodItems.get(i).getPrice();
			}
		}
		return price;
	}
	
	public void viewBill()
	{
		int price;
		Bill bill=new Bill();
		System.out.println("  ");
		System.out.println("                                 BILL                                        ");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Items ordered:                                                         Price:");
		System.out.println("  ");
		printOrderedItem();
		System.out.println("  ");
		bill.setTotalPrice((customer.value)*(price=printItemPrice()));
		System.out.println("                                                    Total "+bill.getTotalPrice()+" Rs");
		System.out.println("  ");
		System.out.println("                                 THANK YOU                                   ");
	}
}