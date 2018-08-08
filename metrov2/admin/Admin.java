package com.lxisoft.metrov2.admin;
import com.lxisoft.metrov2.metro.Metro;
import com.lxisoft.metrov2.metro.station.Station;
import com.lxisoft.metrov2.metro.station.train.Train;
import com.lxisoft.metrov2.metro.station.train.coach.Coach;
import com.lxisoft.metrov2.metro.station.train.coach.ac.Ac;
import com.lxisoft.metrov2.metro.station.train.coach.sleeper.Sleeper;
import com.lxisoft.metrov2.metro.station.train.coach.general.General;
import com.lxisoft.metrov2.metro.station.ticketcounter.TicketCounter;
import java.util.*;

	public class Admin
	{
		public int coachno;
		public int choice,choicee;
		Scanner scan=new Scanner(System.in);
		
		public Metro metro=new Metro();
		public Station station=new Station();
		public Train train=new Train();
		public Ac ac=new Ac();
		public Sleeper sleeper=new Sleeper();
		public General general=new General();
		
		public void adminAccess()
		{
			
			
				
			setMetro();
			setStation();
			setTrain();
			setCoach();
		    System.out.println("\tpassenger can book ticket");
		}
			
			
		
		public void setMetro()
		{
			System.out.println("set metro name");
			String name=scan.next();
			metro.setmetroName(name);
		}
		
		
		public String getMetro()
		{
			return metro.getmetroName();
		}
		
		public void setStation()
		{
			System.out.println("Set the name of Station");
			String name=scan.next();
	
			station.setstationName(name);
		}

		public String getStation()
		{

		return station.getstationName();
		}
	   
	   
	    public void setTrain()
		{
			System.out.println("set train name");
			String name=scan.next();
			train.settrainName(name);
		}
		
		public String getTrain()
		{
			return train.gettrainName();
		}
		
		public void setCoach()
		{
			System.out.println("Enter the number of coaches to be allocated to the train..the available coaches are \n1.ac\n2.sleeper\n3.general\n");
			coachno=scan.nextInt();
			
			switch(coachno)
			{
				case 1:
				System.out.println("which coaches do you want..\n1.ac\n2.sleeper\n3.general");
				choice=scan.nextInt();
				
				switch(choice)
				{
					case 1:ac.setcoachName("Ac");
					ac.setcoachFare(500);
					System.out.println("Ac coach has been assigned:");
					break;
					
					case 2:sleeper.setcoachName("Sleeper");
			        sleeper.setcoachFare(200);
	                System.out.println("Sleeper coach has been assigned");	 
					break;
	 
					case 3:general.setcoachName("General");
					general.setcoachFare(100);
					System.out.println("General coach has been assigned");	 
					break;
					default:System.out.println("invalid choice");
					break;
				}
				break;
				
				case 2:System.out.println("choose the coach combination---- 1-AC&General,2-General&Sleeper,3-Sleeper&Ac");
				choicee=scan.nextInt();
				switch(choicee)
				{
					case 1: ac.setcoachName("Ac");
							general.setcoachName("General");
							ac.setcoachFare(500);
							general.setcoachFare(100);
							System.out.println("Ac&General coach has been assigned");
							break;
	 
					case 2:sleeper.setcoachName("Sleeper");
							general.setcoachName("General");
							sleeper.setcoachFare(200);
							general.setcoachFare(100);
							System.out.println("Sleeper&General coach has been assigned");	 
							break;
	 
					case 3:ac.setcoachName("Ac");
						sleeper.setcoachName("Sleeper");
						ac.setcoachFare(500);
						sleeper.setcoachFare(200);
						System.out.println("Ac&Sleeper coach has been assigned");	 
						break;
						
						default:System.out.println("invalid choice");
						break;
				}
				break;
				
				case 3:ac.setcoachName("Ac");
						sleeper.setcoachName("Sleeper");
						general.setcoachName("General");
						ac.setcoachFare(500);
						sleeper.setcoachFare(200);
						general.setcoachFare(100);
						System.out.println("All the three coaches has been assigned");	
						break;
						default:System.out.println("invalid choice");
						break;
			}
		}
	
		
		
		public void getnoofCoach()
		{
			System.out.println("\tTotally "+coachno+" coaches has assigned");
			System.out.println("\tAvailable coaches are listed below");
			
			if(coachno==1)
			{   
				if(choice==1)
					{ 
						System.out.println("Ac ");
					}
					
				if(choice==2)
					{ 
						System.out.println("Sleeper");
					}
					
				if(choice==3)
					{ 
						System.out.println("General");
					}
			}
			
			if(coachno==2)
			{  
				if(choicee==1)
					{ 
					System.out.println("Ac ");
					System.out.println("General");
					}
				
				if(choicee==2)
				{ 
					System.out.println("General");
					System.out.println("Sleeper");
				}
				if(choicee==3)
				{
					System.out.println("Ac"); 
					System.out.println("Sleeper");
				}
		 
			}
			if(coachno==3)
			{
				System.out.println("Ac"); 
				System.out.println("General");
				System.out.println("Sleeper");
			}
		 
		}
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
				
				
				
				
				
					
					
					
	
			
			
			
			
		
		
				
				
				
				
				
				
				
			
			
			
		



	
