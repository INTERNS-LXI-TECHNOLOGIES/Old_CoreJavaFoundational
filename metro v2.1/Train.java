import java.util.Scanner;
public class Train
{
	String name,time;
	int trainNo;

	Coach[] coachs=new Coach[7];
	//Seat[] seats=new Seat[20];
	Scanner scan=new Scanner(System.in);
/*	public void setDetails()
	{
		for(int i=0;i<1;i++)
		{
			coachs[i]=new Coach();
		coachs[i].setDetails();
		}
	}*/
		
	public void coachDetails()
	{
		for(int i=0;i<7;i++){
	    coachs[i] = new Coach();
		}
	coachs[0].type="AC First class";
	coachs[1].type="AC 2-tier";
	coachs[2].type="AC 3-tier";
	coachs[3].type="First class";
	coachs[4].type="AC chair car";
	coachs[5].type="Sleeper";
	coachs[6].type="Second class";

	}
public void selectCoach()
{
		
	for(int i=0;i<7;i++)
	{
		coachs[i]=new Coach();
	coachs[i].setSeats();
	
	}
	
	System.out.println("1.AC First class\n2.AC 2-tier\n3.AC 3-tier\n4.First class\n5.AC Chair car\n6.Sleeper\n7.Second class");
	int choice=scan.nextInt();
	switch(choice)
	{
		case 1:
		coachs[0].seatDetails();
		
		break;
		case 2:
		coachs[1].seatDetails();

		break;
		case 3:
		coachs[2].seatDetails();
		
		break;
		case 4:
		coachs[3].seatDetails();
		
		break;
		case 5:
		coachs[4].seatDetails();
		
		break;
		case 6:
		coachs[5].seatDetails();
		
		break;
		case 7:
		coachs[6].seatDetails();
		
		
		break;
	}
}
}

