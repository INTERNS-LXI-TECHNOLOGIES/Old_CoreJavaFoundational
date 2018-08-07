package com.lxisoft.metrov2.metro.station.train.coach.passenger.ticket;

import com.lxisoft.metrov2.metro.station.train.coach.passenger.PassengerDetails;
import java.util.*;

public class Ticket
{
	Scanner scan = new Scanner(System.in);
	public ArrayList<PassengerDetails> passengers;
	public int passengernum;
	public void bookTickets()
	{
		passengers = new ArrayList<PassengerDetails>();
		System.out.println("Enter number of passengers::");
		passengernum = scan.nextInt();
		for(int i=0;i<passengernum;i++)
		{
			passengers.add(new PassengerDetails());
		}
		for(int i=0;i<passengernum;i++)
		{
		passengers.get(i).passengerDetail();
		}
		

	}
}	