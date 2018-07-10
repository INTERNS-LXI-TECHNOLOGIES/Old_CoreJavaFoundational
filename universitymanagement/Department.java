import java.io.*;
import java.util.*;
public class Department
{
	
	public static void cse()
	{
		
		System.out.println("Computer Science Department");
	}
	public void ece()
	{
		Registration();
	}
	public void mech()
	{
		Registration();
	}
	public static void Registration()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("\n1.Faculty Registration\t\t2.Student Registration");
		int selection=input.nextInt();
		switch(selection)
		{
			case 1:
			
				System.out.println("\tREGISTRATION FORM");
				System.out.println("\n\nFIRST_NAME :");
				String fname= input.nextLine();
				String Fname= input.nextLine();
				System.out.println("\nLAST_NAME :");
				String lname= input.nextLine();
				System.out.println("\nGENDER :");
				String gen= input.nextLine();
				//gen=("'male','female'");
				System.out.println("\nDATE OF BIRTH:");
				String dob= input.nextLine();
				System.out.println("\nADDRESS :");
				String add= input.nextLine();
				System.out.println("\nEMAIL ID:");
				String email= input.nextLine();
				System.out.println("\nPASSWORD:");
				String pwd= input.nextLine();
				System.out.println("\n\nRegistration is succefully completed");
				System.out.println("\n\n\nClick 1 for continue the process\n\nClick 2 for home page");
				int selection1 = input.nextInt();
				switch(selection1)
			   {
					case 1: Login();
							break;
					case 2: University.Mainmenu();
							break;
				}
			
			case 2:
			
				
				System.out.println("\tREGISTRATION FORM");
				System.out.println("\nFIRST_NAME :");
				String fname1= input.nextLine();
				String Fname1= input.nextLine();
				System.out.println("\nLAST_NAME :");
				String lname1= input.nextLine();
				System.out.println("\nGENDER :");
				String gen1= input.nextLine();
				//gen=("'male','female'");
				System.out.println("\nDATE OF BIRTH:");
				String dob1= input.nextLine();
				System.out.println("\nADDRESS :");
				String add1= input.nextLine();
				System.out.println("\nEMAIL ID:");
				String email1= input.nextLine();
				System.out.println("\nPASSWORD:");
				String pwd11= input.nextLine();
				System.out.println("\n\nRegistration is succefully completed");
				System.out.println("\n\n\nClick 1 for continue the process\n\nClick 2 for home page");
				int selection2 = input.nextInt();
			
				switch(selection2)
				{
					case 1: Login();
							break;
					case 2: University.Mainmenu();
							break;
				}
		
		
		}
	}
	public static void Login()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("\n\tLOGIN");
		System.out.println("\n\nEMAIL ID");
		String email= input.nextLine();
		System.out.println("\nPASSWORD");
		String pwd= input.nextLine();
		LoginPage();
	}
		public static void LoginPage()
	{
		System.out.println("\n\n\t\t\t\t\tLOGIN PAGE\t\t\t\t\t\t\t\t\tclick 4 for Logout");
		System.out.println("\n1.Faculty_details\t\t2.Student_details\t\t3.Result");
		Scanner input=new Scanner(System.in);
		int selection = input.nextInt();
			
		switch(selection)
		{
			
			case 1:Faculty.Faculty_details();
					break;
			case 2:Student.Student_details();
					break;
			case 3:University.Result();
					break;
			case 4:University.Logout();
					break;
		}
			
	
	}
}