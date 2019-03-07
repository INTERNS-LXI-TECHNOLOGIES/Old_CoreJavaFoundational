package com.lxisoft.hotelv1;
import java.util.Scanner;
import java.util.ArrayList;
public class Cashier
{
	Scanner scan=new Scanner(System.in);
	public void printBill(ArrayList <String> foodItems,String nameOfFood)
	{
		int total=0;
		System.out.print("number of order:");
		int noOfOrder=scan.nextInt();
		System.out.println("\t\t\t\tFOOD PALACE\t\t\t\t");
		System.out.println("\t\t\t\tBILL\t\t\t\t");
		System.out.println("\t\t---------------------------------------\t\t");
		System.out.println("SNo\t\t\t\tFood items\t\t\t\tNo\t\t\t\tPrice");
		for(int i=0;i<foodItems.size();i++)
		{
			if((nameOfFood).equals(foodItems.get(i)))
			{
				if((foodItems.get(i+1))!=null)
				{
				System.out.printf((i+1)+"\t\t"+foodItems.get(i)+"\t\t"+noOfOrder+"\t\t"+foodItems.get(i+2)+"\n");
						
				total=total+((noOfOrder)*Integer.parseInt(foodItems.get(i+2)));
				System.out.print("Total\t\t\t\t:"+total);
				int c=Integer.parseInt(foodItems.get(i+1))-noOfOrder;
				String count=Integer.toString(c);
				//System.out.println(count);
				foodItems.set((i+1),(count));
				}
				else
				{
					System.out.println("no food");
				}
			}
		}
		
	}
}