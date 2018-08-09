package com.lxisoft.metrov2.test;
import com.lxisoft.metrov2.admin.Admin;
import com.lxisoft.metrov2.metro.station.ticketcounter.TicketCounter;
import java.util.*;

public class Tdd
{

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		Admin admin=new Admin();
		TicketCounter ticketcounter=new TicketCounter();

		System.out.println("\n\n----------------------WELCOME-----------------------\n");
		admin.adminSettings();
		ticketcounter.ticket(admin); 
	}
}