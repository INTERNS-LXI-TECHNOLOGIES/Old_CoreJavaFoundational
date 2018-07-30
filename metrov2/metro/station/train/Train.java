package com.lxisoft.metrov2.metro.station.train;

import com.lxisoft.metrov2.metro.station.train.coach.Coach;
public class Train
{
	Coach coach = new Coach();
	public void takeTrain()
	{
		
		coach.selectCoach();
	}
}