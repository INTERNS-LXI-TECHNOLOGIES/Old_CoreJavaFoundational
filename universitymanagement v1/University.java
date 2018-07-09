import java.io.*;
import java.util.*;
public class University
{
	College college=new College();
	public void mainMenu()
	{
	System.out.println("\n\t\tMAIN MENU\t\t\n");
	System.out.println("\n\t\t1.ENQUIRY\n\t\t2.REGISTRATION\n\t\t3.EXAMINATION\n\t\t4.LOGIN\n\t\t5.NOTIFICATION\n\t\t6.COLLEGES\n\t\t7.About us\n\t\t8.Contact us");
		Scanner input=new Scanner(System.in);
		int selectInput=input.nextInt();
		switch(selectInput)
		{
		case 1:Enquiry();
		break;
		case 2:Registration();
		break;
		case 3:Examination();
		break;
		case 4:Login();
		break;
		case 5:Notification();
		break;
		case 6:College_List();
		break;
		case 7:About_us();
		break;
		case 8:Contact_us();
		break;
		default:System.out.println("Invalid Input");
		}
	}
	public void Enquiry()
	{
		System.out.println("Enquiry Details");
	}
	public void Registration()
	{
		System.out.println("Registration Form");
	}
	public void Examination()
	{
		System.out.println("Examination Cell");
	}
	public void Login()
	{
		System.out.println("Login");
	}
	public void Notification()
	{
		System.out.println("Notifications");
	}
	public void College_List()
	{
		System.out.println("List of Colleges");
		System.out.println("\n1.Ahalia School of Engineering and Technology\n2.Ammini college of Engineering\n3.Nehru college of Engineering\n4.Sreepathy Institute of Management and Technology");
		Scanner input=new Scanner(System.in);
		int selectCollege=input.nextInt();
		switch(selectCollege)
		{
		case 1:college.Ahalia();
		break;
		case 2:college.Ammini();
		break;
		case 3:college.Nehru();
		break;
		case 4:college.Sreepathy();
		break;
		default:mainMenu();
		}
	}
	public void About_us()
	{
		System.out.println("Adress:");
	}
	public void Contact_us()
	{
		System.out.println("Contact Details:\ne-mail:");
		
	}
	public void Exit()
	{
		mainMenu();
	}
}