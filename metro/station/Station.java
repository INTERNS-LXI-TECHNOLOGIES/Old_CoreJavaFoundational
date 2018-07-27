package com.lxisoft.metro.station;
import com.lxisoft.metro.station.train.Train;
import java.util.ArrayList;
import java.util.*;
import com.lxisoft.metro.station.train.passenger.Passenger;
import com.lxisoft.metro.station.train.passenger.Ticket;


public class Station
{
	Train tr = new Train();
	ArrayList<Train> trains = new ArrayList<Train>();
	Scanner snr = new Scanner(System.in);
	
	public void train()
	{
	
		trains.add(new Train());
		trains.add(new Train());
		
		System.out.println("Choose your train--> \n1.Trivandrum express \n2.Kannur express");
		int ch=snr.nextInt();
		while(ch==1)
		{
			ArrayList<Ticket> passengers = new ArrayList<Ticket>();
			System.out.println("Enter the number of Passengers:");
			int pnum = snr.nextInt();
			for(int i=0;i<pnum;i++)
			{
				passengers.add(new Ticket());
			}
			trains.get(0).coach();
			for(int i=0;i<pnum;i++)
			{
			 passengers.get(i).ticketdetail();
			}
			  for(int i=0;i<pnum;i++)
			{
			int j=i+1;
			 System.out.println("Passenger" +j);
			 passengers.get(i).printticket();
			}
			
			ch=0;
		}
		
		while(ch==2)
		{
			ArrayList<Ticket> passengers = new ArrayList<Ticket>();
			System.out.println("Enter the number of Passengers:");
			int pnum = snr.nextInt();
			for(int i=0;i<pnum;i++)
			{
				passengers.add(new Ticket());
			}
			trains.get(1).coach();
			for(int i=0;i<pnum;i++)
			{
			 passengers.get(i).ticketdetail();
			}
			  for(int i=0;i<pnum;i++)
			{
				int j=i+1;
			 System.out.println("Passenger" +j);
			 passengers.get(i).printticket();
			}
			
			ch=0;
		}
	
	}
	
	
	
}