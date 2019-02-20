package com.lxisoft.hotel;
import java.util.ArrayList;
public class MenuList
{
	public  void listOfFood( ArrayList<Food> foods )
	{
		System.out.println("AVILABLE FOOD");
	    System.out.println("*************");
	    for( int i=0;i<foods.size();i++)
		{
		System.out.println(""+foods.get(i));
		}
	}
}