package com.lxisoft.admin;
import com.lxisoft.fooditem.*;
import com.lxisoft.hotel.*;
import java.util.*;
public class Admin
{

	private String userName="admin";
	private String password="admin123";
	
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
	
	Scanner scan= new Scanner(System.in);
	
	
	
	
		public void adminPage()
		{
			/*Hotel h = new Hotel();*/
			int n,s;
		do
			{
			  System.out.println("------------------------------------------------------------------");
              System.out.println("                        FOOD  /                                   ");
			  System.out.println("                             / ORDERING                           ");
			  System.out.println("------------------------------------------------------------------");
			  System.out.println("  ");
			  System.out.println("1.ADD ITEM");
			  System.out.println("2.VIEW FOOD MENU");
			  System.out.println("3.VIEW ORDERS");
			  System.out.println("4.CALULATE TOTALBILL");
			  System.out.println("5.VIEW BILLS");
			  System.out.println("  ");
			  System.out.print("Enter your choice:");
			  n=scan.nextInt();
			  
			  switch(n)
			  {
				  case 1:System.out.println("You can add now...");
				  System.out.println(" ");
					addItem();
				
				  
				  break;
				  case 2:/*System.out.println("   ");
				         System.out.println("FOOD MENU");
		                 System.out.println("------------------------------------------------------------------");
						 viewItem();*/
						 System.out.println("Temporarly not reachable....!!!");
				  break;
				  case 3:System.out.println("Temporarly not reachable....!!!");
				  break;
				  case 4:System.out.println("Temporarly not reachable....!!!");
				  break;
				  case 5:System.out.println("Temporarly not reachable....!!!");
				  break;
				  default:System.out.println("Invalid choice made..!!!");
			
			  }
			  System.out.print("Do you want to continue...?Yes=1/No=0:");
			  s=scan.nextInt();
			}while(s==1);
	
	}
	
	
	/*FoodItem f; */
	public void addItem()
	{
		int m;
	
	    ArrayList<FoodItem> items=new ArrayList<FoodItem>();
		System.out.println("   ");
		System.out.print("No.of Items..?:");
		m=scan.nextInt();
		/*f=new FoodItem();*/
		System.out.println("   ");
		/*foodItems=new FoodItem[m];*/
		for(int i=0;i<m;i++)
		{
			/*foodItems[i]=new FoodItem();
		foodItems.add(new FoodItem());
		System.out.print("FoodItem:"); 
		f.setName(scan.next());
		/*foodItems[i].setName(scan.next());
		System.out.print("Price:");
		f.setPrice(scan.nextInt());
		/*foodItems[i].setPrice(scan.nextInt());*/
		
		items.add(new FoodItem());
		System.out.print("FoodItem:");
		items.get(i).setName(scan.next());
		System.out.print("Price:");
		items.get(i).setPrice(scan.nextInt());
		System.out.println("   ");
		}
		
	    System.out.println("   ");
		System.out.println("Record saved.....");
		System.out.println("   ");
		System.out.println("FOOD ITEMS");
		for(int i=0;i<m;i++)
		{
		   System.out.println("Fooditem:"+items.get(i).getName()+"             "+"Price:"+items.get(i).getPrice()+"Rs");
		   System.out.println("  ");
		}
		
		
		/*return foodItems;*/
	}
	/*
	public FoodItem a(){
		return f;
	}
	public void viewItem()
	{
		Hotel h = new Hotel();
		
		for(int i=0;i<m;i++)
		{
		System.out.println(h.foodItems.get(i).getName()+"                                      "+h.foodItems.get(i).getPrice());
		}
	}*/
	
	}
	
	