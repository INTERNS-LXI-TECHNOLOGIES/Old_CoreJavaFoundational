package com.lxisoft.metroproject;
import java.util.*;
public class Station
{
	private String station_code;
	private String station_location;
	int tot_platform;
	ArrayList<Train> trains=new ArrayList<Train>();
	Train mangaloremail=new Train();
	Train allepey=new Train();
	public Station()
	{
		stationDetails();
		addTrainDetails();
		searchTrain();
	}
	public void stationDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the location of station:");
		station_location=sc.nextLine();
		System.out.println("Enter the Station Code:");
		station_code=sc.nextLine();
	}
	public void addTrainDetails()
	{
		trains.add(mangaloremail);
		trains.add(allepey);
		mangaloremail.setTrainDetails("Mangalore Mail",12601);
		allepey.setTrainDetails("Allepey Express",22460);
	}
	public void searchTrain()
	{
		
		Scanner t=new Scanner(System.in);
		System.out.println("        Search the train       ");
		System.out.println("Enter the train name:");
		String train_name=t.nextLine();
		for(Train train:trains)
		{
				
				if(train.getTrainName().equals(train_name))
				{
				System.out.println("Train Found");
				train.vacant(train);
				break;
				}
		}
			
	}
	public void printDetails()
	{
		System.out.println("Station Location:"+station_location);
		System.out.println("Station Code:"+station_code);
	}
}