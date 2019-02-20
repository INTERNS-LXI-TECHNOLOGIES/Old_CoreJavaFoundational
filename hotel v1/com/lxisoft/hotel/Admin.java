package com.lxisoft.hotel;
import java.util.Scanner;
import java.util.ArrayList;
public class Admin 
{
Scanner scan=new Scanner(System.in);
//String [] availableFoods;
//int [] price;
int w;
int numOfFood;
//int n;
   public void inventoryOptions(ArrayList<Food> foods)
	{
		System.out.println("CHOOSE\n 1)DELETE\n 2)ADD");
		int c=scan.nextInt();
		if(c==2)
		{
			System.out.println("how many food add you want");
		   numOfFood=scan.nextInt(); 
		
			for( w=0;w<numOfFood;w++)
			{
			   
			  foods.add(new Food());
			  System.out.println("enter the available food");
              foods.get(w).setName(scan.next());
			  System.out.println("enter the price of the food");
			  foods.get(w).setPrice(scan.nextInt());
			  
               			  
			  //foods[w].setName(scan.next());
			   // System.out.println("price"); 
			  //price[w]=scan.nextInt();
			}
		
			/*System.out.println("enter the price of food");
			
			for( n=0;n<numOfFood;n++)
			{
			  
			}*/
			printFoodDetails(foods);
	    }
		
	
	}
	
		
	
	public void printFoodDetails(ArrayList<Food> foods)
	{
		
		//int numOfFood=availableFoods.length;
		int numOfFood=foods.size();
		
		for( w=0;w<numOfFood;w++)
		{
			//System.out.println("food="+availableFoods[w]);
			System.out.println("food="+foods.get(w).getName()+":"+foods.get(w).getPrice());
		}
	}
		
}