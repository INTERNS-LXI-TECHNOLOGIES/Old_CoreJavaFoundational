package com.lxisoft.quizgamev2.login;
import com.lxisoft.quizgamev2.userinterface.Interface_controller;
import com.lxisoft.quizgamev2.security.*;
import java.util.*;
import java.lang.*;
import java.io.*;
public class LogIn_view
{
	private Scanner st=new Scanner(System.in);
	private Scanner in=new Scanner(System.in);
	public Interface_controller play=new Interface_controller();
	public LogIn_model data=new LogIn_model();
	public LogIn_controller checker=new LogIn_controller();
	public void logEntry()throws Exception
	{
		System.out.println("\t\t\t\t\t::Enter the Login Credentials::\n\n");
		System.out.print("\n\t\t\t\t\t[USERNAME] : ");data.setUser(st.nextLine());
		System.out.print("\n\t\t\t\t\t[PASSWORD] : ");data.setPass(st.nextLine());
		try{data.setLogger(checker.logCheck(data.getUser(),data.getPass()));}
		catch(FileNotFoundException fi){System.err.println("*****Wrong Username and password***\n");System.exit(0);}
		System.out.println("\n\n\t\t-------------------------------------------------------------------------------\n\n\n\t\t\t\t[LOGGED AS "+data.getLogger()+" ]");
		System.out.println("\n\n<<<<<<<<<<<<<<<<<<        Welcome "+data.getLogger()+" to our Quiz          >>>>>>>>>>>>>>>\n\n\n\n\n");
		System.out.println("\n\n[Ready to play the quiz]\n|press 1 to continue|\t\t|press 0 to exit|\n\n\n\n\n");
		System.out.print("->");
		data.setChoice(in.nextInt());
		switch(data.getChoice())
		{
			case 1:
			play.check();
			break;
			case 2:
			System.exit(0);
			break;
			
		}
		
	}	
}