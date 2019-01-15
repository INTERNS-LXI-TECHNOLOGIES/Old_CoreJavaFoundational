import java.util.Scanner;
public class Metro{
	String printDestination;
	int destination;
	int selectTrain;
	String trainTime;
	String className;
	int platformNo;
	int confirm;
	String trainName;
	int ticketPrice;
	int selectQuota;
	Train[] trains = new Train[5];
	Ticket[] tickets = new Ticket[6];
	Scanner scan = new Scanner(System.in);
	String[] places = new String[6];
public Metro(){
	System.out.println("Welcome To Metro Ticket Booking");
	System.out.println(" ");
	for(int i = 0;i<5;i++){
		trains[i] = new Train();
		}
	for(int i = 0;i<6;i++){
		tickets[i] = new Ticket();
	}
		trains[0].name = "Trivandrum Express";
		trains[1].name = "Intercity Express";
		trains[2].name = "Mangalore Express";
		trains[3].name = "Amirtha Express";
		trains[4].name = "Ernakulam Express";
		trains[0].time = "08:30";
		trains[1].time = "11:00";
		trains[2].time = "13:30";
		trains[3].time = "15:45";
		trains[4].time = "19:50";
		trains[0].platform = 1;
		trains[1].platform = 4;
		trains[2].platform = 2;
		trains[3].platform = 1;
		trains[4].platform = 3;
		places[0] = "Kozhikode";
		places[1] = "Trivandrum";
		places[2] = "Kasaragod";
		places[3] = "Thrissur";
		places[4] = "Ernakulam";
		places[5] = "Kollam";
		tickets[0].price = 100;
		tickets[1].price = 130;
		tickets[2].price = 190;
		tickets[3].price = 90;
		tickets[4].price = 160;
}
	
	public void toDetails(){
		int totalSeats = trains[0].seats;
		trains[0].noOfTicket();
		do{
		System.out.print("Select Destination \n1.Kozhikode\n2.Trivandrum\n3.Kasaragod\n4.Thrissur\n5.Ernakulam\n6.Kollam\n\nEnter Keyword : ");
		destination = scan.nextInt();
		if(destination>6){
			System.out.println("\nInvalid Entry Try Again\n");
		}
		}while(destination>6);
		for(int i=1;i<7;i++){
		if(destination == i){
			printDestination = places[i-1];
			ticketPrice = tickets[i-1].price;
			
			do{
			System.out.println("Available Trains\n");
			switch(i){
				case 1:
				System.out.println("1."+trains[1].name+" On "+trains[1].time+"\n"+"2."+trains[2].name+" On "+trains[2].time+"\nSelect Train : ");
				selectTrain = scan.nextInt();
				if(selectTrain == 1){
					trainName = trains[1].name;
					trainTime = trains[1].time;
					platformNo = trains[1].platform;
				}
				else if(selectTrain == 2){
					trainName = trains[2].name;
					trainTime = trains[2].time;
					platformNo = trains[2].platform;
				}
				else{
					trainName = "invalid";
					System.out.println("\nInvalid Entry Try Again\n");
				}
				break;
				case 2:
				System.out.println("1."+trains[0].name+" On "+trains[0].time+"\n"+"2."+trains[2].name+" On "+trains[2].time+"\nSelect Train : ");
				selectTrain = scan.nextInt();
				if(selectTrain == 1){
					trainName = trains[0].name;
					trainTime = trains[0].time;
					platformNo = trains[0].platform;
				}
				else if(selectTrain == 2){
					trainName = trains[2].name;
					trainTime = trains[2].time;
					platformNo = trains[2].platform;
				}
				else{
					trainName = "invalid";
					System.out.println("\nInvalid Entry Try Again\n");				}
				break;
				case 3:
				System.out.println("1."+trains[1].name+" On "+trains[1].time+"\n"+"2."+trains[2].name+" On "+trains[2].time+"\nSelect Train : ");
				selectTrain = scan.nextInt();
				if(selectTrain == 1){
					trainName = trains[1].name;
					trainTime = trains[1].time;
					platformNo = trains[1].platform;
				}
				else if(selectTrain == 2){
					trainName = trains[2].name;
					trainTime = trains[2].time;
					platformNo = trains[2].platform;
				}
				else{
					trainName = "invalid";
					System.out.println("\nInvalid Entry Try Again\n");				}
				break;
				case 4:
				System.out.println("1."+trains[3].name+" On "+trains[3].time+"\n"+"2."+trains[4].name+" On "+trains[4].time+"\nSelect Train : ");
				selectTrain = scan.nextInt();
				if(selectTrain == 1){
					trainName = trains[3].name;
					trainTime = trains[3].time;
					platformNo = trains[3].platform;
				}
				else if(selectTrain == 2){
					trainName = trains[4].name;
					trainTime = trains[4].time;
					platformNo = trains[4].platform;
				}
				else{
					trainName = "invalid";
					System.out.println("\nInvalid Entry Try Again\n");				}
				break;
				case 5:
				System.out.println("1."+trains[4].name+" On "+trains[4].time+"\n"+"2."+trains[0].name+" On "+trains[0].time+"\nSelect Train : ");
				selectTrain = scan.nextInt();
				if(selectTrain == 1){
					trainName = trains[4].name;
					trainTime = trains[4].time;
					platformNo = trains[4].platform;
				}
				else if(selectTrain == 2){
					trainName = trains[0].name;
					trainTime = trains[0].time;
					platformNo = trains[0].platform;
				}
				else{
					trainName = "invalid";
					System.out.println("\nInvalid Entry Try Again\n");				}
				break;
				case 6:
				System.out.println("1."+trains[3].name+" On "+trains[3].time+"\n"+"2."+trains[0].name+" On "+trains[0].time+"\nSelect Train : ");
				selectTrain = scan.nextInt();
				if(selectTrain == 1){
					trainName = trains[3].name;
					trainTime = trains[3].time;
					platformNo = trains[3].platform;
				}
				else if(selectTrain == 2){
					trainName = trains[0].name;
					trainTime = trains[0].time;
					platformNo = trains[0].platform;
				}
				else{
					trainName = "invalid";
					System.out.println("\nInvalid Entry Try Again\n");				}
				break;
			}
			}while(trainName == "invalid");
			trains[0].classDetails();
			do{
			System.out.println("Select Quota\n"+"1."+tickets[0].quotaName[0]+"\n2."+tickets[0].quotaName[1]+"\n3."+tickets[0].quotaName[2]+"\n4."+tickets[0].quotaName[3]+"\n5."+tickets[0].quotaName[4]);
			selectQuota = scan.nextInt();
			if(selectQuota>5){
			System.out.println("\nInvalid Entry Try Again\n");
			}
			}while(selectQuota>5);
			System.out.println("Available Seats Are "+totalSeats+"\nEnter 1 To Book || Enter 0 to cancel : " );
			confirm = scan.nextInt();
			if(confirm == 1){
				trains[0].getPassenger();
				System.out.println("\n Now Available Seats Are "+trains[0].seats);
			}
			else{
				System.out.println("Booking canceled");
			}
		}
	}
}
public void displayTicket(){
	if(confirm == 1){
		System.out.println("\n");
		System.out.println("     ***Ticket Details***");
		System.out.println("\nPalakkad To "+printDestination);
		System.out.println("Train Name : "+trainName);
		System.out.println("Train Time : "+trainTime);
		System.out.println("Platform No : "+platformNo);
		System.out.println("Class : "+trains[0].sentClassName());
		System.out.println("Quota : "+tickets[0].quota(selectQuota));
		System.out.println("Ticket Price : "+(((ticketPrice+trains[0].sentClassPrice())*tickets[0].per()/100)+(ticketPrice+trains[0].sentClassPrice())));
		trains[0].putPassenger();
		}
	}
}