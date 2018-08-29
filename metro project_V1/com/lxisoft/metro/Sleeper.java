package com.lxisoft.metro;
public class Sleeper extends Coach
{

	public void setSleeperCoachDetails()
	{
		this.setCoachName("Sleeper");
		this.setPrice(500);
		
	}
	public void printSleeperDetails()
	{
		this.setSleeperCoachDetails();
		System.out.println("Coach Name :"+this.getCoachName());
		System.out.println("Price :"+this.getPrice());
	}

}