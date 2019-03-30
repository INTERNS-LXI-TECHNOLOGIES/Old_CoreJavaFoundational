package com.lxisoft.hotel;
import com.lxisoft.admin.*;
import com.lxisoft.fooditem.*;
import com.lxisoft.customer.*;
import com.lxisoft.bill.*;
import java.util.*;
import java.io.*;
public class Hotel
{
Admin admin=new Admin();
Customer customer=new Customer();
public ArrayList<FoodItem> foodItems=new ArrayList<FoodItem>();
//public ArrayList<FoodItem> foods=new ArrayList<FoodItem>();
Scanner scan=new Scanner(System.in);

public void homePage()throws Exception
{
	int ch,y,price;
	/*Bill bill=new Bill();*/
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
				  case 3:/*customer.logUser(foodItems);
				    price=admin.calculateBill(customer.item,customer.value,foodItems);
					bill.setTotalPrice(price);
					bill.viewBill(customer.item,customer.value,foodItems);*/
					logUser();
				  break;
				   default:System.out.println("Invalid choice made...please try again...!!!");
			
			  }
			  System.out.print("Do you want to continue...?Yes=1/No=0:");
			  y=scan.nextInt();
			}while(y==1);



}

	
	
	public void foodMenu()throws Exception
	{
	System.out.println(" ");
	System.out.println("                               FOOD MENU                               ");
	System.out.println("-----------------------------------------------------------------------");
	System.out.println("FoodItem                                                           Price");
	System.out.println("-----------------------------------------------------------------------");
	admin.reader();
	admin.printDetails();
	/*for(FoodItem f:foodItems)
	{
		
		System.out.println(f.getName()+"                                          "+f.getPrice());
	}*/
	}
	
public void logUser()throws Exception
	{
		String password;
		Bill bill=new Bill();
		int price;
		System.out.println(" ");
		System.out.println("                         CUSTOMER LOGGIN                          ");
		System.out.println("------------------------------------------------------------------");
		System.out.print("Username:");
		customer.setUserName(scan.next());
		System.out.print("Password:");
		customer.setPassword(scan.next());
		System.out.print("Confirm password:");
		password=scan.next();
		if(password.equals(customer.getPassword()))
		{
			 System.out.println(" ");
		     System.out.println("Access granted");
		     System.out.println(" ");
			 //foodMenu();
			// admin.reader();
	admin.printDetails();
			
			
			/*for(FoodItem f:foods)
	{
		
		System.out.println(f.getName()+"                                          "+f.getPrice());
	}*/
			
			
		     customer.placeOrder();
		     price=admin.calculateBill(customer.item,customer.value,foodItems);
			 bill.setTotalPrice(price);
			 bill.viewBill(customer.item,customer.value,foodItems);
		
	    }
		else
		{
			System.out.println("Incorrect password....Please try again...!!!");
		}
		
	}
	
}