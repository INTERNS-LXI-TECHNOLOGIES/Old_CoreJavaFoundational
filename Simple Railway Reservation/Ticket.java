import java.util.Scanner;
public class Ticket
{
	
	int transactionId;
	String pnrNo;
	int trainNo;
	String trainName;
	int distance;
	String coachNo;
	int seatNo;
	String berth;
	int scheduledDeparture;
	float totalFare;
	String status;
	
	String classType;
	String doj;
	String dob;
	String quota;
	
	String from;
	String to;
	
	Scanner scan=new Scanner(System.in);
	
public void setDetails()
	{
	    System.out.print("Transaction Id:");
		transactionId=scan.nextInt();
		System.out.println("Pnr No :");
		pnrNo=scan.next();
		System.out.print("Train No:");
		trainNo=scan.nextInt();
		System.out.print("Train Name:");
		trainName=scan.next();
		System.out.println("Distance:");
		distance=scan.nextInt();
		
		setCoachNoSeatNoAndBerthType();
		
		System.out.print("Scheduled Departure:");
		scheduledDeparture=scan.nextInt();
		System.out.print("Total Fare:");
		totalFare=scan.nextFloat();
		System.out.print("Status:");
		status=scan.next();
	}
	
public void setCoachNoSeatNoAndBerthType()
	{
		System.out.print("Coach No:");
		coachNo=scan.next();
		System.out.print("Seat No:");
		seatNo=scan.nextInt();
		if(seatNo>0 && seatNo<73)
		{
			if(seatNo % 8==1 || seatNo % 8==4)
			{
				berth="LB";
			}
			else if(seatNo % 8==2 || seatNo % 8==5)
			{
				berth="MB";
			}
			else if(seatNo % 8==3 || seatNo % 8==6)
			{
				berth="UB";
			}
			else if(seatNo % 8==7)
			{
				berth="SL";
			}
			else
			{
				berth="SU";
			}
		}
	}

public void printCoachNoSeatNoAndBerthType()
    {
		System.out.println("Coach No:"+coachNo);
		System.out.println("Seat No:"+seatNo);
		System.out.println("Berth:"+berth);
	}

public void setBookingDetails()

	{
		int n;
		int m;
	    
		do{
		
		System.out.println("AVAILABLE CLASSES");
		System.out.println("_____________________");
		System.out.println("1.First AC Sleeper");
		System.out.println("2.Second AC Sleeper");
		System.out.println("3.First Class Non-AC");
		System.out.println("4.AC Sleeper Economy");
		System.out.println("5.Sleeper Class Non-AC");
		System.out.println("                      ");
		System.out.print("Please choose your class type :");
		n=scan.nextInt();
		
	    switch(n)
		{
			case 1:classType="First AC Sleeper";
			break;
			case 2:classType="Second AC Sleeper";
			break;
			case 3:classType="First Class Non-AC";
			break;
			case 4:classType="AC Sleeper Economy";
			break;
			case 5:classType="Sleeper Class Non-AC";
			break;
			default:System.out.println("Invalid choice made...!!!");
			System.out.println("please try again....!!!");			
		}
		
		
		}while(n>5);
		
		System.out.print("Date Of Journey:");
		doj=scan.next();
		System.out.print("Date Of Booking:");
		dob=scan.next();
		do{
		
		System.out.println("AVAILABLE QUOTAS");
		System.out.println("________________");
		System.out.println("1.General Quota");
		System.out.println("2.Tatkal Quata");
		System.out.println("3.Premium Tatkal Quata");
		System.out.println("4.Ladies Quata");
		System.out.println("5.Lower Berth Quota");
		System.out.println("                  ");
		System.out.print("Please choose your quota:");
		 m=scan.nextInt();
		
		switch(m)
		{
			case 1:quota="General Quota";
			break;
			case 2:quota="Tatkal Quata";
			break; 
			case 3:quota="Premium Tatkal Quata";
			break;
			case 4:quota="Ladies Quata";
			break;
			case 5:quota="Lower Berth Quota";
			break;
			default:System.out.println("Invalid choice made...!!!");
			System.out.println("please try again...!!!");
		    
			
		}
		
		
		}while(m>5);
		
		System.out.print("From:");
		from=scan.next();
		System.out.print("To:");
		to=scan.next();
		
	}
public void printBookingDetails()
   {
	  System.out.println("IRCTCs E-TICKETING SERVICE");
	  System.out.println("Electronic Reservation Slip");
	  System.out.println("                           ");
	  System.out.println("JOURNEY DETAILS");
	  System.out.println("_______________");
	  System.out.println("Transaction ID:"+transactionId);
	  System.out.println("PNR No:"+pnrNo);
	  System.out.println("Train No. & Name:"+trainNo+"/"+trainName+" Exp");
	 
	 System.out.println("Class:"+classType);
	 System.out.println("Date of Journey:"+doj);
	 System.out.println("Date of Booking:"+dob);
	 System.out.println("Quata:"+quota);
	 System.out.println("From:"+from);
	 System.out.println("To:"+to);
	 
	 System.out.println("Distance:"+distance+"Km");
	 System.out.println("Scheduled Departure:"+scheduledDeparture);
	 System.out.println("Total Fare:"+"RS."+totalFare);
	 System.out.println("                           ");
	 
			   
	  
   }
public void printCurrentStatus()
{
System.out.println("Booking Status/Current Status:"+status);
}	
}
	