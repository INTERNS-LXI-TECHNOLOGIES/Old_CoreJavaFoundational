package com.lxisoft.metro.station.train;
import com.lxisoft.metro.station.train.coach.Coach;
import com.lxisoft.metro.station.train.coach.Ac;
import com.lxisoft.metro.station.train.coach.General;
import com.lxisoft.metro.station.train.coach.Sleeper;
import com.lxisoft.metro.station.train.passenger.Ticket;
import java.util.*;

public class Train
{
	public void coach()
	{
		
		Ticket t = new Ticket();
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the coach in which you want to travel: \n1.AC CHAIR CAR \n2.SLEEPER CLASS \n3.GENERAL");
		int choice = s.nextInt();
		switch(choice)
		{
			case 1: Ac a = new Ac();
					String coach1 = "AC CHAIR CAR BOOKING";
					a.setName(coach1);
					
					System.out.println(a.getName());
					
					break;
			case 2: Sleeper sp = new Sleeper();
					String coach2 = "SLEEPER CLASS BOOKING";
					sp.setName(coach2);
					
					System.out.println(sp.getName());
					
					break;
					
			case 3: General gn = new General();
					String coach3 = "GENERAL BOOKING";
					gn.setName(coach3);
					
					System.out.println(gn.getName());
					
					break;
		
			default: System.out.println("INVALID!!");
		}
		
	}
	
}