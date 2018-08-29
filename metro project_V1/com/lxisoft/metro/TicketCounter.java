package com.lxisoft.metro;
import java.util.*;
import com.lxisoft.metro.Metro;
import com.lxisoft.metro.Station;
import com.lxisoft.metro.Passenger;
public class TicketCounter
{
	Scanner input=new Scanner(System.in);
	public void ticketBooking(ArrayList<Station> stations,ArrayList<Passenger> passengers)
	{
		
		System.out.println("*********TICKET RESERVATION PORTAL**********");
		
		for(int j=0;j<passengers.size();j++)
		{
			passengers.get(j).enterPassengerDetails();
		}
		System.out.println("Select your starting station:\n");
		for(int i=0;i<stations.size();i++)
		{
			stations.get(i).getStationName();
		}
		
		
	}
}