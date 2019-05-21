package com.lxisoft.quiz.view;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.*;
import com.lxisoft.quiz.model.Question;
import com.lxisoft.quiz.model.QuestionPaper;
import com.lxisoft.quiz.model.MultipleChoiceQuestion;
import com.lxisoft.quiz.repository.MCQRepository;
import com.lxisoft.quiz.control.QuizControl;
/**
*This class is the view class for MCQ
*
*@author Arya Vineesh
*
*@version 2.4
*
*Date Modified:21/5/2019
*/
public class MCQView
{
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(MCQView.class.getName());
	
	MCQRepository quizRepo;
	
	public void enterMultipleChoiceQuestions()
	{
		log.info("MCQView class.............enterMultipleChoiceQuestions............start");
		
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
			quizRepo=new MCQRepository();
			quizRepo.insertIntoDb(qT);
			
		}
		log.info("MCQView class.............enterMultipleChoiceQuestions............end");
	}
	
	public void displayMultipleChoiceQuestions()
	{
		quizRepo=new MCQRepository();
		ArrayList<MultipleChoiceQuestion> questions=new ArrayList<MultipleChoiceQuestion>();
		questions=quizRepo.selectFromDB();
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
	
	public void updateView()
	{
		QuestionPaper qP=new QuestionPaper();
		ArrayList<MultipleChoiceQuestion> questions=new ArrayList<MultipleChoiceQuestion>();
		MultipleChoiceQuestion qT=new MultipleChoiceQuestion();
		ArrayList<String> options=new ArrayList<String>();
		System.out.println("Enter the id of the question to be updated:\n");
		Scanner sc=new Scanner(System.in);
		Scanner stringInput=new Scanner(System.in);
		String id=stringInput.nextLine();
		qT.setQuestionId(id);
		System.out.println("Enter the Question to be updated:\n");
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
			quizRepo=new MCQRepository();
			quizRepo.updateDB(qT,id);
	}
	
	public void deleteView()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id of the question to be deleted :-\n");
		String id=sc.nextLine();
		quizRepo=new MCQRepository();
		quizRepo.deleteFromDb(id);
		
	}
}