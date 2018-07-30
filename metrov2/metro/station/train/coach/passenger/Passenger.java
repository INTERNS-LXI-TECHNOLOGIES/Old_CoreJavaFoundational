package com.lxisoft.metrov2.metro.station.train.coach.passenger;

import com.lxisoft.metrov2.metro.station.train.coach.passenger.ticket.Ticket;
public class Passenger
{
	Ticket ticket = new Ticket();
	public void enterPassenger()
	{
		
		ticket.bookTickets();
		
	}
}