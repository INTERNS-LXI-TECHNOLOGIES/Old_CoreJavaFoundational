package com.lxisoft.metrov3.train;
import java.util.Scanner;
import java.util.ArrayList;
import com.lxisoft.metrov3.train.Seat;
public class Class{
	Scanner scan = new Scanner(System.in);
	private int noOfSeats;
	private String name;
	private int price;
	private ArrayList<Seat> seats;
	public void setNoOfSeats(int noOfSeats){
		this.noOfSeats = noOfSeats;
	}
	public  int getNoOfSeats(){
		return noOfSeats;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}public void setPrice(int price){
		this.price = price;
	}
	public int getPrice(){
		return price;
	}
	public void setSeats(ArrayList<Seat> seats){
		this.seats = seats;
	}
	public ArrayList<Seat> getSeats(){
		return seats;
	}
public void setClassDetails(){
		System.out.println("Enter Class Name");
		setName(scan.next());
		System.out.println("Enter class Price");
		setPrice(scan.nextInt());
	System.out.println("Enter NoOf Seats");
	setNoOfSeats(scan.nextInt());
	setSeats(new ArrayList<Seat>());
	for(int j=0;j<getNoOfSeats();j++){
		//getSeats() = new Seat();
		//getSeats().setNo(j+1);
		getSeats().add(new Seat());
		getSeats().get(j).setNo(j+1);
	}
}
}