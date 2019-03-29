 package com.lxisoft.mvc;
 import com.lxisoft.mvc.*;
 import com.lxisoft.hotel.*;
 import java.util.Scanner;
 import java.util.ArrayList;
 public class HotelModel
 { 
	private String name;
    Scanner scan=new Scanner(System.in);
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
			
		
			
 }
			