import java.io.*;
import java.util.*;
public class College
{
	public static void college()
	{
	System.out.println("WELCOME");
	System.out.println("\n\t\t1.FACULTY LISTS\n\t\t2.STUDENT LISTS\n\t\t3.STUDENT REGISTRATION\n\t\t4.FACULTY LOGIN\n\t\t5.EXIT");
	Scanner input=new Scanner(System.in);
	int selection = input.nextInt();	
	switch(selection)
	{
		case 1:Faculty.faculty_details();
				break;
		case 2:Student.Student_details();
				break;
		case 3:Department.department();
				break;
		case 4:faculty_login();
				break;
		case 5:exit();
				break;
	}
	}
	public static void faculty_login()
	{
	
		Scanner input=new Scanner(System.in);
		System.out.println("\n\tLOGIN");
		System.out.println("\n\nEMAIL ID");
		String email= input.nextLine();
		System.out.println("\nPASSWORD");
		String pwd= input.nextLine();
		Faculty.faculty_details();
	
	}
	public static void exit()
	{
		
	}
	
}