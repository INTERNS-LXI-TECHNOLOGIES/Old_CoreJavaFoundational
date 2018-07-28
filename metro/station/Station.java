package com.lxisoft.metro.station;
import com.lxisoft.metro.station.train.Train;
import com.lxisoft.metro.datetime.CurrentDateTimeExample1;
import com.lxisoft.metro.passenger.Passenger;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  
import java.util.*;
import java.util.Scanner;
public class Station
{    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); 
    CurrentDateTimeExample1 ct=new CurrentDateTimeExample1();
     ArrayList<Train> trains=new ArrayList<Train>();
	   ArrayList<LocalDateTime> times=new ArrayList<LocalDateTime>();
	 Scanner sc=new Scanner(System.in);
  public void train()
  {
     		 
	trains.add(new Train());
	trains.add(new Train());
	trains.add(new Train());
	
	 System.out.println("choose the train 1-trivandrum,2-coimbatore,3-kozhikode");
	 int ch=sc.nextInt();
	 while(ch==1)
	 {
		   ArrayList<Passenger> passengers=new ArrayList<Passenger>();
		    System.out.println("Enter the no of passenger");
	 int passengerno=sc.nextInt();
	 for(int i=0;i<passengerno;i++)
	 {
     passengers.add(new Passenger());
	 
	 
	 }
     trains.get(0).coach();
	  for(int i=0;i<passengerno;i++)
	 {
	 passengers.get(i).details();
	  LocalDateTime l=ct.dateTime();
	 
	  times.add(l);
	 }
	  for(int i=0;i<passengerno;i++)
		  
	 {
		
      System.out.println("\t\t"+dtf.format(times.get(i)));
	 System.out.println("Passenger no="+i);
	 passengers.get(i).ticket();
	 System.out.println("\t\tRoute=\tTrivandrum");
	 
	 System.out.println("\t\tHappy journey");
	 System.out.println("!!!!--------Thanks for Booking------!!!!");
	 }
	
	 ch=0;
	 }
     while(ch==2)
	 {
     ArrayList<Passenger> passengers=new ArrayList<Passenger>();
		    System.out.println("Enter the no of passenger");
	 int passengerno=sc.nextInt();
	 for(int i=0;i<passengerno;i++)
	 {
     passengers.add(new Passenger());
	 }
     trains.get(1).coach();
	  for(int i=0;i<passengerno;i++)
	 {
	 passengers.get(i).details();
	   LocalDateTime l=ct.dateTime();
	 
	  times.add(l);
	 }
	  for(int i=0;i<passengerno;i++)
	 {
	  System.out.println("\t\t"+dtf.format(times.get(i)));
	 System.out.println("Passenger no="+i);
	 passengers.get(i).ticket();
	 System.out.println("\t\tRoute=\tcoimbatore");
	 System.out.println("\t\tHappy journey");
	 System.out.println("!!!!--------Thanks for Booking------!!!!");
	 }
	 ch=0;
	 }
	 while(ch==3)
	 {
		  ArrayList<Passenger> passengers=new ArrayList<Passenger>();
		    System.out.println("Enter the no of passenger");
	 int passengerno=sc.nextInt();
	 for(int i=0;i<passengerno;i++)
	 {
     passengers.add(new Passenger());
	 }
     trains.get(2).coach();
	  for(int i=0;i<passengerno;i++)
	 {
	 passengers.get(i).details();
	  
	  LocalDateTime l=ct.dateTime();
	 
	  times.add(l);
	 }
	  for(int i=0;i<passengerno;i++)
	 {
      System.out.println("\t\t"+dtf.format(times.get(i)));
	 System.out.println("Passenger no="+i);
	 passengers.get(i).ticket();
	 System.out.println("\t\tRoute=\tkozhicode");
	 System.out.println("\t\tHappy journey");
	 System.out.println("!!!!--------Thanks for Booking------!!!!");
	 }
    
	 ch=0;
	 }
	 
  }

}










