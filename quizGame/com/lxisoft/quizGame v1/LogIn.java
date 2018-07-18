import java.util.*;
import java.lang.*;
import java.io.*;
public class LogIn
{
	public static User ui=new User();
	public String USER,PASS;
	Scanner sc=new Scanner(System.in);
	Scanner in=new Scanner(System.in);
	public void logEntry()throws Exception{
		System.out.println("\t\t\t\t\t::Enter the Login Credentials::\n\n");
		System.out.print("\n\t\t\t\t\t[USERNAME] : ");USER=sc.nextLine();
		System.out.print("\n\t\t\t\t\t[PASSWORD] : ");PASS=sc.nextLine();
		String loggedUser=logCheck();
		System.out.println("\n\n\t\t-------------------------------------------------------------------------------\n\n\n\t\t\t\t[LOGGED AS "+loggedUser+" ]");
		System.out.println("\n\n<<<<<<<<<<<<<<<<<<        Welcome "+loggedUser+" to our Quiz          >>>>>>>>>>>>>>>\n\n\n\n\n");
		System.out.println("\n\n[Ready to play the quiz]\n|press 1 to continue|\t\t|press 0 to exit|\n\n\n\n\n");
		System.out.print("->");
		int choice=in.nextInt();
		switch(choice)
		{
			case 1:
			ui.check();
			break;
			case 2:
			System.exit(0);
			break;
			
		}
		
	}	
	public String logCheck()throws Exception{
		FileReader reader=new FileReader("Database\\"+USER+".properties");
		Properties p=new Properties();
		p.load(reader);
		
		if(p.getProperty("USERNAME").equals(USER)&&p.getProperty("PASSWORD").equals(PASS))
		{
			reader.close();
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