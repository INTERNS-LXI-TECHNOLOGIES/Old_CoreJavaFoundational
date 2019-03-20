package com.lxisoft.hotelv1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.util.Comparator;
import java.io.*;
public class Repository
{
	public void storeFood(HotelController controller,ArrayList <Food> foods,Service service)throws Exception
	{
		service.storeFood(controller,foods,service);
	}

public void writeToFile(ArrayList <Food> foods)throws Exception
{
	
	File file=new File("foodsdetail.txt");
	FileWriter fw=new FileWriter(file);
		BufferedWriter bw=new BufferedWriter(fw);
	//ArrayList <String> f=new ArrayList <String>();
			Collections.sort(foods,new Sorting());
		//Iterator itr=foods.iterator();
		//while(itr.hasNext()){
			for(int i=0;i<foods.size();i++)
		{
		System.out.println(foods.get(i).getName()+","+foods.get(i).getFoodCount()+","+foods.get(i).getFoodPrice()+"\n");
			
		}
		
	for(int i=0;i<foods.size();i++)
	{
		
	bw.write(foods.get(i).getName()+","+foods.get(i).getFoodCount()+","+foods.get(i).getFoodPrice()+"\n");
		
	}
	bw.close();
	//foods.clear();
	//System.out.println(hotel.getFoods().size());
	
	
}
public void readFromFile(ArrayList <Food> foods)throws Exception
{
	File file=new File("foodsdetail.txt");
	FileWriter fw=new FileWriter(file,true);
	FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		//foods=new ArrayList <Food>();
				//foods.clear();
				//int i=0;
				int k=0;	
				String data;	
				while((data=br.readLine())!=null)
				{
				//String dup=data;
				//System.out.print((i+1));
				
				Food f=new Food();
				String item[]=data.split(",");
				f.setName(item[k]);
				f.setFoodCount(Integer.parseInt(item[k+1]));
				f.setFoodPrice(Integer.parseInt(item[k+2]));
				foods.add(f);
				//k=k+3;
				//System.out.println("\n");
				}
				System.out.println("SNo\t\tFood items\t\tCount\t\tPrice");
			for(int i=0;i<foods.size();i++)
			{
			System.out.print((i+1)+"\t\t"+foods.get(i).getName()+"\t\t\t"+foods.get(i).getFoodCount()+"\t\t"+foods.get(i).getFoodPrice()+"\n");
			}
			//foods.clear();
}
public void arraylistToFile(ArrayList <Food> foods)throws Exception
{
	File file=new File("foodsdetail.txt");
	FileWriter fw=new FileWriter(file);
		BufferedWriter bw=new BufferedWriter(fw);
		
		Collections.sort(foods,new Sorting());
	for(int i=0;i<foods.size();i++)
	{
		
	bw.write(foods.get(i).getName()+","+foods.get(i).getFoodCount()+","+foods.get(i).getFoodPrice()+"\n");
		
	}
	bw.close();	
}
}
