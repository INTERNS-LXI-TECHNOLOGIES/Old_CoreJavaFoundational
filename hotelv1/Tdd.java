package com.lxisoft.hotelv1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.util.Comparator;
import java.io.*;
public class Tdd
{
	
	public static void main(String[] args) throws Exception
	{
		Scanner scan=new Scanner(System.in);
		ArrayList <Food> foods=new ArrayList <Food>();
		HotelController controller=new HotelController();
		System.out.println("FOOD PALACE");
		controller.displayDetails(foods);
		do
		{
			System.out.println("Login \n 1.Admin \n 2.User \n");
			switch(scan.nextInt())
			{
			case 1:
				controller.getAc().adminDetails();
				System.out.print("Username :");
				if(scan.next().equals(controller.getAc().getAdministrator().getUsername()))
				{
				System.out.print("Password :");
				if(scan.next().equals(controller.getAc().getAdministrator().getPassword()))
				{	
			//readFromFile();
						do{
						System.out.println("1.Add \n2.Delete\n3.Edit");
						switch(scan.nextInt())
						{
						case 1:	
							do{
							
								System.out.println("   Food Details   ");
								Food food=new Food();
										System.out.print("Food item:");
										food.setName(scan.next());
										System.out.print("Count:");
										food.setFoodCount(scan.nextInt());
										System.out.print("Price:");
										food.setFoodPrice(scan.nextInt());			
										foods.add(food);
							System.out.println("To add food again press 1");
							}while(scan.nextInt()==1);
							controller.storeDetails(foods);
							foods.clear();
							controller.displayDetails(foods);
							break;
						case 2:
							
							//deleteFood(foods);
								System.out.print("which one you want to delete:");
								String  n=scan.next();
								System.out.println(foods.size());
								//controller.getAc().getAs().deleteFood(n,foods);
										for(int i=0;i<foods.size();i++)
										{	
										if(n.equals(foods.get(i).getName()))
										{
											
										foods.remove(i);
											
										}
										}
							controller.storeDetails(foods);
							foods.clear();
							controller.displayDetails(foods);
							break;
						case 3:
									
							//editFood(foods);
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
										String nam=scan.next();
										foods.get(i).setName(nam);}
									
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
							//file.delete();
							controller.storeDetails(foods);
							foods.clear();
							controller.displayDetails(foods);
						//	foodItems.clear();
							break;	
							default:System.out.println("Wrong choice");
							break;				
						}
						
						System.out.println("Again do any operation press 1");
					}while(scan.nextInt()==1);
		
				//adminOptions(controller,foods,repository);
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
			
				controller.getCc().userDetails();
				System.out.print("Username :");
				if(scan.next().equals(controller.getCc().getCustomer().getUsername()))
				{
				System.out.print("Password :");
				if(scan.next().equals(controller.getCc().getCustomer().getPassword()))
				{
				//foodOrdering(controller,foods,repository);
						int noOfOrder;
				do{
				System.out.print("Which food you want:");
				String nameOfFood=controller.getCc().selectFood();
				if(foods!=null){
						//System.out.println("Food available");
						//printBill(foods,nameOfFood);
					/*int total=0;
						System.out.print("number of order:");
						int noOfOrder=scan.nextInt();
						System.out.println("\t\t\t\tFOOD PALACE\t\t\t\t");
						System.out.println("\t\t\t\tBILL\t\t\t\t");
						System.out.println("\t\t---------------------------------------\t\t");
						System.out.println("SNo\t\t\t\tFood items\t\t\t\tNo\t\t\t\tPrice");
						//System.out.println(foods.size());
						for(int i=0;i<controller.getFc().getFoods().size();i++)
						{
							int j=0;
							if((nameOfFood).equals(controller.getFc().getFoods().get(i).getName()))
							{
								if(controller.getFc().getFoods().get(i).getFoodCount()!=0)
								{
								System.out.print((j+1)+"\t\t"+controller.getFc().getFoods().get(i).getName()+"\t\t\t"+noOfOrder+"\t\t"+controller.getFc().getFoods().get(i).getFoodPrice()+"\n");
										
								total=total+((noOfOrder)*(controller.getFc().getFoods().get(i).getFoodPrice()));
								System.out.print("Total\t\t\t\t:"+total+"\n");
								//int c=(foods.get(i).getFoodCount())-noOfOrder;
								//String count=Integer.toString(c);
								//System.out.println(count);
								controller.getFc().getFoods().get(i).setFoodCount(controller.getFc().getFoods().get(i).getFoodCount()-noOfOrder);
								}
								else
								{
									System.out.println("no food");
								}
							}
							j++;
						}	*/
						controller.storeDetails(foods);
						foods.clear();
						controller.displayDetails(foods);
				}
				else{System.out.println("No food");}
				System.out.println("\n again order food press 1");
				}while(scan.nextInt()==1);
				
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
		//controller.display(controller,foods,service,repository);
	}
}