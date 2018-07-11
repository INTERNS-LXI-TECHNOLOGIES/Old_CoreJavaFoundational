import java.io.*;
import java.util.*;
public class College
{
	public static Library library=new Library();
	public static Laboratory lab=new Laboratory();
	public static Department department=new Department();
	public static void Ahalia()
	{
		System.out.println("Ahalia School of Engineering and Technology");
		collegeHome();
	}
	public static void Ammini()
	{
		System.out.println("Ammini college of Engineering");
		collegeHome();
	}
	public static void Nehru()
	{
		System.out.println("Nehru college of Engineering");
		collegeHome();	
	}
	public static void Sreepathy()
	{
		System.out.println("Sreepathy Institute of Management and Technology");
		collegeHome();
	}
	public static void collegeHome()
	{
	System.out.println("\n\t\t1.ONLINE REGISTARTION\n\t\t2.NOTIFICATIONS\n\t\t3.SYLLUBUS\n\t\t4.LIBRARY\n\t\t5.TIMETABLE\n\t\t6.DEPARTMENTS\n\t\t7.About us\n\t\t8.Contact us\n\t\t9.COURSES ");
		Scanner input=new Scanner(System.in);
		int selectInput=input.nextInt();
		switch(selectInput)
		{
		case 1:OnlineReg();
				break;
		case 2:University.Notification();
				break;
		case 3:University.Syllubus();
				break;
		case 4:Library();
				break;
		case 5:University.Timetable();
				break;
		case 6:Department_list();
				break;
		case 7:University.About_us();
				break;
		case 8:University.Contact_us();
				break;
		case 9:University.Courses();
				break;
		default:System.out.println("Invalid Input");
		}
	}
	public static void OnlineReg()
	{
		Scanner input1=new Scanner(System.in);
		System.out.println("1.Student Registration: \n2.Faculty Registration: ");
		int key=input1.nextInt();
		switch(key)
		{
		case 1:Student.StudentRegistration();
		break;
		case 2:Faculty.FacultyRegistration();
		break;
		default:collegeHome();
		}
	}
	public static void Department_list()
	{
		System.out.println("\n1.Mechanical Engineering\n2.Civil Engineering\n3.Electronics and Communication Engineering\n4.Electrical Engineering\n5.Computer Science Engineering");
		Scanner input3=new Scanner(System.in);
		int selectdepartment=input3.nextInt();
		switch(selectdepartment)
		{
		case 1:Department.mech();
		break;
		case 2:Department.civil();
		break;
		case 3:Department.ece();
		break;
		case 4:Department.eee();
		break;
		case 5:Department.cse();
		break;
		default:System.out.println("    ");
		}	
	}
	public static void Library()
	{
		System.out.println("Library data");
	}
}
	
