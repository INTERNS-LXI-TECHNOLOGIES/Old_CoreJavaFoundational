import java.io.*;
import java.util.*;
public class College
{
	public static Library library=new Library();
	public static Laboratory lab=new Laboratory();
	public static Department department=new Department();
	/*public static void Ahalia()
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
	}*/
	public static void collegeHome()
	{
	System.out.println("\n\t\t1.ONLINE REGISTARTION\n\t\t2.LOGIN \n\t\t3.LIBRARY\n\t\t4.TIMETABLE\n\t\t5.DEPARTMENT\n\t\t6.ABOUT US\n\t\t7.CONTACT US\n\t\t8.COURSES");
		Scanner input=new Scanner(System.in);
		int selectInput=input.nextInt();
		switch(selectInput)
		{
		case 1:OnlineReg();
				break;
		case 2:Login();
				break;
		case 3:Library();
				break;
		case 4:Timetable();
				break;
		case 6:Department_list();
				break;
		case 7:University.About_us();
				break;
		case 8:University.Contact_us();
				break;
		case 9:University.Courses();
				break;
		default:System.out.println("<<<<<<<<<<<<<<<<<<<<<<Thank You>>>>>>>>>>>>>>>>>>>>>>>");
		}
	}
	public static void Timetable()
	{
		
	}
	public static void OnlineReg()
	{
		Scanner input1=new Scanner(System.in);
		System.out.println(" \n1.Student Registration: \n2.Faculty Registration:");
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
		int selectDepartment=input3.nextInt();
		switch(selectDepartment)
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
	public static void Login()
	{
		Scanner input4=new Scanner(System.in);
		System.out.println(" \n1.Student Login: \n2.Faculty Login:");
		int L_key=input4.nextInt();
		switch(L_key)
		{
		
		case 1:Student.StudentLogin();
		break;
		case 2:Faculty.FacultyLogin();
		break;
		default:collegeHome();
		}
	}
	
}
	
