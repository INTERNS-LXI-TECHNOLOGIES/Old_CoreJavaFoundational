package com.lxisoft.program;
import java.util.*;

public class RemainingSeats
{
	private int acSeat,generalSeat,SleeperSeat;
	//AcCoach ac=new AcCoach();
	//General gen=new General();
	//Sleeper sl=new Sleeper();
	private int compartment;
	private int total;

	public void printDetails(Coach c)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Which compartment do want to check seat availability?\n1.AC\n2.General\n3.Sleeper");
		compartment=in.nextInt();
		switch(compartment)
		{
			case 1:
				total=c.getAc().getAcSeats();
				System.out.println("Remaining seats in Ac compartment="+total);
				break;
			case 2:
				total=c.getGeneral().getGeneralSeats();
				System.out.println("Remaining seats in General compartment="+total);
				break;
			case 3:
				total=c.getSleeper().getSleeperSeats();
				System.out.println("Remaining seats in Sleeper compartment="+total);
				break;
			default:
				System.out.println("Invalid choice");
		}
	}
}