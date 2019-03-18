package com.lxisoft.admin;
import com.lxisoft.fooditem.*;
import com.lxisoft.bill.*;
import com.lxisoft.customer.*;
import java.io.*;
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
	
	public void logAdmin(ArrayList<FoodItem> foodItems)throws Exception
	{
		int num;
	    String item;
		
		File s=new File("foodItems.txt");
		FileWriter fw=new FileWriter(s,true);
		BufferedWriter bw=new BufferedWriter(fw);
		
        System.out.println("                          ADMIN LOGGIN                           ");
		System.out.println("-----------------------------------------------------------------");
	    System.out.print("Username:");
		String userName=scan.next();
		System.out.print("Password:");
		String password=scan.next();
		if(userName.equals(getUserName()) && password.equals(getPassword()))
		{
		   System.out.println(" ");
		   System.out.println("Access granted");
		   System.out.println(" ");
        System.out.print("No.of Items you want to add..?:");
		num=scan.nextInt();
		for(int i=0;i<num;i++)
		{
		foodItems.add(new FoodItem());
		System.out.print("FoodItem:");
		foodItems.get(i).setName(scan.next());
		System.out.print("Price:");
		foodItems.get(i).setPrice(scan.nextInt());
		System.out.println("   ");
		}
		
	    System.out.println("   ");
		System.out.println("Record saved.....");
		System.out.println("   ");
        System.out.println("                         ADDED ITEMS                          ");
	    System.out.println("--------------------------------------------------------------");
		for(int i=0;i<foodItems.size();i++)
		{
		    System.out.println(foodItems.get(i).getName()+"                                      "+foodItems.get(i).getPrice());
		}
		
		System.out.println("     ");
		System.out.print("Do you want to delete anything....?yes=1/no=0:");
		int value=scan.nextInt();
		while(value==1)
		{
		System.out.print("Which item you want to delete...?:");
		item=scan.next();
		for(int i=0;i<foodItems.size();i++)
		{
			if(item.equals(foodItems.get(i).getName()))
			{
				foodItems.remove(foodItems.get(i));
			}
		}
		
		System.out.println("   ");
		System.out.println("AVAILABLE FOOD ITEMS");
		System.out.println("--------------------");
		System.out.println("FoodItem                                   Price");
		System.out.println("------------------------------------------------");
		for(FoodItem f:foodItems)
		{
			System.out.println(f.getName()+"                    "+f.getPrice());
		}
		value++;
		}
		
		for(FoodItem f:foodItems)
		{
		bw.write(f.getName()+";"+f.getPrice());
		bw.newLine();
		}
        bw.close();		
		}
		 else if(userName!=getUserName() && password.equals(getPassword()))
							{
								System.out.println("Invalid username...!!!");
							}
			   else if(password!=getPassword() && userName.equals(getUserName()))
							{
								System.out.println("Incorrect password");
							}
			   else
							{
								System.out.println("Invalid username & password...Please try again...!!!");
							}
	}
	
	
	/*public void adminPage(ArrayList<FoodItem> foodItems)
	{
	 int num;
	 String item;
	    
		System.out.print("No.of Items you want to add..?:");
		num=scan.nextInt();
		for(int i=0;i<num;i++)
		{
		foodItems.add(new FoodItem());
		System.out.print("FoodItem:");
		foodItems.get(i).setName(scan.next());
		System.out.print("Price:");
		foodItems.get(i).setPrice(scan.nextInt());
		System.out.println("   ");
		}
		
	    System.out.println("   ");
		System.out.println("Record saved.....");
		System.out.println("   ");
		
		System.out.println("                         ADDED ITEMS                          ");
	    System.out.println("--------------------------------------------------------------");
		for(int i=0;i<foodItems.size();i++)
		{
		    System.out.println(foodItems.get(i).getName()+"                                      "+foodItems.get(i).getPrice());
		}
		
		System.out.println("     ");
		System.out.print("Do you want to delete anything....?yes=1/no=0:");
		int value=scan.nextInt();
		while(value==1)
		{
		System.out.print("Which item you want to delete...?:");
		item=scan.next();
		for(int i=0;i<foodItems.size();i++)
		{
			if(item.equals(foodItems.get(i).getName()))
			{
				foodItems.remove(foodItems.get(i));
			}
		}
		
		System.out.println("   ");
		System.out.println("AVAILABLE FOOD ITEMS");
		System.out.println("--------------------");
		System.out.println("FoodItem                                   Price");
		System.out.println("------------------------------------------------");
		for(FoodItem f:foodItems)
		{
			System.out.println(f.getName()+"                    "+f.getPrice());
		}
		value++;
		}
		
	}*/
	public int calculateBill(String item,int value,ArrayList<FoodItem> foodItems)
	{
		/*System.out.println(item+"  "+value);*/
		
		/*Bill bill=new Bill();*/
		int price=0;
		System.out.println("  ");
		
			for(FoodItem f:foodItems)
		{
			
			if(item.equals(f.getName()))
			{
				   price=((value)*(f.getPrice()));
						
			}
		}
		return price;
	}
	}