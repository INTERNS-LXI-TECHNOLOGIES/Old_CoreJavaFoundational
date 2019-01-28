import java.util.Scanner;
public class Passenger
{
Scanner scan=new Scanner(System.in);

String name,gender;
int age;

  Ticket ticket=new Ticket();
 
  
  public void passengerDetails()
  {
	  
	  System.out.println("enter the name of the passenger");
	  name=scan.next();
	  System.out.println("enter the gender of passenger");
	  gender=scan.next();
	  ticket.test();
     // ticket.reservation();
	
 }


	
	
}