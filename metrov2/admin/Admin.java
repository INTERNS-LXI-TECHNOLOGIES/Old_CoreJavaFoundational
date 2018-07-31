package com.lxisoft.metrov2.admin;
import com.lxisoft.metrov2.metro.Metro;
import com.lxisoft.metrov2.metro.station.Station;
import com.lxisoft.metrov2.metro.station.train.Train;
import com.lxisoft.metrov2.metro.station.train.coach.Ac.Ac;
import com.lxisoft.metrov2.metro.station.train.coach.General.General;
import com.lxisoft.metrov2.metro.station.train.coach.Sleeper.Sleeper;
import java.util.*;
public class Admin
{
Scanner scan=new Scanner(System.in);
private int adminpassword=123;
Metro metro;
Station station;
Train train;
public  void adminAccess()
{
	
System.out.println("Enter the password");
int password=scan.nextInt();
if(adminpassword==password)

	{
	System.out.println("Authorisation acheived");
	setMetro();
	setStation();
	setTrain();
	setCoach();
	}
else
	{
	System.out.println("Password not matched");
	}
}
public void setMetro()
{
	System.out.println("Set the name of Metro");
	String name=scan.next();
	metro.setmetroName(name);
}
public void setStation()
{
	System.out.println("Set the name of Station");
	String name=scan.next();
	station.setstationName(name);
}
public void setTrain()
{
	System.out.println("Set the name of Train");
	String name=scan.next();
	train.settrainName(name);
}

public void setCoach()
{
	System.out.println("Enter the no of coaches to be allocated to train(available coaches are Ac,Sleeper,General)");
	int coachno=scan.nextInt();
	
}


}