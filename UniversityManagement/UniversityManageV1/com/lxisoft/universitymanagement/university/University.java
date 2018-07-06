package com.lxisoft.universitymanagement.university;
import java.util.Scanner;
import java.io.File;

public class University
{
	private enum Course{MECHANICAL,ELECTRICAL,ELECTRONICS,AUTOMOBILE,COMPUTER,MECHATRONICS,CIVIL}
	
	
	public void printMainMenu()
	{
		System.out.println("--------------------------------------------------Kerala Technological University----------------------------------------------------\n");
		System.out.println("-------------------------------------------------------------Menu---------------------------------------------------------------------\n");
		System.out.println("--------------1.Registration--------------2.Login--------------3.Courses--------------4.Examination--------------5.Inquiry------------");
		System.out.print("Choose an option: ");
		Scanner in=new Scanner(System.in);
		int choice=in.nextInt();
		doMainChoice(choice);
	}
	
	public void doMainChoice(int choice)
	{
		System.out.print("You chose  ");
		switch(choice)
		{
			case 1:System.out.println("Registration\n"); registration(); break;
			case 2:System.out.println("Login\n"); login(); break;
			case 3:System.out.println("Courses\n"); printCourses(); break;
			case 4:System.out.println("Examination\n"); examination(); break;
			case 5:System.out.println("Inquiry\n"); inquiry(); break;
			default:System.out.println("a wrong option\n"); break;
		}
	}
	
	public void registration()
	{
		System.out.println("1.College Registration\n2.Student Registration\n3.Faculty Registration");
	}
	
	public void login()
	{
		System.out.println("1.College login\n2.Student login");
	}
	
	public void printCourses()
	{
		for(Course c:Course.values())
		{
			System.out.println(c);
		}
	}
	
	public void examination()
	{
		System.out.println("1.Examination Notification\n2.Examination results");
	}
	
	public void inquiry()
	{
		System.out.println("1.College Details\n2.Student Details\n3.Faculty Details");
		System.out.print("Choose an option : ");
		Scanner in=new Scanner(System.in);
		int choice=in.nextInt();
		switch(choice)
		{
			case 1:collegeDetails(); break;
			case 2:studentDetails(); break;
			case 3:facultyDetails(); break;
			default:System.out.println("a wrong option\n"); break;
		}
	}
	
	public void collegeDetails()
	{
		
	}
	
	public void  studentDetails()
	{
		
	}
	
	public void facultyDetails()
	{
		
	}
}