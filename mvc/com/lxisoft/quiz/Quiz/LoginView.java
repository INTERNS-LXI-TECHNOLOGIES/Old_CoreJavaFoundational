package com.lxisoft.quiz.Quiz;
import java.io.*;

public class LoginView{
	public void askUsername(){
		System.out.println("Enter the Username");
	}
	public void askPassword(){
		System.out.println("Enter the Password");
	}
	public void succesdetails(){
		    System.out.println("\n\nLOGIN SUCCESSFUL");
			System.out.println("\n\n");
			System.out.println("BEST OF LUCK. TAKE YOUR TEST SOUNDLY AND IN A BETTER MANNER");
			System.out.println("\n\n");
		    System.out.println("----------DESCRIPTION----------");
			System.out.println("\n");
			System.out.println("1. Do not indulge in any kind of malpractices, be genuine and serious while taking the test\n"+"2. Using calculators and other electronic gadgets are strictly prohibited"+ 
			                   ", if any one found being indulged,his/her Candidature will be cancelled\n"+"3. Talking while taking the test is prohibited\n"+"\n\n"+"GOOD LUCK");
			System.out.println("\n IF YOU AGREE WITH THESE CONDITIONS PLEASE PRESS [1]\n");
	}
	public void unsuccesdetails(){
		System.out.println("LOGIN UNSUCCESSFULL");
	    System.out.println("\n\n");
		System.out.println("PLEASE RETRY...........  :|");
	}
	public void interfaceView(){
		System.out.println("\t\t\t\t----------WELCOME TO THE QUIZ COMPETITION----------");
		System.out.println("\n\n");
		System.out.println("\t\t\t\t----------PRESS [1] TO LOGIN--------------- ");
		System.out.println("\n\n\n");
		System.out.println("\t\t\t\t----------PRESS [2] TO SIGNUP--------------- ");
		System.out.println("\n\n\n");
		System.out.println("\t\t\t\t----------PRESS [3] TO EXIT--------------- ");
		System.out.println("\n\n\n");
		System.out.println("\t\t\t\t----------PLEASE SELECT YOUR CHOICE---------------");
		System.out.println("\n\n");
		
		
	}
}