import java.util.Scanner;
public class Tdd
{
public static void main(String args[])
{

Passenger[] passengers;

Scanner scan=new Scanner(System.in);



        System.out.println("WELCOME TO IRCTCs E-TICKETING SERVICE");
		System.out.println("                                     ");
		System.out.println("72 seats are available...You can reserve your seats now....!");
		System.out.println("                                                   ");

		
				System.out.print("Enter the tickets needed:");
				int t=scan.nextInt();
				passengers=new Passenger[t];
				for(int i=0;i<t;i++)
					{
					   passengers[i]=new Passenger();
					   passengers[i].setPassengerDetails();
					  
					}
                for(int i=0;i<t;i++)
				{
				   passengers[i].printDetails();
				}

}
}