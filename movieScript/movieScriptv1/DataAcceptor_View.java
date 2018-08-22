
import java.util.*;
import java.io.*;
public class DataAcceptor_View
{
	public static int mainmenu;
	Credential_View cre; 
	Script_View scr; 
	Dialogue_View dia; 
	Movie_View mov; 
	DataAcceptor_View()throws Exception
	{
		System.out.println("\t\t\t\t\t\t\t*********Movie Screen Play***********");
		System.out.println("\t\t\t\t\t\t\t\t-|1.Enter Credentials|-");
		System.out.println("\t\t\t\t\t\t\t\t-|2. Script Dialogues|-");
		System.out.println("\t\t\t\t\t\t\t\t-|3.  Cast new Movie |-");
		System.out.println("\t\t\t\t\t\t\t\t-|4.   View Script   |-");
		System.out.println("\tEnter '0' to exit");
		System.out.println("\n\n\nEnter option");
		mainViewSelector();	
	}
	public void mainViewSelector()throws Exception
	{
		
		Scanner in=new Scanner(System.in);
		mainmenu=in.nextInt();
		switch(mainmenu)
		{
			case 1:
			cre=new Credential_View();
			break;
			case 2:
			dia=new Dialogue_View();
			break;
			case 3:
			mov=new Movie_View();
			break;
			case 4:
			scr=new Script_View();
			break;
			case 0:
			System.exit(0);
		}
		
	}
	}