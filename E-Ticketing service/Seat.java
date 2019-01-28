import java.util.Scanner;
public class Seat
{

Scanner scan=new Scanner(System.in);
        

    public void create()
	 {
		 System.out.println("10 seats are avilable");
		 System.out.println("                                         ");
        System.out.println("how many passengers do you want tickets to");
        p=scan.nextInt();
		Passenger [] passengers=new Passenger[p];
        int p;
		  for(int i=0;i<p;i++)
				{
						passengers[i]=new Passenger();
						passengers[i].passengerDetails();
				}
				
				
				
	 }
}