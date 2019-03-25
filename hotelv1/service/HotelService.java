package com.lxisoft.hotelv1.service;
import com.lxisoft.hotelv1.model.Food;
import com.lxisoft.hotelv1.repository.Repository;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.util.Comparator;
import java.io.*;
public class HotelService
{
	public void storeDetails(ArrayList <Food> foods)throws Exception
	{
	Repository repository=new Repository();
	repository.writeToFile(foods);
	}
	public void displayDetails(ArrayList <Food> foods)throws Exception
	{
		Repository repository=new Repository();
		repository.readFromFile(foods);
	}
	public int printBill(String nameOfFood,int noOfOrder,ArrayList <Food> foods)
	{
		int total=0;
		for(int i=0;i<foods.size();i++)
						{
							if((nameOfFood).equals(foods.get(i).getName()))
							{
								if(foods.get(i).getFoodCount()!=0)
								{	
								total=total+((noOfOrder)*(foods.get(i).getFoodPrice()));
								//System.out.print("Total\t\t\t\t:"+total+"\n");
								//int c=(foods.get(i).getFoodCount())-noOfOrder;
								//String count=Integer.toString(c);
								foods.get(i).setFoodCount(foods.get(i).getFoodCount()-noOfOrder);
								
								}
							}
						}
		return total;				
	}
}