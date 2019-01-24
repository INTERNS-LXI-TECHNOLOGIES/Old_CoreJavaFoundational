package com.lxisoft.metrov3.train;
import java.util.Scanner;
import java.util.ArrayList;
import com.lxisoft.metrov3.train.Platform;
import com.lxisoft.metrov3.ticket.Ticket;
public class Metro{
	private ArrayList<Platform> platforms;
	private Ticket ticket;
	Scanner scan = new Scanner(System.in);
public Metro(){
	setPlatforms(new ArrayList<Platform>());
	setTicket(new Ticket());
}
public void setPlatforms(ArrayList<Platform> platforms){
	this.platforms = platforms;
}
public ArrayList<Platform> getPlatforms(){
	return platforms;
}
public void setTicket(Ticket ticket){
	this.ticket = ticket;
}
public Ticket getTicket(){
	return ticket;
}
public void admin(){
	for(int i = 0;i<3;i++){
		getPlatforms().add(new Platform());
		getPlatforms().get(i).setPlatformDetails();
	}
}
public void reservation(){
int destination;
int train;
int classes;
int noOfTickets;
int seatNo = 0;
	System.out.println("Welcome To Metro Ticket Booking\n");
	do{
		System.out.print("Select Destination \n1."+getPlatforms().get(0).getDestination()+"\n2."+getPlatforms().get(1).getDestination()+"\n3."+getPlatforms().get(2).getDestination());
		destination = scan.nextInt();
		getTicket().setDestination(getPlatforms().get(destination-1).getDestination());
		if(destination>3){
			System.out.println("\nInvalid Entry Try Again\n");
		}
	}while(destination>3);
	do{
		System.out.println("Available Trains");
		for(int i = 0;i<getPlatforms().get(destination-1).getNoOfTrains();i++){
		System.out.println((i+1)+"."+getPlatforms().get(destination-1).getTrains().get(i).getName());
		}
		train = scan.nextInt();
		if(train>getPlatforms().get(destination-1).getNoOfTrains()){
			System.out.println("Invalid Entry Try Again");
		}
		getTicket().setTrain(getPlatforms().get(destination-1).getTrains().get(train-1).getName());
	}while(train>getPlatforms().get(destination-1).getNoOfTrains());
	do{
		System.out.println("Available Classes And Its Price");
		for(int i = 0;i<getPlatforms().get(destination-1).getTrains().get(train-1).getNoOfClasses();i++){
		System.out.print((i+1)+"."+getPlatforms().get(destination-1).getTrains().get(train-1).getclasses().get(i).getName());
		System.out.println(" : "+getPlatforms().get(destination-1).getTrains().get(train-1).getclasses().get(i).getPrice());
		}
		classes = scan.nextInt();
		getTicket().setClasses(getPlatforms().get(destination-1).getTrains().get(train-1).getclasses().get(classes-1).getName());
		getTicket().setPrice(getPlatforms().get(destination-1).getTrains().get(train-1).getclasses().get(classes-1).getPrice());
		if(classes>getPlatforms().get(destination-1).getTrains().get(train-1).getNoOfClasses()){
			System.out.println("Invalid Entry Try Again");
		}
	}while(classes>getPlatforms().get(destination-1).getTrains().get(train-1).getNoOfClasses());
	System.out.print("Total Available Seats : ");
	if(getPlatforms().get(destination-1).getTrains().get(train-1).getclasses().get(classes-1).getNoOfSeats() > 0){
	System.out.println(getPlatforms().get(destination-1).getTrains().get(train-1).getclasses().get(classes-1).getNoOfSeats());
	}
	else{
	System.out.println("No More Seats Available");
	}
	do{
	System.out.print("Enter No Of Tickets :");
	noOfTickets = scan.nextInt();
	if(noOfTickets>getPlatforms().get(destination-1).getTrains().get(train-1).getclasses().get(classes-1).getNoOfSeats()){
	System.out.println("Only "+getPlatforms().get(destination-1).getTrains().get(train-1).getclasses().get(classes-1).getNoOfSeats()+" Tickets Are Available");
	}
	}while(noOfTickets>getPlatforms().get(destination-1).getTrains().get(train-1).getclasses().get(classes-1).getNoOfSeats());
	System.out.println("Available Seats");
	getPlatforms().get(destination-1).getTrains().get(train-1).getclasses().get(classes-1).setNoOfSeats(getPlatforms().get(destination-1).getTrains().get(train-1).getclasses().get(classes-1).getNoOfSeats() - noOfTickets);
	for(int i = 0;i<noOfTickets;i++){
	for(int j = 1;j<=getPlatforms().get(destination-1).getTrains().get(train-1).getclasses().get(classes-1).getNoOfSeats()+noOfTickets;j++)
	{
		if (seatNo != j){
		System.out.print(getPlatforms().get(destination-1).getTrains().get(train-1).getclasses().get(classes-1).getSeats().get(j-1).getNo()+",");
		}
	}
	System.out.println("\nEnter Seat No :");
	seatNo = scan.nextInt();
	getTicket().setSeatNo(seatNo);
	}	
	getPlatforms().get(destination-1).getTrains().get(train-1).getclasses().get(classes-1).getSeats().get(seatNo-1).getPassenger().setTicket(new Ticket());
	System.out.println("Enter Passenger Details");
	System.out.print("Enter Name : ");
	getPlatforms().get(destination-1).getTrains().get(train-1).getclasses().get(classes-1).getSeats().get(seatNo-1).getPassenger().setName(scan.next());
	getTicket().setName(getPlatforms().get(destination-1).getTrains().get(train-1).getclasses().get(classes-1).getSeats().get(seatNo-1).getPassenger().getName());
	System.out.print("Enter Age : ");
	getPlatforms().get(destination-1).getTrains().get(train-1).getclasses().get(classes-1).getSeats().get(seatNo-1).getPassenger().setAge(scan.next());
	getTicket().setAge(getPlatforms().get(destination-1).getTrains().get(train-1).getclasses().get(classes-1).getSeats().get(seatNo-1).getPassenger().getAge());
	System.out.print("Enter Gender : ");
	getPlatforms().get(destination-1).getTrains().get(train-1).getclasses().get(classes-1).getSeats().get(seatNo-1).getPassenger().setGender(scan.next());
	getTicket().setGender(getPlatforms().get(destination-1).getTrains().get(train-1).getclasses().get(classes-1).getSeats().get(seatNo-1).getPassenger().getGender());
	getTicket().ticket();
	}
}