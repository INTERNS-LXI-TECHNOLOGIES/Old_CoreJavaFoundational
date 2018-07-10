//package com.lxisoft.universitymanage.university;
import java.io.*;
import java.util.*;

public class University
{
	//public static College col=new College();
	public static void Mainmenu()
	{
		System.out.println("\n\n\t\t\t\t\t\t\t\t************HOME PAGE**************");
		System.out.println("\n\n\t\t\t1.ENQUIRY\t\t2.FACULTY DETAILS\t\t3.STUDENT DETAILS\t\t4.EXAMINATION CELL\t\t5.COLLEGE LISTS\t\t6.EXIT");
		System.out.println("\n\n");
		Scanner input=new Scanner(System.in);
		int selection = input.nextInt();	
		switch(selection)
		{
			
			case 1:Enquiry();
					break;
			case 2:Faculty.Faculty_details();
					break;
			case 3:Student.Student_details();
					break;
			case 4:Examination();
					break;
			case 5:College_Lists();
					break;
			case 6:Exit();
					break;
		}
		
	}
	
	public static void Enquiry()
	{
		System.out.println("\t\t\t\t\t\t*******************ENQUIRY DETAILS*********************");
		
	}
	
	public static void Examination()
	{
		System.out.println("Examination cell");
	}
	public static void College_Lists()
	{
		
		System.out.println("List of Colleges");
		System.out.println("\n1.Ahalia School of Engineering and Technology\n2.Sreepathy Engineering college\n3.Nehru Engineering college\n4.Exit");
		Scanner input=new Scanner(System.in);
		int selection = input.nextInt();
		switch(selection)
		{
			case 1:College.Ahalia();
					break;
			case 2:College.Sreepathy();
					break;
			case 3:College.Nehru();
					break;
			case 4:Mainmenu();
					break;
		}
	}
	public static void Exit()
	{
		
	}
	public static void Result()
	{
		
	}
	public static void Logout()
	{
		System.out.println("\t\t\t\t\t\tLogout Successfully Completed");
		System.out.println("\n\nClick 1 for Home Page\t\t\t Click 2 for Exit");
		Scanner input=new Scanner(System.in);
		int selection = input.nextInt();
			
		switch(selection)
		{
			case 1:Mainmenu();
					break;
			case 2:Exit();
					break;
		}
	}
}