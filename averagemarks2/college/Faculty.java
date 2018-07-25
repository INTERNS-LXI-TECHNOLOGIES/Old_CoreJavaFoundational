package com.lxisoft.averagemarks.college;
import java.util.Scanner;
public class Faculty
{
public void display()
{
Scanner sc1= new Scanner(System.in);
//Scanner n=new Scanner();
System.out.println("FACULTY NAME");
String name=sc1.nextLine();

System.out.println("ENTER THE NUMBER OF SESSIONS TAKEN");
int no=sc1.nextInt();

float salary = no*250;
System.out.println("TOTAL SALARY=" +salary);


}
}