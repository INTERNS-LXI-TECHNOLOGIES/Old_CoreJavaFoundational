package com.lxisoft.hotelv1;
public class Tdd
{
	public static void main(String[] args) throws Exception
	{
		Hotel hotel=new Hotel();
		hotel.authentication();
		hotel.writeToFile();
		hotel.readFromFile();
	}
}