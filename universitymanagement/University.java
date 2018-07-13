import java.io.*;
import java.util.*;
public class University
{

	public static void Mainmenu()
	{
		System.out.println("\n\n\t\t\t\t\t\t\t\t************HOME PAGE**************");
		System.out.println("\n\n\t1.CONTACT US\t2.FACULTY DETAILS\t3.STUDENT DETAILS\t4.EXAMINATION CELL\t5.COLLEGE REGISTRATION\t6.COLLEGE LISTS\t7.COLLEGE LOGIN\t8.EXIT");
		System.out.println("\n\n");
		Scanner input=new Scanner(System.in);
		int selection = input.nextInt();	
		switch(selection)
		{
			
			case 1:Contact_us();
					break;
			case 2:Faculty.faculty_details();
					break;
			case 3:Student.Student_details();
					break;
			case 4:Examination();
					break;
			case 5:College_Registration();
					break;
			case 6:College_Lists();
					break;
			case 7:College.college();
					break;
			case 8:Exit();
					break;
		}
		
	}
	
	public static void Contact_us()
	{
		System.out.println("\t\t\t\t\t\t*******************ENQUIRY DETAILS*********************");
		
	}
	
	public static void Examination()
	{
		System.out.println("\t\t\t<<<<<<<<<<<<<<<<EXAMINATION CELL>>>>>>>>>>>>>>>>>>>>>");
	}
	public static void College_Lists()
	{
		
		System.out.println("haii");
		
		
	}

	public static void College_Registration()
	{
		ArrayList clg=new ArrayList();
		String Clg_name,Clg_add,Clg_ph;
		Scanner input=new Scanner(System.in);
		System.out.println("\tCOLLEGE REGISTRATION FORM");
		System.out.println("\n\nCOLLEGE NAME :");
		Clg_name= input.nextLine();
		clg.add(Clg_name);
		System.out.println("ADDRESS");
		Clg_add= input.nextLine();
		clg.add(Clg_add);
		System.out.println("PHONE NUMBER");
		Clg_ph= input.nextLine();
		clg.add(Clg_ph);
		System.out.println("\n\nRegistration is succefully completed");
				System.out.println("\n\n\nClick 1 for display the process\n\nClick 2 for home page");
				int selection1 = input.nextInt();
				switch(selection1)
			   {
					case 1: System.out.println("\t\t\t<<<<<<<<LIST OF COLLEGES>>>>>>>>\n\n");
							System.out.println("COLLEGE NAME\t\tADDRESS\t\tPHONE NUMBER\n");
							System.out.println("\n");
							System.out.print(Clg_name);
							System.out.print("\t\t\t");
							System.out.print(Clg_add);
							System.out.print("\t\t");
							System.out.print(Clg_ph);
							Mainmenu();
							break;
					case 2: Mainmenu();
							break;
			   }
		
	}
	public static void Exit()
	{
		
	}
	

	
}