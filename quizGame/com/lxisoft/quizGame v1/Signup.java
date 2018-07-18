import java.util.*;
import java.io.*;
public class Signup
{
	public String regiName,USERNAME,ID,PASSWORD;
	Scanner sc=new Scanner(System.in);
	public void regNew()
	{
		
		System.out.println("\t\t\t\t\t::Registration portal::\n\n");
		System.out.print("\n\t\t\t\t\t[ID] : ");ID=sc.nextLine();
		System.out.print("\n\t\t\t\t\t[USERNAME] : ");USERNAME=sc.nextLine();
		System.out.print("\n\t\t\t\t\t[PASSWORD] : ");PASSWORD=sc.nextLine();
		System.out.println("\n\n\n------------ "+USERNAME+" data Entered Successfuly---------------\n\n");
	try{commonRegistration();}catch(Exception e){System.out.println("");}
	}
	public void commonRegistration()throws Exception{
		Properties p=new Properties();
		p.setProperty("ID",ID);
		p.setProperty("USERNAME",USERNAME);
		p.setProperty("PASSWORD",PASSWORD);
		p.store(new FileWriter("Database\\"+USERNAME+".properties"),"NEW USER REGISTRATION");
		
		
	}
}