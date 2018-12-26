package com.lxisoft.quiz.service;
import java.io.*;
import java.util.*;
import com.lxisoft.quiz.domain.QuestionPaper;
/**
*Service class for QuestionPaper
*
*@author Arya Vineesh
*/
public class QuestionPaperService
{
	QuestionPaper qP;
	Scanner sc=new Scanner(System.in);
	Scanner stringInput=new Scanner(System.in);
	int count,Mark=0;
	public void createQuestionpaper()
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
			case 1:setQuestionpaper();
					break;
			case 2:attendQuiz();
					break;
		}
	
		
	}
	public void setQuestionpaper()
	{
		try
		{
			File quizFile=new File("quizfile.csv");
			quizFile.createNewFile();
			FileWriter fw=new FileWriter(quizFile);
			BufferedWriter bw=new BufferedWriter(fw);
			System.out.println("Enter the no of questions you want:\n");
		
			int noOfQuestions=sc.nextInt();
			for(int count=0;count<noOfQuestions;count++)
			{
				System.out.println("Enter the question:\n");
				String question=stringInput.nextLine();
				qP.setQuestion(question); 
				bw.write(qP.getQuestion());
				
				System.out.println("Enter the options:");
				for(int i=0;i<4;i++)
				{
					String option=stringInput.nextLine();
					
					bw.append(',');
					bw.write(option);
					
				}
				System.out.println("Enter the correct answer:\n");
				String answer=stringInput.nextLine();
				bw.append(',');
				bw.write(answer);
				
				bw.append("\n");
			}
			
			bw.flush();
			bw.close();
		 
		}
		catch(IOException e)
		{
			
		}
	}
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
	public void displayQuestionpaper()
	{
		try
		{
			FileReader fr=new FileReader("quizfile.csv");
			BufferedReader br=new BufferedReader(fr);
			String readFromFile=br.readLine();
			
			while(readFromFile!=null)
			{
				String readDataArray[]=readFromFile.split(",");
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
				readFromFile=br.readLine();
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
		catch(IOException e)
		{
			
		}
		
	}
}