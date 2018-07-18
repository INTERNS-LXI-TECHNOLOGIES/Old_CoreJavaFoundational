import java.util.*;
import java.lang.*;
public class University
{
	public static String regName;
	public static Registration reg=new Registration();
	public static Faculty fac=new Faculty();
	public static LogIn log=new LogIn();
	public static int main_choice,reg_choice;
	public static Scanner sc=new Scanner(System.in);
	
public static void options()throws Exception
{	
	System.out.println("\n\n\n\t\t\t\t*********UNIVERSITY DATABASE*********");
	do{System.out.println("\n\n<<<<<<<<<<<<<<<<<\tEnter option from below MENU\t>>>>>>>>>>>>>>>>>>>>>>>>>\n\n");
	System.out.println("\t[1.REGISTRATION]\t\t\t[2.LOG IN]\t|3.EXIT|\t\t\n\n");
	main_choice=sc.nextInt();
	switch(main_choice)
	{
		case 1:
		System.out.println("::REGISTRATION PORTAL::\n\n");
		
			
				System.out.println("\n\t|1.COLLEGE Registration|\t|2.STUDENT Registration|\t|3.TEACHER Registration|\t\n\n");
				reg_choice=sc.nextInt();
				switch(reg_choice)
				{
					case 1:
					regName="college";
					System.out.println("1.College Registration");
					reg.regNew(regName);
					break;
					///////////////////////
					case 2:
					regName="student";
					System.out.println("2.Student Registration");
					reg.regNew(regName);
					break;
					////////////////////////
					case 3:
					regName="teacher";
					System.out.println("3.Teacher Registration");
					reg.regNew(regName);
					break;
					/////////////////////////
					
					default:
					System.out.println("Enter value from above data");
					break;
					
					
				}
					
				
				
		break;
////////////////////////////////////
		case 2:
		System.out.println("::LOGIN PORTAL::");
		
			
				System.out.println("\n\t|1.COLLEGE LOGIN|\t|2.STUDENT LOGIN|\t|3.TEACHER LOGIN|\t");
				reg_choice=sc.nextInt();
				switch(reg_choice)
				{
					case 1:
					regName="college";
					System.out.println("1.College Login");
					log.logEntry(regName);
					break;
					///////////////////////
					case 2:
					regName="student";
					System.out.println("2.Student Login");
					log.logEntry(regName);
					break;
					////////////////////////
					case 3:
					regName="teacher";
					System.out.println("3.Teacher Login");
					log.logEntry(regName);
					break;
					/////////////////////////
					
					default:
					System.out.println("Enter value from above data");
					break;
					
					
				}
					
				
				
		break;
////////////////////////////////
		case 3:
		System.out.println("::THANK YOU FOR USING OUR PROGRAMM::");
		System.exit(0);
		break;
///////////////////////////////////
	
		default:
		System.out.println("ENTER ANOTHER VALUE PLEASE");
	}}while(true);
	
	
	
}	
	
	
}