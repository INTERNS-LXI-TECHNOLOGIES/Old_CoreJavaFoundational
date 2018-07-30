package com.lxisoft.metrov2.metro.station.train.coach;
import com.lxisoft.metrov2.metro.station.train.coach.passenger.Passenger;
public class Coach
{
private String coachName;
private int coachPrice;
 Passenger passenger;
  public void setcoachName(String name)
    {
    this.coachName=name;
    }

    public String getcoachName()
	{
	return coachName;
	}
	
	 public void setcoachPrice(int price)
   {
   this.coachPrice=price;
   }

	public int getcoachPrice()
	{
	return coachPrice;
	}

} 