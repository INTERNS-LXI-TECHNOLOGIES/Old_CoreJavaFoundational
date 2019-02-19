package com.lxisoft.fooditem;
import java.util.Scanner;
public class FoodItem
{
	private String name;
	private int price;
	
	Scanner scan=new Scanner(System.in);

	    public void setName(String name)
			{
					this.name=name;
			}
		public String getName()
			{
					return name;
			}
				
		public void setPrice(int price)
			{
					this.price=price;
			}
		public int getPrice()
			{
					return price;
			}
	
	
/*	
	public void viewItem()
	{
		int i;
		
		System.out.println(" ");
		System.out.println("ITEM DETAILS");
		System.out.println("------------");
		for(i=0;i<no_record;i++)
		{
		System.out.println("FoodItem:"+getName());
		System.out.println("Price:"+getPrice()+".00 Rs");
		}
	}*/
	
}