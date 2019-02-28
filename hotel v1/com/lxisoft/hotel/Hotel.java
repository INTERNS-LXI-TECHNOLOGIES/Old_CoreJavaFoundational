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
	     System.out.println("do you want admin or cashier or customer\ncashier=0\nadmin=1\ncustomer=2\nworkers=3");
		 int login=scan.nextInt();
		 
		 if(login==1)	
		  {
			  System.out.println("enter the admin password");
			  int adminPassword=scan.nextInt();
			  if(adminPassword==1234)
					{
						admin.inventoryOptions(foods);
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
				      bill.printBill(customers.orderedFood);
					}
					else
					{
						System.out.println("not founds");
					}
			}
		else if(login==2)
			{
				  menuList.listOfFood(foods);
				   customers.choosing(foods);
				   printing();
			}
       else if(login==3)
		    {   
			    
                System.out.println("do you want see the balance food details \n*)yes=1\n*)no=2");
			    int choice=scan.nextInt();
				if(choice==1)
				{
					printing();
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
     public void printing()
			{
				System.out.println("BALANCE FOOD\n**********");
					for(int i=0;i<foods.size();i++)
					{
						
						System.out.println("  name"+foods.get(i).getName()+"  count"+foods.get(i).getCount());
					}	
			}
}