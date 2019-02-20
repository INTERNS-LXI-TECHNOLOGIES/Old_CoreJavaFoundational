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
	int noOfFood;
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
	int noOfCustomers;
	int con;
	int total=0;
	int noOfOrder;
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
		System.out.print(getFoods().get(i).getSNo()+"\t\t"+getFoods().get(i).getFoodName()+"\t\t\t"+getFoods().get(i).getFoodCount()+"\t\t"+getFoods().get(i).getFoodPrice()+"\n");
		}
		break;
		case 2:
		int num=getAdministrator().deleteFood();
		for(int i=0;i<noOfFood;i++)
		{
		if(num==getFoods().get(i).getSNo())
		{
			foods.remove(i);
			System.out.println(getFoods().get(i));
		}
		}
		System.out.println("SNo\t\tFood items\t\tCount\t\tPrice");
		for(int i=0;i<noOfFood;i++)
		{
		System.out.print(getFoods().get(i).getSNo()+"\t\t"+getFoods().get(i).getFoodName()+"\t\t\t"+getFoods().get(i).getFoodCount()+"\t\t"+getFoods().get(i).getFoodPrice()+"\n");
		}
		break;
		case 3:
		String edit1=getAdministrator().editFood();
		for(int i=0;i<noOfFood;i++)
		{
			
		if(edit1.equals(getFoods().get(i).getFoodName()))
			{
				//getFoods().get(i).getFoodName()=null;
				System.out.println("add food:");
				getFoods().get(i).setFoodName(scan.next());
			}
			else if(edit1.equals(getFoods().get(i).getFoodCount()))
			{
				int count=getFoods().get(i).getFoodCount();
				getFoods().get(i).setFoodCount(scan.nextInt());
			}
			else if(edit1.equals(getFoods().get(i).getFoodPrice()))
			{
				int price=getFoods().get(i).getFoodPrice();
				getFoods().get(i).setFoodPrice(scan.nextInt());
			}
		}
		System.out.println("SNo\t\tFood items\t\tCount\t\tPrice");
		for(int i=0;i<noOfFood;i++)
		{	
		System.out.print(getFoods().get(i).getSNo()+"\t\t"+getFoods().get(i).getFoodName()+"\t\t\t"+getFoods().get(i).getFoodCount()+"\t\t"+getFoods().get(i).getFoodPrice()+"\n");
		}
		
		break;
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
	
	setCustomers(new ArrayList <Customer>());
	System.out.print("number of customers:");
	noOfCustomers=scan.nextInt();
	System.out.print("number of order:");
	noOfOrder=scan.nextInt();
	System.out.print("Which food you want:");
	for(int j=0;j<noOfCustomers;j++)
	{
		
	getCustomers().add(new Customer());	
	for(int i=0;i<noOfFood;i++)
		{
	if((getCustomers().get(j).selectFood()).equals(getFoods().get(i).getFoodName()))
			{
			System.out.println("Food available");
			cashier.printBill();
			System.out.print(getFoods().get(i).getSNo()+"\t\t"+getFoods().get(i).getFoodName()+"\t\t"+noOfOrder+"\t\t"+getFoods().get(i).getFoodPrice()+"\n");
			
			total=total+(noOfOrder*getFoods().get(i).getFoodPrice());
			System.out.print("Total\t\t\t\t:"+total);
			}
	}
	}
			
	}
	
	
}