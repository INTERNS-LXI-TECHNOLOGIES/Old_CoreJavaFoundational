import java.util.Scanner;
public class Metro
{
	
	String noOfTicket;
	
	Platform[] platforms;
	Ticket[] tickets;
	Passenger passenger=new Passenger();
	Scanner scan=new Scanner(System.in);
	public Metro()
{

	
	System.out.println("WELCOME TO THRISSUR RAILWAY STATION");
		System.out.print("How many tickets you want:");
		noOfTicket=scan.nextLine();
		int noOfTick=Integer.parseInt(noOfTicket);
}
	
	public void setPlatDetails()
	{
		platforms=new Platform[6];
		
		
		for(int i=0;i<6;i++)
		{
			platforms[i]=new Platform();
			platforms[i].trainDetails();
		}
		platforms[0].pfNo=1;
		platforms[1].pfNo=2;
		platforms[2].pfNo=3;
		platforms[3].pfNo=4;
		platforms[4].pfNo=5;
		platforms[5].pfNo=6;
		
	}

	
	public void checkDetails()
		{
		String destin;
		int selectTrain;
		System.out.println("Train destinations are\n1.Trivandrum \n2.Ernamkulam\n3.Kottayam\n4.Palakkad\n5.Kozhikode\n");
		int select=scan.nextInt();

		switch(select)
		{
		case 1:	
			System.out.println("1."+platforms[0].trains[0].name+" "+platforms[0].trains[0].trainNo+" at "+platforms[0].trains[0].time+" on platform number "+platforms[0].pfNo+"\n2."+platforms[1].trains[1].name+" "+platforms[1].trains[1].trainNo+" at "+platforms[1].trains[1].time+" on platform number "+platforms[1].pfNo+"\n");
			int choice1=scan.nextInt();
			switch(choice1)
			{
			case 1:
			platforms[0].trains[0].selectCoach();
			selectTrain=0;
			break;
			case 2:
			platforms[1].trains[1].selectCoach();
			selectTrain=1;
			break;
			default:System.out.println("Trains not available");
			}
			break;
		case 2:
			System.out.println("1."+platforms[0].trains[0].name+" "+platforms[0].trains[0].trainNo+" at "+platforms[0].trains[0].time+" on platform number "+platforms[0].pfNo+"\n2."+platforms[1].trains[1].name+" "+platforms[1].trains[1].trainNo+" at "+platforms[1].trains[1].time+" on platform number "+platforms[1].pfNo+"\n3."+platforms[2].trains[2].name+" "+platforms[2].trains[2].trainNo+" at "+platforms[2].trains[2].time+" on platform number "+platforms[2].pfNo+"\n");
			int choice2=scan.nextInt();
			switch(choice2)
			{
			case 1:
			platforms[0].trains[0].selectCoach();
			selectTrain=0;
			break;
			case 2:
			platforms[1].trains[1].selectCoach();
			selectTrain=1;
			break;
			case 3:
			platforms[2].trains[2].selectCoach();
			selectTrain=2;
			break;
			default:System.out.println("Trains not available");
			}
			break;
		case 3:
			System.out.println("1."+platforms[0].trains[0].name+" "+platforms[0].trains[0].trainNo+" at "+platforms[0].trains[0].time+" on platform number "+platforms[0].pfNo+"\n2."+platforms[1].trains[1].name+" "+platforms[1].trains[1].trainNo+" at "+platforms[1].trains[1].time+" on platform number "+platforms[1].pfNo+"\n");
			int choice3=scan.nextInt();
			switch(choice3)
			{
			case 1:
			platforms[0].trains[0].selectCoach();
			selectTrain=0;
			break;
			case 2:
			platforms[1].trains[1].selectCoach();
			selectTrain=1;
			break;
			default:System.out.println("Trains not available");
			}
			break;
		case 4:
			System.out.println("1."+platforms[3].trains[3].name+""+platforms[3].trains[3].trainNo+" at "+platforms[3].trains[3].time+" on platform number "+platforms[3].pfNo+"\n2."+platforms[4].trains[4].name+""+platforms[4].trains[4].trainNo+" at "+platforms[4].trains[4].time+" on platform number "+platforms[4].pfNo+"\n");
			int choice4=scan.nextInt();
			switch(choice4)
			{
			case 1:
			platforms[3].trains[3].selectCoach();
			selectTrain = 3;
			break;
			case 2:
			platforms[4].trains[4].selectCoach();
			selectTrain=4;
			break;
			default:System.out.println("Trains not available");
			}
			break;
		case 5:
			System.out.println("1."+platforms[5].trains[5].name+" "+platforms[5].trains[5].trainNo+" at "+platforms[5].trains[4].time+" on platform number "+platforms[5].pfNo+"\n2."+platforms[0].trains[0].name+" "+platforms[0].trains[4].trainNo+" at "+platforms[0].trains[5].time+" on platform number "+platforms[0].pfNo+"\n");
			int choice5=scan.nextInt();
			switch(choice5)
			{
			case 1:
			platforms[5].trains[5].selectCoach();
			selectTrain=5;
			break;
			case 2:
			platforms[0].trains[0].selectCoach();
			selectTrain=0;
			break;
			default:System.out.println("Trains not available");
			break;
			}
			default:System.out.println("wrong destination");
			break;
			}
		}

		public void seatBooking()
		{
			int selectNo;
			//String noOfTicket;
			int maxSeats=35;
		int coachSeats=5;
		//int found=1;
		//int pos=0;
		int[] bookedSeats=new int[coachSeats];
		int[] seatNo=new int[5]; 
		seatNo[0]=1;seatNo[1]=2;seatNo[2]=3;seatNo[3]=4;seatNo[4]=5;
		
		for(int i=0;i<Integer.parseInt(noOfTicket);i++)
		{
			System.out.print("Select your seat:");
		selectNo=scan.nextInt();
			passenger.ticket=passengerDetails();
			
		for(int j=0;j<coachSeats;j++)
		{
		if(seatNo[j]==selectNo){
		bookedSeats[selectNo-1]=selectNo;}}
		/*System.out.print("Booked seat number:"+seatNo[j]+"\n");
		 found=1;
		 pos=j;
		break;}
		}
		
	
		if(found==1)
		{
			coachSeats = coachSeats -1;
		for(int j=0;j<=coachSeats;j++)
		{
			if((seatNo[j])==selectNo){
			seatNo[j]=seatNo[j+1];
			}
		}*/
		System.out.print("Rest of the seat numbers");
		for(int j=0;j<coachSeats;j++)
		{

		if(bookedSeats[selectNo-1]!=seatNo[j])	
		System.out.print(seatNo[j]+"\n");
			
		}
		
		
	
		
		
		}	
		passenger.ticket.ticketDetails();	
		}
		
		
	public Ticket passengerDetails()
		{
		Ticket ticket=new Ticket();
		
		System.out.print("Passenger Name:");
		ticket.name=scan.next();
		System.out.print("Gender:");
		ticket.gender=scan.next();
		System.out.print("Age:");
		ticket.age=scan.next();

		System.out.print("Aaadhar Number:");
		ticket.aadharno=scan.next();
		//System.out.print("Price:"+(scan.next()));
		return ticket;
		}
	}
		
/*public void ticketDetails()
{
  String name;
	String gender;
	String age;
	String aadharno;
	int selectTrain;
	
	int coachChoice=platforms[selectTrain].trains[selectTrain].choice;
	
platforms[selectTrain].trains[selectTrain].coachs[coachChoice-1].seats[selectNo].passengers.name =name;
platforms[selectTrain].trains[selectTrain].coachs[coachChoice-1].seats[selectNo].passengers.gender=gender;
platforms[selectTrain].trains[selectTrain].coachs[coachChoice-1].seats[selectNo].passengers.age=age;
platforms[selectTrain].trains[selectTrain].coachs[coachChoice-1].seats[selectNo].passengers.aadharno=aadharno;
platforms[selectTrain].trains[selectTrain].coachs[coachChoice-1].seats[selectNo].passengers.setDetails();


}	*/	
	
	


	
			

		
		

	



