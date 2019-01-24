package com.lxisoft.metrov3.train;
import com.lxisoft.metrov3.passenger.Passenger;
public class Seat{
private int no;
private Passenger passenger;
public Seat(){
	setPassenger(new Passenger());
}
public void setPassenger(Passenger passenger){
	this.passenger = passenger;
}
public Passenger getPassenger(){
	return passenger;
}
public void setNo(int no){
	this.no = no;
}
public  int getNo(){
	return no;
}
}