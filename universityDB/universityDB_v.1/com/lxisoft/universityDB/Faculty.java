import java.lang.*;
import java.util.*;
import java.io.*;
public class Faculty{
	public static Properties po=new Properties();
	public static String userName,regName;
	
	public static void teacherPortal(String user,String regName)throws Exception
	{main menu:
		
		userName=user;
		FileReader reader=new FileReader("Database\\"+userName+regName+".properties");
		po.load(reader);
		Scanner dt=new Scanner(System.in);
		Scanner di=new Scanner(System.in);
		System.out.println("\n\n\t\t***********************************************************************************\n");	
		System.out.println("Enter the options from below\n\n\t[1.ENTER PROFILE]\t[2.VIEW PROFILE]\t[3.MARK VIEW]\t[4.RANKLIST VIEW]\t[5.EXIT]");
		System.out.println("\n\t\t***********************************************************************************\n\n");			
		int opt=di.nextInt();
		
		switch(opt){
		case 1:
		System.out.println("Enter the profile info of <"+user+"> :");
		System.out.println("\t\t---------------------------------------\n\n");
		System.out.println("[FIRST_NAME]: ");String funame=dt.nextLine();
		System.out.println("[LAST_NAME]: ");String lname=dt.nextLine();		
		System.out.println("[COLLEGE_NAME]: ");String collegename=dt.nextLine();		
		System.out.println("[DEPARTMENT]: ");String department=dt.nextLine();		
		System.out.println("[STREET_NAME]: ");String street=dt.nextLine();		
		System.out.println("[ADDRESS]: ");String address=dt.nextLine();
		System.out.println("[PHONE_NUMBER]: ");String phone=dt.nextLine();
		System.out.println("\t\t\t|DATA SUBMITTED SUCCESSFULLY|\n\n");
		System.out.println("\t\t---------------------------------------\n\n");
		
	///////////////
		
		po.setProperty("FIRST_NAME",funame);
		po.setProperty("LAST_NAME",lname);
		po.setProperty("COLLEGE_NAME",collegename);
		po.setProperty("DEPARARTMENT",department);
		po.setProperty("STREET_NAME",street);
		po.setProperty("ADDRESS",address);
		po.setProperty("PHONE_NUMBER",phone);
		po.store(new FileWriter("Database\\"+userName+regName+".properties"),"Faculty updation");
		
		
		break;
		case 2:
		po.list(System.out);
		break;
		case 3:

		break;
		case 4:
		break;
		case 5:
		break;
	}
	}
	
	
}
	
	