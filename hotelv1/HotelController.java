package com.lxisoft.hotelv1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.util.Comparator;
import java.io.*;
public class HotelController
{
	Scanner scan=new Scanner(System.in);
	private Hotel hotel;
	private HotelView view;
	public void setHotel(Hotel hotel)
	{
		this.hotel=hotel;
	}
	public Hotel getHotel()
	{
		return hotel;
	}
	public void setView(HotelView view)
	{
		this.view=view;
	}
	public HotelView getView()
	{
		return view;
	}

	/*public HotelController()
	{
	

	}*/
	public void authentication()throws Exception
	{
		setView(new HotelView());
		setHotel(new Hotel());
		
		
		//setFoods(new ArrayList <Food>());
		
		view.authentication(hotel.getAdministrator(),hotel.getCustomer());
	}
	
public void foodOrdering()throws Exception
{
	
	//System.out.println(foods.size());
	File file=new File("foodsdetail.txt");
		FileWriter fw=new FileWriter(file,true);
		//readFromFile();
				int noOfOrder;
				//foods.clear();
				//setCashier(new Cashier());
				//System.out.println(foodItems.size());
				do{
					//readFromFile();
				System.out.print("Which food you want:");
				String nameOfFood=hotel.getCustomer().selectFood();
				if(hotel.getFoods()!=null){
						//System.out.println("Food available");
						hotel.getCashier().printBill(hotel.getFoods(),nameOfFood);
						arraylistToFile();
						hotel.getFoods().clear();
						readFromFile();
				}
				else{System.out.println("No food");}
				System.out.println("\n again order food press 1");
				}while(scan.nextInt()==1);
				
				
				//readFromFile();
}
public void writeToFile()throws Exception
{
	
	File file=new File("foodsdetail.txt");
	FileWriter fw=new FileWriter(file);
		BufferedWriter bw=new BufferedWriter(fw);
	//ArrayList <String> f=new ArrayList <String>();
			Collections.sort(hotel.getFoods(),new Sorting());
		//Iterator itr=foods.iterator();
		//while(itr.hasNext()){
			for(int i=0;i<hotel.getFoods().size();i++)
		{
		System.out.println(hotel.getFoods().get(i).getName()+","+hotel.getFoods().get(i).getFoodCount()+","+hotel.getFoods().get(i).getFoodPrice()+"\n");
			
		}
		
	for(int i=0;i<hotel.getFoods().size();i++)
	{
		
	bw.write(hotel.getFoods().get(i).getName()+","+hotel.getFoods().get(i).getFoodCount()+","+hotel.getFoods().get(i).getFoodPrice()+"\n");
		
	}
	bw.close();
	//foods.clear();
	//System.out.println(hotel.getFoods().size());
	
	
}
public void readFromFile()throws Exception
{
	File file=new File("foodsdetail.txt");
	FileWriter fw=new FileWriter(file,true);
	FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
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
				hotel.getFoods().add(f);
				//k=k+3;
				//System.out.println("\n");
				}
				System.out.println("SNo\t\tFood items\t\tCount\t\tPrice");
			for(int i=0;i<hotel.getFoods().size();i++)
			{
			System.out.print((i+1)+"\t\t"+hotel.getFoods().get(i).getName()+"\t\t\t"+hotel.getFoods().get(i).getFoodCount()+"\t\t"+hotel.getFoods().get(i).getFoodPrice()+"\n");
			}
			//foods.clear();
}
public void arraylistToFile()throws Exception
{
	File file=new File("foodsdetail.txt");
	FileWriter fw=new FileWriter(file);
		BufferedWriter bw=new BufferedWriter(fw);
		
		Collections.sort(hotel.getFoods(),new Sorting());
	for(int i=0;i<hotel.getFoods().size();i++)
	{
		
	bw.write(hotel.getFoods().get(i).getName()+","+hotel.getFoods().get(i).getFoodCount()+","+hotel.getFoods().get(i).getFoodPrice()+"\n");
		
	}
	bw.close();	
}



	
}
