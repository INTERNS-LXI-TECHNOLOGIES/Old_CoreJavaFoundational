package com.lxisoft.metro;
public class ACcoach extends Coach
{
	public void setACcoachDetails()
	{
		this.setCoachName("ACcoach");
		this.setPrice(300);
		
	}
	public void printACcoachDetails()
	{
		this.setACcoachDetails();
		System.out.println("Coach Name :"+this.getCoachName());
		System.out.println("Price :"+this.getPrice());
		
	}
}