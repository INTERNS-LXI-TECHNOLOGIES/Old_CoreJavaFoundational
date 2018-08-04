package com.lxisoft.metrov2.metro.station.train.coach;
import com.lxisoft.metrov2.metro.station.train.coach.Coach;
import com.lxisoft.metrov2.metro.station.train.coach.ac.Ac;
import com.lxisoft.metrov2.metro.station.train.coach.sleeper.Sleeper;
import com.lxisoft.metrov2.metro.station.train.coach.general.General;


public class CoachDetails
{
	Ac ac= new Ac();
	Sleeper sleeper =new Sleeper();
	General general= new General();
	Scanner sr=new Scanner(System.in);
	
	
	public void coach()
	{
		System.out.println("Choose the coach....\n1.Ac\n2.Sleeper\n3.General\n");
		int choice=sr.nextInt();
		
		switch(choice)
		{
			
			case 1: ac.settingAc();
					ac.getcoachName();
					ac.getcoachFare();
					break;
					
					
			case 2: sleeper.settingSleeper();
					sleeper.getcoachName();
					sleeper.getcoachFare();
					break;
					
					
			case 3: general.settingGeneral();
					general.getcoachName();
					general.getcoachFare();
					break;
					
			default:System.out.println("invalid choice");
			        break;
		}
	
	}
	
}
			
			
			
			
			
					
					
			
			
			
		
	
	