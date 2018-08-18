package com.lxisoft.metroproject;
import java.util.*;
public abstract class Coach
{
	String coach_name;
	int coach_price;
	ArrayList<Integer> seat_number=new ArrayList<Integer>();
	Ticket tickets=new Ticket();
	ArrayList<Integer> seat=new ArrayList<Integer>();
	ArrayList<Integer> ticket=new ArrayList<Integer>();
	public Coach()
	{
		for(int i=1;i<=15;i++)
		{
			seat.add(i);
		}
	}
	public void vacancy(Train train)
	{
		System.out.println("Available Seats:");
		for(Integer i:this.seat)
		{
			System.out.println(i+" ");
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total number of seats:");
		int total_seat=sc.nextInt();
		System.out.println("Enter the seat number:");
		for(int i=1;i<=total_seat;i++)
		{
			int seat_number=sc.nextInt();
			ticket.add(seat_number);
			seat.remove(seat.indexOf(seat_number));
		}
		for(Integer i:this.seat)
		{
			System.out.print(i+" ");
		}
	setTicket(train);
	}
	void setTicket(Train train)
	{
		tickets.setTicket(this.coach_name,this.coach_price,seat_number,train);
	}

}
