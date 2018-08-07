package com.lxisoft.metrov2.metro.station.train;

import com.lxisoft.metrov2.metro.station.train.coach.Coach;
public class Train
{
	Coach coach = new Coach();
	
	private String trainName;
	private int trainNo;
	
	
	public void settrainName(String trainName)
	{
		this.trainName=trainName;
	}
	
	public void settrainNo(int trainNo)
	{
		this.trainNo=trainNo;
	}
	
	
	public String gettrainName()
	{
		return trainName;
	}
	
	public int gettrainNo()
	{
		return trainNo;
	}
	

}