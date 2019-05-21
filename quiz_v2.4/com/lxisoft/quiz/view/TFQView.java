package com.lxisoft.quiz.view;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.*;
import com.lxisoft.quiz.model.Question;
import com.lxisoft.quiz.model.QuestionPaper;
import com.lxisoft.quiz.model.TrueOrFalseQuestion;
import com.lxisoft.quiz.repository.TFQRepository;
import com.lxisoft.quiz.control.QuizControl;
/**
*This class is the view class for True or False Questions
*
*@author Arya Vineesh
*
*@version 2.4
*
*Date Modified:21/5/2019
*/
public class TFQView
{
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(TFQView.class.getName());
	
	/**
	*Reference TFQRepository class to access the databases
	*/
	TFQRepository tfqRepo;
	
	/**
	*this method is used to enter the true or false questions by the admin
	*/
	public void enterTrueOrFalseQuestion()
	{
		log.info("TFQView class.............enterTrueOrFalseQuestion............start");
		QuestionPaper qP=new QuestionPaper();
		ArrayList<TrueOrFalseQuestion> questions=new ArrayList<TrueOrFalseQuestion>();
		System.out.println("\nEnter the no of questions you want:\n");
		Scanner sc=new Scanner(System.in);
		Scanner stringInput=new Scanner(System.in);
		int noOfQuestions=sc.nextInt();
		for(int count=0;count<noOfQuestions;count++)
		{
			TrueOrFalseQuestion qT=new TrueOrFalseQuestion();
			System.out.println("\nEnter the question Id :\n");
			String id=stringInput.nextLine();
			qT.setQuestionId(id);
			
			System.out.println("\nEnter the question:\n");
			String question=stringInput.nextLine();
			qT.setQuestion(question);
			
			System.out.println("Enter the status of the question.true/false?");
			boolean status=sc.nextBoolean();
			qT.setIsTrue(status);
			
			questions.add(qT);
			qP.setTrueOrFalseQuestion(questions);
			tfqRepo=new TFQRepository();
			tfqRepo.insertIntoDb(qT);
		}
		log.info("TFQView class.............enterTrueOrFalseQuestion............end");
	}
	
	/**
	*this method is used for display true/false questions to the user
	*/
	public void displayTrueOrFalseQuestion()
	{
		log.info("TFQView class.............displayTrueOrFalseQuestion............start");
		tfqRepo=new TFQRepository();
		ArrayList<TrueOrFalseQuestion> questions=new ArrayList<TrueOrFalseQuestion>();
		questions=tfqRepo.selectFromDB();
		int score=0;
		for(int i=0;i<questions.size();i++)
		{
			TrueOrFalseQuestion tfq=questions.get(i);
			System.out.println("QuestionId:"+tfq.toString()+"\n"+"Question:"+tfq.getQuestion()+"\n");
			System.out.println("Enter the answer:\n");
			Scanner sc=new Scanner(System.in);
			boolean status=sc.nextBoolean();
			QuizControl qC=new QuizControl();
			if(status==tfq.getIsTrue())
			{
				score++;
			}
		}
		displayResult(score);
		log.info("TFQView class.............displayTrueOrFalseQuestion............end");
	}
	
	
	/**
	*this method is used for display the result
	*/
	public void displayResult(int score)
	{
		log.info("TFQView class.............displayResult............start");
		System.out.println();
		System.out.println("****************Quiz  completed**************");
		if(score>0)
			System.out.println("Status : Pass");
		else
			System.out.println("Status : Failed");		
			System.out.println("Mark Scored :"+score);
		log.info("TFQView class.............displayResult............end");
	}
	
	/**
	*this method is used as a view for update operation
	*/
	
	public void updateView()
	{
		log.info("TFQView class.............updateView............start");
		QuestionPaper qP=new QuestionPaper();
		ArrayList<TrueOrFalseQuestion> questions=new ArrayList<TrueOrFalseQuestion>();
		TrueOrFalseQuestion qT=new TrueOrFalseQuestion();
		System.out.println("Enter the id of the question to be updated:\n");
		Scanner sc=new Scanner(System.in);
		Scanner stringInput=new Scanner(System.in);
		String id=stringInput.nextLine();
		qT.setQuestionId(id);
		System.out.println("Enter the Question to be updated:\n");
		String question=stringInput.nextLine();
		qT.setQuestion(question);
		
			System.out.println("Enter the status of the question.true/false?");
			boolean status=sc.nextBoolean();
			qT.setIsTrue(status);
			questions.add(qT);
			qP.setTrueOrFalseQuestion(questions);
			tfqRepo=new TFQRepository();
			tfqRepo.updateDB(qT,id);
		log.info("TFQView class.............updateView............end");
	}
	
	public void deleteView()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id of the question to be deleted :-\n");
		String id=sc.nextLine();
		tfqRepo=new TFQRepository();
		tfqRepo.deleteFromDb(id);
		
	}
}