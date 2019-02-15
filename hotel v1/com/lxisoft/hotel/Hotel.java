package com.lxisoft.hotel;
import com.lxisoft.hotel.Admin;
import com.lxisoft.hotel.Food;
import java.util.ArrayList;
import java.util.Scanner;

public class Hotel
{
Scanner scan=new Scanner(System.in);
private Cashier cashier=new Cashier();
private Admin admin=new Admin();
private String name;
private Worker workers=new Worker();
private ArrayList<Food>food=new ArrayList();


    public void setFood (ArrayList <Food> food)
	{
		this.food=food;
	}
	public ArrayList <Food> getFood()
	{
		return food;
	}
	
	
	
	public void setName(String name)
	{
	   this.name=name;
	}
	public String getName()
	{
	   return name;
	}
	public void setAdmin(Admin admin)
	{
		this.admin=admin;
	}
	public Admin getAdmin()
	{
		return admin;
	}
	public void setCashear (Cashier cashier)
	{
		this.cashier=cashier;
	}
	public Cashier getCashier()
	{
		return cashier;
	}
	
		   /*for(int i=0;i<3;i++)
				{
				  food.add(new pizza);
				}
				for(int j=3;j<6;j++)
				{
				 food.add(new burger());
				}
				for(int k=6;k<9;k++)
				{
					food.add(new alfam());
				}*/

	
	
	
	
	    public void selecting()
		{
			
				
			//workers.selectingFood();
		System.out.println("do you want admin or cashier\nadmin=1\ncashier=0");
		int s=scan.nextInt();
			if(s==1)	
			{
				System.out.println("enter the admin password");
				int i=scan.nextInt();
				if(i==1234)
				{
					admin.addFood();
					workers.selectingFood();
					
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
			       cashier.printDetails();
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