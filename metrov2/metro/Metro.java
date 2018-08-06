package com.lxisoft.metrov2.metro;
import java.util.*;
public class Metro
{
	Scanner boardPoint=new Scanner(System.in);
	private int chooseStation;
	private String boardingStation;
	private String station1="ALUVA";
	private String station2="EDAPALLY";
	private String station3="VYTILA";
	
	public void viewStations()
	{
		System.out.println("-----------------");
		System.out.println("  STATIONS");
		System.out.println("-----------------");
		System.out.println("1) ALUVA");
		System.out.println("2) EDAPALLY");
		System.out.println("3) VYTILA");
		System.out.println("-----------------");
	}

	public void chooseStation()
	{   
		chooseStation=boardPoint.nextInt();

		switch(chooseStation)
		{
			case 1:
				boardingStation=station1;
				System.out.println("Admin Station:"+boardingStation);
			break;

			case 2:
				boardingStation=station2;
				System.out.println("Admin Station:"+boardingStation);
			break;

			case 3:
				boardingStation=station3;
				System.out.println("Admin Station:"+boardingStation);
			break;

			default:
				System.out.println("Invalid choice");
			break;
		}
	}
}
		