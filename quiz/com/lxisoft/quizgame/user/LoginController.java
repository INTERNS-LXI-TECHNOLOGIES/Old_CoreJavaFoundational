package com.lxisoft.quizgame.user;
import com.lxisoft.quizgame.dao.DAO;
import com.lxisoft.quizgame.user.Login;
import com.lxisoft.quizgame.user.LoginView;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
public class LoginController
{
	private Login model;
	private LoginView view;

	public LoginController(Login model,LoginView view)
	{
		this.model=model;
		this.view=view;
	}

	public void setName()
	{
		model.setUsername(view.enterUsername());
	}

	public void getName()
	{
		System.out.println(model.getUsername());
	}

	public void setPassword()
	{
		model.setUserPassword(view.enterPassword());
	}

	public void getPassword()
	{
		System.out.println(model.getUserPassword());
	}

}
