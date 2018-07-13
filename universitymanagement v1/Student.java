import java.io.*;
import java.util.*;
public class Student
{ public static String username,password,user,pw,fname,lname,gendr,dob,email,adress;
	public static void StudentRegistration()
	{
		ArrayList student=new ArrayList();
		Scanner input2=new Scanner(System.in);
		System.out.println("Registration Form");
		System.out.println("FIRST_NAME:");
		fname=input2.nextLine();
		student.add(fname);
		System.out.println("LAST_NAME:");
		lname=input2.nextLine();
		student.add(lname);
		System.out.println("GENDER:");
		gendr=input2.nextLine();
		student.add(gendr);
		System.out.println("DATE OF BIRTH:");
		int dob=input2.nextInt();
		student.add(dob);
		System.out.println("E_MAIL:");
		email=input2.nextLine();
		student.add(email);
		System.out.println("ADDRESS:");
		adress=input2.nextLine();
		student.add(adress);
		System.out.println("USERNAME:");username=input2.nextLine();student.add(username);
		System.out.println("PASSWORD:");password=input2.nextLine();//student.add(password);
		System.out.println(fname+"Registration completed successfully.\n Press any other number to Home page; \n Press 1 to continue; \nPress 2 to Details; ");
		int key=input2.nextInt();
		switch(key)
		{
		case 1:StudentLogin();
		break;
		case 2:System.out.println("Student:"+student);
		break;
		default:College.collegeHome();	
		}
		
	}
	public static boolean StudentLogin()
	{
		Scanner input15=new Scanner(System.in);
		System.out.println("Username:");
		user=input15.nextLine();
		System.out.println("Password:");
		pw=input15.nextLine();
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