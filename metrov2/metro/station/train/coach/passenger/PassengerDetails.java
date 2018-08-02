package com.lxisoft.metrov2.metro.station.train.coach.passenger;
import com.lxisoft.metrov2.metro.station.train.coach.passenger.Passenger;
import java.util.Scanner;
public class PassengerDetails
{
public static void main(String args[])
{
Passenger passenger=new Passenger();

Scanner scan=new Scanner(System.in);
//int passengerNumber;
//String passengerName;
//String passengerGender;
System.out.println("ENTER PASSENGER NUMBER");
int passengerNumber=scan.nextInt();

for(int i=0; i < passengerNumber; i++)
{
System.out.println("ENTER PASSENGER NAME");
String passengerName=scan.nextLine();
passenger.setPassengerName(passengerName);

System.out.println("ENTER PASSENGER %i GENDER");
String passengerGender = scan.nextLine();
passenger.setPassengerGender(passengerGender);

}

}
}