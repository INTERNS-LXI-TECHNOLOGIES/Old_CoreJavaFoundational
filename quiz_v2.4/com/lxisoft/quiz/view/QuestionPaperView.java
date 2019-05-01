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
import com.lxisoft.quiz.control.QuizControl;
/**
*This class is the view class for QuestionPaper
*
*@author Arya Vineesh
*
*@version 2.4
*
*Date Modified:1/5/2019
*/
public class QuestionPaperView
{
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(QuestionPaperView.class.getName());
	QuizDatabaseControl quizDbControl;
		
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
			quizDbControl=new QuizDatabaseControl();
			quizDbControl.insertIntoDb(qT);
			
		}
		log.info("Tdd class.............createQuestionpaperView............end");
	}
	
	public void displayMultipleAnswerQuestions()
	{
		
	}
	
	public void displayMultipleChoiceQuestions()
	{
		quizDbControl=new QuizDatabaseControl();
		ArrayList<MultipleChoiceQuestion> questions=new ArrayList<MultipleChoiceQuestion>();
		questions=quizDbControl.selectFromDB();
		int score=0;
		for(int i=0;i<questions.size();i++)
		{
			MultipleChoiceQuestion mcq=questions.get(i);
			ArrayList<String> options=new ArrayList<String>();
			options=mcq.getOptions();
			System.out.println("QuestionId:"+mcq.toString()+"\n"+"Question:"+mcq.getQuestion()+"\n"+"OptionA:"+options.get(0)+"\n"+"OptionB:"+options.get(1)+"\n"+"OptionC:"+options.get(2)+"\n"+"OptionD:"+options.get(3));
			System.out.println("Enter the answer:\n");
			Scanner sc=new Scanner(System.in);
			String answer=sc.nextLine();
			QuizControl qC=new QuizControl();
			if(qC.isCorrect(answer,mcq.getAnswer()))
			{
				score++;
			}
		}
		displayResult(score);
		
	}
	
	public void displayResult(int score)
	{
		System.out.println();
		System.out.println("****************Quiz  completed**************");
		if(score>0)
			System.out.println("Status : Pass");
		else
			System.out.println("Status : Failed");		
			System.out.println("Mark Scored :"+score);
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
	
	public void updateView()
	{
		MultipleChoiceQuestion qT=new MultipleChoiceQuestion();
		System.out.println("Enter the id of the question to be updated:\n");
		Scanner sc=new Scanner(System.in);
		String id=sc.nextLine();
		quizDbControl=new QuizDatabaseControl();
		quizDbControl.updateDB(qT,id);
		System.out.println();
		
		
		
	}
	
	public void deleteView()
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