package com.lxisoft.quizgame.test;
import com.lxisoft.quizgame.dao.DAO;
import com.lxisoft.quizgame.user.*;
public class Tdd
{
	public static void main(String[] args)
	{
		Login model;
		LoginView view;
		LoginController controller=new LoginController(model,view);
		controller.setName();
		controller.getName();
		controller.setPassword();
		controller.getPassword();
	}	
}