package com.lxisoft.quiz.view;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.*;
import com.lxisoft.quiz.model.Question;
import com.lxisoft.quiz.model.QuestionPaper;
import com.lxisoft.quiz.model.QuizModel;
import com.lxisoft.quiz.control.QuizControl;
import com.lxisoft.quiz.model.MultipleChoiceQuestion;
import com.lxisoft.quiz.model.MultipleAnswerQuestion;
import com.lxisoft.quiz.model.TrueOrFalseQuestion;
public class QuestionPaperView
{
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(Tdd.class.getName());
	QuizModel quizFileModel=new QuizModel();
	QuizControl quizFileContol=new QuizControl();
	
	public void enterMultipleChoiceQuestions()
	{
		log.info("Tdd class.............createQuestionpaperView............start");
		
		QuestionPaper qP=new QuestionPaper();
		ArrayList<MultipleChoiceQuestion> questions=new ArrayList<MultipleChoiceQuestion>();
		ArrayList<String> options=new ArrayList<String>();
		quizFileModel.setFileName("quizfile.csv");
		quizFileContol.createFile(quizFileModel.getFileName());
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
			String writeData=("QuestionId : "+qT.toString()+","+"Question : "+qT.getQuestion()+","+"Option 1: "
			+options.get(0)+","+"Option 2: "+options.get(1)+","+"Option 3: "+options.get(2)+","+"Option 4: "+options.get(3)+","+qT.getAnswer());
			quizFileModel.setWriteData(writeData);
			System.out.println("\nwriteData...."+quizFileModel.getWriteData());
						

			quizFileContol.writeToFile(quizFileModel.getFileName(),quizFileModel.getWriteData());
		}
		log.info("Tdd class.............createQuestionpaperView............end");
	}
	
	public void displayMultipleAnswerQuestions()
	{
		showDate();
		ArrayList<String> readDataArray=quizFileContol.readFromFile(quizFileModel.getFileName());
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
	}
	
	public void displayMultipleChoiceQuestions()
	{
			showDate();
						ArrayList<String> readDataArray=quizFileContol.readFromFile(quizFileModel.getFileName());

						showQuestionPaper(readDataArray);
						
			
	}
	
	public void displayTrueOrFalseQuestions()
	{
		Scanner stringInput=new Scanner(System.in);
						showDate();
						ArrayList<String> readDataArray=quizFileContol.readFromFile(quizFileModel.getFileName());
						int index=readDataArray.size();
						System.out.println("size...."+readDataArray.size());
						int score=0;
						int count=0,limit=2;
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
									if(quizFileContol.isCorrect(answer,readDataArray.get(limit)))
									{
										score++;
									}
									i=i+1;
									limit=limit+3;
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
	public void enterMultipleAnswerQuestions()
	{
		QuestionPaper qP=new QuestionPaper();
		ArrayList<MultipleAnswerQuestion> questions=new ArrayList<MultipleAnswerQuestion>();
		ArrayList<String> options=new ArrayList<String>();
		quizFileModel.setFileName("quizfile2.csv");
		quizFileContol.createFile(quizFileModel.getFileName());
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
			String writeData=("QuestionId : "+qT.toString()+","+"Question : "+qT.getQuestion()+","+"Option 1: "
			+options.get(0)+","+"Option 2: "+options.get(1)+","+"Option 3: "+options.get(2)+","+"Option 4: "+options.get(3)+","+answer[0]+","+answer[1]);
			quizFileModel.setWriteData(writeData);
			System.out.println("\nwriteData...."+quizFileModel.getWriteData());
						

			quizFileContol.writeToFile(quizFileModel.getFileName(),quizFileModel.getWriteData());
		}
	}
	
	public void enterTrueOrFalseQuestion()
	{
		QuestionPaper qP=new QuestionPaper();
		ArrayList<TrueOrFalseQuestion> questions=new ArrayList<TrueOrFalseQuestion>();
		quizFileModel.setFileName("quizfile1.csv");
		quizFileContol.createFile(quizFileModel.getFileName());
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
			String writeData=("QuestionId : "+qT.toString()+","+"Question : "+qT.getQuestion()+","+qT.getIsTrue());
			quizFileModel.setWriteData(writeData);
			System.out.println("\nwriteData...."+quizFileModel.getWriteData());
						

			quizFileContol.writeToFile(quizFileModel.getFileName(),quizFileModel.getWriteData());
		}
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
	public  void showDate()
	{
		log.info("Tdd class.............showDate............start");
		Date d=new Date();
		String date=d.toString();
		System.out.println("Date : "+date);
		log.info("Tdd class.............showDate............end");
	}
}