package com.lxisoft.metrov2.metro.station;

public class StationDetails
{
	Station station = new Station();
	String stationName = station.getstationName();
	
	public void stationDetail()
	{
		System.out.println("Station name::" + stationName);
	}

}