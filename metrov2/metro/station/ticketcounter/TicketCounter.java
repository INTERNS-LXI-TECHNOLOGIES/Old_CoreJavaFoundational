package com.lxisoft.metrov2.metro.station.ticketcounter;
import com.lxisoft.metrov2.admin.Admin;
import com.lxisoft.metrov2.metro.Metro;
import com.lxisoft.metrov2.metro.station.Station;
public class TicketCounter
{

public static  void main(String args[])
{
	Admin admin=new Admin();
admin.setMetro();
admin.getMetro();	
admin.setStation();
admin.getStation();
admin.setTrain();
admin.getTrain();


}


}