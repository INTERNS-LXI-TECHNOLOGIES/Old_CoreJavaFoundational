package com.lxisoft.metro.station.train.passenger;

import com.lxisoft.metro.station.train.passenger.Passenger;
import java.util.Scanner;

public class Ticket
{
	
		Passenger ps = new Passenger();
		Scanner scn = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		
	public void ticketdetail()
	{
		
		
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
		
		System.out.println("Please select the date:");
		String date = s.nextLine();
		ps.setDate(date);
		
		System.out.println("Choose your boarding station:");
		String bstation = s.nextLine();
		ps.setBname(bstation);
		
		System.out.println("Choose your desination:");
		String dstation = s.nextLine();
		ps.setDname(dstation);
		
		System.out.println("Enter the fare: ");
		int fare = s.nextInt();
		ps.setFare(fare);
		
	}
	
	public void printticket()
	{
	
		
		System.out.println("--YOUR TICKET HAS BEEN BOOKED--");
		System.out.println("Passenger name: " + ps.getName());
		System.out.println("Age: " + ps.getAge());
		System.out.println("Gender: " + ps.getGender());
		System.out.println("Your Boarding station is: " + ps.getBname());
		System.out.println("Your Destination is: " + ps.getDname());
		System.out.println("Date:" + ps.getDate());
		System.out.println("Ticket fare: " + ps.getFare());
		System.out.println("-----Thank you for booking-----");
		
		
	}
}