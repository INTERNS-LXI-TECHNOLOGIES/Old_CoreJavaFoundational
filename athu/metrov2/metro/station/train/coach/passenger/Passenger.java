package com.lxisoft.metrov2.metro.station.train.coach.passenger;
import java.util.Scanner;
public class Passenger
{
private String passengerName;
private String passengerGender;

Scanner scan=new Scanner(System.in);

public void setPassengerName(String passengerName)
	{
		this.passengerName=passengerName;
	}
public String getPassengerName()
	{
		return passengerName;
	}

public void setPassengerGender(String passengerGender)
{
this.passengerGender=passengerGender;
}
public String getPassengerGender()
{
return passengerGender;
}


}