package com.lxisoft.metro.station;
import com.lxisoft.metro.coach.*;
import java.util.*;
public class Train
{
	String trainName,startStation,stopStation;
	int trainNo; 
	Coach aC,general,sleeper;

	public Train()
	{
		aC=new Ac();
		general=new General();
		sleeper=new Sleeper();
	}
	
	public  void setTrainDetails(String trainName,int trainNo)
	{
		this.trainName=trainName;
		this.trainNo=trainNo;
		
		System.out.print(this.trainName+" ");
		System.out.println(this.trainNo);
	}
	
	
	public String getMyTrainName()
	{
		return this.trainName;
	}
	
	public void vacant(Train train)
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter coach:\n1.A/c\n2.General\n3.Sleeper");
		int coachSelect=scan.nextInt();
		switch(coachSelect)
		{
			case 0: System.exit(0);
			case 1:aC.vacancy(train);
					break;
			case 2:	general.vacancy(train);
					break;
			case 3:	sleeper.vacancy(train);
					break;
			
			default:System.out.println("Invalid Choice");break;
		}
			
	}
	
		
	
	

		

}