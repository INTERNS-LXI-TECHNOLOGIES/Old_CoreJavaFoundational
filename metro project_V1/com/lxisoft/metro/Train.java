package com.lxisoft.metro;
import java.util.*;
public class Train
{
	private String TrainName;
	private int TrainNo;
	ACcoach AC_coach=new ACcoach();
	Sleeper sleeper=new Sleeper();
	General general=new General();
	
	
	
	Scanner input=new Scanner(System.in);
	public void setTrainName(String name)
	{
		this.TrainName=name;
	}
	public void setTrainNo(int num)
	{
		this.TrainNo=num;
	}
	public String getTrainName()
	{
		return TrainName;
	}
	public int getTrainNo()
	{
		return TrainNo;
	}
	
	public void enterTrainDetails()
	{
		System.out.println("Enter the name of the train:\n");
		String TrainName=input.nextLine();
		setTrainName(TrainName);
		System.out.println("Enter the train number:\n");
		int TrainNo=input.nextInt();
		setTrainNo(TrainNo);
		
		//System.out.println("Enter the number of Coaches in "+TrainName);
		//int noOfCoach=input.nextInt();
		//for(int i=0;i<noOfCoach;i++)
		//{
			//AC_coach.enterCoachDetails();
			
		//}
		
		
	}
	public void printTrainDetails()
	{
		System.out.println("Train Name :"+getTrainName());
		System.out.println("Train Number :"+getTrainNo());
		System.out.println("Available Coach details :");
		
		AC_coach.printACcoachDetails();
		sleeper.printSleeperDetails();
		general.printGeneralDetails();
		
	}
}