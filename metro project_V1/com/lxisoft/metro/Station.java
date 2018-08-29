package com.lxisoft.metro;
import java.util.*;
public class Station
{
	private String stationName;
	TicketCounter ticketCounter=new TicketCounter();

	ArrayList<Platform> platforms=new ArrayList<Platform>();
	
	
	Scanner input=new Scanner(System.in);
	

	public void setStationName(String name)
	{
		this.stationName=name;
	}
	public String getStationName()
	{
		return stationName;
	}
	
	public void enterStationDetails()
	{
		
		System.out.println("Enter station names:\n");
		
		String stationName=input.nextLine();
		setStationName(stationName);
		
		System.out.println("Enter the number of platforms in "+stationName);
		int noOfPlatform=input.nextInt();
		for(int i=0;i<noOfPlatform;i++)
		{
			platforms.add(new Platform());
			
			platforms.get(i).enterPlatformDetails();
		}
	}
	
	public void printStationDetails()
	{
		System.out.println("Available Stations: ");
		System.out.println(getStationName());
		for(int j=0;j<platforms.size();j++)
		{
			platforms.get(j).printPlatformDetails();
		}
	}
		
}
	



