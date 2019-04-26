package com.lxisoft.quiz.view;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.*;
import com.lxisoft.quiz.model.Question;
import com.lxisoft.quiz.model.QuestionPaper;
import com.lxisoft.quiz.model.MultipleChoiceQuestion;
import com.lxisoft.quiz.model.MultipleAnswerQuestion;
import com.lxisoft.quiz.model.TrueOrFalseQuestion;
import com.lxisoft.quiz.control.QuizDatabaseControl;
/**
*This class is the view class for QuestionPaper
*
*@author Arya Vineesh
*
*@version 2.4
*
*Date Modified:22/4/2019
*/
public class QuestionPaperView
{
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(QuestionPaperView.class.getName());
	QuizDatabaseControl quizControl;
		
	public void enterMultipleChoiceQuestions()
	{
		log.info("Tdd class.............createQuestionpaperView............start");
		
		QuestionPaper qP=new QuestionPaper();
		ArrayList<MultipleChoiceQuestion> questions=new ArrayList<MultipleChoiceQuestion>();
		ArrayList<String> options=new ArrayList<String>();
		System.out.println("\nEnter the no of questions you want:\n");
		Scanner sc=new Scanner(System.in);
		Scanner stringInput=new Scanner(System.in);
		int noOfQuestions=sc.nextInt();
		for(int count=0;count<noOfQuestions;count++)
		{
			MultipleChoiceQuestion qT=new MultipleChoiceQuestion();
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
			qP.setMultipleChoiceQuestion(questions);
			quizControl=new QuizDatabaseControl();
			quizControl.insertIntoDb(qT);
			
		}
		log.info("Tdd class.............createQuestionpaperView............end");
	}
	
	public void displayMultipleAnswerQuestions()
	{
		
	}
	
	public void displayMultipleChoiceQuestions()
	{
			
	}
	
	public void displayTrueOrFalseQuestions()
	{
		
	}
	public void enterMultipleAnswerQuestions()
	{
		QuestionPaper qP=new QuestionPaper();
		ArrayList<MultipleAnswerQuestion> questions=new ArrayList<MultipleAnswerQuestion>();
		ArrayList<String> options=new ArrayList<String>();
		System.out.println("\nEnter the no of questions you want:\n");
		Scanner sc=new Scanner(System.in);
		Scanner stringInput=new Scanner(System.in);
		int noOfQuestions=sc.nextInt();
		for(int count=0;count<noOfQuestions;count++)
		{
			MultipleAnswerQuestion qT=new MultipleAnswerQuestion();
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
			System.out.println("\nEnter the correct 2 answers:\n");
			String[] answer=new String[2];
			answer[0]=stringInput.nextLine();
			answer[1]=stringInput.nextLine();
			qT.setAnswers(answer);
			
			questions.add(qT);
			qP.setMultipleAnswerQuestion(questions); 
		}
	}
	
	public void enterTrueOrFalseQuestion()
	{
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
		}
	}
	public  void showQuestionPaper(ArrayList<String> readDataArray)
	{
		
	}
	
	public void updateFileView()
	{
		
		
		
	}
	
	public void deleteFileView()
	{
		
		
	}
	public  void showDate()
	{
		log.info("Tdd class.............showDate............start");
		Date d=new Date();
		String date=d.toString();
		System.out.println("Date : "+date);
		log.info("Tdd class.............showDate............end");
	}
}