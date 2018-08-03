package com.lxisoft.metrov2.metro.station.train.coach.passenger;
import com.lxisoft.metrov2.metro.station.train.coach.passenger.Passenger;
import java.util.Scanner;
 public class  PassengerDetails
 {
 Passenger passenger=new Passenger();
 Scanner scan=new Scanner(System.in);
 String name,destinationPoint;
	public void details()
	{

		 System.out.println("Enter the name");
		 name=scan.next();
		 passenger.setName(name);
		 System.out.println("Enter the Destination point");
		 destinationPoint=scan.next();
		 passenger.setDestinationpoint(destinationPoint);
	}
	public void showDetails()
	{
                      
    System.out.println("\t\t Name\t=\t"+passenger.getName());
	System.out.println("\t\t Destination point=\t"+passenger.getDestinationpoint());
System.out.println("\n\n");
    }
 }
