package com.lxisoft.quiz.view;
import java.util.logging.Logger;
import java.util.logging.Level;
import com.lxisoft.quiz.model.QuestionPaper;
import com.lxisoft.quiz.model.Question;
import com.lxisoft.quiz.model.QuizModel;
import com.lxisoft.quiz.controller.QuizControl;
import java.util.*;
/**
*This class is the main view class
*
*@author Arya Vineesh
*
*@version 2.1
*/
public class Tdd
{
	
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(Tdd.class.getName());
	
	QuizModel quizFileModel=new QuizModel();
	QuizControl quizFileContol=new QuizControl(); 
	
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
			case 1:createQuestionpaperView();
					break;
			case 2:userView();
					break;
		}
		}while(n!=0);
		
		log.info("Tdd class.............loginView............end");	
	}
	
	/**
	*This method is used for create Questionpaper View
	*/
	public  void createQuestionpaperView()
	{
		log.info("Tdd class.............createQuestionpaperView............start");
		
		QuestionPaper qP=new QuestionPaper();
		ArrayList<Question> questions=new ArrayList<Question>();
		ArrayList<String> options=new ArrayList<String>();
		quizFileModel.setFileName("quizfile.csv");
		quizFileContol.createFile(quizFileModel.getFileName());
		System.out.println("\nEnter the no of questions you want:\n");
		Scanner sc=new Scanner(System.in);
		Scanner stringInput=new Scanner(System.in);
		int noOfQuestions=sc.nextInt();
		for(int count=0;count<noOfQuestions;count++)
		{
			Question qT=new Question();
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
			quizFileModel.setWriteData(writeData);
			System.out.println("\nwriteData...."+quizFileModel.getWriteData());
						

			quizFileContol.writeToFile(quizFileModel.getFileName(),quizFileModel.getWriteData());
		}
		for(Question q:questions)
		{
			questions=qP.getQuestions();
			System.out.println(q);
		}
		
		log.info("Tdd class.............createQuestionpaperView............end");
	}
	
	/**
	*This method is used for the user to attend the quiz
	*/
	public  void userView()
	{
		log.info("Tdd class.............userView............start");
		
		System.out.println();
		System.out.println("\n**********Welcome User*********\n");
		System.out.println();
		System.out.println("\nEnter your name:\n");
		Scanner stringInput=new Scanner(System.in);
		String name=stringInput.nextLine();
		System.out.println("\nAre you ready to attend the quiz?Yes/No\n");
		String choice=stringInput.nextLine();
		switch(choice)
		{
			case "y":	showDate();
						ArrayList<String> readDataArray=quizFileContol.readFromFile(quizFileModel.getFileName());

						showQuestionPaper(readDataArray);
						
			case "n":break;
		}
		
		log.info("Tdd class.............userView............end");
	}	
	
	public  void showDate()
	{
		log.info("Tdd class.............showDate............start");
		Date d=new Date();
		String date=d.toString();
		System.out.println("Date : "+date);
		log.info("Tdd class.............showDate............end");
	}
	
	public  void showQuestionPaper(ArrayList<String> readDataArray)
	{
		log.info("Tdd class.............showQuestionPaper............start");
		int index=readDataArray.size();
		int score=0;
		int count=0,limit=6;
		for(int i=count;i<limit;i++)
		{
			if(limit<=index)
			{
				System.out.println(readDataArray.get(i));
				if(i==(limit-1))
				{
					System.out.println("ans.........."+readDataArray.get(limit));
					System.out.println("Enter your answer:\n");
					Scanner stringInput=new Scanner(System.in);
					String answer=stringInput.nextLine();
					if(quizFileContol.isCorrect(answer,readDataArray.get(limit)))
					{
						score++;
					}
					i=i+1;
					limit=limit+7;
				}
			}
		}
		System.out.println();
		System.out.println("****************Quiz  completed**************");
		if(score>0)
			System.out.println("Status : Pass");
		else
			System.out.println("Status : Failed");		
			System.out.println("Mark Scored :"+score);
		log.info("Tdd class.............showQuestionPaper............end");
	}
	public static void main(String arg[])
	{
		Tdd t= new Tdd();
		log.setLevel(Level.SEVERE);
	}
}