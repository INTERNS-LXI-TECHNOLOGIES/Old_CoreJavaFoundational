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
	private ArrayList<Food> foods=new ArrayList<Food>();
	private MenuList menuList=new MenuList();
	private Bill bill=new Bill();
	        public void setBill(Bill bill)
			{
				this.bill=bill;
			}
			public Bill getBill()
			{
				return bill;
			}
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
				this.foods=foods;
			}
			public ArrayList <Food> getFood()
			{
				return foods;
			}
			
			
 
	
   public void authendication()
   {
		    System.out.println("do you want admin or cashier or customer\ncashier=0\nadmin=1\ncustomer=2");
		    int s=scan.nextInt();
		 
		 if(s==1)	
		  {
				System.out.println("enter the admin password");
				int i=scan.nextInt();
						if(i==1234)
						{
							admin.inventoryOptions(foods);
							
						}
						else
						{
							System.out.println("not found");
						}
					
			}
					
	    else if(s==0)
			{
					System.out.println("enter cashier password");
					int j=scan.nextInt();
					if(j==7787)
					{
				
					   customers.choosing(foods);
					    customers.deleteOrderedFood(foods);
					  
					}
					else
					{
						System.out.println("not founds");
					}
			}
		else if(s==2)
			{
				   System.out.println("enter the customer password");
				   int j=scan.nextInt();
				   if(j==55555)
				   {
					  System.out.println("1)menulist\n2)bill");
						 int choice=scan.nextInt();
							switch(choice)
							{
								case 1:
								 menuList.listOfFood(foods);
							   break;
								 case 2:
								
								 bill.printBill(customers.orderedFood);
								 break;
								 
								default:
								System.out.println("invalid entry");
								
							 }
					}
				   else 
				   {
					   System.out.println("not fount");
				   }
			}
			else
			{
				System.out.println("not found");
			}
			
    }
}