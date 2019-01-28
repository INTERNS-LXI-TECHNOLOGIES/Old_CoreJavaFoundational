package com.lxisoft.metro.train;
import com.lxisoft.metro.train.Seat;

import java.util.Scanner;
public class Compartment
{
Scanner scan=new Scanner (System.in);

private Seat seat;

private String name,clas; 
private int number;

                    public void setSeat(Seat seat)
					{
						this.seat=seat;
					}
					public Seat getSeat()
					{
						return seat;
					}
					public void setName(String name)
					{
						this.name=name;
					}
					public String getName()
					{
						return name;
					}
					public void setNumber(int number)
					{
						this.number=number;
					}
					public int getNumber()
					{
						return number;
					}
					public void setClas(String clas)
					{
						this.clas=clas;
					}
					public String getClas()
					{
						return clas;
					}


public void compartmentDetails()
	{
		setSeat(new Seat());
		int x;
             
		do
		{
		   System.out.println("------------------\nchoose your option\n-----------------\n *)1=first Ac Sleeper \n *)2=Second AC Sleeper \n *)3=First Class Non-AC \n *)4=Three-tire AC Sleeper");
		   x=scan.nextInt();
							
				switch(x)
				{
					case 1:setClas("First AC Sleeper");seat.seatDetails();break;
						
					case 2:setClas("Second AC Sleeper");seat.seatDetails();break;
						
					case 3:setClas("First class Non-AC");seat.seatDetails();break;
					
					case 4:setClas("Three-tier AC Sleeper");seat.seatDetails();break;
					
					default:setClas("invalid");
					System.out.println("please enter agane");
			    }
				
		}
		while(x>4);
				
				
	}
			
public void printDetails()
		{
			System.out.println("class name="+getClas());
		}
			
}