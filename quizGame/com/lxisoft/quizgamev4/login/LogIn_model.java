package com.lxisoft.quizgamev2.login;
import java.util.*;
public class LogIn_model
{	
	private String user,pass,logger;
	private int main_choice;
	
		//////////////////////////////////////choice///////////////////////////
	public void setChoice(int main_choice)
	{
		this.main_choice=main_choice;
	}
	public int getChoice()
	{
		return main_choice;
	}
	//////////////////////////////////////user///////////////////////////
	public void setUser(String user)
	{
		this.user=user;
	}
	public String getUser()
	{
		return user;
	}
	/////////////////////////////////////password////////////////////////
	public void setPass(String pass)
	{
		this.pass=pass;
	}
	public String getPass()
	{
		return pass;
	}
	//////////////////////////////////////logger///////////////////////////
	public void setLogger(String logger)
	{
		this.logger=logger;
	}
	public String getLogger()
	{
		return logger;
	}
}