package com.lxisoft.metrov2.test;
import com.lxisoft.metrov2.admin.Admin;
import com.lxisoft.metrov2.metro.Metro;
import com.lxisoft.metrov2.station.Station;
public class Tdd
{
	public static void main(String args[])
	{
		Admin metro=new Admin();
		metro.selectStation();
		Admin station=new Admin();
		station.setTrainNames();
	}
}