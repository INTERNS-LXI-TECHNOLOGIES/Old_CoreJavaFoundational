package com.lxisoft.metrov2.metro.station.train.coach.passenger.ticket;
import com.lxisoft.metrov2.metro.station.train.coach.passenger.PassengerDetails;
import com.lxisoft.metrov2.metro.station.train.coach.passenger.ticket.datetime.CurrentDateTimeExample1 ;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  
import java.util.*;
public class Ticket
{  
	Scanner scan=new Scanner(System.in);
	 public DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); 
    CurrentDateTimeExample1 ct=new CurrentDateTimeExample1();
   public ArrayList<LocalDateTime> times=new ArrayList<LocalDateTime>();
	public ArrayList<PassengerDetails> passengers;
	public int passengerno;
    public void printTicket()
	{  
		
		 passengers=new ArrayList<PassengerDetails>();
		    System.out.println("Enter the no of passengers");
	  passengerno=scan.nextInt();
	 for(int i=0;i<passengerno;i++)
	 {
     passengers.add(new PassengerDetails());
	 }
	  for(int i=0;i<passengerno;i++)
	 {
	 passengers.get(i).details();
	 LocalDateTime l=ct.dateTime();
	 times.add(l);
	 }

	}	

}