package com.lxisoft.metrov2.station;
import com.lxisoft.metrov2.metro.Metro;
import com.lxisoft.metrov2.admin.Admin;
import java.util.*;
public class Station
{
	private String trainName;
	private int noOfTrain;
	private String tName;
	Scanner train=new Scanner(System.in);

	public void enterTrainName()
	{
		System.out.println("Enter the number of trains: ");
		noOfTrain=train.nextInt();
		for(int i=1;i<=noOfTrain;i++)
		{
			System.out.println("Enter the train "+i+" Name: ");
			trainName=train.next();
		}
	}

	public void setTrainName(String trainName)
	{
		
		this.trainName=trainName;
	}

	public String getTrainName()
	{
		return trainName;
	}
}