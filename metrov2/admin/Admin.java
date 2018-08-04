package com.lxisoft.metrov2.admin;
import com.lxisoft.metrov2.metro.Metro;
import com.lxisoft.metrov2.metro.station.Station;
import com.lxisoft.metrov2.metro.station.train.Train;
import com.lxisoft.metrov2.metro.station.train.coach.ac.Ac;
import com.lxisoft.metrov2.metro.station.train.coach.sleeper.Sleeper;
import com.lxisoft.metrov2.metro.station.train.coach.ac.Ac;
import com.lxisoft.metrov2.metro.station.train.coach.general.General;
import java.util.*;

	public class Admin
	{
		public int coachno;
		public int choice,choicee;
		Scanner scan=new Scanner(System.in);
		private int adminpassword=0000;
		Metro metro=new Metro();
		Station station=new Station();
		Train train=new Train();
		
		public void adminAccess()
		{
			System.out.println("Enter the password");
			int password=scan.nextInt();
			if (adminpassword==password)
			{
				System.out.println("admin access achieved");
				setMetro();
				setStation();
				setTrain();
				setCoach();
				
				System.out.println(metro.getmetroName());
				System.out.println(station.getstationName());
				System.out.println(train.gettrainName());
				System.out.println("passenger can book ticket");
			}
			
			else
			{
				
				System.out.println("password invalid:");
			}
		}
		
		public void setMetro()
		{
			System.out.println("set metro name");
			String name=scan.nextLine();
			metro.setmetroName(name);
		}
		
		
		public void getMetro()
		{
			System.out.println(metro.getmetroName());
		}
	
			
			
		
		
				
				
				
				
				
				
				
			
			
			
		



	}
