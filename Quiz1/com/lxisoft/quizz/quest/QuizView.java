package com.lxisoft.quizz.quest;
import com.lxisoft.quizz.quest.*;
import java.util.Scanner;
public class QuizView
{
	public QuizView()
	{
		System.out.println("\t\t\t\t----------WELCOME TO THE QUIZ COMPETITION----------");
		System.out.println("\n\n");
	}	
	public void askUsername()
	{
	System.out.println("Enter the Username:");	
	}
	public void askPassword()
	{
		System.out.println("Enter the Password:");
	}
	public void loginSucceed()
	{
		System.out.println("LOGIN SUCCESSFUL.....\nBEST OF LUCK. TAKE YOUR TEST BETTER.");
		
	}
	public void loginFailed()
	{
		System.out.println("LOGIN FAILED...\n.....PLEASE RETRY.....");
	}
}