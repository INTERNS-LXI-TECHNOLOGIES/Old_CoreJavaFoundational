package com.lxisoft.phone;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Shop
{
	Scanner scan=new Scanner(System.in);
	public void phoneDetails()
	{
		String brand=null;
		String model=null;
		ArrayList <String> distributor=new ArrayList <String>();
		distributor.add("Amazon");
		distributor.add("Flipkart");
		TreeSet <Phone> p=new TreeSet <Phone>(); 
		Phone p1=new Phone("Samsung","17000","s7");
		Phone p2=new Phone("Oppo","20000","F9");
		p.add(p1);
		p.add(p2);
		//Amazon a=new Amazon("Redmi","15000","pro6");
		//Flipkart f=new Flipkart("Redmi","15000","pro6");
		//System.out.println(p1);
		//System.out.println(p2);
		System.out.println(p.toString());
		System.out.println("To book new Phone :");
			System.out.print("Brand:");
			brand=scan.next();
			System.out.print("Model:");
			model=scan.next();
			for(int i=0;i<distributor.size();i++)
			{
				int index=(int)(Math.random()*2);
			if(distributor.get(index).equals("Amazon"))
			{
				if(brand.equals("Redmi")){
				Phone p3=new Phone("Redmi","15000","pro6");
				p.add(p3);}
				//else if(p.equals("Redmi")){System.out.println("Already there");}
				else{
				System.out.println("No phone available");}
			}
			else if(distributor.get(i).equals("Flipkart"))
			{
				if(brand.equals("Redmi")){
				Phone p3=new Phone("Redmi","15000","pro6");
				p.add(p3);}
				//else if(p.equals("Redmi")){System.out.println("Already there");}
				else{
				System.out.println("No phone available");}
			}
			}
		System.out.println(p.toString());
		
		
	}
}