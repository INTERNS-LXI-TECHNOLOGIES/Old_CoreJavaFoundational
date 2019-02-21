package com.lxisoft.hotelv1;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
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
	public void hotelDetails()
	{	
		//int noOfCustomers;
		int con;
		//int total=0;
		//int noOfOrder;
		System.out.println("FOOD PALACE");
		setAdministrator(new Administrator());
		setCashier(new Cashier());
		System.out.println("Login \n 1.Admin \n 2.User \n");
		switch(scan.nextInt())
		{
		case 1:
		administrator.adminDetails();
		do
		{
		System.out.print("Username :");
		if(scan.next().equals(administrator.getUsername()))
		{
			System.out.print("Password :");
			if(scan.next().equals(administrator.getPassword()))
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
			foods.add(administrator.addFood());
			}
			System.out.println("SNo\t\tFood items\t\tCount\t\tPrice");
			for(int i=0;i<foods.size();i++)
			{
			System.out.print((i+1)+"\t\t"+foods.get(i).getFoodName()+"\t\t\t"+foods.get(i).getFoodCount()+"\t\t"+foods.get(i).getFoodPrice()+"\n");
			}
			break;
			case 2:
			int pos=0;
			int num=administrator.deleteFood();
			System.out.println(num);
			for(int i=0;i<foods.size();i++)
			{
			if(num==(foods.get(i).getSNo()))
			{
				// pos=i;
			foods.remove(i);
			}
			}
			//foods.remove(pos);
			if(foods.size()!=0)
			{
			System.out.println("SNo\t\tFood items\t\tCount\t\tPrice");
			for(int i=0;i<foods.size();i++)
			{
			System.out.print((i+1)+"\t\t"+foods.get(i).getFoodName()+"\t\t\t"+foods.get(i).getFoodCount()+"\t\t"+foods.get(i).getFoodPrice()+"\n");
			}
			}
			else
			{
				System.out.println("No food");
			}
			break;
			case 3:
			String edit1=administrator.editFood();
			for(int i=0;i<foods.size();i++)
			{
				
			if(edit1.equals(foods.get(i).getFoodName()))
				{
					String name=foods.get(i).getFoodName();
					System.out.println("add food:");
					foods.get(i).setFoodName(scan.next());
				}
				
				else if((Integer.parseInt(edit1))==(foods.get(i).getFoodCount()))
				{
					int count=foods.get(i).getFoodCount();
					System.out.println("add count:");
					foods.get(i).setFoodCount(scan.nextInt());
				}
				else if((Integer.parseInt(edit1))==(foods.get(i).getFoodPrice()))
				{
					int price=foods.get(i).getFoodPrice();
					System.out.println("add price:");
					foods.get(i).setFoodPrice(scan.nextInt());
				}
			}
			System.out.println("SNo\t\tFood items\t\tCount\t\tPrice");
			for(int i=0;i<foods.size();i++)
			{	
			System.out.print((i+1)+"\t\t"+foods.get(i).getFoodName()+"\t\t\t"+foods.get(i).getFoodCount()+"\t\t"+foods.get(i).getFoodPrice()+"\n");
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
	}
	public void dealCustomers()
	{
		int noOfCustomers;
		int total=0;
		int noOfOrder;
		setCustomers(new ArrayList <Customer>());
		System.out.print("number of customers:");
		noOfCustomers=scan.nextInt();
		System.out.print("number of order:");
		noOfOrder=scan.nextInt();
		System.out.print("Which food you want:");
		for(int j=0;j<noOfOrder;j++)
		{
			
		getCustomers().add(new Customer());	
		if(foods.size()!=0)
		{
		for(int i=0;i<foods.size();i++)
			{
		if((customers.get(j).selectFood()).equals(foods.get(i).getFoodName()))
				{
				System.out.println("Food available");
				cashier.printBill();
				System.out.printf((i+1)+"\t\t"+foods.get(i).getFoodName()+"\t\t"+noOfOrder+"\t\t"+foods.get(i).getFoodPrice()+"\n");
				
				total=total+(noOfOrder*foods.get(i).getFoodPrice());
				System.out.print("Total\t\t\t\t:"+total);
				
				}
				foods.get(i).setFoodCount(foods.get(i).getFoodCount()-noOfOrder);
		}
		System.out.println("SNo\t\tFood items\t\tNos\t\tPrice");
			for(int i=0;i<foods.size();i++)
			{	
			System.out.print((i+1)+"\t\t"+foods.get(i).getFoodName()+"\t\t\t"+foods.get(i).getFoodCount()+"\t\t"+foods.get(i).getFoodPrice()+"\n");
			}
		}
		else{System.out.println("No food");}
		}		
	}
	
	
}