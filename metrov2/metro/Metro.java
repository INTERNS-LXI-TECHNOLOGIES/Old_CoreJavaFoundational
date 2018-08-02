package com.lxisoft.metrov2.metro;
import java.util.Scanner;
public class Metro
{
	Scanner bpt=new Scanner(System.in);
	Scanner dpt=new Scanner(System.in);

	public void station()
	{
		System.out.println("-----------------");
		System.out.println("	STATIONS");
		System.out.println("-----------------");
		System.out.println("1) ALUVA");
		System.out.println("2) EDAPALLY");
		System.out.println("3)VYTILA");
		System.out.println("-----------------");

	}
	
	public void boarding()
	{	
		System.out.println("Enter your boarding point:");
		int boardingpoint=bpt.nextInt();
		String boardingpoint1="ALUVA";
		String boardingpoint2="EDAPALLY";
		String boardingpoint3="VYTILA";
		switch(boardingpoint)
		{
			case 1:
				System.out.println("Boarding point selected as:"+boardingpoint1);
				break;
			case 2:
				System.out.println("Boarding point selected as:"+boardingpoint2);
				break;
			case 3:
				System.out.println("Boarding point selected as:"+boardingpoint3);	
				break;
			default: System.out.println("Invalid choice");		
		}
	}	

	public void destination()
	{
		System.out.println("Enter your destination point:");
		int destinationpoint=dpt.nextInt();
		String destinationpoint1="ALUVA";
		String destinationpoint2="EDAPALLY";
		String destinationpoint3="VYTILA";
		switch(destinationpoint)
		{
			case 1:
				System.out.println("Destination point selected as:"+destinationpoint1);
				break;
			case 2:
				System.out.println("Destination point selected as:"+destinationpoint2);
				break;
			case 3:
				System.out.println("Destination point selected as:"+destinationpoint3);
				break;	
			default: System.out.println("Invalid choice");		
		}
	}	

}