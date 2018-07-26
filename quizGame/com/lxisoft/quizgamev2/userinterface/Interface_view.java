package com.lxisoft.quizgamev2.userinterface;
import com.lxisoft.quizgamev2.login.*;
import com.lxisoft.quizgamev2.signup.*;
import java.util.*;
public class Interface_view{
	public static Signup_view new_user=new Signup_view();
	public static LogIn_view pre_user=new LogIn_view();
	public void userInterface()throws Exception
	{	
		Scanner opt=new Scanner(System.in);
		do{System.out.println("\t\t\t\t******************Welcome to PlayQuiz Game******************\n");
		System.out.println("\t\t\t\t|1.Log In|\t\t|2.Sign Up|\t\t|3.Exit|\n");
		System.out.print("->");
		final int MAIN_OPTION=opt.nextInt();
		switch(MAIN_OPTION)
		{
			case 1:
			System.out.println("\t\t\t\t******************LOG IN INTERFACE******************\n");
			pre_user.logEntry();
			break;
			case 2:
			System.out.println("\t\t\t\t******************SIGN UP INTERFACE******************\n");
			new_user.regNew();
			break;
			case 3:
			System.out.println("\t\t\t\t******************THANK YOU FOR USING OUR PROGRAMM******************\n");
			System.exit(0);
			break;
			
			
		}
		}
		while(true);
		
		
		
	}
}