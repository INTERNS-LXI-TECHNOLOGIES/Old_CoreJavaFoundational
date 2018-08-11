package com.lxisoft.metrov2.metro.station.train.coach.passenger;
import com.lxisoft.metrov2.metro.station.train.coach.passenger.Passenger;
import java.util.Scanner;
import java.util.*;
public class PassengerDetails
{
	 ArrayList<Passenger> passengerList=new ArrayList<Passenger>();
	public void showPassengerDetails()
	{

		Scanner scan=new Scanner(System.in);
		String passengerName,Name;
		String passengerGender,Gender;
		System.out.println("\nENTER PASSENGER NUMBER");
		int passengerNumber=scan.nextInt();
		
		
		for(int i=0; i<passengerNumber; i++)
		{
			passengerList.add(new Passenger());
			Passenger passenger=new Passenger();
			
			System.out.println("\nENTER PASSENGER NAME");
			passengerName=scan.next();
			passengerList.get(i).setPassengerName(passengerName);

			System.out.println("\nENTER PASSENGER GENDER");
			passengerGender=scan.next();
			passengerList.get(i).setPassengerGender(passengerGender);

			//passengerList.add(passenger);
			
		}

		
		for(int i=0;i<passengerNumber;i++)
	 {
		  Name=passengerList.get(i).getPassengerName();
		  Gender=passengerList.get(i).getPassengerGender();
	  System.out.println("PASSENGER NAME " +Name);
	  System.out.println("PASSENGER GENDER " +Gender);
	 
	
	 }
	 
	}
	

	
}
