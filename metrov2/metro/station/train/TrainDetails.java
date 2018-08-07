package com.lxisoft.metrov2.metro.station.train;

public class TrainDetails
{
	Train train = new Train();
	
	String trainName = train.gettrainName();
	int trainNo = train.gettrainNo();

	public void trainDetail()
	{
		System.out.println("Train name::" + trainName);
		System.out.println("Train number::" + trainNo);
	}
}
}
