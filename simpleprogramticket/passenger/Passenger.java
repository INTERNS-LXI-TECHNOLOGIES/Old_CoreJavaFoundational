package com.lxisoft.metro.passenger;
import java.util.Scanner;
public class Passenger
{
	private String name;
    private String address;
	
	Scanner sc=new Scanner(System.in);
	
	public void setName(String name1)
	{
		this.name=name1;
		
	}
	public String getName()
	{
		return name;
		
	}

	public void setAddress(String address1)
	{
		this.address=address1;
	}
	public String getAddress()
	{
	return address;
	}

}
