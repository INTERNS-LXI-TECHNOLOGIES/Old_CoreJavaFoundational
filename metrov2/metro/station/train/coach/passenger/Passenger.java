package com.lxisoft.metrov2.metro.station.train.coach.passenger;
import com.lxisoft.metrov2.metro.station.train.coach.passenger.ticket.Ticket;

public class Passenger
{
      private String name;
      private int age;
      private String gender;
	public void setName(String name)
	{
	  this.name=name;
	}
	public void setAge(int age1)
	{
	 this.age=age1;
	}
	public void setGender(String gender1)
	{
     this.gender=gender1;
	}
	public String getName()
	{
	  return name;
	}
		public int getAge()
		{
			return age;
		}
			public String getGender()
			{
			return gender;
			}
			public void getPassenger()
			{
			Ticket ticket=new Ticket();
			ticket.bookTicket();
			}
		
	
	
}