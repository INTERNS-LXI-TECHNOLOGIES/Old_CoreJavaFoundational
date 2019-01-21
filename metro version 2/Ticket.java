import java.util.Scanner;
public class Ticket

{
 
int transactionID,pnrNumber,price,quota;
String dateOfJourney,dateOfBooking;
String destination,passengerName;

Scanner scan=new Scanner(System.in);

		public void setTicketDetails()
		{
		
		switch(quota)
		{
		 case 1:price=10000;break;
         case 2:price=21340;break;
         case 3:price=4323;break;
         case 4:price=43243;break;
         case 5:price=52343;break;		 
			
		}
		}   


        public void printDetails()
		{
		
			System.out.println("transaction ID="+transactionID);
			System.out.println("PNR number="+pnrNumber);
			System.out.println("Date of journey="+dateOfJourney);
			System.out.println("Date of booking="+dateOfBooking);
			System.out.println("destination of the passanger="+destination);
		     System.out.println("price of the quota="+price);
		}

}