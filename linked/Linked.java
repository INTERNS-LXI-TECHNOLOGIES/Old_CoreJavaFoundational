package com.lxisoft.linked;
import java.util.*;
public class Linked 
{
	String brand;
	String price;
	String model;
	public Linked(String brand,String price,String model)
	{
		this.brand=brand;
		this.price=price;
		this.model=model;
		
	}
	public boolean equals(Object o)
	{
		return this.brand.equals(((Linked)o).brand);
		
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