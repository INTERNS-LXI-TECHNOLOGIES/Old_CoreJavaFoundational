import java.io.*;
import java.util.*;
public class Faculty
{
	public static void FacultyRegistration()
	{
		Scanner input11=new Scanner(System.in);
		System.out.println("Registration Form");
		System.out.println("FIRST_NAME:");
		String fname=input11.nextLine();
		System.out.println("LAST_NAME:");
		String lname=input11.nextLine();
		System.out.println("GENDER:");
		String gendr=input11.nextLine();
		System.out.println("DATE OF BIRTH:");
		int dob=input11.nextInt();
		System.out.println("E_MAIL:");
		String email=input11.nextLine();
		System.out.println("ADDRESS:");
		String adress=input11.nextLine();
		System.out.println("Registration completed successfully.\n Press any other number to Home page; \n Press 1 to continue; ");
		int key=input11.nextInt();
		switch(key)
		{
		case 1:College.OnlineReg();
		break;
		default:College.collegeHome();
		}	
	}
	
}