package com.lxisoft.metro.station.train;

import com.lxisoft.metro.station.train.coach.Ac;
import com.lxisoft.metro.station.train.coach.General;
import com.lxisoft.metro.station.train.coach.Sleeper;
import com.lxisoft.metro.station.train.coach.Coach;
import java.util.Scanner;

public class Train
{
public void show()
{
	
	Coach c1=new Ac();
	Coach c2=new General();
	Coach c3=new Sleeper();
	
	Scanner scan=new Scanner(System.in);
	System.out.println("WHICH COACH DO YOU WANT? \n 1.AC \n 2.SLEEPER \n3.GENERAL");
	int choice=scan.nextInt();

switch(choice)
{
	case 1:
	c1.selectedCoach="AC COACH";
	c1.price=1000;
	System.out.println("YOU SELECTED "+c1.selectedCoach+ ": COST "  +c1.price);
	break;
	
	case 2:
    c2.selectedCoach="GENERAL COACH";
	c2.price=500;
	System.out.println("YOU SELECTED "+c2.selectedCoach+ ": COST "  +c2.price);
	break;
	
	case 3:
	
	c3.selectedCoach="SLEEPER CLASS";
	c3.price=250;
	System.out.println("YOU SELECTED "+c3.selectedCoach+ ": COST "  +c3.price);
	break;
	
	default:System.out.println("INVALID");
	
	
}

}
}