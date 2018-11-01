package com.lxisoft.technicalQuiz.quiz;
import com.lxisoft.technicalQuiz.DAO;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import com.lxisoft.technicalQuiz.quiz.QuestionController;
import java.sql.*;
import java.util.*;
import com.lxisoft.technicalQuiz.quiz.User; 
public class UserController
{
		User user;
	public ResultSet getAllUserDetails()
	{	
		
		Connection con=DAO.getConnection();
		Statement  stmt=DAO.getStatement(con);
		Connection con1=DAO.getConnection();
		String query=" select * from userdata ";
		
		
		try
		{
	
		PreparedStatement ps = con.prepareStatement("INSERT INTO userData VALUES ( ?, ?, ?)");
		ps.setString(1, "4");
        ps.setString(2,"manoj3");
        ps.setString(3,"1893");
       // int i = ps.executeUpdate();
	    PreparedStatement ps1 = con1.prepareStatement("select userPassword from userData where userName= ?");
		ps1.setString(1,"manoj2");
		ResultSet rs= ps1.executeQuery();
		rs.next();
		String pass=rs.getString("userPassword");
		//System.out.println(pass);
		
		return DAO.getResult(stmt,query);
		}
		
		catch(Exception se)
		{
			se.printStackTrace();
			return null;
		}
		//return null;
	}
	public void passwordAuthentication(ResultSet result)
	{
		user=new User();
		QuestionController questionController=new QuestionController();
		Scanner scan =new Scanner(System.in);
		System.out.println("enter user name");
		String userName=scan.next();
		user.setUserName(userName);
		try
		{
			while(result.next())
			{
				
				String id=result.getString("userId");
				String correctOption,enteredOption,name=result.getString("userName");
				String password=result.getString("userPassword");
		
				if(name.equals(user.getUserName()))
				{	
				System.out.println("enter the password");
				String userPassword=scan.next();
				user.setUserPassword(password);
					
				if(userPassword.equals(user.getUserPassword()))
					{
						System.out.println("Successfully logged in");
						boolean flag=true;
						System.out.println("Totally there are "+questionController.noOfQuestion()+ " no of Questions");
					
						for(int i=0;i<questionController.noOfQuestion();i++)
						{ 
							if(flag==true)
							{
							System.out.println("\t"+questionController.questions.get(i).getQuestion());
						
							System.out.print("\t\t\t1.\t"+questionController.questions.get(i).getOption1());
							System.out.print("\t\t2.\t"+questionController.questions.get(i).getOption2());
							System.out.print("\t\t3.\t"+questionController.questions.get(i).getOption3());
							System.out.println("\t\t4.\t"+questionController.questions.get(i).getOption4());
							correctOption=questionController.questions.get(i).getCorrectOption();
							System.out.println("Type the correct option");
							enteredOption=scan.next();
								if(enteredOption.equals(correctOption))
								{flag=true;
							System.out.println("Answer is correct");
								}
								else
								{flag=false;
							System.out.println("sorry wrong answer");
								}
							}
						}
					}
					else
					{
					System.out.println("Authentication failed");
					}

				}
				
			}
			
		
		}
		catch(SQLException se)
		{
			se.printStackTrace();	
		}
	}
	
}
