import java.util.Scanner;

public class Car
{
	String name,colour;
	Scanner scan=new Scanner(System.in);

	public void createCarDetails()
	{
		System.out.println("enter the name of the  car");
		name=scan.next();
		System.out.println("enter the colour of the car");
		colour=scan.next();



		
	}

public void printCarDetails()
{
	System.out.println(" car details");
	System.out.println("................");
	System.out.println("car name="+name);
	System.out.println("car colour="+colour);


	
}
}
 