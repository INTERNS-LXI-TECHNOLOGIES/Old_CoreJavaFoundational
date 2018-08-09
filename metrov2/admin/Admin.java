package com.lxisoft.metrov2.admin;

import com.lxisoft.metrov2.metro.Metro;
import com.lxisoft.metrov2.metro.station.Station;
import com.lxisoft.metrov2.metro.station.train.Train;
import com.lxisoft.metrov2.metro.station.train.coach.Ac;
import com.lxisoft.metrov2.metro.station.train.coach.General;
import com.lxisoft.metrov2.metro.station.train.coach.Sleeper;
import java.util.*;
public class Admin
{
	public int coachnum;
	public int choice;
	Scanner scan = new Scanner(System.in);
	public Metro metro = new Metro();
	public Station station = new Station();
	public Train train = new Train();
	public Ac ac = new Ac();
	public Sleeper sleeper = new Sleeper();
	public General general = new General();
	
	
	public void viewAdmin()
	{
		System.out.println("****WELCOME ADMIN****");
		setMetro();
		setStation();
		setTrain();
		setCoach();
		System.out.println("---WELCOME TO ONLINE TICKET BOOKING---");
		
	}
	
	public void setMetro()
	{
		System.out.println("Name of the metro::");
		String name= scan.nextLine();
		metro.setmetroName(name);
	}
	
	public String getMetro()
	{
		return metro.getmetroName();
	}
	
	public void setStation()
	{
		System.out.println("Name of the Station::");
		String name=scan.nextLine();
		station.setstationName(name);
	}
	
	public String getStation()
	{
		return station.getstationName();
	}
	
	public void setTrain()
	{
		System.out.println("Name of the train::");
		String name= scan.nextLine();
		train.settrainName(name);
	}
	
	public String getTrain()
	{
		return train.gettrainName();
	}
	
	public void setCoach()
	{
		System.out.println("Choose the coaches for the train 1.single coach train 2.all coaches ");
		coachnum=scan.nextInt();
		
		switch(coachnum)
		{
			case 1: System.out.println("choose the coach....1.AC 2.SLEEPER 3.GENERAL");
			int choice=scan.nextInt();
			switch(choice)
			    {
					case 1: ac.setcoachName("AC");
							ac.setcoachFare(500);
							System.out.println("AC coach has been set");
							break;
							
					case 2: sleeper.setcoachName("SLEEPER");
							sleeper.setcoachFare(450);
							System.out.println("SLEEPER coach has been set");
							break;
							
					case 3: general.setcoachName("GENERAL");
							general.setcoachFare(180);
							System.out.println("GENERAL coach has been set");
							break;
					
					default:System.out.println("INVALID CHOICE");
					break;
				}
				break;
				
			case 2: ac.setcoachName("AC");
					sleeper.setcoachName("SLEEPER");
					general.setcoachName("GENERAL");
					ac.setcoachFare(580);
					sleeper.setcoachFare(430);
					general.setcoachFare(180);
					
					System.out.println("3 coaches has been set");
			break;
			
			default: System.out.println("INVALID CHOICE!!");
			break;
			
		}			
	}
	
	public void seecoachNum()
	{
		System.out.println("The coaches available in the train are::");
		if(coachnum==1)
		{
			if(choice==1)
			{
				System.out.println("AC");
			}
			if(choice==2)
			{
				System.out.println("SLEEPER");
			}
			if(choice==3)
			{
				System.out.println("GENERAL");
			}
		}
		if(coachnum==2)
		{
			System.out.println("AC");
			System.out.println("SLEEPER");
			System.out.println("GENERAL");
		}
		
	}
	
	
}
