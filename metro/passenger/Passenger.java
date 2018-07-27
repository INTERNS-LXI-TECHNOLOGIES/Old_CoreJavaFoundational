package com.lxisoft.metro.passenger;
import com.lxisoft.metro.passenger.PassengerDetails;
import java.util.Scanner;
public class Passenger
{
PassengerDetails p=new PassengerDetails();
public void detail()
{

Scanner sr=new Scanner(System.in);
System.out.println("enter the passenger name:");
String name =sr.nextLine();
p.setName(name);
System.out.println("enter the passenger age:");
int age=sr.nextInt();
p.setAge(age);
Scanner sa=new Scanner(System.in);
System.out.println("enter the gender:");
String gender=sa.nextLine();
p.setGender(gender);
}
public void ticket()
{
System.out.println(" passenger name:"+p.getName());
System.out.println( "passenger age:"+p.getAge());
System.out.println("gender:"+ p.getGender());
}
}

