package com.lxisoft.technicalQuiz.test;
import com.lxisoft.technicalQuiz.DAO;
import com.lxisoft.technicalQuiz.quiz.UserController;
import java.sql.ResultSet;
public class Tdd
{	
	public static void main(String args[])
	{
	 UserController userController=new UserController();
	
	 userController.passwordAuthentication(userController.getAllUserDetails());
	}
}