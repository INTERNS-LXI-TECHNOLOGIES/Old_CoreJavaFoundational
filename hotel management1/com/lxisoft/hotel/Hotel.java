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

/*FoodItem[] foodItems;*/
public ArrayList<FoodItem> foodItems=new ArrayList<FoodItem>();

	public void homePage()
		{
			int ch,y;
			do
			{
			  System.out.println("------------------------------------------------------------------");
              System.out.println("                        FOOD  /                                   ");
			  System.out.println("                             / ORDERING                           ");
			  System.out.println("------------------------------------------------------------------");
			  System.out.println("  ");
			  System.out.println("1.ADMIN LOGIN");
			  System.out.println("2.CUSTOMER LOGIN");
			  System.out.println("3.FOOD MENU");
			  System.out.println("  ");
			  System.out.print("Enter your choice:");
			  ch=scan.nextInt();
			 /* if(ch==1){
			  adminLogin();
				  foodItems.add(admin.a());
			  }*/
			  
			  switch(ch)
			  {
				  case 1:adminLogin();
				 /* foodItems.add(admin.a());*/
				  		
				  break;
				  case 2:customer.customerLogin();
				  break;
				 /* case 3:food();
				  break;*/
			      default:System.out.println("Invalid choice made...please try again...!!!");
			
			  }
			  System.out.print("Do you want to continue...?Yes=1/No=0:");
			  y=scan.nextInt();
			}while(y==1);
			
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
							admin.adminPage();
							
							
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
	/*
	public void food()
	{
    // foodItems.add(admin.addItem());		
	//admin.viewItem(foodItems);
	System.out.println("Not available");
	}*/
										
}