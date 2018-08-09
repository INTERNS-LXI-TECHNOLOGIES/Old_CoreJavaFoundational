package com.lxisoft.metrov2.test;

import com.lxisoft.metrov2.metro.Metro;
import com.lxisoft.metrov2.admin.Admin;
import com.lxisoft.metrov2.metro.station.ticketcounter.TicketCounter;
public class TDD
{
	
	public static void main(String args[])
	{
		Admin admin = new Admin();
		TicketCounter ticketcounter = new TicketCounter();
		admin.viewAdmin();
		ticketcounter.takeTicket(admin);
		
	}

}