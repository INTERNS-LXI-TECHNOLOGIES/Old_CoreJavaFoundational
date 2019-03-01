package com.lxisoft.hotelv1;
import java.util.Scanner;
import java.util.ArrayList;
public class Cashier
{
	Scanner scan=new Scanner(System.in);
	public void printBill(ArrayList <Food> foods,String nameOfFood)
	{
		int total=0;
		System.out.print("number of order:");
		int noOfOrder=scan.nextInt();
		System.out.println("\t\t\t\tFOOD PALACE\t\t\t\t");
		System.out.println("\t\t\t\tBILL\t\t\t\t");
		System.out.println("\t\t---------------------------------------\t\t");
		System.out.println("SNo\t\t\t\tFood items\t\t\t\tCount\t\t\t\tPrice");
		for(int i=0;i<foods.size();i++)
		{
			if((nameOfFood).equals(foods.get(i).getName()))
			{
				if((foods.get(i).getFoodCount())!=0)
				{
				System.out.printf((i+1)+"\t\t"+foods.get(i).getName()+"\t\t"+noOfOrder+"\t\t"+foods.get(i).getFoodPrice()+"\n");
						
				total=total+(noOfOrder*foods.get(i).getFoodPrice());
				System.out.print("Total\t\t\t\t:"+total);
				foods.get(i).setFoodCount(foods.get(i).getFoodCount()-noOfOrder);
				}
				else
				{
					System.out.println("no food");
				}
			}
		}
		
	}
}