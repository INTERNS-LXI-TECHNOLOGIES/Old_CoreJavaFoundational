import java.util.Scanner;
public class Metro
{
String name;
	
Scanner scan=new Scanner(System.in);

Platform platform=new Platform();



	public void setMetroDetails()
		{
			
		 System.out.println("enter the name of the metro");
		 name=scan.next();
	     platform.setPlatformDetails();
		}
		
	public void reservation()
	{
		int t1;
	       //passanger.setPassangerDetails();
		  //passanger.printDetails();
		  System.out.println("how many tickets do you want");
	      platform.train.compartment.seat.passanger.t1=scan.nextInt();
				   
	      System.out.println("enter the name of the passenger");
		  platform.train.compartment.seat.passanger.name=scan.next();
		  
		  System.out.println("enter the age of the passenger");
	      platform.train.compartment.seat.passanger.age=scan.nextInt();
		  
		  System.out.println("enter the gender of passenger");
		  platform.train.compartment.seat.passanger.gender=scan.next();
		  
		  System.out.println("enter the mobile number of the passanger");
		  platform.train.compartment.seat.passanger.mobileNumber=scan.nextInt();
		 //int x = platform.train.compartment.seat.passanger.ticket.destination
		  
		  System.out.println("please enter your destination");
	      platform.train.compartment.seat.passanger.ticket.destination=scan.next();
		
        System.out.println("enter  passenger  transaction ID in 10 digit number");   
		platform.train.compartment.seat.passanger.ticket.transactionID=scan.nextInt();
		
		System.out.println("enter the passenger PNR Number in 10 digit");
		platform.train.compartment.seat.passanger.ticket.pnrNumber=scan.nextInt();

		System.out.println("enter the date of journey");
		platform.train.compartment.seat.passanger.ticket.dateOfJourney=scan.next();
		
		System.out.println("enter the date of booking in passenger");
		platform.train.compartment.seat.passanger.ticket.dateOfBooking=scan.next();
        
		System.out.println("                           \nchoose any one\n-----------------\navailable quotas\n--------------");
		System.out.println("1)general quota\n2)tatkal quota\n3)premium tatkal quota\n4)ladies quota\n5)lower birth quota");
		platform.train.compartment.seat.passanger.ticket.quota=scan.nextInt();
		platform.train.compartment.seat.passanger.ticket.setTicketDetails();
		platform.train.compartment.seat.passanger.printDetails();
	
	}
	
	
	 public void printDetails()
	 {
		 System.out.println("                                          ");
		 System.out.println("ALL TRAIN START RUNNING FROM KOCHI METRO");
		 System.out.println("WELCOME TO KOCHI METRO E-Ticketing service");
		 System.out.println("***********");
		 System.out.println("ADMIN PART");
		 System.out.println("***********");
		 System.out.println("name of the metro="+name);
	     platform.printDetails();
		 
	 }
	 
	 
		
}