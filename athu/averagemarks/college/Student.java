package com.lxisoft.averagemarks.college;
import java.util.Scanner;
public class Student
{
public void inputDetails()
	
{
	
	Scanner sc=new Scanner(System.in);
Scanner sc1=new Scanner(System.in);
Scanner sc2=new Scanner(System.in);
Scanner sc3=new Scanner(System.in);
Scanner sc4=new Scanner(System.in);


System.out.println("ENTER NAME");
String name=sc.nextLine();

System.out.println("ENTER ID");
int id=sc1.nextInt();

System.out.println("ENTER MARKS OF SUB1");
int mark1=sc2.nextInt();

System.out.println("ENTER MARKS OF SUB2");
int mark2=sc3.nextInt();

System.out.println("ENTER MARKS OF SUB3");
int mark3=sc4.nextInt();

double average = (mark1+mark2+mark3)/3;
System.out.println("AVERAGE MARKS ARE " + average);

}

}
