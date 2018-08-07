package com.lxisoft.metrov2.metro.station.train.coach.passenger;

public class Passenger
{
	private String name;
	private int age;
	private String destination;
	
	
	
	public void setpassengerName(String name)
	{
		this.name=name;
	}

	public void setpassengerAge(int age)
	{
		this.age=age;
	}
	
	public void settrainDestination(String destination)
	{
		this.destination=destination;
	}
	
	public String getpassengerName()
	{
		return name;
	}
	
	public int getpassengerAge()
	{
		return age;
	}
	
	public String gettrainDestination()
	{
		return destination;
	}

}