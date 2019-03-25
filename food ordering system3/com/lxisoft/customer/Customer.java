package com.lxisoft.customer;
import com.lxisoft.fooditem.*;
import java.util.*;
public class Customer
{
private String userName;
private String password;

public void setUserName(String userName)
{
this.userName=userName;
}
public String getUserName()
{
return userName;
}

public void setPassword(String password)
{
this.password=password;
}
public String getPassword()
{
return password;
}

Scanner scan=new Scanner(System.in);

public void logUser(ArrayList<FoodItem> foodItems)
	{
		String password;
		
		System.out.println(" ");
		System.out.println("                         CUSTOMER LOGGIN                          ");
		System.out.println("------------------------------------------------------------------");
		System.out.print("Username:");
		setUserName(scan.next());
		System.out.print("Password:");
		setPassword(scan.next());
		System.out.print("Confirm password:");
		password=scan.next();
		if(password.equals(getPassword()))
		{
			 System.out.println(" ");
		     System.out.println("Access granted");
		     System.out.println(" ");
			 System.out.println("                               FOOD MENU                               ");
	         System.out.println("-----------------------------------------------------------------------");
	         System.out.println("FoodItem                                                           Price");
	         System.out.println("-----------------------------------------------------------------------");
	
			 for(FoodItem f:foodItems)
	{
		
		System.out.println(f.getName()+"                                          "+f.getPrice());
	}
		
		placeOrder();
		
	    }
		else
		{
			System.out.println("Incorrect password....Please try again...!!!");
		}
	}
	public String item;
	public int value;
	public void placeOrder()
	{
		
			
			 System.out.println(" ");
			 System.out.print("choose anything: ");
			 item=scan.next();
			 System.out.print("How many......?:");
			 value=scan.nextInt();
			 
		
	}

}