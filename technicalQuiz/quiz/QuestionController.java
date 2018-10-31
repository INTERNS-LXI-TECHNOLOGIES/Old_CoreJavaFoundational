package com.lxisoft.technicalQuiz.quiz;
import com.lxisoft.technicalQuiz.quiz.Question;
import com.lxisoft.technicalQuiz.DAO;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.util.*;

public class QuestionController
{		
	public ArrayList<Question> questions=new ArrayList<Question>();
	Question question;
	Connection con=DAO.getConnection();
	Statement  stmt=DAO.getStatement(con);
	ResultSet result;
	String query="select * from Questions";
	
	public int noOfQuestion()
	{
		int i=0;
		try
		{
			ResultSet result=stmt.executeQuery(query);
			while(result.next())
		{	
			question=new Question();
			questions.add(question);
			questions.get(i).setQuestionNo(i);
			questions.get(i).setQuestion(result.getString("Question"));
			
				questions.get(i).setOption1(result.getString("option1"));
				questions.get(i).setOption2(result.getString("option2"));
				questions.get(i).setOption3(result.getString("option3"));
				questions.get(i).setOption4(result.getString("option4"));
				questions.get(i).setCorrectOption(result.getString("correctOption"));
			
			i=i+1;
			
		
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return i;
	}
	
}