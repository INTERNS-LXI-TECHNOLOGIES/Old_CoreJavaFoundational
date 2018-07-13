import java.io.*;
import java.util.*;
public class Department
{
	public static void department()
	{
		System.out.println("\nChoose the Department");
		System.out.println("\n\t\t1.CSE\n\t\t2.ECE\n\t\t3.EEE\n\t\t4.MECH\n\t\t5.CIVIL");
		Scanner input=new Scanner(System.in);
		int selection = input.nextInt();	
		switch(selection)
		{
			case 1:cse();
				break;
			case 2:ece();
				break;
			case 3:eee();
				break;
			case 4:mech();
				break;
			case 5:civil();
				break;
		}
	}
	public static void cse()
	{
		
		System.out.println("Computer Science Department");
		Regidtration();
		
	}
	public static void ece()
	{
		System.out.println("Electronics and Communication Department");
		Registration();
	}
	public static void eee()
	{
		System.out.println("Electrical and Electronics Department");
		Registration();
	}
	public static void mech()
	{
		System.out.println("Mechanical Department");
		Registration();
	}
	public static void civil()
	{
		System.out.println("Civil Department");
		Registration();
	}
	public static void Registration()
	{
		ArrayList arr=new ArrayList();
		String Fname,lname,gen,dob,add,email,pwd;
		Scanner input=new Scanner(System.in);
				System.out.println("\tREGISTRATION FORM");
				System.out.println("\n\nFIRST_NAME :");
				Fname= input.nextLine();
				arr.add(Fname);
				System.out.println("\nLAST_NAME :");
				lname= input.nextLine();
				arr.add(lname);
				System.out.println("\nGENDER :");
				 gen= input.nextLine();
				arr.add(gen);
				System.out.println("\nDATE OF BIRTH:");
				dob= input.nextLine();
				arr.add(dob);
				System.out.println("\nADDRESS :");
				add= input.nextLine();
				arr.add(add);
				System.out.println("\nEMAIL ID:");
				email= input.nextLine();
				arr.add(email);
				System.out.println("\nPASSWORD:");
				pwd= input.nextLine();
				arr.add(pwd);
				System.out.println("\n\nRegistration is succefully completed");
				System.out.println("\n\n\nClick 1 for display the process\n\nClick 2 for home page");
				int selection1 = input.nextInt();
				switch(selection1)
			   {
					case 1: System.out.println(arr);
							break;
					case 2: University.Mainmenu();
							break;
			   }
			
			
		
		
	}
	
		/*public static void LoginPage()
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
			//case 3:University.Result();
					//break;
		//	case 4:University.Logout();
				//	break;
		}
			
	
	*/
}