package com.lxisoft.customer;
import com.lxisoft.fooditem.*;
import java.util.*;
public class Customer
{
public void placeOrder(ArrayList<FoodItem> foodItems)
{
/*foodItems.foodMenu();*/
System.out.println("FOOD MENU");
		System.out.println("--------------");
		for(int i=0;i<foodItems.size();i++)
		{
		System.out.println(foodItems.get(i).getName()+"                                      "+foodItems.get(i).getPrice());
		}
		System.out.print("Choose anything:");
}
}