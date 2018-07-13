import java.util.*;
import java.io.*;
public class Registration
{
	public String regiName,USERNAME,ID,PASSWORD;
	Scanner sc=new Scanner(System.in);
	public void regNew(String regName)
	{
		regiName=regName;
		System.out.println("Enter the following details of "+regName+"\n\n");
		System.out.println("[ID] : ");ID=sc.nextLine();
		System.out.println("[USERNAME] : ");USERNAME=sc.nextLine();
		System.out.println("[PASSWORD] : ");PASSWORD=sc.nextLine();
		System.out.println("\n\n------------ "+USERNAME+" data Entered Successfuly---------------\n\n");
	try{commonRegistration();}catch(Exception e){System.out.println("");}
	}
	public void commonRegistration()throws Exception{
		Properties p=new Properties();
		p.setProperty("ID",ID);
		p.setProperty("USERNAME",USERNAME);
		p.setProperty("PASSWORD",PASSWORD);
		p.store(new FileWriter("Database\\"+USERNAME+regiName+".properties"),"DATABASE DATA REGISTRATION");
		
		
	}
}