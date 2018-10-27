package com.lxisoft.technicalQuiz.Quiz;
import com.lxisoft.technicalQuiz.DAO;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

public class QuestionController
{
	Question question=new Question();
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
		{
				question.setQuestion(result.getString("userName"));
			
		
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}
	
}