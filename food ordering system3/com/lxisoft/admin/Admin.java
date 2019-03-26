package com.lxisoft.admin;
import com.lxisoft.fooditem.*;
import com.lxisoft.bill.*;
import com.lxisoft.customer.*;
import java.util.*;
import java.io.*;
public class Admin
{

	private String userName="admin";
	private String password="admin123";
	private static File s=new File("foodItems.txt");
	
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
		int x,choice;
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
		   
		   do
		   {
				System.out.println("1.ADD");
				System.out.println("2.DELETE");
				System.out.println("  ");
			    System.out.print("Enter your choice:");
			    choice=scan.nextInt();
				
				 switch(choice)
			  {
				  case 1:add(foodItems);
				  break;
				  case 2:delete(foodItems);
				  break;
				  default:System.out.println("Invalid choice made...please try again...!!!");
			
			  }
			  System.out.print("want to do any other operation...?Yes=1/No=0:");
			  x=scan.nextInt();
			}while(x==1);
			
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

public void add(ArrayList<FoodItem> foodItems)throws Exception
{	
        int num;
		
		
		FileWriter fw=new FileWriter(s,true);
		BufferedWriter bw=new BufferedWriter(fw);
		
	   
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
		
			 for(FoodItem f:foodItems)
		{
		bw.write(f.getName()+";"+f.getPrice());
		bw.newLine();
		}
        bw.close();	
		
        System.out.println("                         ADDED ITEMS                          ");
	    System.out.println("--------------------------------------------------------------");
		for(int i=0;i<foodItems.size();i++)
		{
		    System.out.println(foodItems.get(i).getName()+"                                      "+foodItems.get(i).getPrice());
		}
}

public void delete(ArrayList<FoodItem> foodItems)
{
	 String item;
	 System.out.println("FoodItem                                                           Price");
	         System.out.println("-----------------------------------------------------------------------");
	
			 for(FoodItem f:foodItems)
	{
		
		System.out.println(f.getName()+"                                          "+f.getPrice());
	}
	System.out.println("     ");
		
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
		
}
	
	public int calculateBill(String item,int value,ArrayList<FoodItem> foodItems)
	{
		
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
	
	public void reader()throws Exception
	{
		FileReader fr=new FileReader(s);
		BufferedReader br=new BufferedReader(fr);
        String b=null;
		 int i=0;
			 while((b=br.readLine())!=null)
			 {
				
				 System.out.println(">>>"+b);
				 /* String a[]=b.split(";");
				  	  foodItems.add(new FoodItem());
				  foodItems.get(i).setName(a[0]);
				  foodItems.get(i).setPrice(Integer.parseInt(a[1]));
				  i++;*/
			 }
			 fr.close();
	}
	}