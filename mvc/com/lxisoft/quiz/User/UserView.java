package com.lxisoft.quiz.User;

import com.lxisoft.quiz.Quiz.*;
import java.io.*;
import java.util.*;

public class UserView{
	public void display(QuestionsController q){
		System.out.println(q.que+"\n\n"+"1: "+q.option1+"\n\n"+"2: "+q.option2+"\n\n"+"3: "+q.option3+"\n\n"+"4: "+q.option4);
	}
	public void instruct(){
		System.out.println("Enter your correct Choice");
	}
	public void caution(){
		System.out.println("\n\nPLEASE ENTER A CORRECT OPTION\n\n");
	}
	public void error(){
		System.out.println("Error");	
	}
	public void upperGraph(int mark){
	System.out.println("****************************************");	
	System.out.println("\n"+"\n"+"\n");
	System.out.println("YOUR SCORE IS         "+mark+" out of 200");
	}
	public void lowerGraph(){
		System.out.println("\n\n\n");
	System.out.println("****************************************");	
	}
	public void success(){
		System.out.println("YOU HAVE SUCCESSFULLY CLEARED THE TEST");
	}
	public void unsuccess(){
		System.out.println("YOU HAVE FAILED......BETTER LUCK NEXT TIME");
	}
}