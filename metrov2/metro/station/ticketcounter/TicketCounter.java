package com.lxisoft.metrov2.metro.station.ticketcounter;
import com.lxisoft.metrov2.metro.admin.Admin;
import com.lxisoft.metrov2.metro.Metro;
import com.lxisoft.metrov2.metro.station.Station;
import com.lxisoft.metrov2.metro.station.train.coach.passenger.ticket.Ticket;
import java.util.*;


public class TicketCounter

{

	Scanner scan=new Scanner(System.in);
	Ticket ticket=new Ticket();
	
	 public void ticket()
	 {
		 
        		 
		System.out.println("select your coach");
		String coachName=scan.nextLine();
		ticket.printTicket();
	 }

}
		