package com.lxisoft.metro;
import com.lxisoft.metro.Station;
import java.util.*;
public class Metro
{
	private String metroName;
	Scanner input=new Scanner(System.in);
	Scanner stringInput=new Scanner(System.in);
	ArrayList<Station> stations=new ArrayList<Station>();
	public void setMetroName(String name)
	{
		this.metroName=name;
	}
	public String getMetroName()
	{
		return metroName;
	}
	public void setStation()
	{
		for(int i=0;i<3;i++)
		{
			stations.add(new Station());
		}
		do
		{
		System.out.println("\n***WELCOME TO THE  MOST ADVANCED METRO SYSTEM IN INDIA - KOCHI METRO ***\n");
		System.out.println("Select your choice:\n");
		System.out.println("1.Admin\n2.Ticket Reservation\n3.Exit\n");
		int choice=input.nextInt();
		
		switch(choice)
		{
			case 1:
					System.out.println("***********Enter the Metro Details***************\n");
					System.out.println("Enter the metro name:\n");
					String metroName=stringInput.nextLine();
					setMetroName(metroName);
					System.out.println("Enter the number of station you want:\n");
					int noOfStation=input.nextInt();
					for(int j=0;j<noOfStation;j++)
					{
						stations.get(j).enterStationDetails();
					}
					break;
			case 2:
					printMetroDetails();
					
					
					 break;
			case 3:
					System.exit(0);
					break;
					
		}
		}while(true);
	}
	public void printMetroDetails()
	{
		System.out.println("*********WELCOME TO THE METRO PORTAL***********\n");
					System.out.println("Your Metro is :"+getMetroName());
					for(int i=0;i<stations.size();i++)
					{
						stations.get(i).printStationDetails();
					}
					
					
	}
}