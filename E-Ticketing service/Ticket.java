import java.util.Scanner;
  public class Ticket

{
String transactionID,pnrNumber,trainNumber,dateOfJourney,dateOfBooking;
String trainName,from,to,distance,clas;

Scanner scan=new Scanner(System.in);


   public void reservation()
   {
	  
	       
	        System.out.println("enter  passenger  transaction ID in 10 digit number");   
			transactionID=scan.next();
			System.out.println("enter the passenger PNR Number in 10 digit");
			pnrNumber=scan.next();

			System.out.println("enter the date of journey");
			dateOfJourney=scan.next();
			System.out.println("enter the distance");
			distance=scan.next();
			System.out.println("enter the date of booking in passenger");
			dateOfBooking=scan.next();

			
			
	
	   int x;
		System.out.println("choose your option 1,2,3,4 /n 1=ac,2=2a,3=fc,4=3a");
		x=scan.nextInt();
		
		switch(x)
		{
		case 1:clas="First AC Sleeper";printDetails();break;
			
		case 2:clas="Second AC Sleeper";printDetails();break;
		    
		case 3:clas="First class Non-AC";printDetails();break;
		
		case 4:clas="Three-tier AC Sleeper";printDetails();break;
		
		default:System.out.println("invalide");
		}	
		
   }
   
  
   public void printDetails()
   {
	       System.out.println("                       ");
	       System.out.println("                       ");
	       System.out.println("PASSENGER BOOKING DETAILS");
		   System.out.println("****************************");
		   System.out.println("TransactionID="+transactionID);
		   System.out.println("____________________");
		   System.out.println("PNR number="+pnrNumber);
		   System.out.println("____________________");
           System.out.println("Date of journey="+dateOfJourney);
		   System.out.println("____________________");
		   System.out.println("Distence="+distance);
		   System.out.println("____________________");
		   System.out.println("Date of booking="+dateOfBooking);
           System.out.println("class="+clas);
		   
		   
   }
   public void test()
   {
	   System.out.println("testing");
   }

}