import java.io.*;
import java.util.*;
public class Student
{
	public static void StudentRegistration()
	{
		Scanner input2=new Scanner(System.in);
		System.out.println("Registration Form");
		System.out.println("FIRST_NAME:");
		String fname=input2.nextLine();
		System.out.println("LAST_NAME:");
		String lname=input2.nextLine();
		System.out.println("GENDER:");
		String gendr=input2.nextLine();
		System.out.println("DATE OF BIRTH:");
		int dob=input2.nextInt();
		System.out.println("E_MAIL:");
		String email=input2.nextLine();
		System.out.println("ADDRESS:");
		String adress=input2.nextLine();
		System.out.println("Registration completed successfully.\n Press any other number to Home page; \n Press 1 to continue; ");
		int key=input2.nextInt();
		switch(key)
		{
		case 1:College.OnlineReg();
		break;
		default:College.collegeHome();	
		}
		
	}
}