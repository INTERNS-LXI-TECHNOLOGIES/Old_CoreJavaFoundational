import java.io.*;
import java.util.*;
public class Faculty
{ 
public static String password,pw,user,username;
	public static void FacultyRegistration()
	{
		ArrayList fac=new ArrayList();
		Scanner input11=new Scanner(System.in);
		System.out.println("Registration Form");
		System.out.println("FIRST_NAME:");
		String fname=input11.nextLine();
		fac.add(fname);
		System.out.println("LAST_NAME:");
		String lname=input11.nextLine();
		fac.add(lname);
		System.out.println("GENDER:");
		String gendr=input11.nextLine();
		fac.add(gendr);
		System.out.println("DATE OF BIRTH:");
		int dob=input11.nextInt();
		fac.add(dob);
		System.out.println("E_MAIL:\n");
		String email=input11.nextLine();
		fac.add(email);
		System.out.println("ADDRESS:");
		String adress=input11.nextLine();
		fac.add(adress);
		System.out.println("USERNAME:");username=input11.nextLine();fac.add(username);
		System.out.println("PASSWORD:"); password=input11.nextLine();//fac.add(password);
		System.out.println(fname+"Registration completed successfully.\n Press any other number to Home page; \n Press 1 to Login; \nPress 2 to Details;");
		int key=input11.nextInt();
		switch(key)
		{
		case 1:FacultyLogin();
		break;
		case 2:System.out.println("Faculty:"+fac);
		break;
		default:College.collegeHome();
		}	
	}
	public static boolean FacultyLogin()
	{
		Scanner input14=new Scanner(System.in);
		System.out.println("Username:");
		user=input14.nextLine();
		System.out.println("Password:");
		pw=input14.nextLine();
		if((username.equals(user))&&(password.equals(pw)))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
}