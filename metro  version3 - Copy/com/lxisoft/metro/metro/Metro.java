package com.lxisoft.metro.metro;
import com.lxisoft.metro.metro.Platform;

import java.util.Scanner;
public class Metro
{
Scanner scan=new Scanner(System.in);
//private Platform [] platform;
public Platform [] platform;
private String name;
               
		public void setName(String name)
		{
			this.name=name;
		}
		public String getName()
		{
			return name;
		}
		
		/*public void setPlatform(Platform [] platform)
		{
			this.platform=platform;
		}
		public Platform[] getPlatform()
		{
			return platform;
		}*/


public void MetroDetails()
		{
			System.out.println("enter the name of the metro");
			name=scan.next();
			System.out.println("how many platform ");
			int p=scan.nextInt();
            platform=new Platform[p];
			//setPlatform(new Platform[p]);
			for (int i=1;i<p;i++)
			{
				platform[i]=new Platform();
			  //platform[i]=new Platform();
					  if(i==1)
					  {
						  System.out.println("platform number 2");
						  System.out.println("the express way is the rout of thrissur");
				       }
					   else if(i==2)
					   {
						   System.out.println("platform number 3");
						   System.out.println("the express way is the rout of malappuram");
					   }
					   else if(i==3)
					   {
						   System.out.println("platform number 4");
						   System.out.println("the express way is the rout of kozhikode");
					   }
					   else if(i==4)
					   {
						   System.out.println("platform number 5");
						   System.out.println("the express way is the rout of kollam");
					   }
					   else if(i==5)
					   {
						   System.out.println("platform number 6");
						   System.out.println("the express way is the rout of ernakulam");
					   }
					   else
					   {
						   System.out.println("not fount");
					   }
			}
			
			//platform.PlatformDetails();
		}
			
public void reservation()
		{
			int t1;
			
		   platform.getTrain().getCompartment().getSeat().getPassanger().PassangerDetails();
			
			 System.out.println("enter  passenger  transaction ID in 10 digit number");   
			platform.getTrain().getCompartment().getSeat().getPassanger().getTicket().setTransactionID(scan.nextInt());
			
			System.out.println("enter the passenger PNR Number in 10 digit");
			
			platform.getTrain().getCompartment().getSeat().getPassanger().getTicket().setPnrNumber(scan.nextInt());

			System.out.println("enter the date of journey");
			
			platform.getTrain().getCompartment().getSeat().getPassanger().getTicket().setDateOfJourney(scan.next());
			
			System.out.println("enter the date of booking in passenger");
			
			platform.getTrain().getCompartment().getSeat().getPassanger().getTicket().setDateOfBooking(scan.next());
			
			System.out.println("                           \nchoose any one\n-----------------\navailable quotas\n--------------");
			System.out.println("1)general quota\n2)tatkal quota\n3)premium tatkal quota\n4)ladies quota\n5)lower birth quota");
			platform.getTrain().getCompartment().getSeat().getPassanger().getTicket().setQuota(scan.nextInt());
			platform.getTrain().getCompartment().getSeat().getPassanger().getTicket().ticketDetails();
			platform.getTrain().getCompartment().getSeat().getPassanger().printDetails();
		
		}
	
public void printDetails()
		{
			 System.out.println("                                          ");
			 System.out.println("ALL TRAIN START RUNNING FROM KOCHI METRO");
			 System.out.println("WELCOME TO KOCHI METRO E-Ticketing service");
			 System.out.println("***********");
			 System.out.println("ADMIN PART");
			 System.out.println("***********");
			 System.out.println("name of the metro="+getName());
			 platform.printDetails();
		}
	 
}