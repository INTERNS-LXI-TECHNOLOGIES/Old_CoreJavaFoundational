package com.lxisoft.metrov2.metro.station.ticketcounter;
import com.lxisoft.metrov2.admin.Admin;
import com.lxisoft.metrov2.metro.station.train.coach.passenger.ticket.Ticket;
import com.lxisoft.metrov2.metro.station.train.coach.passenger.PassengerDetails;
import com.lxisoft.metrov2.metro.station.train.coach.Coach;
import java.util.*;
public class TicketCounter
{
Scanner scan=new Scanner(System.in);

public String coachName,MetroName,TrainName,StationName;
int Coachno,coachPrice;
Ticket ticket=new Ticket();
public void ticket(Admin admin)
{


MetroName=admin.getMetro();
TrainName=admin.getTrain();	
StationName=admin.getStation();
admin.getStation();
admin.getTrain();
admin.getnoofCoach();
System.out.println("Choose the coach: \n\t1)AC\n\t2)Sleeper\n\t3)General");
Coachno=scan.nextInt();
if(Coachno==1)
   {
	   coachName="Ac";
	coachPrice= admin.ac.getcoachPrice();  
   }
   if(Coachno==2)
   {
	   coachName="Sleeper";
	coachPrice= admin.sleeper.getcoachPrice();  
   }
   if(Coachno==3)
   {
	   coachName="General";
	 coachPrice=admin.general.getcoachPrice();  
   }
 System.out.println("----------------------------------------------");
System.out.println("\t\tWelcome to "+MetroName+" Metro");
System.out.println("----------------------------------------------");
ticket.printTicket();
System.out.println("--------Booking Successful !!!------\n");
	  for(int i=0;i<ticket.passengerno;i++)
	{
	System.out.println("PASSENGER "+i+1);	
	System.out.println("----------------------------------------------");
	System.out.println("----------------------------------------------");
	 System.out.println("\n\tDate & Time:"+ticket.dtf.format(ticket.times.get(i)));
		System.out.println("----------------------------------------------");
	 System.out.println("\n\tTRAIN NAME: "+TrainName);
		System.out.println("----------------------------------------------");
	 System.out.println("\n\tSTARTING POINT:"+StationName+"\n");
	 	System.out.println("----------------------------------------------");
	 ticket.passengers.get(i).showDetails();
	 System.out.println("----------------------------------------------");
	System.out.println("\n\tCOACH: "+coachName);
	System.out.println("----------------------------------------------");
	System.out.println("\n\tTICKET FARE: "+coachPrice);
	System.out.println("----------------------------------------------");
	System.out.println("\t\t!!Happy journey!!");
	System.out.println("----------------------------------------------");
	System.out.println("----------------------------------------------");
    }
}


}