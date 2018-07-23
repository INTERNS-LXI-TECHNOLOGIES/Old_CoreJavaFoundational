package com.lxisoft.quizz.quest;
import com.lxisoft.quizz.quest.*;
import java.util.*;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;
import java.io.IOException;
public class QuizController
{
	private QuizModel quizmodel;
	private QuizView quizview;
	public QuizController()
	{
		quizview=new QuizView();
		login();
	}
	public void login()
	{	
	try
	{
		int count=0;
		File file=new File("./com/lxisoft/quizz/file/credentials.txt");
		String username,password;
		Scanner input=new Scanner(System.in);
		quizview.askUsername();
		username=input.nextLine();
		quizview.askPassword();
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
			quizview.loginSucceed();
			
		}
		else
		{
			quizview.loginFailed();
		}
	}
	catch(IOException e)
		{
			System.out.println("IOException");
		}	
	}
	public void loadQuestion()
	{
		
	}
}