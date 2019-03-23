package com.lxisoft.hotelv1;
import java.util.Scanner;
import java.util.Comparator;
public class FoodController 
{
	private Food foods;
	public void setFoods(Food foods)
	{
		this.foods=foods;
	}
	public Food getFoods()
	{
		return foods;
	}
	/*public void foodDetails()
	{
		foods=new Food();
		foods.setName(scan.next());
		foods.setFoodCount(scan.nextInt());
		foods.setFoodPrice(scan.nextInt());
	}*/
}