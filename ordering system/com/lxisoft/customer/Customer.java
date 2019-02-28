package com.lxisoft.customer;
import com.lxisoft.fooditem.*;
import java.util.*;
public class Customer
{
	Scanner scan=new Scanner(System.in);
public void placeOrderAndBillPrinting(ArrayList<FoodItem> foodItems)
{
/*foodItems.foodMenu();*/
String order;
int value;
int total;
System.out.println("FOOD MENU");
		System.out.println("--------------");
		for(int i=0;i<foodItems.size();i++)
		{
		System.out.println(foodItems.get(i).getName()+"                                      "+foodItems.get(i).getPrice());
		}
		System.out.print("Choose anything:");
		order=scan.next();
		System.out.print("How many...?:");
		value=scan.nextInt();
		for(int i=0;i<foodItems.size();i++)
		{
		if(order.equals(foodItems.get(i).getName()))
		{
		System.out.println("  ");
		System.out.println("                        BILL                        ");
		System.out.println("----------------------------------------------------");
		System.out.println("  ");
		System.out.println("Items ordered:                                Price:");
		System.out.println("   ");
		System.out.println(foodItems.get(i).getName()+" "+"X"+" "+value+"                                       "+foodItems.get(i).getPrice());
		System.out.println("   ");
		total=((foodItems.get(i).getPrice())*(value));
		System.out.println("                              Total "+total+" Rs");
		System.out.println("   ");
		System.out.println("--------------------~*THANK YOU*~--------------------");
		}
		}
		
}
}