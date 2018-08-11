package com.lxisoft.program;
import java.util.*;

public class General
{
	private int totalNoOfSeats=20;
	private int noOfTickets;


	public void bookTicket()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("How many tickets do you want to book");	
		noOfTickets=in.nextInt();
		totalNoOfSeats-=noOfTickets;
		
	}

	public void setGeneralSeats(int totalNoOfSeats)
	{
		this.totalNoOfSeats=totalNoOfSeats;
	}

	public int getGeneralSeats()
	{
		return totalNoOfSeats;
	}

}