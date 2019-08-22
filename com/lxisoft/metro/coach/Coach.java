package com.lxisoft.metro.coach;
import com.lxisoft.metro.ticket.Ticket;
import com.lxisoft.metro.station.*;
import java.util.*;

public abstract class Coach
{
	
	String coachName;
	int coachPrice;
	ArrayList <Integer> seatNo=new ArrayList<Integer>();
	
	Ticket tickets=new Ticket();
	 ArrayList<Integer> seat=new ArrayList<Integer>();

	ArrayList <Integer> ticket=new ArrayList<Integer>();
		

public Coach()
	{
		for(int i=1;i<=15;i++)
		{
		
			seat.add(i);

		}
	}
	
	public void vacancy(Train train)
	{
		System.out.println("Available Seats");
		
		for(Integer i:this.seat)
		
		{
			
			System.out.print(i+" ");
		}
		
		Scanner scan=new Scanner(System.in);
		System.out.println("");
		System.out.print("Enter no of seat:");
		int totalSeat=scan.nextInt();
		System.out.print("Enter seat no:");
		for(int i=1;i<=totalSeat;i++)
		{
			
			int seatNo=scan.nextInt();
			
			ticket.add(seatNo);
			
			seat.remove(seat.indexOf(seatNo));
		}
		
		System.out.println("Available Seats");
		for(Integer i:this.seat)
		
		{
			
			System.out.print(i+" ");
		}
		setTicket(train);
		
	}
	
	void setTicket(Train train)
	{
		tickets.setTicket(this.coachName,this.coachPrice,ticket,train);
	}
}