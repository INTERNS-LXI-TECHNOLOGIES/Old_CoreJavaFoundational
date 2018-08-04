package com.lxisoft.metrov2.test;
import com.lxisoft.metrov2.admin.Admin;
 import com.lxisoft.metrov2.metro.Metro;
 import com.lxisoft.metrov2.metro.station.ticketcounter.TicketCounter;

public class TDD
{
		
		public static void main(String args[])
	{
		System.out.println("welcome to metro");
		Admin admin=new Admin();
		admin.adminAccess();
		TicketCounter ticketcounter=new TicketCounter();
		ticketcounter.ticket();
	
	}

}