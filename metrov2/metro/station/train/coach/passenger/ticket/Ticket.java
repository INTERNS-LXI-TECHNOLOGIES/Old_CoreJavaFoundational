package com.lxisoft.metrov2.metro.station.train.coach.passenger.ticket;
import com.lxisoft.metrov2.metro.station.train.coach.passenger.ticket.datetime.DateTime;

import com.lxisoft.metrov2.metro.station.train.coach.passenger.PassengerDetails;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.*;


public class Ticket
{
	  Scanner scan=new Scanner(System.in);
	  DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	  DateTime dt=new DateTime();
	  ArrayList<LocalDateTime>times=new ArrayList<LocalDateTime>();
	  
	
	  public void printTicket()
	
	{
		ArrayList<PassengerDetails>passengers=new ArrayList<PassengerDetails>();
		System.out.println("enter the no of passengers:");
		int passengerno=scan.nextInt();
		for(int i=0;i<passengerno;i++)
			{
				passengers.add(new PassengerDetails());
			}
		for(i=0;i<passengerno;i++)
			{
				passengers.get(i).details();
				LocalDateTime l=dt.dateTime();
				times.add(l);
			}
		for(i=0;i<passengerno;i++)
			{
				System.out.println("\t"+dtf.format(times.get(i)));
				System.out.println("\tpassenger no:"+i);
				passengers.get(i).show();
				System.out.println("\t booking successful");
			}
	}		
				
			
		
		
	
	
	
	
}