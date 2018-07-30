package com.lxisoft.metrov2.metro.station.train.coach;
import com.lxisoft.metrov2.metro.station.train.coach.Coach;
import com.lxisoft.metrov2.metro.station.train.coach.Ac.Ac;
import com.lxisoft.metrov2.metro.station.train.coach.Sleeper.Sleeper;
import com.lxisoft.metrov2.metro.station.train.coach.General.General;
import java.util.Scanner;
public class CoachDetails
{
	
	
	Ac ac=new Ac();
	General general=new General();
	Sleeper sleeper=new Sleeper();
	Scanner sc=new Scanner(System.in);
	public void coach()
	 {
	
	 
	 System.out.println("choose the coach---- 1-AC,2-General,3-Sleeper");
	int choice=sc.nextInt();
    switch(choice)
{
     case 1:ac.settingAc();
	
	 break;
	 case 2:general.settingGeneral();
	
	 break;
	 case 3:sleeper.settingSleeper();

	 break;
	 default:System.out.println("invalid choice");
		     break;
}
}
	
	
	
	
	
	
}