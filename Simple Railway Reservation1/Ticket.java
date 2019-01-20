import java.util.Scanner;
public class Ticket
{
int transactionId;
String pnrNo;
int distance;
int scheduledDeparture;
float totalFare;
String status;
String doj;
String dob;
String quota;	
String from;
String to;
	
Scanner scan=new Scanner(System.in);

Train train=new Train();
Coach coach=new Coach();
Seat seat=new Seat();

public void setDetails()
	{
	    System.out.print("Transaction Id:");
		transactionId=scan.nextInt();
		System.out.println("Pnr No :");
		pnrNo=scan.next();
		train.setTrainDetails();
		System.out.println("Distance:");
		distance=scan.nextInt();
	    coach.setCoachNo();
		seat.setSeatNoAndBerthType();
		System.out.print("Scheduled Departure:");
		scheduledDeparture=scan.nextInt();
		
		totalFare=coach.price+price;
		
		
		System.out.print("Status:");
		status=scan.next();
		
   }
   
   int price;
   
public void setBookingDetails()
	{
		int m;
		coach.setClassType();
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
			       price=100;
			       break;
			case 2:quota="Tatkal Quata";
			       price=135;
			       break; 
			case 3:quota="Premium Tatkal Quata";
			       price=140;
			       break;
			case 4:quota="Ladies Quata";
			       price=100;
			       break;
			case 5:quota="Lower Berth Quota";
			       price=110;
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
	  train.printTrainDetails();
	  coach.printClassType();
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

public void printCoachNoSeatNoAndBerthType()
     {
            coach.printCoachNo();
            seat.printSeatNoAndBerthType();			
    }
}	