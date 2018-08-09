package com.lxisoft.metro.station.train;
import com.lxisoft.metro.station.train.coach.Ac.Ac;
import com.lxisoft.metro.station.train.coach.General.General;
import com.lxisoft.metro.station.train.coach.Sleeper.Sleeper;
import java.util.Scanner;
public class Train
{
     public void coach()
	 {
	
	 Scanner sc=new Scanner(System.in);
	 System.out.println("choose the coach---- 1-AC,2-General,3-Sleeper");
	int choice=sc.nextInt();
    switch(choice)
{
     case 1:Ac a=new Ac();
	 //String j=;
	 a.setname("Ac coach");
	 a.setprice(1000);
	 System.out.println(a.getname());
	 System.out.println(a.getprice());
	 break;
	 case 2:General g=new General();
	 	 g.setname("General coach");
	 g.setprice(100);
	 System.out.println(g.getname());
	 System.out.println(g.getprice());
	 break;
	 case 3:Sleeper s=new Sleeper();
	 	 s.setname("Sleeper coach");
	 s.setprice(400);
	 System.out.println(s.getname());
	 System.out.println(s.getprice());
	 break;
	 default:System.out.println("invalid choice");
		     break;
}
}
}