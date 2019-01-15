import java.util.Scanner;
public class Seat
{
	
	
Scanner scan=new Scanner(System.in);

    Passenger passengers=new Passenger();

       public void passengerDetails()
			  {
				  String name;
				  int age;
				  String gender;
				  System.out.println("enter the name of the passenger");
				  name=scan.next();
				  System.out.println("enter the age of the passenger");
				  age=scan.nextInt();
				  System.out.println("enter the gender of passenger");
				  gender=scan.next();
				  
				  passengers.calling();
				 
				
				
			 }        

   
}