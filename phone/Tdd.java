package com.lxisoft.phone;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Tdd
{
	public static void main(String[] args)
	{
		/*Shop shop=new Shop();
		shop.phoneDetails();*/
		TreeSet <Phone> p=new TreeSet <Phone>(); 
		Phone p1=new Phone("redmi","15000","7");
		Phone p2=new Phone("redmi","1000","7");
		p.add(p1);
		p.add(p2);
		//System.out.println(p1);
		//System.out.println(p2);
		System.out.println(p.toString());
		//if((p1.toString()).equals(p2.toString()))
		//{
		/*if(p1.equals(p2))
		{
			System.out.println("true");.
			
		}*/
		//}
	}
	
}