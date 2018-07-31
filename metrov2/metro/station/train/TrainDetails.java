package com.lxisoft.metrov2.metro.station.train;

 public class  TrainDetails
 {
 Train train=new Train();
 String trainName=train.gettrainName();
 String trainRoute=train.gettrainRoute();
	void details()
	{
	 System.out.println("Train Name is="+trainName);
	 System.out.println("Route ="+trainRoute);
	}
 }
