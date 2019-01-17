package com.lxisoft.metro3;
import java.util.Scanner;
public class Train{
	String noOfClasses;
	String name;
	String time;
	Scanner scan = new Scanner(System.in);
	Class[] classes;
//	String[] destinations = new String[6];
//	Ticket ticket = new Ticket();
//	int[] fare = new int[5];
//	int destination;
//	String name;
//	String time;
public void setClassDetails(){
	System.out.println("how Many Classes Available");
	noOfClasses = scan.nextLine();
	classes = new Class[Integer.parseInt(noOfClasses)];
	for(int i=0;i<Integer.parseInt(noOfClasses);i++){
		classes[i] = new Class();
	}
	for(int i=0;i<Integer.parseInt(noOfClasses);i++){
		System.out.println("Enter Class Name");
		classes[i].name = scan.nextLine();
		classes[i].setSeatDetails();
	}

		/*destinations[0] = "Kozhikode";
		destinations[1] = "Trivandrum";
		destinations[2] = "Kasaragod";
		destinations[3] = "Thrissur";
		destinations[4] = "Ernakulam";
		destinations[5] = "Kollam";
		fare[0] = 100;
		fare[1] = 130;
		fare[2] = 190;
		fare[3] = 90;
		fare[4] = 160;
		for(int i=1;i<7;i++){
		if(destination == i){
		ticket.destination = destinations[i-1];
		ticket.price = fare[i-1];
	}
}*/
}
}