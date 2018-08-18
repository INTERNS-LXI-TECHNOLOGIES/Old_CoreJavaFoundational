package com.lxisoft.metroproject;
import java.util.*;
public class Ticket
{
	public void setTicket(String coach_name,int coach_price,ArrayList<Integer> seat_number,Train train)
	{
		System.out.println("\nTrain:"+train.getTrainName());
		System.out.println("\nCoach:"+coach_name);
		System.out.println("Reserved Seats:");
		for(int i=0;i<seat_number.size();i++)
		{
			System.out.print(seat_number.get(i)+" ");
		}
		System.out.println("\nPrice:"+coach_price*seat_number.size());
	}
}
		
	