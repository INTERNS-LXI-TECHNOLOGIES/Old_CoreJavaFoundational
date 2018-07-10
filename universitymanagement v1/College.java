import java.io.*;
import java.util.*;
public class College
{
	public static Student student=new Student();
	public static Faculty faculty=new Faculty();
	public static Department department=new Department();
	public static void Ahalia()
	{
		System.out.println("Ahalia School of Engineering and Technology");
		Registration();
		Department_list();
		
	}
	public static void Ammini()
	{
		System.out.println("Ammini college of Engineering");
		Registration();
		Department_list();
	}
	public static void Nehru()
	{
		System.out.println("Nehru college of Engineering");
		Registration();
		Department_list();
		
	}
	public static void Sreepathy()
	{
		System.out.println("Sreepathy Institute of Management and Technology");
		Registration();
		Department_list();
		Department_list();
	}
	public static void Registration()
	{
		Scanner input1=new Scanner(System.in);
		
		System.out.println("1.Student Registration: \n2.Faculty Registration: ");
		int key=input1.nextInt();
		switch(key)
		{
		case 1:Student.StudentRegistration();
		break;
		case 2:Faculty.FacultyRegistration();
		break;
		default:University.mainMenu();
		}
	}
	public static void department_list()
	{
		System.out.println("\n1.Mechanical Engineering\n2.Civil Engineering\n3.Electronics and Communication Engineering\n4.Electrical Engineering\n5.Computer Science Engineering");
		Scanner input3=new Scanner(System.in);
		int selectdepartment=input3.nextInt();
		switch(selectdepartment)
		{
		case 1:mech();
		break;
		case 2:civil();
		break;
		case 3:ece();
		break;
		case 4:eee();
		break;
		case 5:cse();
		break;
		
		default:System.out.println("    ");
		}	
	
	
	}
	
}
