import java.util.Scanner;
public class Train
{
String name;
String time,number;

	
Scanner scan=new Scanner(System.in);
Compartment compartment=new Compartment();
public void setTrainDetails()
	{
		
		System.out.println("enter the number of the train");
		number=scan.next();
		System.out.println("enter the train name");
		name=scan.next();
		System.out.println("enter the time of the train");
		time=scan.next();
		compartment.setCompartmentDetails();
		
	}

	public void printDetails()
	{
		System.out.println("number of the train="+number);
		System.out.println("name of the train="+name);
		System.out.println("time of the Train="+time);
		compartment.seat.printDetails();
		
	}	
	
}
