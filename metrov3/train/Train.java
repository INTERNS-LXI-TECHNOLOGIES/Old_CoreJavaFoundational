package com.lxisoft.metrov3.train; 
import java.util.Scanner;
import java.util.ArrayList;
public class Train
{
private	String name;
private	String time;
private	int trainNo;
private ArrayList <Coach> coachs;
	Scanner scan=new Scanner(System.in);
public void setName(String name)
{
	this.name=name;
}
public String getName()
{
	return name;
}
public void setTime(String time)
{
	this.time=time;
}
public String getTime()
{
	return time;
}
public void setTrainNo(int trainNo)
{
	this.trainNo=trainNo;
}
public int getTrainNo()
{
	return trainNo;
}
public void setCoachs(ArrayList <Coach> coachs)
{
	this.coachs=coachs;
}
public ArrayList <Coach> getCoachs()
{
	return coachs;
}
	
		
	public void coachDetails()
	{
		setCoachs(new ArrayList <Coach>());
		for(int i=0;i<7;i++){
	    getCoachs().add (new Coach());
		}
	getCoachs().get(0).setType("AC First class");
	getCoachs().get(1).setType("AC 2-tier");
	getCoachs().get(2).setType("AC 3-tier");
	getCoachs().get(3).setType("First class");
	getCoachs().get(4).setType("AC chair car");
	getCoachs().get(5).setType("Sleeper");
	getCoachs().get(6).setType("Second class");

	}
public void selectCoach()
{
		
	/*for(int i=0;i<7;i++)
	{
		coachs[i]=new Coach();
	coachs[i].setSeats();
	
	}**/
	
	System.out.println("1.AC First class\n2.AC 2-tier\n3.AC 3-tier\n4.First class\n5.AC Chair car\n6.Sleeper\n7.Second class");
	int choice=scan.nextInt();
	switch(choice)
	{
		case 1:
		getCoachs().get(0).seatDetails();
		
		break;
		case 2:
		getCoachs().get(1).seatDetails();

		break;
		case 3:
		getCoachs().get(2).seatDetails();
		
		break;
		case 4:
		getCoachs().get(3).seatDetails();
		
		break;
		case 5:
		getCoachs().get(4).seatDetails();
		
		break;
		case 6:
		getCoachs().get(5).seatDetails();
		
		break;
		case 7:
		getCoachs().get(6).seatDetails();
		
		
		break;
	}
}
}

