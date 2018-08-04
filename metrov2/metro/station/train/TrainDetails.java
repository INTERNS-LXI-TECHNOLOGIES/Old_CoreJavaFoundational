package com.lxisoft.metrov2.metro.station.train;

public class TrainDetails
{
	Train train=new Train();
	
	String trainName=train.gettrainName();
	String trainRoute=train.gettrainRoute();
	
	public void details()
	{
		System.out.println("Train Name:" +trainName);
		Syatem.out.println("Train route:" +trainRoute);
	}
}


