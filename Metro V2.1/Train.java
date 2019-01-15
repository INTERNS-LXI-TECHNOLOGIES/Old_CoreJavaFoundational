import java.util.Scanner;
public class Train{
	Passenger[] passenger;
	Scanner scan = new Scanner(System.in);
	String name;
	String time;
	int platform;
	int seats = 50;
	int noOfTicket;
	int selectClass;
	Class classes = new Class();
public int noOfTicket(){
	System.out.println("No of Tickets");
	noOfTicket = scan.nextInt();
	passenger  = new Passenger[noOfTicket];
	for(int i=0;i<noOfTicket;i++){
		passenger[i] = new Passenger();
		seats--;
	}
	return noOfTicket;
}	

public void getPassenger(){
	for(int i=0;i<noOfTicket;i++){
		System.out.println("\nEnter Passenger Details No "+(i+1)+"\n");
		passenger[i].passDetails();
	}
}


public void putPassenger(){
	for(int i=0;i<noOfTicket;i++){
		System.out.println("\n\n Passenger Details No "+(i+1));
		passenger[i].passDisplay();
	}
}
public void classDetails(){
	System.out.println("Select Class\n"+"1."+classes.classOneA+"\n2."+classes.classtwoA+"\n3."+classes.classthreeA+"\n4."+classes.classFC+"\n5."+classes.classCC+"\n6."+classes.classSL+"\n7."+classes.classTwoS);
			selectClass = scan.nextInt();
			if(selectClass>7){
			System.out.println("\nInvalid Entry Try Again\n");
			}while(selectClass>7);
}
public String sentClassName(){
	return classes.selectClass(selectClass);
}
public int sentClassPrice(){
	return classes.setClassPrice();
}
}