package com.lxisoft.metromanagement.metro;
public class Coach
{
private int coachNo;
private int seatNo;
private int fare;
private String type;
public void setCoachNo(int coachNo)
{
	this.coachNo=coachNo;
}
public int getCoachNo()
{
	return coachNo;
}
public void setSeatNo(int seatNo)
{
	this.seatNo=seatNo;
}
public void setFare(int fare)
{
	this.fare=fare;
}
}