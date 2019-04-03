package com.lxisoft.hotelv1.service;
import com.lxisoft.hotelv1.model.Food;
import com.lxisoft.hotelv1.repository.Repository;
import java.util.*;
import java.io.*;
public class HotelService
{
	 private Repository repository;
	 public void setRepository(Repository repository)
	 {
		 this.repository=repository;
	 }
	 public Repository getRepository()
	 {
		 return repository;
	 }
	 public HotelService()
	 {
		repository=new Repository();
	 }		
	 public void a()throws Exception
	 {
		 repository.connectWithDb();
	 }
	public void storeDetails(ArrayList <Food> foods)throws Exception
	{
	repository.writeToFile(foods);
	}
	public void displayDetails(ArrayList <Food> foods)throws Exception
	{
		repository.readFromFile(foods);
	}
	public void store(Food food)throws Exception
	{
		repository.insert(food);
	}
	public void remove(String n)throws Exception
	{
		repository.delete(n);
	}
	public void editName(String nam,String edit)throws Exception
	{
		repository.editName(nam,edit);
	}
	/*public void editCount(int c,String edit)throws Exception
	{
		repository.editCount(c,edit);
	}
	public void editPrice(int p,String edit)throws Exception
	{
		repository.editPrice(p,edit);
	}*/
		
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