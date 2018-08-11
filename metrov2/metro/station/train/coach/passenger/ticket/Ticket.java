package com.lxisoft.metrov2.metro.station.train.coach.passenger.ticket;
import com.lxisoft.metrov2.metro.station.train.coach.passenger.Passenger;
import com.lxisoft.metrov2.metro.station.train.coach.passenger.PassengerDetails;
import com.lxisoft.metrov2.metro.station.train.coach.CoachDetails;
public class Ticket
{
	PassengerDetails passengerDetails=new PassengerDetails();
	public void displayTicket()
	{
passengerDetails.showPassengerDetails();
//passengerDetails.showTicket();
	}

}