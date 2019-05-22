package com.lxisoft.collection;
import java.util.*;
import java.io.*;
import java.lang.*;
public class Shop
{
	String brand=null;
	String model=null;
	int price=0;
	public void setDetails()throws Exception
	{
	Set<Phone> set=new TreeSet<Phone>();

	Phone p1=new Phone("Redmi","Note7Pro",140);
	Phone p2=new Phone("Honor","8X",150);
	Phone p3=new Phone("Redmi","Note7",100);
	Phone p4=new Phone("Samsung","M30",120);
	System.out.println(set.toString());
	set.add(p1);
	set.add(p2);
	set.add(p3);
	set.add(p4);


	for(Phone p:set)
	{
		System.out.println(p.brand+","+p.model+","+p.price);
	}
	
	}
}