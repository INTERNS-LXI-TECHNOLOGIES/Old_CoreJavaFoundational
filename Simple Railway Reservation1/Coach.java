import java.util.Scanner;
public class Coach
{

String coachNo;
Seat seat;
String classType;
int price;

Scanner scan=new Scanner(System.in);


public void setClassType()
{
     int n;
	 do{
		
		System.out.println("AVAILABLE CLASSES");
		System.out.println("_____________________");
		System.out.println("1.First AC Sleeper");
		System.out.println("2.Second AC Sleeper");
		System.out.println("3.First Class Non-AC");
		System.out.println("4.AC Sleeper Economy");
		System.out.println("5.Sleeper Class Non-AC");
		System.out.println("                      ");
		System.out.print("Please choose your class type :");
		n=scan.nextInt();
		
		  switch(n)
		{
			case 1:classType="First AC Sleeper";
			       price=1430;
			       break;
			case 2:classType="Second AC Sleeper";
			       price=1230;
			       break;
			case 3:classType="First Class Non-AC";
			       price=500;
			       break;
			case 4:classType="AC Sleeper Economy";
			       price=1435;
			       break;
			case 5:classType="Sleeper Class Non-AC";
			       price=750;
			       break;
			default:System.out.println("Invalid choice made...!!!");
			System.out.println("please try again....!!!");			
		}
		
		
		}while(n>5);
		
}

public void printClassType()
		{
			System.out.println("Class:"+classType);
		}

public void printPrice()
		{
			System.out.println(+price);
		}

public void setCoachNo()
		{
			System.out.print("Coach No:");
			coachNo=scan.next();
		}


public void printCoachNo()
		{
			System.out.println("Coach No:"+coachNo);
		}

}