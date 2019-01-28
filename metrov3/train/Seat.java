package com.lxisoft.metrov3.train;
import com.lxisoft.metrov3.metro.Passenger;
public class Seat
{
	private int seatNo;
	Passenger passengers=new Passenger();
	
	public void setSeatNo(int seatNo)
	{
		this.seatNo=seatNo;
	}
	public int getSeatNo()
	{
		return seatNo;
	}
}
	