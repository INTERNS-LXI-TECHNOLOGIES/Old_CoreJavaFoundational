package com.lxisoft.metrov2.coach.coachtypes;
import com.lxisoft.metrov2.coach.CoachDetails;
import com.lxisoft.metrov2.coach.Coach;
 public class General extends CoachDetails
 {
 	private int generalFare;
 	public void setGeneralFare(int generalFare)
 	{
 		this.generalFare=generalFare;
 	}

 	public void getGeneralFare()
 	{
 		return generalFare;
 	}

 }