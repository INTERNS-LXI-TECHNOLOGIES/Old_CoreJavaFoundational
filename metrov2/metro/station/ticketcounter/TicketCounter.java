package com.lxisoft.metrov2.metro.station.ticketcounter;
import com.lxisoft.metrov2.admin.Admin;
import com.lxisoft.metrov2.metro.Metro;
import com.lxisoft.metrov2.metro.station.Station;
import java.util.*;
public class TicketCounter
{
Scanner scan=new Scanner(System.in);
public String Coachname;
public void ticket()
{
Admin admin=new Admin();

admin.getMetro();	
admin.getStation();
admin.getTrain();
admin.getnoofCoach();
System.out.println("Select the coach");
Coachname=scan.next();

}


}