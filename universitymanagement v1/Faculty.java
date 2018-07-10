import java.io.*;
import java.util.*;
public class Faculty
{
	
	public static void FacultyRegistration()
	{
		Scanner input1=new Scanner(System.in);
		System.out.println("Registration Form");
		System.out.println("FIRST_NAME:");
		String fname=input1.nextLine();
		System.out.println("LAST_NAME:");
		String lname=input1.nextLine();
		System.out.println("GENDER:");
		String gendr=input1.nextLine();
		System.out.println("DATE OF BIRTH:");
		int dob=input1.nextInt();
		System.out.println("E_MAIL:");
		String ename=input1.nextLine();
		System.out.println("ADDRESS:");
		String adress=input1.nextLine();
		System.out.println("Registration completed successfully.\n Press any other number to Home page; \n Press 1 to continue; ");
		int key=input1.nextInt();
		switch(key)
		{
		case 1:University.Login();
		break;
		default:University.mainMenu();
		}
			
	}
}