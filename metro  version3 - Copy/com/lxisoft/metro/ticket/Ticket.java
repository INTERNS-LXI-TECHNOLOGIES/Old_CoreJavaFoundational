package com.lxisoft.metro.ticket;

import java.util.Scanner;
public class Ticket
{
Scanner scan=new Scanner(System.in);
 
private int transactionID,pnrNumber,price;
private String dateOfJourney,dateOfBooking;
private String destination,passengerName;
private int quota;



           

				public void setTransactionID(int transactionID)
				{
					this.transactionID=transactionID;
				}
				public int getTransactionID()
				{
					return transactionID;
				}
				public void setPnrNumber(int pnrNumber)
				{
					this.pnrNumber=pnrNumber;
				}
				public int getPnrNumber()
				{
					return pnrNumber;
				}
				public void setQuota(int quota)
				{
					this.quota=quota;
				}
				public int getQuota()
				{
					return quota;
				}
				public void setPrice(int price)
				{
					this.price=price;
				}
				public int getPrice ()
				{
					return price;
				} 
				public void setDateOfJourney(String dateOfJourney)
				{
					this.dateOfJourney=dateOfJourney;
				}
				public String getDateOfJourney()
				{
					return dateOfJourney;
				}
				public void setDateOfBooking(String dateOfBooking)
				{
					this.dateOfBooking=dateOfBooking;
				}
				public String getDateOfBooking()
				{
					return dateOfBooking;
				}
				public void setDestination(String destination)
				{
					this.destination=destination;
				}
				public String getDestination()
				{
					return destination;
				}

	
	public void ticketDetails()
	{
	
	switch(quota)
		{
		 case 1:setPrice(10000);break;
		 case 2:setPrice(21340);break;
		 case 3:setPrice(4323);break;
		 case 4:setPrice(43243);break;
		 case 5:setPrice(52343);break;		 
		}
	}   


      public void printDetails()
		{
		
			System.out.println("transaction ID="+getTransactionID());
			System.out.println("PNR number="+getPnrNumber());
			System.out.println("Date of journey="+getDateOfJourney());
			System.out.println("Date of booking="+getDateOfBooking());
			System.out.println("destination of the passanger="+getDestination());
		     System.out.println("price of the quota="+getPrice());
		}

}