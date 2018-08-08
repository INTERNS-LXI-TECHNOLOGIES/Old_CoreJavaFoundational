package com.lxisoft.metrov2.metro.station.train.coach.passenger;
import com.lxisoft.metrov2.metro.station.train.coach.passenger.Passenger;
import java.util.*;

public class PassengerDetails
{
	Passenger passenger=new Passenger();
	Scanner sc=new Scanner(System.in);
	String name,destination;
	int age;
	
	
	public void details()
	{
		
		System.out.println("Enter the name:");
		 name=sc.next();
		passenger.setName(name);
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the destination:");
		
		destination=s.next();
		passenger.setDestination(destination);
		
		
		
		System.out.println("your age:");
		 age=sc.nextInt();
		passenger.setAge(age);
	}
		
		public void showDetails()
		 {
			System.out.println("\t\tName of the passenger :" +passenger.getName());
			System.out.println("\t\tDestination :" +passenger.getDestination());
			
			System.out.println("\t\tAge :" +passenger.getAge());
		 }
	
}
	