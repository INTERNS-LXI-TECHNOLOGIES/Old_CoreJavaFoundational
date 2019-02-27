package com.lxisoft.admin;
import com.lxisoft.fooditem.*;
import java.util.*;
public class Admin
{

Scanner scan=new Scanner(System.in);
int m;
public void addItem(ArrayList<FoodItem> foodItems)
{
System.out.println("    Admin    ");
System.out.println("-------------------------");
System.out.println("   ");
System.out.print("No.of Items..?:");
m=scan.nextInt();
for(int i=0;i<m;i++)
   {
        foodItems.add(new FoodItem());
		System.out.print("FoodItem:");
		foodItems.get(i).setName(scan.next());
		System.out.print("Price:");
		foodItems.get(i).setPrice(scan.nextInt());
		System.out.println("   ");
	}
		
	    System.out.println("   ");
		System.out.println("Record saved.....");
		System.out.println("   ");
		}
		
public void viewItem(ArrayList<FoodItem> foodItems)
{
System.out.println("FOOD MENU");
		System.out.println("--------------");
		for(int i=0;i<m;i++)
		{
		System.out.println(foodItems.get(i).getName()+"                                      "+foodItems.get(i).getPrice());
		}
	}

public void removeItem(ArrayList<FoodItem> foodItems)
{
	String item;
	System.out.println("     ");
	System.out.print("Do you want to delete anything....?yes=1/no=0:");
	int value=scan.nextInt();
	while(value==1)
	{
	System.out.print("Which item you want to delete...?:");
	item=scan.next();
	for(int i=0;i<foodItems.size();i++)
	{
		if(item.equals(foodItems.get(i).getName()))
		{
			foodItems.remove(foodItems.get(i));
		}
	}
	
	System.out.println("   ");
	System.out.println("AVAILABLE FOOD ITEMS");
	System.out.println("--------------------");
	System.out.println("FoodItem                                   Price");
	System.out.println("------------------------------------------------");
	for(FoodItem f:foodItems)
	{
		System.out.println(f.getName()+"                    "+f.getPrice());
	}
	value++;
	}
}
			
			
}	