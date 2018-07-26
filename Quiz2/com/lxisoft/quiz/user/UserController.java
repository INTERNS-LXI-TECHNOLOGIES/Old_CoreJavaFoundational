package com.lxisoft.quiz.user;
import com.lxisoft.quiz.clear.*;
import com.lxisoft.quiz.quest.*;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;
public class UserController
{
	private UserModel usermodel;
	private QuestionController questioncontroller;
	private UserView userview;
	public UserController()
	{
		userview=new UserView();
		usermodel=new UserModel();
		login();
	}	  
	public void login()
	{	
	try
	{
		int count=0;
		File file=new File("./file/credentials.txt");
		String username,password;
		Scanner input=new Scanner(System.in);
		userview.askUsername();
		username=input.nextLine();
		userview.askPassword();
		password=input.nextLine();
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		String st;
		while((st=br.readLine())!=null)
		{
			String s[]=st.split(";");
			if((username.equals(s[0]))&&(password.equals(s[1])))
			{
			count++;
			}
		}
			if (count>0)
			{
			userview.loginSucceed();
			
			cls();
			questioncontroller=new QuestionController();
			}
			else
			{
			userview.loginFailed();
			}
	}
	catch(IOException e)
		{
			System.out.println("IOException");
		}
	}
	public void cls()
	{
		Cls clrscr=new Cls();
		try
		{
			clrscr.cls();
		}
		catch (IOException e)
		{
			
		}
		catch (InterruptedException e)
		{
			
		}
	}
}