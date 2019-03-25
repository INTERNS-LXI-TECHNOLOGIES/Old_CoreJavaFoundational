package com.lxisoft.hotelv1;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
public class AdministratorService
{
	public void addFood(ArrayList <Food> foods,Food food)
	{
		foods.add(food);
	}
	public void deleteFood(String n,ArrayList <Food> foods)
	{
		for(int i=0;i<foods.size();i++)
			{	
				if(n.equals(foods.get(i).getName()))
					{
											
					foods.remove(i);
											
					}
			}
	}
	public void editFoodName(String edit,ArrayList <Food> foods,String nam)
	{
		for(int i=0;i<foods.size();i++)
		{	
			if(edit.equals(foods.get(i).getName()))
				{
					foods.get(i).setName(nam);
				}
		}
	}
	public void editFoodCount(String edit,ArrayList <Food> foods,int c)
	{
		for(int i=0;i<foods.size();i++)
		{	
			if(edit.equals(foods.get(i).getName()))
				{
					foods.get(i).setFoodCount(c);
				}
		}
	}
	public void editFoodPrice(String edit,ArrayList <Food> foods,int p)
	{
		for(int i=0;i<foods.size();i++)
		{	
			if(edit.equals(foods.get(i).getName()))
				{
					foods.get(i).setFoodPrice(p);
				}
		}
	}
	
}