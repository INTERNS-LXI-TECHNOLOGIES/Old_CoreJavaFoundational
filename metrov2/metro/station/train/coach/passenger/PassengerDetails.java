package com.lxisoft.metrov2.metro.station.train.coach.passenger;
import com.lxisoft.metrov2.metro.station.train.coach.passenger.Passenger;
import java.util.Scanner;
public class PassengerDetails
{
	Passenger passenger=new Passenger();
	public void showPassengerDetails()
	{

		Scanner scan=new Scanner(System.in);
		String passengerName;
		String passengerGender;
		System.out.println("ENTER PASSENGER NUMBER");
		int passengerNumber=scan.nextInt();

		for(int i=0; i<passengerNumber; i++)
		{
			System.out.println("ENTER PASSENGER NAME");
			passengerName=scan.next();
			passenger.setPassengerName(passengerName);

			System.out.println("ENTER PASSENGER GENDER");
			passengerGender=scan.next();
			passenger.setPassengerGender(passengerGender);

		}

	}
	
	public void showTicket()
	{
		
		System.out.println("PASSENGER NAME:"+passenger.getPassengerName()+ "\nPASSENGER GENDER:"+passenger.getPassengerGender());
		
	}
	
}
