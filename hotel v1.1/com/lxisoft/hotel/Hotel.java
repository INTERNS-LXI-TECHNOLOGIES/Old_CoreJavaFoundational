package com.lxisoft.hotel;
import com.lxisoft.hotel.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Hotel
{
	File f=new File("A.Txt");
	FileReader fr;
	BufferedReader br;
	private String name;
	static Scanner scan=new Scanner(System.in);
	private Admin admin=new Admin();
	private Cashier cashier=new Cashier();
	private Customer customers=new Customer();
	private ArrayList<Worker> workers=new ArrayList<Worker>();
	private ArrayList<Food> foods=new ArrayList<Food>();
	private MenuList menuList=new MenuList();
	
			
	        public void setMenuList (MenuList menuList)
			{
				this.menuList=menuList;
			}
			public MenuList getMenuList()
			{
				return menuList;
			}
			
            public void setCashear (Cashier cashier)
			{
				this.cashier=cashier;
			}
			public Cashier getCashier()
			{
				return cashier;
			}
		   
		   public void setWorkers (ArrayList<Worker> workers)    
			{
				this.workers=workers;
			}
			public ArrayList<Worker> getWorkers()
			{
				return workers;
			}
			

           public void setCustomers(Customer customers)
			{
			   this.customers=customers;
			}
			public Customer getCoustemers()
			{
				return customers;
			}
			

           public void setAdmin(Admin admin)
			{
				this.admin=admin;
			}
			public Admin getAdmin()
			{
				return admin;
			}
			

		   public void setName(String name)
			{
			   this.name=name;
			}
			public String getName()
			{
			   return name;
			}

           public void setFood (ArrayList <Food> food)
			{
				this.foods=foods;
			}
			public ArrayList <Food> getFood()
			{
				return foods;
			}
			

	public void authendication()throws Exception
    {
	     System.out.println("do you want admin or cashier or customer\ncashier=0\nadmin=1\ncustomer=2\nworkers=3");
		 int login=scan.nextInt();
		 
		 if(login==1)	
		  {
			  System.out.println("enter the admin password");
			  int adminPassword=scan.nextInt();
			  if(adminPassword==1234)
					{
						admin.choose(foods);
					}
			  else
					{
						System.out.println("not found");
					}
		  }
		 else if(login==0)
		  {
					System.out.println("enter cashier password");
					int cashierPassword=scan.nextInt();
					if(cashierPassword==7787)
					{
				      cashier.callingBill(customers.orderedFood);
					
					}
					else
					{
						System.out.println("not founds");
					}
			}
		else if(login==2)
			{
				  menuList.listOfFood(foods);
				   customers.foodChoosing(foods);
				   System.out.println("size***="+foods.size());
				
				   balanceFoodPrinting();
			}
       else if(login==3)
		    {   
			    
                System.out.println("do you want see the balance food details \n*)yes=1\n*)no=2");
			    int choice=scan.nextInt();
				if(choice==1)
				{
					balanceFoodPrinting();
				}
				else 
				{
					System.out.println("you cant see");
				}
			}
		else
			{
				System.out.println("not found");
			}
	 }
     public void balanceFoodPrinting()throws Exception
			{
				
		          //String [] item=new String[3];
				String k;
				System.out.println("BALANCE FOOD\n**************");
					
						fr=new FileReader(f);
						br=new BufferedReader(fr);
						int i=0;
						while((k=br.readLine())!= null)
						{	
							String item[]=k.split(",");
							
							System.out.println(""+k);
							System.out.println("item==="+item[i]);
							
						}
				
			}
}