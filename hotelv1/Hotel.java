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
	//private Bill bill;
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
	/*public void setBill(Bill bill)
	{
		this.bill=bill;
	}
	public Bill getBill()
	{
		return bill;
	}*/
	
	public void hotelDetails()
	{	
	int noOfFood;
	int noOfCustomers;
	int con;
	System.out.println("FOOD PALACE");
	setAdministrator(new Administrator());
	setCashier(new Cashier());
	System.out.println("Login \n 1.Admin \n 2.User \n");
	switch(scan.nextInt())
	{
	case 1:
	getAdministrator().adminDetails();
	do
	{
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
		setFoods(new ArrayList <Food>());
		System.out.println("Enter the food details");
		System.out.print("Enter the number of food items:");
		noOfFood=scan.nextInt();
		System.out.println("   Food Details   ");
		for(int i=0;i<noOfFood;i++)
		{
		getFoods().add(getAdministrator().addFood());
		}
		System.out.println("SNo\t\tFood items\t\tCount\t\tPrice");
		for(int i=0;i<noOfFood;i++)
		{
		System.out.print(getFoods().get(i).getSNo()+"\t\t"+getFoods().get(i).getFoodName()+"\t\t\t\t"+getFoods().get(i).getFoodCount()+"\t\t\t\t"+getFoods().get(i).getFoodPrice()+"\n");
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
		default:System.out.println("Wrong choice");
		break;
		}
		}
		else
		{
			System.out.println("Password is incorrect");
			System.out.println("Do you want to continue press 1");
		}
	}
	else
	{
		System.out.println("Username is incorrect");
		System.out.println("Do you want to continue press 1");
	}
	con=scan.nextInt();
	}while(con==1);
	break;
	case 2:
	getCashier().userDetails();
	do
	{
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
			System.out.println("Do you want to continue press 1");
		}
	}
	else
	{
		System.out.println("Username is incorrect");
		System.out.println("Do you want to continue press 1");
	}
	con=scan.nextInt();
	}while(con==1);
	break;
	default:System.out.println("Wrong choice");
	break;
	}
	System.out.print("number of customers:");
	noOfCustomers=scan.nextInt();
	setCustomers(new ArrayList <Customer>());
	System.out.print("Which food you want:");
	for(int j=0;j<noOfCustomers;j++)
	{
	getCustomers().add(new Customer());	
	//getCustomers().get(j).selectFood();
	}
	/*for(int j=0;j<noOfCustomers;j++)
	{
		for(int i=0;i<noOfFood;i++)
		{
			if(getCustomers().get(j).selectFood()==getFoods().get(i).getFoodName())
			{
			cashier.printBill();
			System.out.print(getFoods().get(i).getSNo()+"\t\t"+getFoods().get(i).getFoodName()+"\t\t\t\t"+getFoods().get(i).getFoodCount()+"\t\t\t\t"+getFoods().get(i).getFoodPrice()+"\n");
			}
		}
	}*/
	}
	
	
}