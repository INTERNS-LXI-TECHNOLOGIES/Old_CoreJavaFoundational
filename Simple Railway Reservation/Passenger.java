import java.util.Scanner;
public class Passenger
{

String name;
int age;
String gender;

Scanner scan=new Scanner(System.in);


Ticket ticket=new Ticket();



public void setPassengerDetails()
{

	System.out.print("Please enter your name:");
	name=scan.next();
	System.out.print("Enter your age:");
	age=scan.nextInt();
	System.out.print("Gender");
	System.out.println("______");
	System.out.println("1.Male");
	System.out.println("2.Female");
	System.out.print("Select gender:");
	int d=scan.nextInt();
	switch(d)
	{
	case 1:gender="Male";
	break;
	case 2:gender="Female";
	break;
	default:System.out.println("Invalid...!");
	break;
	}
	ticket.setBookingDetails();
	ticket.setDetails();
}
	
		
		
public void printDetails()
{
	ticket.printBookingDetails();
	System.out.println("PASSENGER DETAILS");
	System.out.println("_________________");
	System.out.println("Name:"+name);
	System.out.println("Age:"+age);
	System.out.println("Gender:"+gender);
	ticket.printCurrentStatus();
	ticket.printCoachNoSeatNoAndBerthType();
	System.out.println("                ");
	System.out.println("This ticket is non-refundable & non-transferable");
	System.out.println("                                         ");
	System.out.println("HAVE A HAPPY JOURNEY");
	System.out.println("--------~*~---------");
}

}
	
	