package com.lxisoft.metro.station;

import java.util.*;
import java.io.*;

public class Station
{
	ArrayList<Train> trains=new ArrayList<Train>();

	Train train1=new Train();
	Train train2=new Train();
	Train train3=new Train();
	Train train4=new Train();
	

	public Station()
	{
		addTrain();
		searchTrain();
		
	}
	
	public void addTrain()
	{
		trains.add(train1);
		trains.add(train2);
		trains.add(train3);
		trains.add(train4);
		train1.setTrainDetails("Train1",12345);
		train2.setTrainDetails("Train2",12346);
		train3.setTrainDetails("Train3",12347);
		train4.setTrainDetails("Train4",12348);
	}
		
	public void searchTrain()
	{
		while(true)
		{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter train name:");
		String trainName=scan.next();
		
		
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