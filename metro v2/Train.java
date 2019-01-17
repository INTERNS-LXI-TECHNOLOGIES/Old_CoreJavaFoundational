import java.util.Scanner;
public class Train
{
	String destin;
	String name,time;
	int choice;
	int trainNo;
	Coach[] coachs=new Coach[7];
	Scanner scan=new Scanner(System.in);
	public void setDetails()
	{
		for(int i=0;i<7;i++){
	    coachs[i] = new Coach();
		}
	coachs[0].name="AC First class";
	coachs[1].name="AC 2-tier";
	coachs[2].name="AC 3-tier";
	coachs[3].name="First class";
	coachs[4].name="AC chair car";
	coachs[5].name="Sleeper";
	coachs[6].name="Second class";

	}
public void selectCoach(){

	System.out.println("1.AC First class\n2.AC 2-tier\n3.AC 3-tier\n4.First class\n5.AC Chair car\n6.Sleeper\n7.Second class");
	choice=scan.nextInt();
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

