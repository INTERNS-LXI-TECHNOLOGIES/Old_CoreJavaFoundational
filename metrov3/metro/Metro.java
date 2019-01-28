package com.lxisoft.metrov3.metro;
import com.lxisoft.metrov3.ticket.Ticket;  
import java.util.Scanner;
import java.util.ArrayList;
public class Metro
{
	
	private String noOfTicket;
	
	private ArrayList <Platform> platforms;
	
	private Passenger passenger; 
	Ticket ticket=new Ticket();
	Scanner scan=new Scanner(System.in);
	public void setNoOfTicket(String noOfTicket)
	{
		this.noOfTicket=noOfTicket;
	}
	public String getNoOfTicket()
	{
		return noOfTicket;
	}
	
	public void setPlatforms(ArrayList <Platform> platforms) 
	{
		this.platforms=platforms;
	}
	public ArrayList <Platform> getPlatforms()
	{
		return platforms;
	}
	public void setPassenger(Passenger passenger)
	{
		this.passenger=passenger;
	}
	public Passenger getPassenger()
	{
		return passenger;
	}
	public void setTicket(Ticket ticket)
	{
		this.ticket=ticket;
	}
	public Ticket getTicket()
	{
		return ticket;
	}
	

	
	public Metro()
{

	
	System.out.println("WELCOME TO THRISSUR RAILWAY STATION");
		System.out.print("How many tickets you want:");
		setNoOfTicket(scan.nextLine());
	
}
	
	public void setPlatDetails()
	{
		
		setPlatforms(new ArrayList <Platform>());
		for(int i=0;i<6;i++)
		{
			getPlatforms().add(new Platform());
			getPlatforms().get(i).trainDetails();
			getPlatforms().get(i).setPfNo(i+1);

		}
		
	}

	
	public void checkDetails()
		{
		System.out.println("Train destinations are\n1.Trivandrum \n2.Ernamkulam\n3.Kottayam\n4.Palakkad\n5.Kozhikode\n");
		int select=scan.nextInt();

		switch(select)
		{
		case 1:	
			System.out.println("1."+getPlatforms().get(0).getTrains().get(0).getName()+" "+getPlatforms().get(0).getTrains().get(0).getTrainNo()+" at "+getPlatforms().get(0).getTrains().get(0).getTime()+" on platform number "+getPlatforms().get(0).getPfNo()+"\n2."+getPlatforms().get(0).getTrains().get(1).getName()+" "+getPlatforms().get(1).getTrains().get(1).getTrainNo()+" at "+getPlatforms().get(1).getTrains().get(1).getTime()+" on platform number "+getPlatforms().get(1).getPfNo()+"\n");
			int choice1=scan.nextInt();
			switch(choice1)
			{
			case 1:
			getPlatforms().get(0).getTrains().get(0).selectCoach();
			break;
			case 2:
			getPlatforms().get(1).getTrains().get(1).selectCoach();
			break;
			default:System.out.println("Trains not available");
			}
			break;
		case 2:
			System.out.println("1."+getPlatforms().get(0).getTrains().get(0).getName()+" "+getPlatforms().get(0).getTrains().get(0).getTrainNo()+" at "+getPlatforms().get(0).getTrains().get(0).getTime()+" on platform number "+getPlatforms().get(0).getPfNo()+"\n2."+getPlatforms().get(1).getTrains().get(1).getName()+" "+getPlatforms().get(1).getTrains().get(1).getTrainNo()+" at "+getPlatforms().get(1).getTrains().get(1).getTime()+" on platform number "+getPlatforms().get(1).getPfNo()+"\n3."+getPlatforms().get(2).getTrains().get(2).getName()+" "+getPlatforms().get(2).getTrains().get(2).getTrainNo()+" at "+getPlatforms().get(2).getTrains().get(2).getTime()+" on platform number "+getPlatforms().get(2).getPfNo()+"\n");
			int choice2=scan.nextInt();
			switch(choice2)
			{
			case 1:
			getPlatforms().get(0).getTrains().get(0).selectCoach();
			
			break;
			case 2:
			getPlatforms().get(1).getTrains().get(1).selectCoach();
			
			break;
			case 3:
			getPlatforms().get(2).getTrains().get(2).selectCoach();
			
			break;
			default:System.out.println("Trains not available");
			}
			break;
		case 3:
			System.out.println("1."+getPlatforms().get(0).getTrains().get(0).getName()+" "+getPlatforms().get(0).getTrains().get(0).getTrainNo()+" at "+getPlatforms().get(0).getTrains().get(0).getTime()+" on platform number "+getPlatforms().get(0).getPfNo()+"\n2."+getPlatforms().get(1).getTrains().get(1).getName()+" "+getPlatforms().get(1).getTrains().get(1).getTrainNo()+" at "+getPlatforms().get(1).getTrains().get(1).getTime()+" on platform number "+getPlatforms().get(1).getPfNo()+"\n");
			int choice3=scan.nextInt();
			switch(choice3)
			{
			case 1:
			getPlatforms().get(0).getTrains().get(0).selectCoach();
			
			break;
			case 2:
			getPlatforms().get(1).getTrains().get(1).selectCoach();
		
			break;
			default:System.out.println("Trains not available");
			}
			break;
		case 4:
			System.out.println("1."+getPlatforms().get(3).getTrains().get(3).getName()+""+getPlatforms().get(3).getTrains().get(3).getTrainNo()+" at "+getPlatforms().get(3).getTrains().get(3).getTime()+" on platform number "+getPlatforms().get(3).getPfNo()+"\n2."+getPlatforms().get(4).getTrains().get(4).getName()+""+getPlatforms().get(4).getTrains().get(4).getTrainNo()+" at "+getPlatforms().get(4).getTrains().get(4).getTime()+" on platform number "+getPlatforms().get(4).getPfNo()+"\n");
			int choice4=scan.nextInt();
			switch(choice4)
			{
			case 1:
			getPlatforms().get(3).getTrains().get(3).selectCoach();
			
			break;
			case 2:
			getPlatforms().get(4).getTrains().get(4).selectCoach();
			
			break;
			default:System.out.println("Trains not available");
			}
			break;
		case 5:
			System.out.println("1."+getPlatforms().get(5).getTrains().get(5).getName()+" "+getPlatforms().get(5).getTrains().get(5).getTrainNo()+" at "+getPlatforms().get(5).getTrains().get(4).getTime()+" on platform number "+getPlatforms().get(5).getPfNo()+"\n2."+getPlatforms().get(0).getTrains().get(0).getName()+" "+getPlatforms().get(0).getTrains().get(4).getTrainNo()+" at "+getPlatforms().get(0).getTrains().get(5).getTime()+" on platform number "+getPlatforms().get(0).getPfNo()+"\n");
			int choice5=scan.nextInt();
			switch(choice5)
			{
			case 1:
			getPlatforms().get(5).getTrains().get(5).selectCoach();
		
			break;
			case 2:
			getPlatforms().get(0).getTrains().get(0).selectCoach();
			
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
			setPassenger(new Passenger());
			int selectNo;
			//String noOfTicket;
			int maxSeats=35;
		int coachSeats=5;
		//int found=1;
		//int pos=0;
		int[] bookedSeats=new int[coachSeats];
		int[] seatNo=new int[5]; 
		seatNo[0]=1;seatNo[1]=2;seatNo[2]=3;seatNo[3]=4;seatNo[4]=5;
		
		for(int i=0;i<Integer.parseInt(getNoOfTicket());i++)
		{
			System.out.print("Select your seat:");
		selectNo=scan.nextInt();
			passengerDetails();
			
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
		ticket.ticketDetails();	
		}
		
		
	public Ticket passengerDetails()
		{
		
		
		System.out.print("Passenger Name:");
		ticket.setName(scan.next());
		System.out.print("Gender:");
		ticket.setGender(scan.next());
		System.out.print("Age:");
		ticket.setAge(scan.next());

		System.out.print("Aaadhar Number:");
		ticket.setAadharNo(scan.next());
		System.out.print("Price:");
		ticket.setPrice(scan.next());
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
	
	



		
		

	



