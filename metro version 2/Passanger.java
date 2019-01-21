import java.util.Scanner;
public class Passanger
{ 
String name,gender;
int mobileNumber,age,t1;

Scanner scan=new Scanner(System.in);
Ticket ticket=new Ticket();

      public void setPassangerDetails()
			  {
				  
				  ticket.setTicketDetails();
				  
				 
			}
     public void printDetails()
	        {   
			      System.out.println("*************");
			      System.out.println("USER DETAILS");
				  System.out.println("*************");
			      System.out.println("no of tickets="+t1);
	              System.out.println("passanger name="+name);
				 
				  System.out.println("age of the passanger"+age);
				  System.out.println("gender of the passanger"+gender);
				  System.out.println("mobile number of the passanger");
				  ticket.printDetails();
		    }	 

}