import java.io.*;
import java.util.*;
public class University
{
	public static College college=new College();
	public static void mainMenu()
	{
	System.out.println("\n\t\tMAIN MENU\t\t\n");
	System.out.println("\n\t\t1.ENQUIRY\n\t\t2.EXAMINATION\n\t\t3.LOGIN\n\t\t4.NOTIFICATION\n\t\t5.COLLEGES\n\t\t6.About us\n\t\t7.Contact us\n\t\t8.COURSES ");
		Scanner input=new Scanner(System.in);
		int selectInput=input.nextInt();
		switch(selectInput)
		{
		case 1:Enquiry();
		break;
		case 2:Examination();
		break;
		case 3:Login();
		break;
		case 4:Notification();
		break;
		case 5:College_List();
		break;
		case 6:About_us();
		break;
		case 7:Contact_us();
		break;
		case 8:Courses();
		break;
		default:System.out.println("Invalid Input");
		}
	}
	public static void Enquiry()
	{
		System.out.println("Enquiry Details");
	}
	public static void Examination()
	{
		System.out.println("Examination Cell");
	}
	public static void Login()
	{
		Scanner input2=new Scanner(System.in);
		System.out.println("Login");
		System.out.println("E_mail:");
		String email=input2.nextLine();
		System.out.println("Password:");
		String passwrd=input2.nextLine();
		
	}
	public static void Notification()
	{
		System.out.println("Notifications");
	}
	public static void College_List()
	{
		System.out.println("List of Colleges");
		System.out.println("\n1.Ahalia School of Engineering and Technology\n2.Ammini college of Engineering\n3.Nehru college of Engineering\n4.Sreepathy Institute of Management and Technology");
		Scanner input=new Scanner(System.in);
		int selectCollege=input.nextInt();
		switch(selectCollege)
		{
		case 1:College.Ahalia();
		break;
		case 2:College.Ammini();
		break;
		case 3:College.Nehru();
		break;
		case 4:College.Sreepathy();
		break;
		default:mainMenu();
		}
	}
	public static void About_us()
	{
		System.out.println("Adress:");
	}
	public static void Contact_us()
	{
		System.out.println("Contact Details:\ne-mail:");
		
	}
	public static void Exit()
	{
		mainMenu();
	}
	public static void Courses()
	{
		System.out.println("Courses Offered:");
	}
}