package com.lxisoft.metro.passanger;
import com.lxisoft.metro.ticket.Ticket;

import java.util.Scanner;
public class Passanger
{
Scanner scan=new Scanner(System.in);
private Ticket ticket;
	
private String name,gender;
private int mobileNumber,age,t1;
                     public void setTicket(Ticket ticket)
					 {
						 this.ticket=ticket;
					 }
                      public Ticket getTicket()	
					  {
						  return ticket;
					  }					  
				   public void setT1(int t1)
				   {
					  this.t1=t1;
				   }
				   public int getT1()
				   {
					  return t1;
				   }
					public void setName(String name)
					{
						this.name=name;
					}
					public String getName()
					{
						return name;
					}
					public void setGender(String gender)
					{
						this.gender=gender;
					}
					public String getGender()
					{
						return gender;
					}
					public void  setMobileNumber(int mobileNumber)
					{
						this.mobileNumber=mobileNumber;
					}
					public int getMobileNumber()
					{
						return mobileNumber;
					}
					public void setAge(int age)
					{
						this.age=age;
					}
					public int getAge()
					{
						return age;
					}

public void PassangerDetails()
		{
			setTicket(new Ticket());
		  System.out.println("how many tickets do you want");
	      setT1(scan.nextInt());
				   
	      System.out.println("enter the name of the passenger");
		  setName(scan.next());
		  
		  System.out.println("enter the age of the passenger");
	      setAge(scan.nextInt());
		  
		  System.out.println("enter the gender of passenger");
		  setGender(scan.next());
		  
		  System.out.println("enter the mobile number of the passanger");
		  setMobileNumber(scan.nextInt());
		 
		  
		  
				  ticket.ticketDetails();
	  }
 public void printDetails()
	  {   
		  System.out.println("*************");
		  System.out.println("USER DETAILS");
		  System.out.println("*************");
		  System.out.println("no of tickets="+getT1());
		  System.out.println("passanger name="+getName());
		 
		  System.out.println("age of the passanger"+getAge());
		  System.out.println("gender of the passanger"+getGender());
		  System.out.println("mobile number of the passanger"+getMobileNumber());
		  ticket.printDetails();
	 }	 
}