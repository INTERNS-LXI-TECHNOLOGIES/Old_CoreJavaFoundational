package com.lxisoft.metro;
import java.util.*;
public class Passenger
{
	private String PassengerName;
	Scanner input=new Scanner(System.in);
	Ticket ticket=new Ticket();
	public void setPassengerName(String passengerName)
	{
		this.PassengerName=passengerName;
	}
	public String getPassengerName()
	{
		return PassengerName;
	}
	public void enterPassengerDetails()
	{
		
		System.out.println("Enter your name:\n");
		String PassengerName=input.nextLine();
		
		
		
	}
}