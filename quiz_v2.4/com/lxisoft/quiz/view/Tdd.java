package com.lxisoft.quiz.view;
import com.lxisoft.quiz.view.MCQView;
import com.lxisoft.quiz.view.MAQView;
import com.lxisoft.quiz.view.TFQView;
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
*Date Modified:21/5/2019
*/
public class Tdd
{
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(Tdd.class.getName());
	MCQView mcqView;
	TFQView tfqView;
	MAQView maqView;
	
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
	/**
	*This method is used to select the operation performed by the admin
	*/
	public void adminView()
	{
		log.info("Tdd class.............adminView............start");
		System.out.println("Enter the type of question you want:\n");
		System.out.println("1.MultipleChoiceQuestion\n2.MultipleAnswerQuestion\n3.TrueOrFalseQuestion\n");
		System.out.println("select your choice:\n");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:mcqView=new MCQView();
					System.out.println("Select your operation:");
					System.out.println("1.Insert\n2.Update\n3.Delete");
					int select=sc.nextInt();
					switch(select)
					{
						case 1:mcqView.enterMultipleChoiceQuestions();
						break;
						case 2:mcqView.updateView();
						break;
						case 3:mcqView.deleteView();
						break;
					}
			break;
			case 2:maqView=new MAQView();
					System.out.println("Select your operation:");
					System.out.println("1.Insert\n2.Update\n3.Delete");
					int select2=sc.nextInt();
					switch(select2)
					{
						case 1:maqView.enterMultipleAnswerQuestions();
						break;
						case 2:maqView.updateView();
						break;
						case 3:maqView.deleteView();
						break;
					}
			break;
			case 3:tfqView=new TFQView();
					System.out.println("Select your operation:");
					System.out.println("1.Insert\n2.Update\n3.Delete");
					int select3=sc.nextInt();
					switch(select3)
					{
						case 1:tfqView.enterTrueOrFalseQuestion();
						break;
						case 2:tfqView.updateView();
						break;
						case 3:tfqView.deleteView();
						break;
					}
			break;
		}
		log.info("Tdd class.............adminView............end");
	}
	
	/**
	*This method is used for user view of the quiz
	*/
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
		switch(k)
		{
			case 1:mcqView=new MCQView();
					mcqView.displayMultipleChoiceQuestions();
					break;
			case 2:maqView=new MAQView();
					maqView.displayMultipleAnswerQuestions();
					break;
			case 3:tfqView=new TFQView();
					tfqView.displayTrueOrFalseQuestion();
					break;
		}
		
		log.info("Tdd class.............userView............end");
	}
	
	/**
	*this is the main method
	*/
	public static void main(String arg[])
	{
		Tdd t= new Tdd();
		log.setLevel(Level.SEVERE);
	}
}