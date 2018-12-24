package com.lxisoft.quiz.questionpaper.question;
import java.io.*;
import java.util.*;
import com.lxisoft.quiz.questionpaper.question.answer.Answer;
import com.lxisoft.quiz.questionpaper.options.Option;
public class Question
{
	Answer answers=new Answer();
	ArrayList<Option> options=new ArrayList<Option>();
	Scanner sc=new Scanner(System.in);
	Scanner stringInput=new Scanner(System.in);
	public void createQuestions()
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
				bw.write(question);
				for(int i=0;i<n;i++)
				{
					options.add(new Option());
					options.get(i).createOptions();
				}
			}
		}
		catch(IOException e)
		{
			
		}
	}
}