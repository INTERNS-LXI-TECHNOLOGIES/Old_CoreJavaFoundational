package com.lxisoft.phone;
import java.util.*;
public class Phone implements Comparable<Phone>
{
	String brand;
	String price;
	String model;
	public Phone(String brand,String price,String model)
	{
		this.brand=brand;
		this.price=price;
		this.model=model;
	}
	public int compareTo(Phone p)
	{
		return brand.compareTo(p.brand);
	}
	
	public String toString()
	{
		return brand+" "+price+" "+model;
	}
	/*public void setBrand(String brand)
	{
		this.brand=brand;
	}
	public String getBrand()
	{
		return brand;
	}
	public void setModel(String model)
	{
		this.model=model;
	}
	public String getModel()
	{
		return model;
	}
	public int setPrice(int price)
	{
		this.price=price;
	}
	public int getPrice()
	{
		return price;
	}*/
}
