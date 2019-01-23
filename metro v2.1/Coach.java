import java.util.Scanner;
public class Coach
{
String type;

Seat[] seats=new Seat[5];

public void setSeats()
{ 
for(int i=0;i<5;i++)
{
	seats[i]=new Seat();
}
	seats[0].seatNo=1;
	seats[1].seatNo=2;
	seats[2].seatNo=3;
	seats[3].seatNo=4;
	seats[4].seatNo=5;


}
public void seatDetails()
{
int maxSeats=35;
int coachSeats=5;
int noOfSeats;	
if(maxSeats!=0)
{
	if(coachSeats!=0)
	{
		System.out.print("Seat Numbers for booking:");
	for(int seatNo=1;seatNo<=5;seatNo++)
	{
		System.out.print(+seatNo+" \n");
	}
	
	}
}
}
}
	
		/*//seats[seatNo].passDetails();
		coachSeats=coachSeats-1;
		maxSeats=maxSeats-1;
		
		
	}
	System.out.print("Rest coach seats:"+coachSeats);
	System.out.print("Rest total seats:"+maxSeats);
	}
	else
	{
	System.out.print("No seats available in this coach to select another coach");
	}
}
else
{
	System.out.print("all seats are booked");
}
}
	
		
	
	
}*/
	
	
	
