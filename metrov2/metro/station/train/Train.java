package com.lxisoft.metrov2.metro.station.train;
 import com.lxisoft.metrov2.metro.station.train.coach.Coach;

public class Train
{
	Coach coach;
	private String trainName;
	private String trainRoute;
	
	public void settrainName(String trainName)
	{
		this.trainName=trainName();
	}
	
	public String gettrainName()
	{
		return trainName;
	}
	
	public void settrainRoute(String trainRoute)
	{
		this.trainRoute=trainRoute;
	}
	
	public String gettrainRoute()
	{
		return trainRoute;
	}
	
	
	
}