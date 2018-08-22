package com.lxisoft.metromanagement.metro;
import com.lxisoft.metromanagement.metro.*;
import java.util.Scanner;
import java.util.*;
public class Station
{
	Train[] t;
	int noOfTrain;
	Coach[] c=new Coach[1000];
	int modeSelect;
	int stationNo;
	String stationName;
	//String location;
	//int establishYear;
	public void stationval()
{
	
	Scanner in=new Scanner(System.in);
	System.out.println("=========================================================================================");
	System.out.println("=================================WELCOME TO METRO PORTAL=================================");
	System.out.println("=========================================================================================");
	System.out.println("=====================DATA ENTRY MODE=============================");
	editormode();
	System.out.println("ENTER THE OPTION");
	System.out.println("\n---------------------------------\n 1>>Display Train details \n 2>>Ticket Booking \n ---------------------------------");
    modeSelect=in.nextInt();
	switch(modeSelect)
	{
		case 1:
		{
			printmode();
		}
		break;
		case 2:
		{
		 bookmode();
		}
		break;
		default: System.out.println("enter Correct choice");
	}
	
}
	
	
	void editormode()
		{
			
			Scanner in=new Scanner(System.in);
			Scanner inpu=new Scanner(System.in);
			System.out.println("-------ENTER CURRENT STATION DETAILS ENTRY------");
			int stationlim;
			System.out.println("Enter the station number");
			stationNo=in.nextInt();
			System.out.println("Enter the Name of the Station");
			stationName=inpu.nextLine();
		//	System.out.println("Enter the Location of the Station");
		//	location=inpu.nextLine();
		//	System.out.println("Enter the Year of establish");
			//establishYear=in.nextInt();
			//Runtime.getRuntime().exec("cls");
			System.out.println("---------thankyou---------");
			trainmode();
		}
		void trainmode()
		{
			String namOfTrain;
			
			int trainNum;
			int traintime;
			int seatno;
			String trainorigin;
			String traindestination;
			int i=0;
			Scanner in=new Scanner(System.in);
			Scanner inpu=new Scanner(System.in);
			System.out.println("ENTER THE No OF TRAIN");
			noOfTrain=in.nextInt();
			t=new Train[noOfTrain];
			ArrayList<Train> trains=new ArrayList<Train>();
			for(i=0;i<noOfTrain;i++)
			{
				
				t[i]=new Train();
				System.out.println("ENTER THE NAME OF TRAIN");
			    namOfTrain=inpu.nextLine();
				trains.add(t[i]);
				t[i].settrainname(namOfTrain);
				System.out.println("ENTER THE TRAIN NUMBER");
				trainNum=in.nextInt();
				t[i].setTrainNo(trainNum);
				System.out.println("ENTER THE ORIGIN OF THE TRAIN");
				trainorigin=inpu.nextLine();
				t[i].setOrigin(trainorigin);
				System.out.println("ENTER THE DESTINATION");
				traindestination=inpu.nextLine();
				t[i].setDestination(traindestination);
				System.out.println("ENTER THE TIME DURATION OF TRAIN");
				traintime=in.nextInt();
				t[i].setTimeJourney(traintime);
				System.out.println("NUMBER OF SEATS");
				seatno=in.nextInt();
				t[i].setNoOfSeat(seatno);
				coachentry();
			}
		}
			public void coachentry()
			{
				int cnum;
				Scanner in=new Scanner(System.in);
				System.out.println("ENTER THE NUMBER OF COACEHS");
				cnum=in.nextInt();
				for(int j=0;j<cnum;j++)
				{
					System.out.println("******************\nENTER COACH DETAILS\n******************");
					int opt;
					System.out.println("SELECT COACH CLASS \n =============\n 1>> AC 2>>GEN");
					opt=in.nextInt();
					switch(opt)
					{
						case 1: 
						{	System.out.println("ENTER THE DETAILS OF AC COACH");
							int cno;
							int sno;
							int fre;
							Scanner inc=new Scanner(System.in);
							Coach[] c=new Accoach[cnum];
							System.out.println("Enter the coach number");
							cno=inc.nextInt();
							c[j].setCoachNo(cno);
							c[j].getCoachNo();
							System.out.println("Enter the seat number");
							sno=inc.nextInt();
							c[j].setSeatNo(sno);
							System.out.println("Enter the fare for ac");
							fre=inc.nextInt();
							c[j].setFare(fre);
							//c[j].type="AC";
						}
						break;
						case 2:
						{
							System.out.println("ENTER THE DETAILS OF GENERAL COACH");
							int cno;
							int sno;
							int fre;
							Scanner inc=new Scanner(System.in);
							Coach[] c=new Generalcoach[cnum];
							System.out.println("Enter the coach number");
							cno=inc.nextInt();
							c[j].setCoachNo(cno);
							System.out.println("Enter the seat number");
							sno=inc.nextInt();
							c[j].setSeatNo(sno);
							System.out.println("Enter the fare for gen");
							fre=inc.nextInt();
							c[j].setFare(fre);
							//c[j].type="gen";
						}
						break;
						default: System.out.println("Enter a opt");
					}
				}
			}
			public void printmode()
			{
				int i=0;
				System.out.println("-----------------------Train Details----------------");
				System.out.println("TRAIN.NO"+"\t"+"TRAIN NAME"+"\t"+"TRAIN ORIGIN"+"\t"+"TRAIN DESTINATION"+"\t"+"TRAVEL DURATION"+"\t"+"NO OF SEAT");
				for(i=0;i<noOfTrain;i++)
				{
					System.out.println(t[i].getTrainNo());
			    }
			}
			public void  bookmode()
			{
				
			}
			
}