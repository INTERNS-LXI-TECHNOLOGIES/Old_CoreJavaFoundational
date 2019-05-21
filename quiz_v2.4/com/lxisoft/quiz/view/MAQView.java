package com.lxisoft.quiz.view;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.*;
import com.lxisoft.quiz.model.Question;
import com.lxisoft.quiz.model.QuestionPaper;
import com.lxisoft.quiz.model.MultipleAnswerQuestion;
import com.lxisoft.quiz.repository.MAQRepository;
import com.lxisoft.quiz.control.QuizControl;
/**
*This class is the view class for MultipleAnswerQuestion
*
*@author Arya Vineesh
*
*@version 2.4
*
*Date Modified:21/5/2019
*/
public class MAQView
{
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(MAQView.class.getName());
	
	MAQRepository maqRepo;
	
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
			maqRepo=new MAQRepository();
			maqRepo.insertIntoDb(qT);
		}
	}
	
	public void displayMultipleAnswerQuestions()
	{
		maqRepo=new MAQRepository();
		ArrayList<MultipleAnswerQuestion> questions=new ArrayList<MultipleAnswerQuestion>();
		questions=maqRepo.selectFromDB();
		int score=0;
		for(int i=0;i<questions.size();i++)
		{
			MultipleAnswerQuestion maq=questions.get(i);
			ArrayList<String> options=new ArrayList<String>();
			options=maq.getOptions();
			System.out.println("QuestionId:"+maq.toString()+"\n"+"Question:"+maq.getQuestion()+"\n"+"OptionA:"+options.get(0)+"\n"+"OptionB:"+options.get(1)+"\n"+"OptionC:"+options.get(2)+"\n"+"OptionD:"+options.get(3));
			System.out.println("Enter the answer:\n");
			Scanner sc=new Scanner(System.in);
			String answer=sc.nextLine();
			QuizControl qC=new QuizControl();
			if(qC.isCorrect(answer,maq.getAnswer()))
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
		ArrayList<MultipleAnswerQuestion> questions=new ArrayList<MultipleAnswerQuestion>();
		MultipleAnswerQuestion qT=new MultipleAnswerQuestion();
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
			System.out.println("\nEnter the correct answers:\n");
			String[] answers=new String[2];
			answers[0]=stringInput.nextLine();
			answers[1]=stringInput.nextLine();
			
			qT.setAnswers(answers);
			questions.add(qT);
			qP.setMultipleAnswerQuestion(questions);
			maqRepo=new MAQRepository();
			maqRepo.updateDB(qT,id);
	}
	
	public void deleteView()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id of the question to be deleted :-\n");
		String id=sc.nextLine();
		maqRepo=new MAQRepository();
		maqRepo.deleteFromDb(id);
		
	}
}