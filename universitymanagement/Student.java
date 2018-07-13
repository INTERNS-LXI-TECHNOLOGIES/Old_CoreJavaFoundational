import java.io.*;
import java.util.*;
public class Student
{
	public static void Student_details()
	{
		
	}
	public static void Logout()
	{
		System.out.println("\t\t\t\t\t\tLogout Successfully Completed");
		System.out.println("\n\nClick 1 for Home Page\t\t\t Click 2 for Exit");
		Scanner input=new Scanner(System.in);
		int selection = input.nextInt();
			
		switch(selection)
		{
			case 1:University.Mainmenu();
					break;
			case 2:College.exit();
					break;
		}
	}
}