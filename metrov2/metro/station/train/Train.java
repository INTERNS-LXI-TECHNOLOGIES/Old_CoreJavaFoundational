package com.lxisoft.metrov2.metro.station.train;
import  com.lxisoft.metrov2.metro.station.train.coach.Coach;
public class Train
{
Coach coach;
private String trainName;
private String trainRoute;
   
   
   public void settrainName(String name)
    {
    this.trainName=name;
    }

    public void settrainRoute(String route)
   {
   this.trainRoute=route;
   }

    public String gettrainName()
	{
	return trainName;
	}

	public String gettrainRoute()
	{
	return trainRoute;
	}


}








		