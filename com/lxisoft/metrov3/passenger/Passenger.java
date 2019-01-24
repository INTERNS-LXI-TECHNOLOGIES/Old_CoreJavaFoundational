package com.lxisoft.metrov3.passenger;
import com.lxisoft.metrov3.ticket.Ticket;
public class Passenger{
private Ticket ticket;
private String name;
private String age;
private String gender;
	public void setTicket(Ticket ticket){
		this.ticket = ticket;
	}
	public Ticket getTicket(){
		return ticket;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(String age){
		this.age = age;
	}
	public String getAge(){
		return age;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
	public String getGender(){
		return gender;
	}
}