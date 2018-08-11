package com.lxisoft.metrov2.metro.station.train.coach;
import com.lxisoft.metrov2.metro.station.train.coach.passenger.Passenger;
import com.lxisoft.metrov2.metro.station.train.coach.passenger.PassengerDetails;
import com.lxisoft.metrov2.metro.station.train.coach.passenger.ticket.Ticket;
import com.lxisoft.metrov2.metro.station.train.coach.Coach;
import com.lxisoft.metrov2.metro.station.train.coach.Ac;
import com.lxisoft.metrov2.metro.station.train.coach.Sleeper;
import com.lxisoft.metrov2.metro.station.train.coach.General;

import java.util.Scanner;

public class CoachDetails
{
	//PassengerDetails passengerDetails=new PassengerDetails();
	public void showCoachDetails()
	{
		Coach coach1=new Ac();
		Coach coach2=new Sleeper();
		Coach coach3=new General();
		
		
		Ticket ticket=new Ticket();
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("\n \nCHOOSE YOUR COACH \n 1.AC \n 2.SLEEPER \n 3.GENERAL");

		int choice=scan.nextInt();
		
		switch(choice)
		{
			case 1: 
			coach1.setCoachName("AC COACH");
			coach1.setCoachPrice ( 1000 );
			System.out.println("YOU SELECTED "+coach1.getCoachName()+ "  FOR RUPEES "+coach1.getCoachPrice());
			break;
	
			case 2: 
			coach2.setCoachName("SLEEPER COACH");
			coach2.setCoachPrice ( 500 );
			System.out.println("YOU SELECTED "+coach2.getCoachName()+ " FOR RUPEES "+coach2.getCoachPrice());
			break;
	
			case 3: 
			coach3.setCoachName("GENERAL COACH");
			coach3.setCoachPrice(250);
			System.out.println("YOU SELECTED "+coach3.getCoachName()+ "FOR RUPEES "+coach3.getCoachPrice());
			break;
	
		}
		
		
		//passengerDetails.showPassengerDetails();
		
		ticket.displayTicket();
		
	}

}