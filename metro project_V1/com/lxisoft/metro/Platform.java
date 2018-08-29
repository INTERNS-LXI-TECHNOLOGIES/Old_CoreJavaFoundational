package com.lxisoft.metro;
import java.util.*;
public class Platform
{
	private String PlatformType;
	
	Scanner input=new Scanner(System.in);
	
	ArrayList<Train> trains=new ArrayList<Train>();
	public void setPlatformType(String type)
	{
		this.PlatformType=type;
	}
	
	public String getPlatformType()
	{
		return PlatformType;
	}
	
	
	public void enterPlatformDetails()
	{
		System.out.println("Enter platform type:\n");
		String PlatformType=input.nextLine();
		setPlatformType(PlatformType);
		System.out.println("Enter the number of trains\n");
		int noOfTrain=input.nextInt();
		for(int i=0;i<noOfTrain;i++)
		{
			trains.add(new Train());
			
			trains.get(i).enterTrainDetails();
		}
	}
	
	public void printPlatformDetails()
	{
		System.out.println("Platform Type :"+getPlatformType());
		for(int j=0;j<trains.size();j++)
		{
			trains.get(j).printTrainDetails();
		}
	}
}