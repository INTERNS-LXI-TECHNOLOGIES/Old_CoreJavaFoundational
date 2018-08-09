package com.lxisoft.metro;
import java.util.*;
public class Coach
{
	private String CoachName;
	private int Price;
	private int SeatNumber;
	Scanner input=new Scanner(System.in);
	ArrayList<Passenger> passengers=new ArrayList<Passenger>();
	public void setCoachName(String name)
	{
		this.CoachName=name;
	}
	public String getCoachName()
	{
		return CoachName;
	}
	
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public int getPrice()
	{
		return Price;
	}
	public void setSeatNumber(int seatNo)
	{
		this.SeatNumber=seatNo;
	}
	public int getSeatNumber()
	{
		return SeatNumber;
	}
	
	
}