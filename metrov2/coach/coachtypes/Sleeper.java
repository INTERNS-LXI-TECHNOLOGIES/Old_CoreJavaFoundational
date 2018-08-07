package com.lxisoft.metrov2.coach.coachtypes;
import com.lxisoft.metrov2.coach.Coach;
import java.util.*;
 public class Sleeper
 {
 	private int sleeperFare;
 	Scanner fareOfSleeper=new Scanner(System.in);

 	public void assignSleeperFare()
 	{
 		sleeperFare=fareOfSleeper.nextInt();
 	}

 	public void setSleeperFare(int sleeperFare)
 	{
 		this.sleeperFare=sleeperFare;
 	}

 	public int getSleeperFare()
 	{
 		return sleeperFare;
 	}

 }