package com.lxisoft.program;
import java.util.*;

public class Coach
{
	AcCoach ac=new AcCoach();
	General g=new General();
	Sleeper s=new Sleeper();
	int total;
	private int ticketType;
	public AcCoach getAc()
	{
		return ac;
	}
	public General getGeneral()
	{
		return g;
	}
	public Sleeper getSleeper()
	{
		return s;
	}
	void printDetails()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the coach that you want to book ticket(1,2,3)?\n1.AC\n2.Sleeper\n3.General");
		ticketType=in.nextInt();
		switch(ticketType)
		{
			case 1:
				ac.bookTicket();
				total=ac.getAcSeats();
				if(total>0)
				{
					System.out.println("Please play the required amount");


					System.out.println("Ticket successfully Booked");
				}
				else
				{
					System.out.println("Seats are full");
				}
				break;
			case 2:
				s.bookTicket();
				total=s.getSleeperSeats();
				if(total>0)
				{
					System.out.println("Please play the required amount");
					System.out.println("Ticket successfully Booked");
				}
				else
				{
					System.out.println("Seats are full");
				}
				break;
			case 3:
				g.bookTicket();
				total=g.getGeneralSeats();
				if(total>0)
				{
					System.out.println("Please play the required amount");
					System.out.println("Ticket successfully Booked");
				}
				else
				{
					System.out.println("Seats are full");
				}
				break;
			default:
				System.out.println("Invalid choice");
		}
	}
	
}
