package com.lxisoft.metro.station.train;

import com.lxisoft.metro.station.train.coach.Ac;
import com.lxisoft.metro.station.train.coach.General;
import com.lxisoft.metro.station.train.coach.Sleeper;
import java.util.*;


public class Train
{
	public void coach()
	{
	  Scanner sc =new Scanner(System.in);
	  System.out.println("choose your coach..\n1.Ac\n2.General\n3.Sleeper");
	  int ch=sc.nextInt();
	  switch(ch)
	  {
		  case 1: Ac a=new Ac();
		  
		  a.setName("AC COACH");
		  a.setFare(500);
		  System.out.println(a.getName());
		  System.out.println(a.getFare());
		  break;
		  
		  case 2: Sleeper sl=new Sleeper();
		
		  sl.setName("SLEEPER COACH");
		  sl.setFare(200);
		  System.out.println(sl.getName());
		  System.out.println(sl.getFare());
		  break;
		   case 3: General g=new General();
		  
		   g.setName("GENERAL COACH");
		   g.setFare(100);
		   System.out.println(g.getName());
		   System.out.println(g.getFare());
		  break;
		  
		  
		  
	  }
	}
	
	
}
	  