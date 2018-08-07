package com.lxisoft.metrov2.coach.coachtypes;
import com.lxisoft.metrov2.coach.Coach;
import java.util.*;
 public class Ac
 {
 	private int acFare;
 	Scanner fareOfAc=new Scanner(System.in);

 	public void assignAcFare()
 	{
 		acFare=fareOfAc.nextInt();
 	}
 	public void setAcFare(int acFare)
 	{
 		this.acFare=acFare;
 	}

 	public int getAcFare()
 	{
 		return acFare;
 	}

 }