package com.lxisoft.technicalQuiz.Quiz;
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
	
	public void quiz()
	{
		try
		{
			ResultSet result=stmt.executeQuery(query);
			while(result.next())
		{	int i=0;
			question=new Question();
			questions.add(question);
			questions.get(i).setQuestionNo(i);
			questions.get(i).setQuestion(result.getString("Question"));
			i=i+1;
			
		
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}
	
}