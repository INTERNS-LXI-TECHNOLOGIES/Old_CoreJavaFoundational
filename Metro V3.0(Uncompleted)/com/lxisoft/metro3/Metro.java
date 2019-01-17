package com.lxisoft.metro3;
import java.util.Scanner;
public class Metro{
//	int selectTrain;
	Platform[] platforms = new Platform[1];
//	Passenger[] passenger;
	Ticket ticket = new Ticket();
	//Train[] trains;
//	Class classes = new Class();
	Scanner scan = new Scanner(System.in);
public Metro(){
	for(int i = 0;i<1;i++){
		platforms[i] = new Platform();
	}
}
public void setPlatformDetails(){
	/*for(int i = 0;i<5;i++){
		trains[i] = new Train();
		}*/
	for(int i = 0;i<1;i++){
		System.out.println("Enter Platform Details For Platform No "+(i+1));
		System.out.println("Enter Destination Of This Platform ");
		platforms[i].destination = scan.next();
		platforms[i].setTrainDetails();
		platforms[i].no = i+1;
		}
}	
public void reservation(){

	System.out.println("Welcome To Metro Ticket Booking\n");
	do{
		System.out.print("Select Destination \n1."+platforms[0].destination+"\n"/*+"\n2."+platform[1].destination+"\n3."+platform[3].destination*/);
		ticket.destination = scan.nextInt();
		if(ticket.destination>1){
			System.out.println("\nInvalid Entry Try Again\n");
		}
	}while(ticket.destination>3);
		//trains = new Train[Integer.parseInt(platforms[ticket.destination-1].noOfTrains)];
		/*for(int i = 0;i<Integer.parseInt(platforms[ticket.destination-1].noOfTrains);i++){
			trains[i] = new Train();
		}*/
		System.out.println("Available Trains\n");
		for(int i = 0;i<Integer.parseInt(platforms[ticket.destination-1].noOfTrains);i++){
		System.out.println(platforms[ticket.destination-1].trains[i].name);
	}
			/*for(int i=1;i<7;i++){
			if(trains[0].destination == i){
		do{
			System.out.println("Available Trains\n");
			switch(i){
				case 1:
				System.out.println("1."+trains[1].name+" On "+trains[1].time+"\n"+"2."+trains[2].name+" On "+trains[2].time+"\nSelect Train : ");
				selectTrain = scan.nextInt();
				if(selectTrain == 1){
					ticket.trainName = trains[1].name;
					ticket.trainTime = trains[1].time;
					ticket.pfno = platform[0].pfno;
				}
				else if(selectTrain == 2){
					ticket.trainName = trains[2].name;
					ticket.trainTime = trains[2].time;
					platform[0].no = platform[1].pfno;
				}
				else{
					ticket.trainName = "invalid";
					System.out.println("\nInvalid Entry Try Again\n");
				}
				break;
				case 2:
				System.out.println("1."+trains[0].name+" On "+trains[0].time+"\n"+"2."+trains[2].name+" On "+trains[2].time+"\nSelect Train : ");
				selectTrain = scan.nextInt();
				if(selectTrain == 1){
					ticket.trainName = trains[0].name;
					ticket.trainTime = trains[0].time;
					platform[0].no = platform[2].pfno;
				}
				else if(selectTrain == 2){
					ticket.trainName = trains[2].name;
					ticket.trainTime = trains[2].time;
					platform[0].no = platform[1].pfno;
				}
				else{
					ticket.trainName = "invalid";
					System.out.println("\nInvalid Entry Try Again\n");				}
				break;
				case 3:
				System.out.println("1."+trains[1].name+" On "+trains[1].time+"\n"+"2."+trains[2].name+" On "+trains[2].time+"\nSelect Train : ");
				selectTrain = scan.nextInt();
				if(selectTrain == 1){
					ticket.trainName = trains[1].name;
					ticket.trainTime = trains[1].time;
					platform[0].no = platform[0].pfno;
				}
				else if(selectTrain == 2){
					ticket.trainName = trains[2].name;
					ticket.trainTime = trains[2].time;
					platform[0].no = platform[1].pfno;
				}
				else{
					ticket.trainName = "invalid";
					System.out.println("\nInvalid Entry Try Again\n");				}
				break;
				case 4:
				System.out.println("1."+trains[3].name+" On "+trains[3].time+"\n"+"2."+trains[4].name+" On "+trains[4].time+"\nSelect Train : ");
				selectTrain = scan.nextInt();
				if(selectTrain == 1){
					ticket.trainName = trains[3].name;
					ticket.trainTime = trains[3].time;
					platform[0].no = platform[2].pfno;
				}
				else if(selectTrain == 2){
					ticket.trainName = trains[4].name;
					ticket.trainTime = trains[4].time;
					platform[0].no = platform[1].pfno;
				}
				else{
					ticket.trainName = "invalid";
					System.out.println("\nInvalid Entry Try Again\n");				}
				break;
				case 5:
				System.out.println("1."+trains[4].name+" On "+trains[4].time+"\n"+"2."+trains[0].name+" On "+trains[0].time+"\nSelect Train : ");
				selectTrain = scan.nextInt();
				if(selectTrain == 1){
					ticket.trainName = trains[4].name;
					ticket.trainTime = trains[4].time;
					platform[0].no = platform[1].pfno;
				}
				else if(selectTrain == 2){
					ticket.trainName = trains[0].name;
					ticket.trainTime = trains[0].time;
					platform[0].no = platform[2].pfno;
				}
				else{
					ticket.trainName = "invalid";
					System.out.println("\nInvalid Entry Try Again\n");				}
				break;
				case 6:
				System.out.println("1."+trains[3].name+" On "+trains[3].time+"\n"+"2."+trains[0].name+" On "+trains[0].time+"\nSelect Train : ");
				selectTrain = scan.nextInt();
				if(selectTrain == 1){
					ticket.trainName = trains[3].name;
					ticket.trainTime = trains[3].time;
					platform[0].no = platform[2].pfno;
				}
				else if(selectTrain == 2){
					ticket.trainName = trains[0].name;
					ticket.trainTime = trains[0].time;
					platform[0].no = platform[2].pfno;
				}
				else{
					ticket.trainName = "invalid";
					System.out.println("\nInvalid Entry Try Again\n");				}
				break;
			}
			}while(ticket.trainName == "invalid");
}
}
		System.out.println("No of Tickets");
		ticket.noOfTicket = scan.nextInt();
		passenger  = new Passenger[ticket.noOfTicket];
		for(int i=0;i<ticket.noOfTicket;i++){
		passenger[i] = new Passenger();
	}
		do{
			System.out.println("Select Class\n"+"1."+classes.classOneA+"\n2."+classes.classtwoA+"\n3."+classes.classthreeA+"\n4."+classes.classFC+"\n5."+classes.classCC+"\n6."+classes.classSL+"\n7."+classes.classTwoS);
			classes.selectClass = scan.nextInt();
			if(classes.selectClass>7){
			System.out.println("\nInvalid Entry Try Again\n");
			}
			}while(classes.selectClass>7);
		do{
			System.out.println("Select Quota\n"+"1."+ticket.quotaName[0]+"\n2."+ticket.quotaName[1]+"\n3."+ticket.quotaName[2]+"\n4."+ticket.quotaName[3]+"\n5."+ticket.quotaName[4]);
			ticket.selectQuota = scan.nextInt();
			if(ticket.selectQuota>5){
			System.out.println("\nInvalid Entry Try Again\n");
			}
			}while(ticket.selectQuota>5);*/
}
}