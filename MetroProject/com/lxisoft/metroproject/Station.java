package com.lxisoft.metroproject;
import java.util.*;
public class Station
{
	private String station_code;
	private String station_location;
	int tot_platform;
	ArrayList<Train> trains=new ArrayList<Train>();
	Train mangaloremail=new Train();
	public Station()
	{
		stationDetails();
		platformDetails();
		addTrainDetails();
	}
	public void stationDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the location of station:");
		station_location=sc.nextLine();
		System.out.println("Enter the Station Code:");
		station_code=sc.nextLine();
	}
	public void platformDetails()
	{
		Scanner p=new Scanner(System.in);
		System.out.println("Enter the total number of platforms in a station:");
		tot_platform=p.nextInt();
	}
	public void addTrainDetails()
	{
		trains.add(mangaloremail);
		mangaloremail.setTrainDetails("Mangalore Mail",12601,"WAP 4A","Chennai","Mangalore");
	}
		
	public void printDetails()
	{
		System.out.println("Station Location:"+station_location);
		System.out.println("Station Code:"+station_code);
		System.out.println("Total Number of platforms are:"+tot_platform);
		for(int i=0;i<trains.size();i++)
		{
		trains.get(i).printTrainDetails();
		}
	}
}