package com.lxisoft.metro.station.train.passenger;

public class Passenger
{
	private String name;
	private int age;
	private char gender;
	private String date;
	private String bstation;
	private String dstation;
	private int fare;
	


public void setName(String n1)
	{
		this.name=n1;
	
	}
	
	public void setAge(int a1)
	{
		this.age=a1;
	}
	
	public void setGender(char g)
	{
		this.gender=g;
	}
	
	public void setBname(String bs)
	{
		this.bstation=bs;
	}
	
	public void setDname(String ds)
	{
		this.dstation=ds;
	}
	
	public void setDate(String dt)
	{
		this.date=dt;
	}
	
	public void setFare(int f1)
	{
		this.fare=f1;
	}
	
	
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public char getGender()
	{
		return gender;
	}
	
	public String getBname()
	{
		return bstation;
	}
	
	public String getDname()
	{
		return dstation;
	}
	
	public String getDate()
	{
		return date;
	}
	
	public int getFare()
	{
		return fare;
	}
	
}
