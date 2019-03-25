package com.lxisoft.hotelv1.controller;
import com.lxisoft.hotelv1.model.Food;
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
}