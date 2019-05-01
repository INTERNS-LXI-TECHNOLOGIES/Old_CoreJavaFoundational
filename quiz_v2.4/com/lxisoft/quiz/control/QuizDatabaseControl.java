package com.lxisoft.quiz.control;
import  com.lxisoft.quiz.repository.QuizDatabaseConnection;
import com.lxisoft.quiz.model.Question;
import com.lxisoft.quiz.model.MultipleChoiceQuestion;
import java.util.*;
import java.sql.ResultSet;
/**
*This class is the control class for QuizDatabase
*
*@author Arya Vineesh
*
*@version 2.4
*
*Date Modified:1/5/2019
*/
public class QuizDatabaseControl
{
	// public QuizDatabaseControl()
	// {
		// log.setLevel(Level.SEVERE);
	// }
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

	public ArrayList<MultipleChoiceQuestion> selectFromDB()
	{
		
		ArrayList<MultipleChoiceQuestion> questions=new ArrayList<MultipleChoiceQuestion>();
		ResultSet rs;
		try
		{
			String selectQuery="select * from questionpaper";
			connection=new QuizDatabaseConnection();
			rs=connection.select(selectQuery);
			while(rs.next())
			{
				mcq=new MultipleChoiceQuestion();
				String id=rs.getString("QuestionId");
				String question=rs.getString("Question");
				String optionA=rs.getString("OptionA");
				String optionB=rs.getString("OptionB");
				String optionC=rs.getString("OptionC");
				String optionD=rs.getString("OptionD");
				ArrayList<String> options=new ArrayList<String>();
				options.add(optionA);
				options.add(optionB);
				options.add(optionC);
				options.add(optionD);
				String answer=rs.getString("Answer");
				
				mcq.setQuestionId(id);
				mcq.setQuestion(question);
				mcq.setOptions(options);
				mcq.setAnswer(answer);
				questions.add(mcq);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return questions;
	}
	
	public int updateDB(MultipleChoiceQuestion mcq,String id)
	{
		int status=0;
		try
		{
			String updateQuery="update questionpaper set QuestionId='"+mcq.toString()+"',Question='"+mcq.getQuestion()+"',OptionA='"+mcq.getOptions().get(0)+"',OptionB='"+mcq.getOptions().get(1)+"',OptionC='"+mcq.getOptions().get(2)+"',OptionD='"+mcq.getOptions().get(3)+"'";
			status=connection.manipulate(updateQuery);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	
	public void searchSelectFromDB(String answer)
	{
		ResultSet rs;
		try
		{
			String searchQuery="Select Answer from questionpaper where QuestionId like ?";
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}