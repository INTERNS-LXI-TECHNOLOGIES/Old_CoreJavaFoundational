package com.lxisoft.metrov3.train;
import java.util.Scanner;
import java.util.ArrayList;
public class Coach
{
private String type;

private ArrayList <Seat> seats;
public void setType(String type)
{
	this.type=type;
}
public String getType()
{
	return type;
}
public void setSeats(ArrayList <Seat> seats)
{
	this.seats=seats;
}
public ArrayList <Seat> getSeats()
{
	return seats;
}

public void seatDetails()
{
int maxSeats=35;
int coachSeats=5;
int noOfSeats;	
setSeats(new ArrayList <Seat>());

for(int i=0;i<5;i++)
{
	getSeats().add(new Seat());
}
	getSeats().get(0).setSeatNo(1);
	getSeats().get(1).setSeatNo(2);
	getSeats().get(2).setSeatNo(3);
	getSeats().get(3).setSeatNo(4);
	getSeats().get(4).setSeatNo(5);
if(maxSeats!=0)
{
	if(coachSeats!=0)
	{
		System.out.print("Seat Numbers for booking:");
	for(int i=0;i<5;i++)
	{
	
		System.out.print(+getSeats().get(i).getSeatNo()+" \n");
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
	
	
	
