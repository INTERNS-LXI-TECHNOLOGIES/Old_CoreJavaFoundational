package com.lxisoft.quize.Quize;
import com.lxisoft.quize.User.*;
import java.io.*;
import java.util.*;

public class TDD{
	public static void main(String args[]){
		int choice;
		String username,password,signupUsername,signupPassword;
		User u = new User();
		Scanner sc=new Scanner(System.in);
		System.out.println("\t\t\t\t----------WELCOME TO THE QUIZ COMPETITION----------");
		System.out.println("\n\n");
		System.out.println("\t\t\t\t----------PRESS [1] TO LOGIN--------------- ");
		System.out.println("\t\t\t\t----------PRESS [2] TO SIGNUP--------------- ");
		System.out.println("\t\t\t\t----------PRESS [3] TO EXIT--------------- ");
		System.out.println("\t\t\t\t----------PLEASE SELECT YOUR CHOICE---------------");
		System.out.println("\n\n");
		choice = sc.nextInt();
		switch(choice){
			case 1: System.out.println("ENTER THE USERNAME");
		            username=System.console().readLine();
		            System.out.println("ENTER THE PASSWORD");
		            password=System.console().readLine();
			        Login l=new Login(username,password);break;
		    case 2: System.out.println("ENTER THE USERNAME");
		            signupUsername=System.console().readLine();
		            System.out.println("ENTER THE PASSWORD");
		            signupPassword=System.console().readLine();
					u.signup(signupUsername,signupPassword);break;
			case 3: System.exit(0);break;
		    default: System.out.println("YOU ENTERED A WRONG CHOICE");
		}
	}
}