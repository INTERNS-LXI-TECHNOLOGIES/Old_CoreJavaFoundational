import java.util.Scanner;
public class Coach
{
String name;
int noOfTicket,i;
int maxSeat=20;
Seat[] seats=new Seat[20];
Passenger[] passengers;
Scanner scan=new Scanner(System.in);
public void seatDetails()
{
	if(maxSeat!=0){
	System.out.print("Number of tickets:");
	noOfTicket=scan.nextInt();
	int	seat=noOfTicket;
	passengers=new Passenger[noOfTicket];
	for(int i=0;i<noOfTicket;i++)
			{
			passengers[i]=new Passenger();
			//seats[i]=new Seat();
			}
	for(int seatNo=1;seatNo<=seat;seatNo++)
	{
		System.out.println("Seat Number:"+seatNo);
		passengers[i].setDetails();
		maxSeat=maxSeat-1;
		
	}
	System.out.print("Rest of the seats:"+maxSeat);
	}
	else
	{
	System.out.print("No seats available in this coach");
	}
		
}
}