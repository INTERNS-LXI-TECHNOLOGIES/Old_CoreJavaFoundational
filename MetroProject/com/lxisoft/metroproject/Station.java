package com.lxisoft.metroproject;
import java.util.*;
public class Station
{
	private String station_code;
	private String station_location;
	public Station()
	{
		stationDetails();
		this.station_location=station_location;
		setLocation(station_location);
		setCode(station_code);
	}
	public void stationDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the location of station:");
		station_location=sc.nextLine();
		System.out.println("Enter the Station Code:");
		station_code=sc.nextLine();
	}
	public void setLocation(String loc)
	{
		this.station_location=loc;
	}
	public String getLocation()
	{
		return station_location;
	}
		public void setCode(String code)
	{
		this.station_code=code;
	}
	public String getCode()
	{
		return station_code;
	}
		public void printDetails()
	{
		System.out.println("Station Location:"+station_location);
		System.out.println("Station Code:"+station_code);
	}
}