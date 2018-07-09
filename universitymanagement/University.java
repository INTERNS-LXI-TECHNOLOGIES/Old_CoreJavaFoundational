//package com.lxisoft.universitymanage.university;
import java.io.*;
import java.util.*;
public class University
{
	//public static College col=new College();
	public static void Mainmenu()
	{
		System.out.println("\n\n\t\t\t\t\t\t\t\t************MAIN MENU**************");
		System.out.println("\n\n\t\t\t1.ENQUIRY\t\t2.REGISTRATION\t\t3.LOGIN\t\t4.EXAMINATION\t\t5.COLLEGE LISTS\t\t6.EXIT");
		System.out.println("\n\n");
		Scanner input=new Scanner(System.in);
		int selection = input.nextInt();
			
		switch(selection)
		{
			case 1:Enquiry();
					break;
			case 2:Registration();
					break;
			case 3:Login();
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
	public static void Registration()
	{
		System.out.println("REGISTRATION FORM");
	}
	public static void Login()
	{
		System.out.println("LOGIN");
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
}