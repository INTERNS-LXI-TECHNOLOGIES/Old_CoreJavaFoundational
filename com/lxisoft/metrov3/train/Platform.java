package com.lxisoft.metrov3.train;
import java.util.Scanner;
import java.util.ArrayList;
import com.lxisoft.metrov3.train.Train;
public class Platform{
	private int noOfTrains;
	private int no;
	private String destination;
	private ArrayList<Train> trains;
Scanner scan = new Scanner(System.in);
	public void setNoOfTrains(int noOfTrains){
		this.noOfTrains = noOfTrains;
	}
	public int getNoOfTrains(){
		return noOfTrains;
	}
	public void setNo(int no){
		this.no = no;
	}
	public int getNo(){
		return no;
	}
	public void setDestination(String destination){
		this.destination = destination;
	}
	public String getDestination(){
		return destination;
	}
	public void setTrains(ArrayList<Train> trains){
		this.trains = trains;
	}
	public ArrayList<Train> getTrains(){
		return trains;
	}
public void setPlatformDetails(){

		System.out.println("Enter Platform Details");
		System.out.println("Enter Destination Of This Platform ");
		setDestination(scan.next());
		System.out.println("Enter No Of Trains");
		setNoOfTrains(scan.nextInt());
		setTrains(new ArrayList<Train>());
		for(int j=0;j<getNoOfTrains();j++){
		getTrains().add(new Train());
		getTrains().get(j).setTrainDetails();
		}
}
}