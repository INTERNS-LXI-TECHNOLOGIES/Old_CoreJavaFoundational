package com.lxisoft.metro.station;
import com.lxisoft.metro.datetime.DateTime;
import com.lxisoft.metro.passenger.Passenger;
import com.lxisoft.metro.passenger.PassengerDetails;
import com.lxisoft.metro.station.train.Train;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.*;
public class Station

{
	DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	ArrayList<Train>trains=new ArrayList<Train>();
	Scanner sn=new Scanner(System.in);
     public void train()
	{
		trains.add(new Train());
		trains.add(new Train());
		
		System.out.println("choose your train..\n1.chennai\n2.banglore");
		DateTime d=new DateTime();
	
		LocalDateTime dt=d.dateTime();
		int c=sn.nextInt();
		while(c==1)
		{
			ArrayList<Passenger> passengers=new ArrayList<Passenger>();
			System.out.println("Enter the no of passengers:");
			int passno=sn.nextInt();
			for(int i=0;i<passno;i++)
			{
			 passengers.add(new Passenger());
			}
			
			trains.get(0).coach();
	           for(int i=0;i<passno;i++)
			{
				passengers.get(i).detail();
			}
				for(int i=0;i<passno;i++)
				{
					int j=i+1;
					System.out.println(dtf.format(dt));
					System.out.println("Passenger no=" +j);
					passengers.get(i).ticket();
					System.out.println("destination=chennai");
					System.out.println("-------booking successful------");
					
					System.out.println("--------Thanks for Booking------");
				}
				c=0;
		}
		 while(c==2)
		{
			ArrayList<Passenger> passengers=new ArrayList<Passenger>();
		    System.out.println("Enter the no of passenger");
			int passno=sn.nextInt();
				for(int i=0;i<passno;i++)
				{
					passengers.add(new Passenger());
				}
				trains.get(1).coach();
					for(int i=0;i<passno;i++)
					{
						passengers.get(i).detail();
					}
						for(int i=0;i<passno;i++)
						{
							int j=i+1;
							System.out.println("Passenger no="+j);
							passengers.get(i).ticket();
							System.out.println("destination=banglore");
							System.out.println("Happy journey");
							System.out.println("!!!!--------Thanks for Booking------!!!!");
						}
						c=0;
		}

	} 
		
		
		

	
}