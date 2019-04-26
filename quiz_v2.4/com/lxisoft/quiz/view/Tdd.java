package com.lxisoft.quiz.view;
import com.lxisoft.quiz.view.QuestionPaperView;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.*;

/**
*This class is used as a view class
*
*@author AryaVineesh
*
*@version 2.4
*
*Date Modified:22/4/2019
*/
public class Tdd
{
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(Tdd.class.getName());
	QuestionPaperView qPView;
	
	/**
	*This is the constructor for Tdd
	*/
	public Tdd()
	{
		log.setLevel(Level.SEVERE);
		loginView();
	}
	
	/**
	*This method is used for selecting the category for the user
	*/
	public  void loginView()
	{
		log.info("Tdd class.............loginView............start");
		int n;
		do{
		System.out.println();
		System.out.println("**********welcome to the quiz************");
		System.out.println();
		System.out.println("1.Admin\n2.User\n");
		System.out.println("Select your category\n");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		switch(n)
		{
			case 1:adminView();
					break;
			case 2:userView();
					break;
		}
		}while(n!=0);
		
		log.info("Tdd class.............loginView............end");	
	}
	
	public void adminView()
	{
		qPView=new QuestionPaperView();
		System.out.println("Select the file operations:");
		System.out.println("1.Insert\n2.Update\n3.Delete");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:selectQuestionType();
			break;
			case 2:qPView.updateFileView();
			break;
			case 3:qPView.deleteFileView();
			break;
		}
	}
	
	public void selectQuestionType()
	{
		System.out.println("Enter the type of question you want:\n");
		System.out.println("1.MultipleChoiceQuestion\n2.MultipleAnswerQuestion\n3.TrueOrFalseQuestion\n");
		System.out.println("select your choice:\n");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		qPView=new QuestionPaperView();
		switch(choice)
		{
			case 1:qPView.enterMultipleChoiceQuestions();
					break;
			case 2:qPView.enterMultipleAnswerQuestions();
					break;
			case 3:qPView.enterTrueOrFalseQuestion();
					break;
		}
	}
	
	public void userView()
	{
		log.info("Tdd class.............userView............start");
		
		System.out.println();
		System.out.println("\n**********Welcome User*********\n");
		System.out.println();
		System.out.println("\nEnter your name:\n");
		Scanner stringInput=new Scanner(System.in);
		Scanner sc=new Scanner(System.in);
		String name=stringInput.nextLine();
		System.out.println("select the type of question paper you would like to answer:\n");
		System.out.println("1.MultipleChoiceQuestion\n2.MultipleAnswerQuestion\n3.TrueOrFalseQuestion\n");
		System.out.println("select your choice:\n");
		int k=sc.nextInt();
		qPView=new QuestionPaperView();
		switch(k)
		{
			case 1:qPView.displayMultipleChoiceQuestions();
					break;
			case 2:qPView.displayMultipleAnswerQuestions();
					break;
			case 3:qPView.displayTrueOrFalseQuestions();
					break;
		}
		
		log.info("Tdd class.............userView............end");
	}
	
	
	
	
	public static void main(String arg[])
	{
		Tdd t= new Tdd();
		log.setLevel(Level.SEVERE);
	}
}