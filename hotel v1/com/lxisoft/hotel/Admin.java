package com.lxisoft.hotel;
import java.util.Scanner;
import java.util.ArrayList;
public class Admin 
{
Scanner scan=new Scanner(System.in);

int w;
int numOfFood;

  /* public void inventoryOptions(ArrayList<Food> foods)
	{
		System.out.println("CHOOSE\n 1)ADD");
		int c=scan.nextInt();
		if(c==1)
		{
			System.out.println("how many foods do you want to add");
		   numOfFood=scan.nextInt(); 
		
			for( w=0;w<numOfFood;w++)
			{
			   
			  foods.add(new Food());
			    
			  System.out.println("enter the name of the food");
              foods.get(w).setName(scan.next());
			  System.out.println("enter the price of the food");
			  
			  foods.get(w).setPrice(scan.nextInt());
			}
          printFoodDetails(foods);
	    }
	}
	
	public void printFoodDetails(ArrayList<Food> foods)
	{
	    int numOfFood=foods.size();
		
		for( w=0;w<numOfFood;w++)
		{
			
			System.out.println("food="+foods.get(w).getName()+":"+foods.get(w).getPrice());
		}
	}*/
		

		
		
		
		
		
   public void inventoryOptions(ArrayList<Food> foods)
	{
		System.out.println("CHOOSE\n 1)ADD");
		int c=scan.nextInt();
		if(c==1)
		{
			
		   System.out.println("how many foods do you want to add");
		   numOfFood=scan.nextInt(); 
		
			for( w=0;w<numOfFood;w++)
			{
			   
			  foods.add(new Food());
			  System.out.println("enter the name of the food");
              foods.get(w).setName(scan.next());
			  System.out.println("enter the price of the food");
			  
			  foods.get(w).setPrice(scan.nextInt());
		   }
          printFoodDetails(foods);
	    }

	}
	
	public void printFoodDetails(ArrayList<Food> foods)
	{
	    int numOfFood=foods.size();
		
		for( w=0;w<numOfFood;w++)
		{
			
			System.out.println("food="+foods.get(w).getName()+":"+foods.get(w).getPrice());
		}
	}		
		
		
		
		
		
		
		
		
		
		
		
		
		
}