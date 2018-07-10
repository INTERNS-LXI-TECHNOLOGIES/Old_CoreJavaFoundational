import java.io.*;
import java.util.*;
public class College
{
	public static Faculty fac=new Faculty();
	public static Student stu=new Student();
	//public static Department dept=new Department();
	public static void department()
	{
		System.out.println("\n1.CSE\n2.ECE\n3.MECH");
		Scanner input=new Scanner(System.in);
		int selection=input.nextInt();
		switch(selection)
		{
			case 1: dept.cse();
					break;
			case 2: dept.ece();
					break;.
			case 3: dept.mech();
					break;
		}
	}
	public static void Ahalia()
	{
		System.out.println("\nWelcome to Ahalia School of Engineering and Technology");
		System.out.println("\n1.ENQUIRY\t\t2.REGISTRATION\t\t3.LOGIN\t\t4.DEPARTMENT\t\t\t\t5.EXIT");
		Scanner input=new Scanner(System.in);
		int selection = input.nextInt();
			
		switch(selection)
		{
			case 1:University.Enquiry();
					break;
			case 2:Department.Registration();
					break;
			case 3:Department.Login();
					break;
			case 4:department();
					break;
			case 5:University.Mainmenu();
					break;
		}
	}
	public static void Sreepathy()
	{
		System.out.println("\nWelcome to Sreepathy Engineering College");
		System.out.println("\n1.ENQUIRY\t\t2.REGISTRATION\t\t3.LOGIN\t\t4.DEPARTMENT\t\t5.EXIT");
		Scanner input=new Scanner(System.in);
		int selection = input.nextInt();
			
		switch(selection)
		{
			case 1:University.Enquiry();
					break;
			case 2:Department.Registration();
					break;
			case 3:Department.Login();
					break;
			case 4:department();
					break;
			case 5:University.Mainmenu();
					break;
		}
	}
	public static void Nehru()
	{
		System.out.println("\nWelcome to Nehru College of Engineering");
		System.out.println("\n1.ENQUIRY\t\t2.REGISTRATION\t\t3.LOGIN\t\t4.DEPARTMENT\t\t5.EXIT");
		Scanner input=new Scanner(System.in);
		int selection = input.nextInt();
			
		switch(selection)
		{
			case 1:University.Enquiry();
					break;
			case 2:Department.Registration();
					break;
			case 3:Department.Login();
					break;
			case 4:department();
					break;
			case 5:University.Mainmenu();
					break;
		}
	}
	
}