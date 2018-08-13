import java.io.*;
import java.util.*;
public class College
{
	public String clg_address,clg_name,clg_email;
	public ArrayList<Department> department;
	int i;
	public void collegReg()
	{ 
	    
		Scanner input12=new Scanner (System.in);
		System.out.println("College Name:");
		clg_name=input12.nextLine();
		System.out.println("E_MAIL:");
		clg_email=input12.nextLine();
		System.out.println("ADDRESS:");
		clg_address=input12.nextLine();
		
	}

	public void collegeHome()
	{
	System.out.println("\n\t\t1.ONLINE REGISTARTION\n\t\t2.LOGIN \n\t\t3.LIBRARY\n\t\t4.TIMETABLE\n\t\t5.DEPARTMENT\n\t\t6.ABOUT US\n\t\t7.CONTACT US\n\t\t8.COURSES");
		Scanner input=new Scanner(System.in);
		int selectInput=input.nextInt();
		switch(selectInput)
		{
		case 1:OnlineReg();
				break;
		case 2:Login();
				break;
		default:System.out.println("<<<<<<<<<<<<<<<<<<<<<<Thank You>>>>>>>>>>>>>>>>>>>>>>>");
		}
	}
	public void DeptReg()
	{
		Scanner input10=new Scanner(System.in);
		department=new ArrayList<Department>();
		Department dept=new Department();
		System.out.println("Departments\n Enter the Department:");
		String dep=input10.nextLine();
		
		department.add(dept);
	}
	public void OnlineReg()
	{
		Scanner input1=new Scanner(System.in);
		System.out.println(" \n1.Student Registration: \n2.Faculty Registration:");
		int key=input1.nextInt();
		
		for(Department dept:department)
		{
		//dept.student = new Student();
		System.out.println("entered for loop "+dept);
		//System.out.println("entered for loop "+dept.get(i).student);
		}
		//dept.faculty = new Faculty();
		switch(key)
		{
		case 1://dept.student.StudentRegistration();
		         break;
		case 2://dept.faculty.FacultyRegistration();
				 break;
		default: collegeHome();
		}
	}
	public void Department_list()
	{
		/*System.out.println("\n1.Mechanical Engineering\n2.Civil Engineering\n3.Electronics and Communication Engineering\n4.Electrical Engineering\n5.Computer Science Engineering");
		Scanner input3=new Scanner(System.in);
		int selectDepartment=input3.nextInt();
		switch(selectDepartment)
		{
		case 1:department.mech();
			break;
		case 2:department.civil();
			break;
		case 3:department.ece();
			break;
		case 4:department.eee();
			break;
		case 5:department.cse();
			break;
		default:System.out.println("    ");
		}*/	
	}

	public void Login()
	{
		Scanner input4=new Scanner(System.in);
		System.out.println(" \n1.Student Login: \n2.Faculty Login:");
		int L_key=input4.nextInt();
		switch(L_key)
		{
		case 1:// dept.student.StudentLogin();
		break;
		case 2: //dept.faculty.FacultyLogin();
		break;
		default: //collegeHome();
		}
	}
	
}
	
