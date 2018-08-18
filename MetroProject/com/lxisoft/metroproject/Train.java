package com.lxisoft.metroproject;
import java.util.*;
public class Train
{
	private String train_name,source,destination,engine_number;
	private int train_number; 
	Coach general,sleeper,ac;
	public Train()
	{
		general=new General();
		sleeper=new Sleeper();
		ac=new Ac();
	}
	public void setTrainDetails(String train_name,int train_number)
	{
		this.train_name=train_name;
		this.train_number=train_number;
	}
	public String getTrainName()
	{
		return train_name;
	}
	public int getTrainNumber()
	{
		return train_number;
	}
	public void vacant(Train train)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Coach type:\n1.Sleeper\n2.General\n3.AC");
		int coachType=sc.nextInt();
		switch(coachType)
		{
			case 0:System.exit(0);
			case 1:sleeper.vacancy(train);
					break;
			case 2:general.vacancy(train);
					break;
			case 3:ac.vacancy(train);
					break;
			default:System.out.println("Invalid Choice");
					break;
		}
	}		
}

	