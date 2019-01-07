package com.lxisoft.quiz.service;
import java.io.*;
import java.util.*;
import com.lxisoft.quiz.utilities.Utility;
import com.lxisoft.quiz.model.*;
/**
*This class is for service QuestionPaper
*
*@author Arya Vineesh
*
*@version 1.4
*/
public class QuestionPaperService
{
	Utility fileUtility=new Utility();
	Question qT;
	QuestionPaper qP;
	Scanner sc=new Scanner(System.in);
	Scanner stringInput=new Scanner(System.in);
	int count,Mark=0;
	/**
	*This method is used for selecting the category for the user
	*
	*
	*/
	public void selectCategory()
	{
		
		qP=new QuestionPaper();
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
	
		
	}
	
	/**
	*This method is used for create Questionpaper
	*/
	public void createQuestionpaper()
	{
		ArrayList<Question> questions=new ArrayList<Question>();
		ArrayList<String> options=new ArrayList<String>();
			fileUtility.createFile("quizfile.csv");
			
			
			System.out.println("Enter the no of questions you want:\n");
			int noOfQuestions=sc.nextInt();
			for(int count=0;count<noOfQuestions;count++)
			{
				qT=new Question();
				
				System.out.println("Enter the question:\n");
				String question=stringInput.nextLine();
				qT.setQuestion(question);
				
				
				fileUtility.writeToFile("quizfile.csv",qT.getQuestion());
				
				System.out.println("Enter the no of options you want:\n");
				int noOfOptions=sc.nextInt();
				for(int i=0;i<noOfOptions;i++)
				{
					System.out.println("Enter the option: "+(i+1));
					String option=stringInput.nextLine();
					options.add(option);
					qT.setOptions(options);
					System.out.println();
					System.out.println("read data>>>>>>>>>>>>"+qT.getOptions().get(i));
					System.out.println();
					fileUtility.writeToFile("quizfile.csv",qT.getOptions().get(i));
				}
				
				
				System.out.println("Enter the correct answer:\n");
				String answer=stringInput.nextLine();
				qT.setAnswer(answer);
				fileUtility.writeToFile("quizfile.csv",qT.getAnswer());
				
				questions.add(qT);
				qP.setQuestions(questions); 
			}
			for(int k=0;k<questions.size();k++)
			{
				questions=qP.getQuestions();
				System.out.println(questions.get(k));
			}
			
		
	}
	
	/**
	*This method is used for the user to attend the quiz
	*/
	public void attendQuiz()
	{
		System.out.println();
		System.out.println("**********Welcome User*********");
		System.out.println();
		System.out.println("Enter your name:\n");
		String name=stringInput.nextLine();
		System.out.println("Are you ready to attend the quiz?Yes/No");
		String choice=stringInput.nextLine();
		switch(choice)
		{
			case "y":displayQuestionpaper();
			case "n":break;
		}
		
	}
	
	/**
	*This method is used to display the Questionpaper
	*/
	public void displayQuestionpaper()
	{
		
			String readData=fileUtility.readFromFile("quizfile.csv");
			System.out.println();
			System.out.println("read data for display>>>>>>>>>"+readData);
			System.out.println();
			while(readData!=null)
			{
				 String readDataArray[]=readData.split(",");
				for(int i=0;i<5;i++)
				{
					System.out.println(readDataArray[i]);
				}
				
			
				System.out.println("Enter your answer:\n");
				String answer=stringInput.nextLine();
				if(answer.equals(readDataArray[5]))
				{
					count++;
					Mark=Mark+2;
				}
				
				readData=fileUtility.readFromFile("quizfile.csv");
			
			}
			
			System.out.println();
			System.out.println("****************Quiz  completed**************");
			if(Mark>0)
				System.out.println("Status : Pass");
			else
				System.out.println("Status : Failed");
			System.out.println("The no of questions answered is: "+count);
			System.out.println("Mark Scored :"+Mark);
			if(Mark>=9)
				System.out.println("Grade A");
			else if(Mark<9 && Mark>=7)
				System.out.println("Grade B");
			else if(Mark<7 && Mark>=5)
				System.out.println("Grade C");
			else if(Mark<5 && Mark>0)
			{
				System.out.println("Grade not mentioned.You need improvement.");
			}
		
		
	}
}