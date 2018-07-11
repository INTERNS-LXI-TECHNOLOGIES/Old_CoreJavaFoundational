import java.io.*;
import java.util.*;
public class University
{
	public static College college=new College();
	//College.collegeHome();
	public static void universityHome()
	{
	System.out.println("\n\t\t\t\t\t\t\t\t\t\t\tDate:\n\t\t\t\t\t\t\t\t\t\t\tTime:\n");
	System.out.println("\n<1.ONLINE REGISTARTION>\t\t<2.EXAMINATION RESULTS>\t\t<3.SYLLUBUS>\t\t<4.NOTIFICATIONS>\n<5.TIMETABLE>\t\t<6.AFFILIATED COLLEGES>\t\t<7.About us>\t\t<8.Contact us>\t\t<9.COURSES >");
		Scanner input=new Scanner(System.in);
		int selectInput=input.nextInt();
		switch(selectInput)
		{
		case 1:College.OnlineReg();
				break;
		case 2:ExaminationResult();
				break;
		case 3:Syllubus();
				break;
		case 4:Notification();
				break;
		case 5:Timetable();
				break;
		case 6:College_List();
				break;
		case 7:About_us();
				break;
		case 8:Contact_us();
				break;
		case 9:Courses();
				break;
		default:System.out.println("Invalid Input");
		}
	}
	
	public static void ExaminationResult()
	{
		System.out.println("Examination Cell");
	}
	public static void Syllubus()
	{
		
		
	}
	public static void Notification()
	{
		System.out.println("Notifications");
	}
	public static void Timetable()
	
	{
			System.out.println("\n\t\t TIME TABLE:\t\t\n");
	}
	public static void College_List()
	{
		System.out.println("Affiliated Colleges");
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
		default:universityHome();
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
	
	public static void Courses()
	{
		System.out.println("Courses Offered:");
	}
}