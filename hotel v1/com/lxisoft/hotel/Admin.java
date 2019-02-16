package com.lxisoft.hotel;
import java.util.Scanner;
public class Admin 
{
Scanner scan=new Scanner(System.in);
String [] availableFoods;
int w;
   public void inventoryOptions()
	{
		System.out.println("CHOOSE\n 1)DELETE\n 2)EDITE\n 3)ADD");
		int c=scan.nextInt();
		if(c==3)
		{
			System.out.println("how many food add you want");
			int numOfFood=scan.nextInt();
			availableFoods=new  String [numOfFood];
				
			System.out.println("enter the available Food");
			
			for( w=0;w<numOfFood;w++)
			{
			  availableFoods[w]=scan.next();
			}
	    }
	
	}
	
	public void printFoodDetails()
	{
		int numOfFood=availableFoods.length;
		System.out.println(""+numOfFood);
		System.out.println("AVILABLE FOOD");
		for( w=0;w<numOfFood;w++)
		{
			System.out.println("food="+availableFoods[w]);
		}
	}
		
}