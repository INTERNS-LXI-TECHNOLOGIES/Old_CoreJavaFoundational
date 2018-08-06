package com.lxisoft.metrov2.admin;
import com.lxisoft.metrov2.metro.Metro;
import com.lxisoft.metrov2.station.Station;
public class Admin
{
	Metro currentStation=new Metro();
	Station trainNames=new Station();
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

}	
		