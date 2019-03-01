package com.lxisoft.hotel;
import com.lxisoft.admin.*;
import com.lxisoft.fooditem.*;
import java.util.*;
public class Hotel
{
Admin admin=new Admin();
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
			  System.out.println("  ");
			  System.out.print("Enter your choice:");
			  ch=scan.nextInt();
			   switch(ch)
			  {
				  case 1:logAdmin();
				  break;
				  case 2:foodMenu();
				  break;
				   default:System.out.println("Invalid choice made...please try again...!!!");
			
			  }
			  System.out.print("Do you want to continue...?Yes=1/No=0:");
			  y=scan.nextInt();
			}while(y==1);



}

	public void logAdmin()
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
	}
	
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
}