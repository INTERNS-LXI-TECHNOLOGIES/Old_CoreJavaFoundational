package com.lxisoft.hotelv1;
import java.util.Scanner;
import java.util.ArrayList;
public class Hotel
{
	Scanner scan=new Scanner(System.in);
	private Administrator administrator;
	private Cashier cashier;
	private ArrayList <Food> foods;
	//Customer customer=new Customer();
	public void setAdministrator(Administrator administrator)
	{
		this.administrator=administrator;
	}
	public Administrator getAdministrator()
	{
		return administrator;
	}
	public void setCashier(Cashier cashier)
	{
		this.cashier=cashier;
	}
	public Cashier getCashier()
	{
		return cashier;
	}
	public void setFoods(ArrayList <Food> foods)
	{
		this.foods=foods;
	}
	public ArrayList <Food> getFoods()
	{
		return foods;
	}
	public void hotelDetails()
	{
	System.out.println("FOOD PALACE");
	setAdministrator(new Administrator());
	setCashier(new Cashier());
	//setFoods.add(new ArrayList <Food>());
	/*for(int i=0;i<getAdministrator().noOfFood;i++)
	{
		
	}*/
	System.out.println("Login \n 1.Admin \n 2.User \n");
	switch(scan.nextInt())
	{
	case 1:
	getAdministrator().adminDetails();
	
	System.out.print("Username :");
	if(scan.next().equals(getAdministrator().getUsername()))
	{
		System.out.print("Password :");
		if(scan.next().equals(getAdministrator().getPassword()))
		{
		getAdministrator().addFoods();	
		}
		else
		{
			System.out.println("Password is incorrect");
		}
	}
	else
	{
		System.out.println("Username is incorrect");
	}
	System.out.println("Do you want to continue press 1");
	//if(scan.next()==1)
	
	
	break;
	case 2:
	getCashier().userDetails();
	System.out.print("Username :");
	if(scan.next().equals(getCashier().getUsername()))
	{
		System.out.print("Password :");
		if(scan.next().equals(getCashier().getPassword()))
		{
			
		}
		else
		{
			System.out.println("Password is incorrect");
		}
	}
	else
	{
		System.out.println("Username is incorrect");
	}
	break;
	default:System.out.println("Wrong choice");
	break;
	}
	
	
	}
	
	
}