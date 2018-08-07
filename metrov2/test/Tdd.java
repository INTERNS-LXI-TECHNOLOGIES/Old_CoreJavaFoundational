package com.lxisoft.metrov2.test;
import com.lxisoft.metrov2.admin.Admin;
import com.lxisoft.metrov2.metro.Metro;
import com.lxisoft.metrov2.station.Station;
import com.lxisoft.metrov2.train.Train;
import com.lxisoft.metrov2.coach.coachtypes.Ac;
import com.lxisoft.metrov2.coach.coachtypes.Sleeper;
import com.lxisoft.metrov2.coach.coachtypes.General;
import com.lxisoft.metrov2.coach.Coach;
import com.lxisoft.metrov2.ticketcounter.TicketCounter;
public class Tdd
{
	public static void main(String args[])
	{
		Admin metro=new Admin();
		metro.selectStation();
		Admin station=new Admin();
		station.setTrainNames();
		Admin train=new Admin();
		train.viewCoach();	
		Admin coachDetails=new Admin();
		coachDetails.coachFares();

	}


}