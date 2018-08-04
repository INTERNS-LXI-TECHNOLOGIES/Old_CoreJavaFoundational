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
System.out.println("Choose the coach(1-AC,2-Sleeper,3-General)");
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
System.out.println("\t\tWelcome to\t"+MetroName+"\tMetro");
ticket.printTicket();
	  for(int i=0;i<ticket.passengerno;i++)
	{
	 System.out.println("\t\t"+ticket.dtf.format(ticket.times.get(i)));
	
	 System.out.println("Passenger no="+i+"\t\tYour Train is\t"+TrainName);
	 ticket.passengers.get(i).showDetails();
	System.out.println("\t\tCoach="+coachName);
	System.out.println("\t\tCoach price="+coachPrice);
	System.out.println("\t\tStarting point="+StationName);
	System.out.println("\t\tHappy journey");
	System.out.println("!!!!--------Thanks for Booking------!!!!\n");
    }
}


}