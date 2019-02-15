package com.lxisoft.hotelv1;
import java.util.Scanner;
public class Customer
{
	Scanner scan=new Scanner(System.in);
	public void selectFood()
	{
		String food;
		System.out.print("Which food you want:");
		food=scan.next();
	}
}