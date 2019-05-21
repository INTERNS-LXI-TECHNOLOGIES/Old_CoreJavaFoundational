package com.lxisoft.quiz.repository;
import com.lxisoft.quiz.model.Question;
import com.lxisoft.quiz.model.TrueOrFalseQuestion;
import java.util.*;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
/**
*This class is the repository class for TFQ
*
*@author Arya Vineesh
*
*@version 2.4
*
*Date Modified:21/5/2019
*/
public class TFQRepository
{
	Connection con;
	PreparedStatement ps;
	Question questionModel;
	TrueOrFalseQuestion tfq;
	
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(TFQRepository.class.getName());
	
	public TFQRepository()
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
	
	public int insertIntoDb(TrueOrFalseQuestion tfq)
	{
		int status=0;
		try
		{
			String insertQuery="insert into tfq_questionPaper values(?,?,?)";
			ps=con.prepareStatement(insertQuery);
			ps.setString(1,tfq.toString());
			ps.setString(2,tfq.getQuestion());
			ps.setBoolean(3,tfq.getIsTrue());
			status=ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}	

	public ArrayList<TrueOrFalseQuestion> selectFromDB()
	{
		
		ArrayList<TrueOrFalseQuestion> questions=new ArrayList<TrueOrFalseQuestion>();
		ResultSet rs;
		try
		{
			String selectQuery="select * from tfq_questionpaper";
			ps=con.prepareStatement(selectQuery);
			
			rs=ps.executeQuery();
			while(rs.next())
			{
				tfq=new TrueOrFalseQuestion();
				String id=rs.getString("QuestionId");
				String question=rs.getString("Question");
				boolean status=rs.getBoolean("Status");
				
				tfq.setQuestionId(id);
				tfq.setQuestion(question);
				tfq.setIsTrue(status);
				questions.add(tfq);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return questions;
	}
	
	public int updateDB(TrueOrFalseQuestion tfq,String id)
	{
		int status=0;
		try
		{
			String updateQuery="update tfq_questionpaper set Question=?,Status=? where QuestionId=?";
			ps=con.prepareStatement(updateQuery);
			
			ps.setString(1,tfq.getQuestion());
			ps.setBoolean(2,tfq.getIsTrue());
			ps.setString(3,tfq.toString());
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
			String deleteQuery="delete from tfq_questionpaper where QuestionId=?";
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