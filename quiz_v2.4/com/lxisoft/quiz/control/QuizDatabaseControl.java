package com.lxisoft.quiz.control;
import  com.lxisoft.quiz.repository.QuizDatabaseConnection;
import com.lxisoft.quiz.model.Question;
import com.lxisoft.quiz.model.MultipleChoiceQuestion;
import java.util.*;
public class QuizDatabaseControl
{
	QuizDatabaseConnection connection;
	Question questionModel;
	MultipleChoiceQuestion mcq;
	public int insertIntoDb(MultipleChoiceQuestion mcq)
	{
		int status=0;
		try
		{
			ArrayList<String> options=new ArrayList<String>();
			options=mcq.getOptions();
			
			for(int i=0;i<4;i++)
			{
				System.out.println("arraylist..... "+options.get(i));
			}
			
			String insertQuery="insert into questionPaper(QuestionId,Question,OptionA,OptionB,OptionC,OptionD,Answer) values('"+mcq.toString()+"','"+mcq.getQuestion()+"','"+options.get(0)+"','"+options.get(1)+"','"+options.get(2)+"','"+options.get(3)+"','"+mcq.getAnswer()+"')";
			connection=new QuizDatabaseConnection();
			status=connection.manipulate(insertQuery);
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}		
}