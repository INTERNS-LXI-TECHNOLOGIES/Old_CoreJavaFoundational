package com.lxisoft.metromanagement.metro;
public class Train
{


	private int trainNO;
	private String trainName;
	private String trainOrigin;
	private String trainDestination;
	private float timeOfJourney;
	private int noOfSeats;
	private String classAvailable;
	

public void setTrainNo(int trainNO)
{
	this.trainNO=trainNO;
}
public void settrainname(String trainName)
{
	this.trainName=trainName;
}
public void setOrigin(String trainOrigin)
{
	this.trainOrigin=trainOrigin;
}
public void setDestination(String trainDestination)
{
	this.trainDestination=trainDestination;
}
public void setTimeJourney(float timeOfJourney)
{
	this.timeOfJourney=timeOfJourney;
}
public void setNoOfSeat(int noOfSeats)
{
	this.noOfSeats=noOfSeats;
}
public void setclass(String classAvailable)
{
	this.classAvailable=classAvailable;
}
public int getTrainNo()
{
	return trainNO;
}
public String getTrainName()
{
	return trainName;
}
}
