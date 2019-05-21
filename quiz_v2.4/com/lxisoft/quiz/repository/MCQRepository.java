package com.lxisoft.quiz.repository;
import com.lxisoft.quiz.model.Question;
import com.lxisoft.quiz.model.MultipleChoiceQuestion;
import java.util.*;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
/**
*This class is the repository class for Quiz
*
*@author Arya Vineesh
*
*@version 2.4
*
*Date Modified:21/5/2019
*/
public class MCQRepository
{
	Connection con;
	PreparedStatement ps;
	Question questionModel;
	MultipleChoiceQuestion mcq;
	
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(MCQRepository.class.getName());
	
	public MCQRepository()
	{
		//log.setLevel(Level.SEVERE);
		try
		{
			// Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","root");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}	
	}
	
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
			
			String insertQuery="insert into questionPaper values(?,?,?,?,?,?,?)";
			ps=con.prepareStatement(insertQuery);
			ps.setString(1,mcq.toString());
			ps.setString(2,mcq.getQuestion());
			ps.setString(3,options.get(0));
			ps.setString(4,options.get(1));
			ps.setString(5,options.get(2));
			ps.setString(6,options.get(3));
			ps.setString(7,mcq.getAnswer());
			status=ps.executeUpdate();
			
			
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
			ps=con.prepareStatement(selectQuery);
			
			rs=ps.executeQuery();
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
			ArrayList<String> options=new ArrayList<String>();
			
			
			options=mcq.getOptions();
			
			for(int i=0;i<4;i++)
			{
				System.out.println("arraylist..... "+options.get(i));
			}
			String updateQuery="update questionpaper set Question=?,OptionA=?,OptionB=?,OptionC=?,OptionD=?,Answer=? where QuestionId=?";
			ps=con.prepareStatement(updateQuery);
			
			ps.setString(1,mcq.getQuestion());
			ps.setString(2,options.get(0));
			ps.setString(3,options.get(1));
			ps.setString(4,options.get(2));
			ps.setString(5,options.get(3));
			ps.setString(6,mcq.getAnswer());
			ps.setString(7,mcq.toString());
			status=ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	
	public int deleteFromDb(String id)
	{
		int status=0;
		try
		{
			String deleteQuery="delete from questionpaper where QuestionId=?";
			ps=con.prepareStatement(deleteQuery);
			ps.setString(1,id);
			status=ps.executeUpdate();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return status;
	}
}