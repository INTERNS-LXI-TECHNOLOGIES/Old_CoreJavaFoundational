package com.lxisoft.hotel;
import com.lxisoft.hotel.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Hotel
{
	static Scanner scan=new Scanner(System.in);
	private Cashier cashier=new Cashier();
	private Worker workers=new Worker();
	private Customer customers=new Customer();
	private Admin admin=new Admin();
	private String name;
	private ArrayList<Food>food=new ArrayList();
            public void setCashear (Cashier cashier)
			{
				this.cashier=cashier;
			}
			public Cashier getCashier()
			{
				return cashier;
			}
			
			

            public void setWorkers (Worker workers)    
			{
				this.workers=workers;
			}
			public Worker getWorkers()
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
				this.food=food;
			}
			public ArrayList <Food> getFood()
			{
				return food;
			}
			
			

	
	    public void authendication()
		  {
		    System.out.println("do you want admin or cashier\nadmin=1\ncashier=0");
		    int s=scan.nextInt();
			if(s==1)	
			{
				System.out.println("enter the admin password");
				int i=scan.nextInt();
				if(i==1234)
				{
			        admin.inventoryOptions();
					admin.printFoodDetails();
				}
				else 
				{
					System.out.println("not fount");
				}
				
			}
			else if(s==0)
			{
				System.out.println("enter cashier password");
				int j=scan.nextInt();
				if(j==7787)
				{
			       cashier.printDetails( customers.getFood());
				  
				}
				else
				{
					System.out.println("not fount");
				}
			}
			else
			{
				System.out.println("not fount");
			}
       }
}