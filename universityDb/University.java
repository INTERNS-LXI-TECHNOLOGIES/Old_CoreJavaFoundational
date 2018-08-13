import java.io.*;
import java.util.*;
public class University
{
	public ArrayList<College> clg;
	College co;

	public void universityHome()
	{		
	System.out.println("\n\t\t\t\t\t\t\t\t\t\t\tDate:\n\t\t\t\t\t\t\t\t\t\t\tTime:\n");
	System.out.println("\n<1.REGISTARTION>\t\t<2.EXAMINATION RESULTS>\t\t<3.SYLLUBUS>\t\t<4.NOTIFICATIONS>\n<5.AFFILIATED COLLEGES>\t\t<6.About us>\t\t\t<7.Contact us>\t\t<8.COURSES >");
		Scanner input=new Scanner(System.in);
		int selectInput=input.nextInt();
		switch(selectInput)
		{
		case 1:CollegeReg();
				break;	
		case 2:co.DeptReg();
				break;
		default:System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<Thank You>>>>>>>>>>>>>>>>>>>>>>>>>>");
		}
	}
	public void CollegeReg()
	{
	System.out.println("************Registration Form**************");
	System.out.println("Enter the college Details:");
     clg=new ArrayList<College>();
	 co=new College();
	 co.collegReg();
	 clg.add(co);
	Scanner input00=new Scanner (System.in);
	System.out.println("\tRegistration completed successfully.\n Press any other number to Home page; \n Press 1 to Details ");
	int c_key=input00.nextInt();
		switch(c_key)
		{
			case 1:System.out.println("College:"+co.clg_name);
			co.collegeHome();
			break;
			default:universityHome();
		}
	}
}