package com.lxisoft.quiz.service;
import java.io.*;
import java.util.*;
import java.util.logging.*;
import com.lxisoft.quiz.utilities.Utility;
import com.lxisoft.quiz.model.*;
/**
*This class is for service QuestionPaper
*
*@author Arya Vineesh
*
*@version 1.5
*/
public class QuestionPaperService
{
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(QuestionPaper.class.getName());
	
	Utility fileUtility=new Utility();
	Question qT;
	QuestionPaper qP;
	Scanner sc=new Scanner(System.in);
	Scanner stringInput=new Scanner(System.in);
	
	/**
	*This method is used for selecting the category for the user
	*
	*
	*/
	public void selectCategory()
	{
		log.info("QuestionPaperService class.............selectCategory............start");
		
		System.out.println();
		System.out.println("**********welcome to the quiz************");
		System.out.println();
		System.out.println("1.Admin\n2.User\n");
		System.out.println("Select your category\n");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:createQuestionpaper();
					break;
			case 2:attendQuiz();
					break;
		}
		
		log.info("QuestionPaperService class.............selectCategory............end");
	}
	
	/**
	*This method is used for create Questionpaper
	*/
	public void createQuestionpaper()
	{
		log.info("QuestionPaperService class.............createQuestionpaper............start");
		
		qP=new QuestionPaper();
		ArrayList<Question> questions=new ArrayList<Question>();
		ArrayList<String> options=new ArrayList<String>();
		fileUtility.createFile("quizfile.csv");
		System.out.println("\nEnter the no of questions you want:\n");
		int noOfQuestions=sc.nextInt();
		for(int count=0;count<noOfQuestions;count++)
		{
			qT=new Question();
			System.out.println("\nEnter the question Id :\n");
			String id=stringInput.nextLine();
			qT.setQuestionId(id);
			
			System.out.println("\nEnter the question:\n");
			String question=stringInput.nextLine();
			qT.setQuestion(question);
			System.out.println("\nEnter the no of options you want:\n");
			int noOfOptions=sc.nextInt();
			for(int i=0;i<noOfOptions;i++)
			{
				System.out.println("\nEnter the option: "+(i+1));
				String option=stringInput.nextLine();
				options.add(option);
				qT.setOptions(options);	
			}
			System.out.println("\nEnter the correct answer:\n");
			String answer=stringInput.nextLine();
			qT.setAnswer(answer);
			questions.add(qT);
			qP.setQuestions(questions); 
			String writeData=("QuestionId : "+qT.toString()+","+"Question : "+qT.getQuestion()+","+"Option 1: "
			+options.get(0)+","+"Option 2: "+options.get(1)+","+"Option 3: "+options.get(2)+","+"Option 4: "+options.get(3)+","+qT.getAnswer());
			fileUtility.writeToFile("quizfile.csv",writeData);
		}
		for(Question q:questions)
		{
			questions=qP.getQuestions();
			System.out.println(q);
		}
		
		log.info("QuestionPaperService class.............createQuestionpaper............end");
	}
	
	/**
	*This method is used for the user to attend the quiz
	*/
	public void attendQuiz()
	{
		log.info("QuestionPaperService class.............attendQuiz............start");
		
		System.out.println();
		System.out.println("\n**********Welcome User*********\n");
		System.out.println();
		System.out.println("\nEnter your name:\n");
		String name=stringInput.nextLine();
		System.out.println("\nAre you ready to attend the quiz?Yes/No\n");
		String choice=stringInput.nextLine();
		switch(choice)
		{
			case "y":	showQuestionPaper();
						fileUtility.readFromFile("quizfile.csv");			
			case "n":break;
		}
		
		log.info("QuestionPaperService class.............attendQuiz............end");
	}	
	
	public void showQuestionPaper()
	{
		Date d=new Date();
		String date=d.toString();
		System.out.println("Date : "+date);
	}
}