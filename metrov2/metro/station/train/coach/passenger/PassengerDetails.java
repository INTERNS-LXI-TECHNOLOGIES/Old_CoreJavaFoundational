package com.lxisoft.metrov2.metro.station.train.coach.passenger;
import com.lxisoft.metrov2.metro.station.train.coach.passenger.Passenger;
import java.util.*;

public class PassengerDetails
{
	Passenger passenger=new Passenger();
	Scanner sc=new Scanner(System.in);
	
	
	
	public void details()
	{
		
		System.out.println("Enter the name:");
		String name=sc.nextLine();
		passenger.setName(name);
		
		System.out.println("Enter the destination:");
		String destination=sc.nextLine();
		passenger.setDestination(destination);
		
		System.out.println("Your gender:");
		char gender=sc.next().charAt(0);
		passenger.setGender(gender);
		
		System.out.println("your age:");
		int age=sc.nextInt();
		passenger.setAge(age);
	}
		
		public void show()
		 {
			System.out.println("\t\tName of the passenger :" +passenger.getName());
			System.out.println("\t\tName of the passenger :" +passenger.getDestination());
			System.out.println("\t\tGender :" +passenger.getGender());
			System.out.println("\t\tAge :" +passenger.getAge());
		 }
	
}
	