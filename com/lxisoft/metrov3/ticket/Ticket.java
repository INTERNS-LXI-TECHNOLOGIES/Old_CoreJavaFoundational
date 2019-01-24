package com.lxisoft.metrov3.ticket;
import com.lxisoft.metrov3.passenger.Passenger;
public class Ticket{
	private String destination;
	private String train;
	private String classes;
	private int price;
	private int seatNo;
	private String name;
	private String age;
	private String gender;
	public void setDestination(String destination){
		this.destination = destination;
	}
	public String getDestination(){
		return destination;
	}
	public void setTrain(String train){
		this.train = train;
	}
	public String getTrain(){
		return train;
	}
	public void setClasses(String classes){
		this.classes = classes;
	}
	public String getClasses(){
		return classes;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public int getPrice(){
		return price;
	}
	public void setSeatNo(int seatNo){
		this.seatNo = seatNo;
	}
	public int getSeatNo(){
		return seatNo;
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
public void ticket(){
System.out.println("\nTicket Details");
System.out.println("Destination : "+getDestination());
System.out.println("Train Name : "+getTrain());
System.out.println("Class Name : "+getClasses());
System.out.println("Seat No : "+getSeatNo());
System.out.println("Price : "+getPrice());
System.out.println("Name : "+getName());
System.out.println("Age : "+getAge());
System.out.println("Gender : "+getGender());
}
}