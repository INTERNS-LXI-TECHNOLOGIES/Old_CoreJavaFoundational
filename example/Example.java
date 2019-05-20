package com.lxisoft.example;
import java.util.*;
public class Example 
{
	String brand;
	String price;
	String model;
	public Example(String brand,String price,String model)
	{
		this.brand=brand;
		this.price=price;
		this.model=model;
		
	}
	public boolean equals(Object e)
	{
		return this.brand.equals(((Example)e).brand);
		
	}
	public int hashCode()
	{
		return brand.hashCode();
	}
	public String toString()
	{
		return brand+" "+price+" "+model;
	}
}