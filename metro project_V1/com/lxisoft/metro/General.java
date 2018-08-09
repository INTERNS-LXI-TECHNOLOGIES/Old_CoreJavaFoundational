package com.lxisoft.metro;
public class General extends Coach
{
	public void setGeneralcoachDetails()
	{
		this.setCoachName("General");
		this.setPrice(200);
		
	}
	public void printGeneralDetails()
	{
		this.setGeneralcoachDetails();
		System.out.println("Coach Name:"+this.getCoachName());
		System.out.println("Price :"+this.getPrice());
		
	}
}