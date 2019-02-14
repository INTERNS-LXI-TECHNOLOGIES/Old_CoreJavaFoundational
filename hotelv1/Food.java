package com.lxisoft.hotelv1;
import java.util.Scanner;
public class Food
{
	private String foodName;
	private int foodPrice;
	public void setFoodName(String foodName)
	{
		this.foodName=foodName;
	}
	public String getFoodName()
	{
		return foodName;
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