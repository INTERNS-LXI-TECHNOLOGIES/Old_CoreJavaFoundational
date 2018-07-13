import java.io.*;
import java.util.*;
public class University
{
	//public static String username,user,pw,psd,college;
	College c=new College();	
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
		case 2:ExaminationResult();
				break;
		case 3:Syllubus();
				break;
		case 4:Notification();
				break;
		
		case 5:College_List();
				break;
		case 6:About_us();
				break;
		case 7:Contact_us();
				break;
		case 8:Courses();
				break;
		default:System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<Thank You>>>>>>>>>>>>>>>>>>>>>>>>>>");
		}
	}
	
	public void ExaminationResult()
	{
		System.out.println("Examination Cell");
	}
	public void Syllubus()
	{
		System.out.println("Please Wait.................\n ");
		
	}
	public void Notification()
	{
		System.out.println("Notifications");
	}
	public void College_List()
	{
		
		
	}/*System.out.println("Affiliated Colleges");
		System.out.println("\n1.Ahalia School of Engineering and Technology\n2.Ammini college of Engineering\n3.Nehru college of Engineering\n4.Sreepathy Institute of Management and Technology");
		Scanner input=new Scanner(System.in);
		int selectCollege=input.nextInt();
		switch(selectCollege)
		{
		case 1:College.Ahalia();
				break;
		case 2:College.Ammini();
				break;
		case 3:College.Nehru();
				break;
		case 4:College.Sreepathy();
				break;
		default:universityHome();
		}
	}*/
	public static void About_us()
	{
		System.out.println("Adress:");
	}
	public static void Contact_us()
	{
		System.out.println("Contact Details:\ne-mail:");
		
	}
	
	public static void Courses()
	{
		System.out.println("Courses Offered:");
	//courses_list();
	}
	String college,Id,psd,c_mail,c_address,username,pw,user;
	public void CollegeReg()
	{
    ArrayList clg=new ArrayList();
	Scanner input12=new Scanner (System.in);
		System.out.println("Registration Form");
		System.out.println(" Enter the college Details:");
		System.out.println("College Name:");
		college=input12.nextLine();
		clg.add(college);
		System.out.println("College ID:");
		Id=input12.nextLine();
		clg.add(Id);
		System.out.println("User Name:");
		username=input12.nextLine();
		clg.add(username);
		System.out.println("Password:");
		psd=input12.nextLine();
		//clg.add(psd);
		System.out.println("E_MAIL:");
		c_mail=input12.nextLine();
		clg.add(c_mail);
		System.out.println("ADDRESS:");
		c_address=input12.nextLine();
		clg.add(c_address);
		clg.size();
		System.out.println(college+"\tRegistration completed successfully.\n Press any other number to Home page; \n Press 1 to Login; \n Press 2 to Details ");
		int c_key=input12.nextInt();
		switch(c_key)
		{
			case 1:Login();
			break;
			case 2:System.out.println("College:"+clg);
			College.collegeHome();
			break;
			default:universityHome();
		}
	}
	public boolean Login()
	{
		Scanner input13=new Scanner(System.in);
		System.out.println("Username:");
		user=input13.nextLine();
		System.out.println("Password:");
		pw=input13.nextLine();
		if((username.equals(user))&&(psd.equals(pw)))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
}