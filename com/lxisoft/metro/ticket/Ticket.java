package com.lxisoft.metro.ticket;
import com.lxisoft.metro.station.*;
import java.util.*;

public class Ticket
{
	public void  setTicket(String coachName,int coachPrice,ArrayList<Integer> seatNo,Train train)
	{
		
		System.out.println("\n*************************");
		System.out.println("\nTrain:"+train.getMyTrainName());
		System.out.println("\nCoach:"+coachName);
		
		System.out.print("Reserved Seats:");
		for(int i=0;i<seatNo.size();i++)
		{
			System.out.print(seatNo.get(i)+"  ");
		
		
		}
		System.out.println("");
		System.out.println("Price:"+coachPrice*seatNo.size());
		System.out.println("\n*************************");
	}
}