package com.lxisoft.metrov2.metro.station.train.coach.passenger;

import com.lxisoft.metrov2.metro.station.train.coach.passenger.Passenger;
import java.util.*;
public class PassengerDetails
{
	Passenger passenger = new Passenger();
	Scanner scan = new Scanner(System.in);
		
	public void passengerDetail()
	{
		
		System.out.println("Enter your name::");
		String name = scan.next();
		passenger.setpassengerName(name);
		System.out.println("Enter your age::");
		int age = scan.nextInt();
		passenger.setpassengerAge(age);
		System.out.println("Enter the destination::");
		String destination =scan.next();
		passenger.settrainDestination(destination);	
		
	}
	
	public void printDetail()
	{
		
		System.out.println("Passenger name::" + passenger.getpassengerName());
		System.out.println("Passenger age::" + passenger.getpassengerAge());
		System.out.println("Your Destination::" + passenger.gettrainDestination());
		
	}
	
}
















