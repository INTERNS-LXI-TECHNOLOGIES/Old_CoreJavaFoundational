package com.lxisoft.metro3;
import java.util.Scanner;
public class Class{
	String name;
	String noOfSeats;
	Scanner scan = new Scanner(System.in);
//	int selectClass;
/*	Ticket ticket = new Ticket();
	String classOneA = "1A (AC First Class)";
	String classtwoA = "2A (AC 2-Tier)";
	String classthreeA = "3A (Ac 3-Tier)";
	String classFC = "FC (First Class)";
	String classCC = "CC (AC Chair Car)";
	String classSL = "SL (Sleeper)";
	String classTwoS = "2S (Second Sitting)";*/
	Seat[] seats;
public void setSeatDetails(){
	System.out.println("Enter NoOf Seats");
	noOfSeats = scan.nextLine();
	seats = new Seat[Integer.parseInt(noOfSeats)];
	for(int i=0;i<Integer.parseInt(noOfSeats);i++){
		seats[i] = new Seat();
		seats[i].no = i+1;
	}
}
/*public void selectClass(){
			switch(selectClass){
				case 1:
				ticket.className = classOneA;
				ticket.classPrice = 1210;
				break;
				case 2:
				ticket.className = classtwoA;
				ticket.classPrice = 1010;
				break;
				case 3:
				ticket.className = classthreeA;
				ticket.classPrice = 835;
				break;
				case 4:
				ticket.className = classFC;
				ticket.classPrice = 630;
				break;
				case 5:
				ticket.className = classCC;
				ticket.classPrice = 470;
				break;
				case 6:
				ticket.className = classSL;
				ticket.classPrice = 195;
				break;
				case 7:
				ticket.className = classTwoS;
				ticket.classPrice = 0;
				break;
			}
}*/
}