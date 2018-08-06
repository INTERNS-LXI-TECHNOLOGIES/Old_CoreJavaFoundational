package com.lxisoft.metrov2.coach.coachtypes;
import com.lxisoft.metrov2.coach.CoachDetails;
import com.lxisoft.metrov2.coach.Coach;
 public class Sleeper extends CoachDetails
 {
 	private int sleeperFare;
 	public void setSleeperFare(int sleeperFare)
 	{
 		this.sleeperFare=sleeperFare;
 	}

 	public void getSleeperFare()
 	{
 		return sleeperFare;
 	}

 }