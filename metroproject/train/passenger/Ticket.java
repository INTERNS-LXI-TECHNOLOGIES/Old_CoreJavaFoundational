package com.lxisoft.metro.station.train.passenger;

import com.lxisoft.metro.station.train.passenger.Passenger;
import java.util.Scanner;

public class Ticket
{
	
	public void printticket()
	{
		
		Passenger ps = new Passenger();
		Scanner scn = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
	
		System.out.println("For booking please enter your details:");
		System.out.println("Enter your name:");
		String name = scn.nextLine();
		ps.setName(name);
		
		System.out.println("Enter your age:");
		int age = scn.nextInt();
		ps.setAge(age);
		
		System.out.println("Choose your gender: ");
		char gender = scn.next().charAt(0);
		ps.setGender(gender);
		
		System.out.println("Choose your boarding station:");
		String bstation = s.nextLine();
		ps.setBname(bstation);
		
		System.out.println("Choose your desination:");
		String dstation = s.nextLine();
		ps.setDname(dstation);
		
		System.out.println("Enter the fare: ");
		int fare = s.nextInt();
		ps.setFare(fare);
		
	
		
		System.out.println("Your ticket has booked");
		System.out.println("Passenger name: " + ps.getName());
		System.out.println("Age: " + ps.getAge());
		System.out.println("Gender: " + ps.getGender());
		System.out.println("Your Boarding station is: " + ps.getBname());
		System.out.println("Your Destination is: " + ps.getDname());
		System.out.println("Ticket fare: " + ps.getFare());
		
		
	}
}