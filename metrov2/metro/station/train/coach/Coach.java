package com.lxisoft.metrov2.metro.station.train.coach;
import com.lxisoft.metrov2.metro.station.train.coach.passenger.Passenger;
public class Coach
{
 String coachName;
 int coachPrice;
 Passenger passenger;
  public void setcoachName(String name)
    {
    this.coachName=name;
    }

    public void setcoachPrice(int price)
   {
   this.coachPrice=price;
   }

    public String getcoachName()
	{
	return coachName;
	}

	public int getcoachPrice()
	{
	return coachPrice;
	}

} 