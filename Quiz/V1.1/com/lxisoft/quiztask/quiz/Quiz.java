package com.lxisoft.quiztask.quiz;

import java.util.ArrayList;
import java.io.File;
import com.lxisoft.quiztask.user.User;
import com.lxisoft.quiztask.question.Question;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
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
		printMenu();
		int score=askQuestions();
		printReport(score);
	}
	public void printMenu()
	{
		boolean stop=false;
		do
		{
			Cls.clear();
			System.out.println("1.Register\n2.Login");
			System.out.print("\nEnter the choice : ");
			Scanner in= new Scanner(System.in);
			int choice=in.nextInt();
			switch(choice)
			{
				case 1:stop=registerOption();break;
				case 2:stop=loginOption();break;
				default:System.out.println("Wrong option.");break;
			}
			waitForKey();
		}while(!stop);
	}
	public boolean loginOption()
	{
		System.out.print("Enter User name : ");
		Scanner in=new Scanner(System.in);
		String userName= in.nextLine();
		System.out.print("Enter password : ");
		String password=in.nextLine();
		return validateUser(userName,password);
	}
	public boolean registerOption()
	{
		System.out.println("Registering a new user");
		System.out.print("Enter User name : ");
		Scanner in=new Scanner(System.in);
		String userName= in.nextLine();
		if(existingUser(userName))
		{
			System.out.println("User already exists");
			return false;
		}
		System.out.print("Enter password : ");
		String password=in.nextLine();
		User u=new User(userName,password);
		userList.add(u);
		writeToUserFile(userName,password);
		System.out.println("Registration successful");
		return true;
	}		
	public boolean existingUser(String userName)
	{
		for(User u:userList)
		{
			if(u.getUserName().equals(userName))
				return true;
		}
		return false;
	}
	public void writeToUserFile(String userName,String password) 
	{
		try
		{
			BufferedWriter bw=new BufferedWriter(new FileWriter(userFile,true));
			bw.newLine();
			bw.write(userName);
			bw.write(';');
			bw.write(password);
			bw.close();
		}
		catch(IOException e)
		{
			System.out.println("Error while writing to file");
		}
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
		System.out.println("Invalid username.");
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