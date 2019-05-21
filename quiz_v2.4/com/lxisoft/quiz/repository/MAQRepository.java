package com.lxisoft.quiz.repository;
import com.lxisoft.quiz.model.Question;
import com.lxisoft.quiz.model.MultipleAnswerQuestion;
import java.util.*;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
/**
*This class is the repository class for MAQ
*
*@author Arya Vineesh
*
*@version 2.4
*
*Date Modified:21/5/2019
*/
public class MAQRepository
{
	Connection con;
	PreparedStatement ps;
	Question questionModel;
	MultipleAnswerQuestion maq;
	
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(MAQRepository.class.getName());
	
	public MAQRepository()
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
	
	public int insertIntoDb(MultipleAnswerQuestion maq)
	{
		int status=0;
		try
		{
			ArrayList<String> options=new ArrayList<String>();
			
			
			options=maq.getOptions();
			
			for(int i=0;i<4;i++)
			{
				System.out.println("arraylist..... "+options.get(i));
			}
			
			String[] answers=new String[2];
			answers=maq.getAnswers();
			
			
			String insertQuery="insert into maq_questionPaper values(?,?,?,?,?,?,?,?)";
			ps=con.prepareStatement(insertQuery);
			ps.setString(1,maq.toString());
			ps.setString(2,maq.getQuestion());
			ps.setString(3,options.get(0));
			ps.setString(4,options.get(1));
			ps.setString(5,options.get(2));
			ps.setString(6,options.get(3));
			ps.setString(7,answers[0]);
			ps.setString(8,answers[1]);
			status=ps.executeUpdate();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}	

	public ArrayList<MultipleAnswerQuestion> selectFromDB()
	{
		
		ArrayList<MultipleAnswerQuestion> questions=new ArrayList<MultipleAnswerQuestion>();
		ResultSet rs;
		try
		{
			String selectQuery="select * from maq_questionpaper";
			ps=con.prepareStatement(selectQuery);
			
			rs=ps.executeQuery();
			while(rs.next())
			{
				maq=new MultipleAnswerQuestion();
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
				String answer1=rs.getString("Answer1");
				String answer2=rs.getString("Answer2");
				String[] answers=new String[2];
				answers[0]=answer1;
				answers[1]=answer2;
				
				maq.setQuestionId(id);
				maq.setQuestion(question);
				maq.setOptions(options);
				maq.setAnswers(answers);
				questions.add(maq);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return questions;
	}
	
	public int updateDB(MultipleAnswerQuestion maq,String id)
	{
		int status=0;
		try
		{
			ArrayList<String> options=new ArrayList<String>();
			
			
			options=maq.getOptions();
			
			for(int i=0;i<4;i++)
			{
				System.out.println("arraylist..... "+options.get(i));
			}
			
			String[] answers=new String[2];
			answers=maq.getAnswers();
			
			
			String updateQuery="update maq_questionpaper set Question=?,OptionA=?,OptionB=?,OptionC=?,OptionD=?,Answer1=?,Answer2=? where QuestionId=?";
			ps=con.prepareStatement(updateQuery);
			
			ps.setString(1,maq.getQuestion());
			ps.setString(2,options.get(0));
			ps.setString(3,options.get(1));
			ps.setString(4,options.get(2));
			ps.setString(5,options.get(3));
			ps.setString(6,answers[0]);
			ps.setString(7,answers[1]);
			ps.setString(8,maq.toString());
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
			String deleteQuery="delete from maq_questionpaper where QuestionId=?";
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