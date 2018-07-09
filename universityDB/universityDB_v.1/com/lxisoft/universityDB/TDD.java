import java.util.*;
public class TDD
{
	public static String regName;
	public static Registration reg=new Registration();
public static void main(String args[])
{int main_choice,reg_choice;
	Scanner sc=new Scanner(System.in);
	University uni=new University();
	System.out.println("\n\n\n\t\t\t\t*********UNIVERSITY DATABASE*********");
	System.out.println("\n\n<<<<<<<<<<<<<<<<<\tEnter option from below MENU\t>>>>>>>>>>>>>>>>>>>>>>>>>");
	System.out.println("\t[1.REGISTRATION]\t[2.LOG IN]\t[3.RESULTS]\t[4.ENQUIRY]\t");
	main_choice=sc.nextInt();
	switch(main_choice)
	{
		case 1:
		System.out.println("::REGISTRATION PORTAL::");
		
			
				System.out.println("\n\t|1.COLLEGE Registration|\t|2.STUDENT Registration|\t|3.TEACHER Registration|\t|4.LIBRARY Registration|");
				reg_choice=sc.nextInt();
				switch(reg_choice)
				{
					case 1:
					regName="college";
					System.out.println("1.College Registration");
					reg.regNew(regName,reg_choice);
					break;
					///////////////////////
					case 2:
					regName="student";
					System.out.println("2.Student Registration");
					reg.regNew(regName,reg_choice);
					break;
					////////////////////////
					case 3:
					regName="teacher";
					System.out.println("3.Teacher Registration");
					reg.regNew(regName,reg_choice);
					break;
					/////////////////////////
					case 4:
					regName="library";
					System.out.println("4.Library Registration");
					reg.regNew(regName,reg_choice);
					break;
					//////////////////
					default:
					System.out.println("Enter value from above data");
					break;
					
					
				}
					
				
				
		break;
////////////////////////////////////
		case 2:
		System.out.println("::LOG IN::");
		break;
////////////////////////////////
		case 3:
		System.out.println("::RESULTS::");
		break;
///////////////////////////////////
		case 4:
		System.out.println("::ENQUIRY PORTAL::");
		break;
///////////////////////////////////
		default:
		System.out.println("ENTER ANOTHER VALUE PLEASE");
	}
	
	
	
}	
	
	
}