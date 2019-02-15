package com.lxisoft.hotel;
import java.util.Scanner;
public class Admin 
{
Scanner scan=new Scanner(System.in);

	public void addFood()
	{
		System.out.println("how many food add you want");
		int numOfFood=scan.nextInt();
		System.out.println("enter the available Food");
		for(int w=0;w<numOfFood;w++)
		{
		String availableFood=scan.next();
		printFoodDetails(availableFood);
		}
	}
	public void printFoodDetails(String availableFood)
	{
		System.out.println("AVILABLE FOOD");
		System.out.println(availableFood);
	}
		
}