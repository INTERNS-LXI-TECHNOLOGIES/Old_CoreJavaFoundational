import java.io.*;
import java.util.*;
public class Student
{
	public void Student_details()
	{
		
	}
	public void Logout()
	{
		System.out.println("\t\t\t\t\t\tLogout Successfully Completed");
		System.out.println("\n\nClick 1 for Home Page");
		Scanner input=new Scanner(System.in);
		int selection = input.nextInt();
			
		switch(selection)
		{
			case 1:univ.homePage();
					break;
			//case 2:College.exit();
					//break;
		}
	}
}