package com.lxisoft.metrov2.admin;
import com.lxisoft.metrov2.metro.Metro;
import com.lxisoft.metrov2.metro.station.Station;
import com.lxisoft.metrov2.metro.station.train.Train;
import com.lxisoft.metrov2.metro.station.train.coach.Ac.Ac;
import com.lxisoft.metrov2.metro.station.train.coach.General.General;
import com.lxisoft.metrov2.metro.station.train.coach.Sleeper.Sleeper;
import com.lxisoft.metrov2.metro.station.ticketcounter.TicketCounter;
import java.util.*;
public class Admin
{
	public int coachno;
	public int choice,choice1;
	public String adminStation;
	public String station1="ALUVA";
	public String station2="EDAPALLY";
	public String station3="KALOOR";
	Scanner scan=new Scanner(System.in);
	public Metro metro=new Metro();
	public Station station=new Station();
	public Train train=new Train();
	public Ac ac=new Ac();
	public General general=new General();
	public Sleeper sleeper=new Sleeper();
	public void adminSettings()
	{
		setMetro();
		setStation();
		setTrain();
		setCoach();
		System.out.println("-------------------- ! Metro Administration successful ! Ready to book Tickets ! --------------------\n");
	}
	public void setMetro()
	{
		System.out.println("Set the name of Metro");
		String name=scan.next();
		metro.setmetroName(name);

	}
	public String getMetro()
	{
		return metro.getmetroName();
	}

	public void setStation()
	{
		System.out.println("1) ALUVA");
		System.out.println("2) EDAPALLY");
		System.out.println("3) KALOOR");
		System.out.println("Select Admin Station: ");
		int chooseStation=scan.nextInt();

		switch(chooseStation)
		{
			case 1:
				adminStation=station1;
			break;

			case 2:
				adminStation=station2;
			break;

			case 3:
				adminStation=station3;
			break;

			default:
				System.out.println("INVALID CHOICE");

			break;
		}

		station.setstationName(adminStation);
	}

	public String getStation()
	{

		return station.getstationName();
	}

	public void displayStationName()
	{
		station.displayStation();
	}
	public void setTrain()
	{
		System.out.println("Set the name of Train");
		String name=scan.next();
		train.settrainName(name);
	}
	public String  getTrain()
	{

		return train.gettrainName();
	}


	public void setCoach()
	{
		System.out.println("---------------------Available coaches (3 Nos.)-------------------\n\n\t* AC\n\t* SLEEPER\n\t* GENERAL");
		System.out.println("\nEnter the number of coaches to be allocated for train: ");
		 coachno=scan.nextInt();

		
	    switch(coachno)
		{
	    	case 1: 

		     System.out.println("\n\t1)AC\n\t2)Sleeper\n\t3)General");
			 System.out.println("Select the coach(s) to be assigned: ");
			 choice=scan.nextInt();
		
		 
		    switch(choice)
			{
		     case 1: ac.setcoachName("Ac");
					ac.setcoachPrice(1000);
			        System.out.println("Assigned Coach: AC");
			 break;
			 
			 case 2:sleeper.setcoachName("Sleeper");
					sleeper.setcoachPrice(500);
			        System.out.println("Assigned Coach: SLEEPER");	 
			 break;
			 
			 case 3:general.setcoachName("General");
					general.setcoachPrice(100);
			        System.out.println("Assigned Coach: GENERAL");	 
			 break;

			 default:System.out.println("! INVALID CHOICE !");
			break;
			}
	 	break;
	 
	 
	 case 2:
	 	System.out.println("\n\t1)AC & GENERAL\n\t2)GENERAL & Sleeper\n\t3)SLEEPER & AC");
	 	System.out.println("Which 2 coaches have to be assigned ?");
		choice1=scan.nextInt();
		switch(choice1)
		{
		     case 1: ac.setcoachName("Ac");
				     general.setcoachName("General");
					 ac.setcoachPrice(1000);
					 general.setcoachPrice(100);
			        System.out.println("Assigned coahes: AC & GENERAL");
			 break;
			 
			 case 2:sleeper.setcoachName("Sleeper");
				    general.setcoachName("General");
					sleeper.setcoachPrice(500);
					general.setcoachPrice(100);
			        System.out.println("Assigned coaches: SLEEPER & GENERAL");	 
			 break;
			 
			 case 3:ac.setcoachName("Ac");
			        sleeper.setcoachName("Sleeper");
					ac.setcoachPrice(1000);
					sleeper.setcoachPrice(250);
			        System.out.println("Assigned coahes: AC & SLEEPER");	 
			 break;

			 default:System.out.println("! INVALID CHOICE !");
			 break;
		}	
	   break;

		 case 3:
		 	ac.setcoachName("Ac");
			sleeper.setcoachName("Sleeper");
			general.setcoachName("General");
			ac.setcoachPrice(1000);
			sleeper.setcoachPrice(250);
			general.setcoachPrice(100);
			System.out.println("All 3 coaches are assigned");	
		 break;

		 default:System.out.println("! INVALID CHOICE !");
		 break;
	}
}
	public void getnoofCoach()
	{
	 System.out.println("\n-------------------Available coaches------------------\n");
     if(coachno==1)
	 {   if(choice==1)
		 { 
		 	System.out.println("\t\t--->AC");
		 }
		 if(choice==2)
		 { 
		 	System.out.println("\t\t--->SLEEPER");
		 }
		 if(choice==3)
		 { 
		 	System.out.println("\t\t--->GENERAL");
		 }
	 }
	 if(coachno==2)
	 { 
	  	if(choice1==1)
		 { 
		 	System.out.println("\t\t--->AC");
			System.out.println("\t\t--->GENERAL");
		 }
		 if(choice1==2)
		 { 
			System.out.println("\t\t--->GENERAL");
			System.out.println("\t\t--->SLEEPER");
		 }
		 if(choice1==3)
		 {
			System.out.println("\t\t--->AC"); 
			System.out.println("\t\t--->SLEEPER");
		 }
		 
	 }
	 if(coachno==3)
		 {
			System.out.println("\t\t--->AC"); 
			System.out.println("\t\t--->GENERAL");
			System.out.println("\t\t--->SLEEPER");
		 }
		 
	
	}

}