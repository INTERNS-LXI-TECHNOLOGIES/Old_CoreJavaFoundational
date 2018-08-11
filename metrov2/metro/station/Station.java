package com.lxisoft.metrov2.metro.station;
import com.lxisoft.metrov2.metro.station.train.*;
public class Station
{
	Train train=new Train();
	public void showStation()
	{
		System.out.println("\n \nWELCOME TO STATION");
		train.showTrain();
		
		
	}


}