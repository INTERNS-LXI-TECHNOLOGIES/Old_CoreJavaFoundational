package com.lxisoft.metro.station;

import java.util.*;
import java.io.*;

public class Station
{
	ArrayList<Train> trains=new ArrayList<Train>();

	Train maveli=new Train();
	Train parasuram=new Train();
	Train egmore=new Train();
	Train gareebrath=new Train();
	

	public Station()
	{
		addTrain();
		searchTrain();
		
	}
	
	public void addTrain()
	{
		trains.add(maveli);
		trains.add(parasuram);
		trains.add(egmore);
		trains.add(gareebrath);
		maveli.setTrainDetails("Maveli",612358,"Shornur","Ernakulam");
		parasuram.setTrainDetails("Parasuram",612358,"Shornur","Ernakulam");
		egmore.setTrainDetails("Egmore",612358,"Shornur","Ernakulam");
		gareebrath.setTrainDetails("Gareebrath",612358,"Shornur","Ernakulam");
	}
		
	public void searchTrain()
	{
		while(true)
		{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter train name:");
		String trainName=scan.next();
		//System.out.print("Source & Destination:");
		//String source=scan.next();
		//String destination=scan.next();
		
		for(Train train:trains)
		{
			if(train.getMyTrainName().equals(trainName))
			{
				System.out.println("Train Found");
				train.vacant(train);
				break;
			}
		
		}
		
		
		}
	}
	
	

	
	
}