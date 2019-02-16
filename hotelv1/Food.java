package com.lxisoft.hotelv1;
import java.util.Scanner;
public class Food
{
	private int sNo;
	private String foodName;
	private int foodCount;
	private int foodPrice;
	public void setSNo(int sNo)
	{
		this.sNo=sNo;
	}
	public int getSNo()
	{
		return sNo;
	}
	public void setFoodName(String foodName)
	{
		this.foodName=foodName;
	}
	public String getFoodName()
	{
		return foodName;
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
}