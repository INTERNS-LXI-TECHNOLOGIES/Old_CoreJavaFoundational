package com.lxisoft.quiztask.quiz;

import java.util.ArrayList;
import java.io.File;
import com.lxisoft.quiztask.user.User;
import com.lxisoft.quiztask.question.Question;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import com.lxisoft.quiztask.clearscreen.Cls;

public class Quiz
{
	private File userFile;
	private File questionFile;
	private ArrayList<User> userList;
	private Question[] question;
	public Quiz()
	{
		userFile=new File("./com/lxisoft/quiztask/database/userFile.txt");
		questionFile= new File("./com/lxisoft/quiztask/database/questionFile.txt");
		userList=loadUserFile();
		question=loadQuestions();	
		boolean loggedIn=false;
		do
		{
			Cls.clear();
			loggedIn=initLogin();
			waitForKey();
		}while(!loggedIn);
		int score=askQuestions();
		printReport(score);
	}
	public ArrayList<User> loadUserFile()
	{
		ArrayList<User> users=new ArrayList<User>();
		try
		{
			BufferedReader br=new BufferedReader(new FileReader(userFile));
			String line;
			while((line = br.readLine())!=null)
			{
				String[] str = line.split(";");
				String userName=str[0];
				String password=str[1];
				User u=new User(userName,password);
				users.add(u);
			}
		}
		catch(IOException e)
		{
			System.out.println("Error reading file");
		}
		return users;
	}
	public boolean initLogin()
	{
		System.out.print("Enter User name : ");
		Scanner in=new Scanner(System.in);
		String userName= in.nextLine();
		System.out.print("Enter password : ");
		String password=in.nextLine();
		return validateUser(userName,password);
	}
	public boolean validateUser(String userName,String password)
	{
		for(User u:userList)
		{
			if(u.getUserName().equals(userName))
			{
				if(u.login(password))
				{
					System.out.println("Login success");
					return true;
				}
				else
				{
					System.out.println("Login failed : Wrong password");
					return false;
				}
			}
		}
		System.out.println("Invalid username");
		return false;
	}
	public Question[] loadQuestions()
	{
		Question[] quest=new Question[10];
		int i=0;
		try
		{
			BufferedReader br=new BufferedReader(new FileReader(questionFile));
			String line;
			while((line = br.readLine())!=null)
			{
				String[] str = line.split(";");
				Question qst=new Question(str);
				quest[i++]=qst;
			}
		}
		catch(IOException e)
		{
			System.out.println("Error reading file");
		}
		return quest;
	}
	public int askQuestions()
	{
		int score=0;
		for(Question q:question)
		{
			Cls.clear();
			System.out.println(q);
			System.out.print("\nEnter the option number : ");
			Scanner in = new Scanner(System.in);
			int answer=in.nextInt();
			if(q.isCorrect(answer))
			{
				score++;
			}
		}
		return score;
	}
	public void printReport(int score)
	{
		Cls.clear();
		System.out.println("Your score is "+score+" out of "+question.length);
		if(score>6)
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
	}
	public static void waitForKey()
	{
		System.out.print("Press ENTER to continue");
		try
		{
			char ch=(char)System.in.read();
		}
		catch(IOException e)
		{}
	}
}