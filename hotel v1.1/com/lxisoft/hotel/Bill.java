package com.lxisoft.hotel;
import java.util.ArrayList;
import java.io.*;
public class Bill
{
	     	 
		public void printBill( ArrayList<Food>  orderedFood)        
		{
            int total=0;
			System.out.println("\nOLYMPIC\n********\n");
			System.out.println("18/8/2019");
			System.out.println("size"+orderedFood.size());
			for(int i=0;i<orderedFood.size();i++)
		    {
			System.out.println("oderd Food:"  +orderedFood.get(i).getName()+orderedFood.get(i).getPrice()+"...........");
			total=total+orderedFood.get(i).getPrice();
		    }
			System.out.println("Total="+total);

		}
}