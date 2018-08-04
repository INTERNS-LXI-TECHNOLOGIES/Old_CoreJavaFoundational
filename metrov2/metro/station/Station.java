package com.lxisoft.metrov2.metro.station;
import com.lxisoft.metrov2.metro.station.train.Train;

public class Station
{
	Train train;
	private String stationName;
	
	public void setstationName(String stationName)
	{
		this.stationName=stationName();
		
	}
	
	public String getstationName()
	{
		return stationName;
	}
	
	
	
	
}