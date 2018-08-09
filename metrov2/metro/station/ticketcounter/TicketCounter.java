package com.lxisoft.metrov2.metro.station.ticketcounter;
import com.lxisoft.metrov2.admin.Admin;
import com.lxisoft.metrov2.metro.station.train.coach.passenger.PassengerDetails;
import com.lxisoft.metrov2.metro.station.train.coach.passenger.ticket.Ticket;
import com.lxisoft.metrov2.metro.station.train.coach.Coach;
import java.util.*;

public class TicketCounter
{	
	Scanner scan= new Scanner(System.in);
	Ticket ticket = new Ticket();
	int coachFare;
	String coachName;
	public void takeTicket(Admin admin)
	{
		String metroName=admin.getMetro();
		String trainName=admin.getTrain();
		String stationName=admin.getStation();
		admin.getStation();
		admin.getTrain();
		admin.seecoachNum();
		System.out.println("Passenger please select the coach you want to book...>1.AC 2.SLEEPER 3.GENERAL");
		int coachNo = scan.nextInt();
		if(coachNo==1)
		{
			coachName="AC";
			coachFare=admin.ac.getcoachFare();
		}
		if(coachNo==2)
		{
			 coachName="SLEEPER";
			 coachFare=admin.sleeper.getcoachFare();
		
		}
		if(coachNo==3)
		{
			coachName="GENERAL";
			coachFare=admin.general.getcoachFare();
		}
		
		System.out.println("***WELCOME TO " + metroName+ "METRO***");
		ticket.bookTickets();
				for(int i=0;i<ticket.passengernum;i++)
				{
					System.out.println("Passenger num="+i+" \n your train is:: "+trainName);
					ticket.passengers.get(i).printDetail();
					System.out.println("Coach::" +coachName);
					System.out.println("Coach Fare::" +coachFare);
					System.out.println(" Starting point::" +stationName);
					System.out.println("\n---HAPPY JOURNEY---");
				}
	}

}
		
	