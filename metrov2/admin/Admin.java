package com.lxisoft.metrov2.admin;
import com.lxisoft.metrov2.metro.Metro;
import com.lxisoft.metrov2.station.Station;
import com.lxisoft.metrov2.train.Train;
import com.lxisoft.metrov2.coach.coachtypes.Ac;
import com.lxisoft.metrov2.coach.coachtypes.Sleeper;
import com.lxisoft.metrov2.coach.coachtypes.General;
import com.lxisoft.metrov2.coach.Coach;
public class Admin
{
	Metro currentStation=new Metro();
	Station trainNames=new Station();
	Train coachTypes=new Train();
	Coach fare=new Coach();
	public void selectStation()
	{
		currentStation.viewStations();
		currentStation.chooseStation();
	}

	public void setTrainNames()
	{	
		trainNames.enterTrainName();
		trainNames.getTrainName();
	}

	public void viewCoach()
	{
		coachTypes.viewCoaches();
	}

	public void coachFares()
	{
		fare.switchCoach();
	}

}	
		