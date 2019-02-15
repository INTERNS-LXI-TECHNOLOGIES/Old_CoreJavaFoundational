package com.lxisoft.hotelv1;
import java.util.Scanner;
import java.util.ArrayList;
public class Hotel
{
	Scanner scan=new Scanner(System.in);
	private Administrator administrator;
	private Cashier cashier;
	private ArrayList <Food> foods;
	private ArrayList <Customer> customers;
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
	public void setCustomers(ArrayList <Customer> customers)
	{
		this.customers=customers;
	}
	public ArrayList <Customer> getCustomers()
	{
		return customers;
	}
	
	public void hotelDetails()
	{	
	int noOfFood;
	int noOfCustomers;
	System.out.println("FOOD PALACE");
	setAdministrator(new Administrator());
	setCashier(new Cashier());
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
		System.out.println("1.Add \n2.Delete\n3.Edit");
		switch(scan.nextInt())
		{
		case 1:	
		getAdministrator().addFoods();
		System.out.print("Enter the number of food items:");
		noOfFood=scan.nextInt();
		System.out.println("   Food Details   ");
		setFoods(new ArrayList <Food>());
		for(int i=0;i<noOfFood;i++)
		{
			getFoods().add(new Food());
			System.out.print("Food no:");
			getFoods().get(i).setSNo(scan.nextInt());
			System.out.print("Food item:");
			getFoods().get(i).setFoodName(scan.next());
			System.out.print("Price:");
			getFoods().get(i).setFoodPrice(scan.nextInt());
		}
		System.out.println("SNo    Food items     Price");
		for(int i=0;i<noOfFood;i++)
		{
		System.out.print(getFoods().get(i).getFoodName()+"     "+getFoods().get(i).getFoodName()+"             "+getFoods().get(i).getFoodPrice()+"\n");
		}
		break;
		case 2:
		/*getAdministrator().deleteFoods();
		int n=scan.nextInt();
		for(int i=0;i<noOfFood;i++)
		{
		if(n-1==getFoods().get(i).getSNo())
		{
			getFoods().remove(i);
		}
		}
		break;*/
		}
		}
		else
		{
			System.out
			.println("Password is incorrect");
		}
	}
	else
	{
		System.out.println("Username is incorrect");
	}
	//System.out.println("Do you want to continue press 1");
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
	/*setCustomers(new ArrayList <Customer>());
	System.out.println("number of customers:");
	noOfCustomers=scan.
	for(int j=0;j<noOfCustomers;j++)
	{
	getCustomers().add(new Customer());	
	setCustomers().selectFood();*/
	
	
	}
	
	
}