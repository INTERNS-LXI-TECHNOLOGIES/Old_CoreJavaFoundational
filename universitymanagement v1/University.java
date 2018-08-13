import java.io.*;
import java.util.*;
public class University
{
	public static College co;

	public void universityHome()
	{
		
	System.out.println("\n\t\t\t\t\t\t\t\t\t\t\tDate:\n\t\t\t\t\t\t\t\t\t\t\tTime:\n");
	System.out.println("\n<1.REGISTARTION>\t\t<2.EXAMINATION RESULTS>\t\t<3.SYLLUBUS>\t\t<4.NOTIFICATIONS>\n<5.AFFILIATED COLLEGES>\t\t<6.About us>\t\t\t<7.Contact us>\t\t<8.COURSES >");
		Scanner input=new Scanner(System.in);
		int selectInput=input.nextInt();
		switch(selectInput)
		{
		case 1:CollegeReg();
				break;
		case 2:ExaminationResult();
				break;
		case 3:Syllubus();
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
		default:System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<Thank You>>>>>>>>>>>>>>>>>>>>>>>>>>");
		}
	}
	
	public void ExaminationResult()
	{
		System.out.println("Examination Cell");
	}
	public void Syllubus()
	{
		System.out.println("Please Wait.................\n ");
		
	}
	public void Notification()
	{
		System.out.println("Notifications");
	}
	public void College_List()
	{
		
		
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
	//String clg_address,clg_name,clg_email;
	public void CollegeReg()
	{
		
	System.out.println("************Registration Form**************");
	
	System.out.println("Enter the college Details:");
	
    List clg=new ArrayList();
	
	//System.out.println("cannot access clg name"+clg_name);
	//co.collegReg();
	
	clg.add(co.collegReg());
	
	Scanner input00=new Scanner (System.in);
	System.out.println("\tRegistration completed successfully.\n Press any other number to Home page; \n Press 1 to Details ");
	int c_key=input00.nextInt();
		switch(c_key)
		{
			case 1:System.out.println("College:"+clg);
			College.collegeHome();
			break;
			default:universityHome();
		}
	}
}