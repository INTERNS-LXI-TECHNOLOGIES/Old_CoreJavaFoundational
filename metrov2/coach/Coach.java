package com.lxisoft.metrov2.coach;
import com.lxisoft.metrov2.station.Station;
import com.lxisoft.metrov2.train.Train;
import com.lxisoft.metrov2.coach.coachtypes.Ac;
import com.lxisoft.metrov2.coach.coachtypes.Sleeper;
import com.lxisoft.metrov2.coach.coachtypes.General;
import java.util.*;
public class Coach
{
	boolean coach=true;
	Scanner coachType=new Scanner(System.in);
	Ac setFareOfAc=new Ac();
	Sleeper setFareOfSleeper=new Sleeper();
	General setFareOfGeneral=new General();
	
	public void switchCoach()
	{
		System.out.println("Set the fares for each coaches");
		if(coach==true)
		{		
				System.out.println("AC coach fare");
				setFareOfAc.assignAcFare();

				System.out.println("Sleeper coach fare");
				setFareOfSleeper.assignSleeperFare();

				System.out.println("General coach fare");
				setFareOfGeneral.assignGeneralFare();
		}
	}

}