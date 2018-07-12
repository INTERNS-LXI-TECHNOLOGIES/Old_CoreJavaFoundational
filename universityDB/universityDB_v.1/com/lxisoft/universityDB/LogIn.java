import java.util.*;
import java.lang.*;
import java.io.*;
public class LogIn
{
	public String USER,PASS;
	Scanner sc=new Scanner(System.in);
	public void logEntry(String regName)throws Exception{
		System.out.println("Enter Login Credentials of "+regName+"\n\n");
		System.out.println("[USERNAME] : ");USER=sc.nextLine();
		System.out.println("[PASSWORD] : ");PASS=sc.nextLine();
		String loggedUser=logCheck(regName);
		System.out.println("\n\n-------------------------------------------------------------------------------\n[LOGGED AS "+loggedUser+" ]");
		System.out.println("\n\n<<<<<<<<<<<<<<<<<<        Welcome "+loggedUser+" to Database Management System          >>>>>>>>>>>>>>>\n\n\n\n\n");
		if(regName.equals("student"))
		{
			
		}
		
	}	
	public String logCheck(String regName)throws Exception{
		FileReader reader=new FileReader("Database\\"+regName+".properties");
		Properties p=new Properties();
		p.load(reader);
		if(p.getProperty("USERNAME").equals(USER)&&p.getProperty("PASSWORD").equals(PASS))
		{
			return USER;
		}
		else
		{
				System.out.println("\t\t\t\t\t\tXXXXXXXXXXX--WRONG USER DATA--XXXXXXXXXXXXXXX");
				System.exit(0);
				return USER;
		}
		
		
	}
}