package com.lxisoft.metrov2.metro.station.train.coach;

import com.lxisoft.metrov2.metro.station.train.coach.Coach;
import com.lxisoft.metrov2.metro.station.train.coach.Ac;
import com.lxisoft.metrov2.metro.station.train.coach.Sleeper;
import com.lxisoft.metrov2.metro.station.train.coach.General;
import java.util.*;

public class CoachDetails
{
	Ac ac = new Ac():
	Sleeper sleeper = new Sleeper();
	General general = new General();
	Coach coach = new Coach();
	Scanner scan = new Scanner();
	
	public void coachDetail()
	{

		System.out.println("Choose the coach--->> \n1.AC coach \n2.SLEEPER coach \n3.GENERAL");
		int choice = scan.nextInt();
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
			
			
			default: System.out.println("choice is invalid");
			break;
			
		}
	
	}
	
}