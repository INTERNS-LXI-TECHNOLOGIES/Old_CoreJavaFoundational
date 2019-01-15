package com.lxisoft.quiz.controller;
import java.util.logging.*;
import com.lxisoft.quiz.model.QuestionPaper;
import com.lxisoft.quiz.model.Question;
import com.lxisoft.quiz.model.QuizFileModel;
import com.lxisoft.quiz.controller.QuizFileService;
import java.util.*;
public class QuestionPaperService
{
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(QuestionPaperService.class.getName());
	
	QuestionPaper qP;
	Question qT;
	Scanner sc=new Scanner(System.in);
	Scanner stringInput=new Scanner(System.in);
	QuizFileModel quizFileModel=new QuizFileModel();
	QuizFileService quizFileService=new QuizFileService(); 
	
	/**
	*This method is used for selecting the category for the user
	*
	*
	*/
	public void selectCategory()
	{
		log.info("QuestionPaperService class.............selectCategory............start");
		int n;
		do{
		System.out.println();
		System.out.println("**********welcome to the quiz************");
		System.out.println();
		System.out.println("1.Admin\n2.User\n");
		System.out.println("Select your category\n");
		n=sc.nextInt();
		switch(n)
		{
			case 1:createQuestionpaper();
					break;
			case 2:attendQuiz();
					break;
		}
		}while(n!=0);
		
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
		quizFileModel.setFileName("quizfile.csv");
		quizFileService.createFile(quizFileModel.getFileName());
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
			quizFileModel.setWriteData(writeData);
			System.out.println("\nwriteData...."+quizFileModel.getWriteData());
						

			quizFileService.writeToFile(quizFileModel.getFileName(),quizFileModel.getWriteData());
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
			case "y":	showDate();
						ArrayList<String> readDataArray=quizFileService.readFromFile(quizFileModel.getFileName());

						printFileContents(readDataArray);
						
			case "n":break;
		}
		
		log.info("QuestionPaperService class.............attendQuiz............end");
	}	
	
	public void showDate()
	{
		Date d=new Date();
		String date=d.toString();
		System.out.println("Date : "+date);
	}
	
	public void printFileContents(ArrayList<String> readDataArray)
	{
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
					String answer=stringInput.nextLine();
					if(quizFileService.isCorrect(answer,readDataArray.get(limit)))
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
			
	}

}