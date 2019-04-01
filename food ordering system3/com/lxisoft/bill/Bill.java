package com.lxisoft.bill;
import com.lxisoft.fooditem.*;
import com.lxisoft.customer.*;
import java.util.*;
public class Bill
{
private int totalPrice;

			public void setTotalPrice(int totalPrice)
			{
			this.totalPrice=totalPrice;
			}
			public int getTotalPrice()
			{
			return totalPrice;
			}
	
	/*public void viewBill(String item,int value,ArrayList<FoodItem> foodItems)
	{
		System.out.println("  ");
		
			for(FoodItem f:foodItems)
		{
			
			if(item.equals(f.getName()))
			{
				System.out.println("  ");
				System.out.println("                                 BILL                                        ");
				System.out.println("-----------------------------------------------------------------------------");
				System.out.println("Items ordered:                                                         Price:");
				System.out.println("  ");
				System.out.println(f.getName()+" "+"X"+" "+value+"                                      "+f.getPrice());
			}
		}
		System.out.println("                                                    Total "+getTotalPrice()+" Rs");
		System.out.println("  ");
		System.out.println("                                 THANK YOU                                   ");
	}*/
	
	public void viewBill()
	{
		System.out.println("  ");
		System.out.println("                                 BILL                                        ");
				System.out.println("-----------------------------------------------------------------------------");
				System.out.println("Items ordered:                                                         Price:");
				System.out.println("  ");
	}
					
	
}
