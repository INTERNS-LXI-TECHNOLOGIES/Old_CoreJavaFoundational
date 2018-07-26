package com.lxisoft.program;
import java.util.*;


public class Station
{
	String stationName;
	Platform p;
	int choice;
	char ch,ch1;
	Timetable t;
	int location;
	RateEnquiry rt;
	BookMeal bm;
	public Station(String stationName)
	{
		this.stationName=stationName;
	}
	public void printDetails()
	{
		Scanner sc=new Scanner(System.in);
		Scanner rd=new Scanner(System.in);
		do
		{
			System.out.println(stationName);
			System.out.println("\n****************************************");
			System.out.println("|		   MENU				    |");
			System.out.println("****************************************");
			System.out.println("1.BOOK TICKET                           ");
			System.out.println("2.CANCEL TICKET                         ");
			System.out.println("3.SEAT AVAILABILITY                     ");
			System.out.println("4.PLATFORM DETAILS                      ");
			System.out.println("5.BOOK MEAL                             ");
			System.out.println("6.TIME TABLE                            ");
			System.out.println("7.STATION LIST                          ");
			System.out.println("8.RATE ENQUIRY                          ");
			System.out.println("****************************************\n");
			System.out.println("Enter your choice(1-10)");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					p=new Platform();
					//assume there is 2 platform for each station
					do{

						System.out.println("******************************************");
						System.out.println("PLATFORM DETAILS\n");
						p.printDetails();
						System.out.println("******************************************");
						System.out.println("\nDo you want to check another platform details");
						ch1=rd.next().charAt(0);
					}while(ch1=='y' || ch1=='Y');
					break;
				case 5:
					bm=new BookMeal();
					bm.printDetails();
					break;
				case 6:
					do{
						System.out.println("******************************************");
						System.out.println("Enter the location from which you need the timetable:\n1.ALUVA\n2.KALOOR\n3.KADAVANTHRA\n4.ERNAKULAM\n");
						System.out.println("******************************************");
						location=sc.nextInt();
						t=new Timetable(location);
						t.printTimetable();
						System.out.println("Do you want to check another station details");
						ch1=rd.next().charAt(0);
					}while(ch1=='y' || ch1=='Y');
					break;
				case 7:
					System.out.println("\n****************************************");
					System.out.println("STATION LIST");
					System.out.println("******************************************");
					System.out.println("1.ALUVA");
					System.out.println("2.KALOOR");
					System.out.println("3.KADAVANTHRA");
					System.out.println("4.ERNAKULAM");
					System.out.println("****************************************\n");
					break;
				case 8:
					do{
						rt=new RateEnquiry();
						System.out.println("\n****************************************\nRATE ENQUIRY\n****************************************");
						rt.printDetails();
						System.out.println("*****************************************");
						System.out.println("Do you wish to check another rate enquiry");
						ch1=rd.next().charAt(0);
					}while(ch1=='y' || ch1=='Y');
						break;
				default:
					System.out.println("Invalid choice");
			}



			System.out.println("Do you want to select the menu once more(y/n)");
			ch=rd.next().charAt(0);

		}while(ch=='y' || ch =='Y');
	}

}