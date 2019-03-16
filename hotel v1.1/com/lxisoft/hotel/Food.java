package com.lxisoft.hotel;
import java.util.Scanner;
public class Food
{
	
	Scanner scan=new Scanner(System.in);
	private String name;
	private int price,count;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public int getPrice()
	{
		return price;
	}
	public void setCount(int count)
	{
		this.count=count;
	}
	public int getCount()
	{
		return count;
	}	
	
	
	public String toString()
	{
		return "Food Name :"+name;
	}

}