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
public int coachno;
public int choice,choice1;
Scanner scan=new Scanner(System.in);
private int adminpassword=123;
public Metro metro=new Metro();
public Station station=new Station();
public Train train=new Train();
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
public void getMetro()
{
	String j=metro.getmetroName();
	System.out.println(j);
}

public void setStation()
{
	System.out.println("Set the name of Station");
	String name=scan.next();
	
	station.setstationName(name);
}

public void getStation()
{
String j=station.getstationName();
System.out.println(j);
}
public void setTrain()
{
	System.out.println("Set the name of Train");
	String name=scan.next();
	train.settrainName(name);
}
public void getTrain()
{
String j=train.gettrainName();
System.out.println(j);
}


public void setCoach()
{
	System.out.println("Enter the no of coaches to be allocated to train(available coaches are Ac,Sleeper,General)");
	 coachno=scan.nextInt();
	
	
	 Ac ac=new Ac();
	 General general=new General();
	 Sleeper sleeper=new Sleeper();
	
	
    switch(coachno)
{
     case 1: 
	 System.out.println("choose the coach---- 1-AC,2Sleeper,3-General");
	
	 choice=scan.nextInt();
	 
    switch(choice)
	{
     case 1: ac.setcoachName("Ac");
	        System.out.println("Ac coach has been assigned");
	 	break;
	 
	 case 2:sleeper.setcoachName("Sleeper");
	        System.out.println("Sleeper coach has been assigned");	 
	 break;
	 
	 case 3:general.setcoachName("General");
	        System.out.println("General coach has been assigned");	 
	 break;
	 default:System.out.println("invalid choice");
		     break;
	}
	 break;
	 
	 
	 case 2:System.out.println("choose the coach combination---- 1-AC&General,2-General&Sleeper,3-Sleeper&Ac");
	 choice1=scan.nextInt();
    switch(choice1)
	{
     case 1: ac.setcoachName("Ac");
		     general.setcoachName("General");
	        System.out.println("Ac&General coach has been assigned");
	 	break;
	 
	 case 2:sleeper.setcoachName("Sleeper");
		    general.setcoachName("General");
	        System.out.println("Sleeper&General coach has been assigned");	 
	 break;
	 
	 case 3:ac.setcoachName("Ac");
	        sleeper.setcoachName("Sleeper");
	        System.out.println("Ac&Sleeper coach has been assigned");	 
	 break;
	 default:System.out.println("invalid choice");
		     break;
	}	
	 break;
	 case 3:ac.setcoachName("Ac");
			sleeper.setcoachName("Sleeper");
			general.setcoachName("General");
			System.out.println("All the three coaches has been assigned");	
	 break;
	 default:System.out.println("invalid choice");
		     break;
}
}
public void getnoofCoach()
	{
	System.out.println("Totally"+coachno+"coaches has assigned");
	 System.out.println("Available coaches are listed below");
     if(coachno==1)
	 {   if(choice==1)
		 { System.out.println("Ac ");
		 }
		 if(choice==2)
		 { System.out.println("Sleeper");
		 }
		 if(choice==3)
		 { System.out.println("General");
		 }
	 }
	 if(coachno==2)
	 {  if(choice1==1)
		 { System.out.println("Ac ");
			System.out.println("General");
		 }
		 if(choice1==2)
		 { 
		System.out.println("General");
		System.out.println("Sleeper");
		 }
		 if(choice1==3)
		 {
			System.out.println("Ac"); 
			System.out.println("Sleeper");
		 }
		 
	 }
	 if(coachno==3)
		 {
			System.out.println("Ac"); 
			System.out.println("General");
			System.out.println("Sleeper");
		 }
		 
	
	}

}