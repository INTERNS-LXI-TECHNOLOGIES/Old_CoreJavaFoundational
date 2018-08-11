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
	public void setTrainDetails(String train_name,int train_number,String engine_number,String source,String destination)
	{
		this.train_name=train_name;
		this.train_number=train_number;
		this.engine_number=engine_number;
		this.source=source;
		this.destination=destination;
	}
	public String getTrainName()
	{
		return train_name;
	}
	public int getTrainNumber()
	{
		return train_number;
	}
	public void printTrainDetails()
	{
		System.out.println("Train Name:"+train_name);
		System.out.println("Train Number:"+train_number);
	}
	
}

	