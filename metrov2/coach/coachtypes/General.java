package com.lxisoft.metrov2.coach.coachtypes;
import com.lxisoft.metrov2.coach.Coach;
import java.util.*;
 public class General
 {
 	private int generalFare;
 	Scanner fareOfGeneral=new Scanner(System.in);

 	public void assignGeneralFare()
 	{
 		generalFare=fareOfGeneral.nextInt();
 	}

 	public void setGeneralFare(int generalFare)
 	{
 		this.generalFare=generalFare;
 	}

 	public int getGeneralFare()
 	{
 		return generalFare;
 	}

 }