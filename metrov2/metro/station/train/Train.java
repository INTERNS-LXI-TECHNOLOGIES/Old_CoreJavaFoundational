package com.lxisoft.metrov2.metro.station.train;
import com.lxisoft.metrov2.metro.station.train.coach.CoachDetails;
public class Train
{
	CoachDetails coachDetails=new CoachDetails();
public void showTrain()
{
	System.out.println("\n \nWELCOME TO TRAIN");

coachDetails.showCoachDetails();
}
}