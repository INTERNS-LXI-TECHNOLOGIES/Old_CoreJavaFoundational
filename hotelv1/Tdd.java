package com.lxisoft.hotelv1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.util.Comparator;
import java.io.*;
public class Tdd
{
	Scanner scan=new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		Service service=new Service();
		HotelController controller=new HotelController();
		ArrayList <Food> foods=new ArrayList <Food>();
		controller.display(controller,foods,service);
		//controller.printDetails(service,controller,foods);
	}
public void authentication(HotelController controller,ArrayList <Food> foods,Service service)throws Exception
{	
//File file=new File("foodsdetail.txt");
//FileWriter fw=new FileWriter(file,true);
		//System.out.println(file.exists());
		//bw.write("pizza");
			System.out.println("FOOD PALACE");
			
			
			//controller=new HotelController();
		controller.service.repository.readFromFile(foods);
		do
		{
			System.out.println("Login \n 1.Admin \n 2.User \n");
			switch(scan.nextInt())
			{
			case 1:
				controller.adminDetails();
				System.out.print("Username :");
				if(scan.next().equals(controller.getAdministrator().getUsername()))
				{
				System.out.print("Password :");
				if(scan.next().equals(controller.getAdministrator().getPassword()))
				{	
			//readFromFile();
			
				adminOptions(controller,foods);
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
			case 2:
			
				controller.userDetails();
				System.out.print("Username :");
				if(scan.next().equals(controller.getCustomer().getUsername()))
				{
				System.out.print("Password :");
				if(scan.next().equals(controller.getCustomer().getPassword()))
				{
					//readFromFile();
				foodOrdering(controller,foods);
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
				System.out.println("Login page press 2");
		}while(scan.nextInt()==2);
}	
public void adminOptions(HotelController controller,ArrayList <Food> foods)throws Exception
{
		//File file=new File("foodsdetail.txt");
		//FileWriter fw=new FileWriter(file,true);
		//controller=new HotelController();
		
		//readFromFile();
		do{
			System.out.println("1.Add \n2.Delete\n3.Edit");
			switch(scan.nextInt())
			{
			case 1:	
				do{
				foods.add(addFood());
				//file.delete();
				//foods.set(0);
				//writeToFile();
				System.out.println("To add food again press 1");
				}while(scan.nextInt()==1);
				
				//foodDetails();
				
			
				controller.service.repository.writeToFile(foods);
				foods.clear();
				controller.service.repository.readFromFile(foods);
			 // foods.clear();
				break;
			case 2:
				
				deleteFood(foods);
				//file.delete();
				controller.service.repository.arraylistToFile(foods);
				foods.clear();
				controller.service.repository.readFromFile(foods);
				//foodItems.clear();
				break;
			case 3:
						
				editFood(foods);
				//file.delete();
				controller.service.repository.arraylistToFile(foods);
				foods.clear();
				controller.service.repository.readFromFile(foods);
			//	foodItems.clear();
				break;	
				default:System.out.println("Wrong choice");
				break;				
			}
			
			System.out.println("Again do any operation press 1");
		}while(scan.nextInt()==1);
		
}	
public void foodOrdering(HotelController controller,ArrayList <Food> foods)throws Exception
{
	
	//System.out.println(foods.size());
	//File file=new File("foodsdetail.txt");
		//FileWriter fw=new FileWriter(file,true);
		//readFromFile();
				int noOfOrder;
				//foods.clear();
				//System.out.println(foodItems.size());
				do{
					//readFromFile();
				System.out.print("Which food you want:");
				String nameOfFood=controller.selectFood();
				if(foods!=null){
						//System.out.println("Food available");
						printBill(foods,nameOfFood);
						controller.service.repository.arraylistToFile(foods);
						foods.clear();
						controller.service.repository.readFromFile(foods);
				}
				else{System.out.println("No food");}
				System.out.println("\n again order food press 1");
				}while(scan.nextInt()==1);
				
				
				//readFromFile();
}
public Food addFood() throws Exception
	{	
	System.out.println("   Food Details   ");
	Food foods=new Food();
			System.out.print("Food item:");
			foods.setName(scan.next());
			System.out.print("Count:");
			foods.setFoodCount(scan.nextInt());
			System.out.print("Price:");
			foods.setFoodPrice(scan.nextInt());
			return foods;
			
	}
	public void deleteFood(ArrayList <Food> foods) throws Exception
	{
		
		System.out.print("which one you want to delete:");
		String  n=scan.next();
		//System.out.println(n);
		System.out.println(foods.size());
		//System.out.println(foods.get(0).getName());
				
				for(int i=0;i<foods.size();i++)
				{
				//System.out.println(foods.get(i).getName());	
				if(n.equals(foods.get(i).getName()))
				{
					
				foods.remove(i);
					
				}
				}
	}
	public void editFood(ArrayList <Food> foods)throws Exception
	{
				System.out.print("which one you want to edit:");
				String edit=scan.next();
				System.out.println(foods.size());
				//System.out.println(edit);
				for(int i=0;i<foods.size();i++)
				{	
					if(edit.equals(foods.get(i).getName()))
					{
						//System.out.println(foodItems.get(i));
						//String name=foodItems.get(i);
						System.out.println("change name press 1");
						while(scan.nextInt()==1){
						System.out.print("changed food name:");
						String n=scan.next();
						foods.get(i).setName(n);}
					
					System.out.println("change food count press 2");
						while(scan.nextInt()==2){
						System.out.print("changed food count:");
						int c=scan.nextInt();
						foods.get(i).setFoodCount(c);
						}
					System.out.println("change name press 3");
						while(scan.nextInt()==3){
						System.out.print("changed food price:");
						int p=scan.nextInt();
						foods.get(i).setFoodPrice(p);
						}
					}
				}
	}
	public void printBill(ArrayList <Food> foods,String nameOfFood)
	{
		int total=0;
		System.out.print("number of order:");
		int noOfOrder=scan.nextInt();
		System.out.println("\t\t\t\tFOOD PALACE\t\t\t\t");
		System.out.println("\t\t\t\tBILL\t\t\t\t");
		System.out.println("\t\t---------------------------------------\t\t");
		System.out.println("SNo\t\t\t\tFood items\t\t\t\tNo\t\t\t\tPrice");
		//System.out.println(foods.size());
		for(int i=0;i<foods.size();i++)
		{
			int j=0;
			if((nameOfFood).equals(foods.get(i).getName()))
			{
				if(foods.get(i).getFoodCount()!=0)
				{
				System.out.print((j+1)+"\t\t"+foods.get(i).getName()+"\t\t\t"+noOfOrder+"\t\t"+foods.get(i).getFoodPrice()+"\n");
						
				total=total+((noOfOrder)*(foods.get(i).getFoodPrice()));
				System.out.print("Total\t\t\t\t:"+total+"\n");
				//int c=(foods.get(i).getFoodCount())-noOfOrder;
				//String count=Integer.toString(c);
				//System.out.println(count);
				foods.get(i).setFoodCount(foods.get(i).getFoodCount()-noOfOrder);
				}
				else
				{
					System.out.println("no food");
				}
			}
			j++;
		}
	}

}