package com.lxisoft.hotelv1.model;
import java.util.Scanner;
import java.util.Comparator;
public class Food 
{
	private int sNo;
	private String name;
	private int foodCount;
	private int foodPrice;
	private String food_add_date;
	public void setSNo(int sNo)
	{
		this.sNo=sNo;
	}
	public int getSNo()
	{
		return sNo;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setFoodCount(int foodCount)
	{
		this.foodCount=foodCount;
	}
	public int getFoodCount()
	{
		return foodCount;
	}
	public void setFoodPrice(int foodPrice)
	{
		this.foodPrice=foodPrice;
	}
	public int getFoodPrice()
	{
		return foodPrice;
	}
	public void setFood_add_date(String food_add_date)
	{
		this.food_add_date=food_add_date;
	}
	public String getFood_add_date()
	{
		return food_add_date;
	}
	
}