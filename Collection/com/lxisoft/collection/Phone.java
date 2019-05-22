package com.lxisoft.collection;
import java.util.*;
import java.io.*;
import java.lang.*;

public class Phone implements Comparable<Phone>
{
	String brand,model;
	int price;
	public Phone(String brand,String model,int price)
	{
		this.brand=brand;
		this.model=model;
		this.price=price;
	}
	
	public int compareTo(Phone p)
	{			
		return brand.compareTo(p.brand);
	}
	/*public String toString()
	{
		return brand+","+model+","+price;
	}*/
}