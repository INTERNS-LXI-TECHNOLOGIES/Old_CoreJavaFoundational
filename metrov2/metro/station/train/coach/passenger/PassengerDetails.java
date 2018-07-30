package com.lxisoft.metrov2.metro.station.train.coach.passenger;

 public class  PassengerDetails
 {
 Passenger passenger=new Passenger();
 String passengername=passenger.getName();
 String passengergender=passenger.getGender();
	void details()
	{
	 System.out.println("Name="+passengername);
	 System.out.println("Gender="+passengergender);
	}
 }
