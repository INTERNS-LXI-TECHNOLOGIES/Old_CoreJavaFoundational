package com.lxisoft.metrov2.metro;
import com.lxisoft.metrov2.metro.Metro;
import com.lxisoft.metrov2.metro.station.Station;
public class MetroDetails
{
	Metro metro=new Metro();
	Station station=new Station();
public void viewMetroDetails()
{
metro.setMetroName("COCHI METRO!!");
System.out.println("\n \nWELCOME TO "+metro.getMetroName());
station.showStation();
}
}