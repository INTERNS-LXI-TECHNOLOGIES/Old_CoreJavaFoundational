package com.lxisoft.metro3;
import java.util.Scanner;
public class Platform{
	String noOfTrains;
	int no;
	String destination;
	Train[] trains;
Scanner scan = new Scanner(System.in);
public void setTrainDetails(){
System.out.println("Enter No Of Trains");
noOfTrains = scan.nextLine();
trains = new Train[Integer.parseInt(noOfTrains)];
	for(int i=0;i<Integer.parseInt(noOfTrains);i++){
		trains[i] = new Train();
	}
for(int i=0;i<Integer.parseInt(noOfTrains);i++){
	System.out.println("Enter Train Name And Time "+(i+1));
	trains[i].name = scan.nextLine();
	trains[i].time = scan.nextLine();
	trains[i].setClassDetails();
}

}
}