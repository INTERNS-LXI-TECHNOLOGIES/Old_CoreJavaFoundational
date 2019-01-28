package com.lxisoft.metrov3.metro;
import com.lxisoft.metrov3.train.Train;
import java.util.Scanner;
import java.util.ArrayList;
public class Platform
{
	private int pfNo;
	private ArrayList <Train> trains;
	Scanner scan=new Scanner(System.in);
	public void setPfNo(int pfNo)
	{
		this.pfNo=pfNo;
	}
	public int getPfNo()
	{
		return pfNo;
	}
	public void setTrains(ArrayList <Train> trains)
	{
		this.trains=trains;
	}
	public ArrayList <Train> getTrains()
	{
		return trains;
	}
	public void trainDetails()
	{
		setTrains(new ArrayList <Train>());
	for(int i=0;i<6;i++)
		{
		getTrains().add(new Train());
		getTrains().get(i).coachDetails();
		}
	
		getTrains().get(0).setTrainNo(112);
		getTrains().get(1).setTrainNo(122);
		getTrains().get(2).setTrainNo(231);
		getTrains().get(3).setTrainNo(345);
		getTrains().get(4).setTrainNo(456);
		getTrains().get(5).setTrainNo(567);
		getTrains().get(0).setName("Amritha Express");
		getTrains().get(1).setName("Trivandrum Express");
		getTrains().get(2).setName("Ernamkulam Passenger");
		getTrains().get(3).setName("Palakkad Express");
		getTrains().get(4).setName("Thrissur Passenger");
		getTrains().get(5).setName("Bangalore Express");

		getTrains().get(0).setTime("9.00 am");
		getTrains().get(1).setTime("1.00 pm");
		getTrains().get(2).setTime("3.00 pm");
		getTrains().get(3).setTime("10.00 am");
		getTrains().get(4).setTime("2.00 pm");
		getTrains().get(5).setTime("4.00 pm");
}

}		