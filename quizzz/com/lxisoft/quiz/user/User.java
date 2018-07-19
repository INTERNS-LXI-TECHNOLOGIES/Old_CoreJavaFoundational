package com.lxisoft.quiz.user;
import com.lxisoft.quiz.quizGame.Quiz;
import com.lxisoft.quiz.quizGame.Question;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class User
{
	String username,password;

	public void login()
	{

		File file=new File("./com/lxisoft/quiz/file/doc.txt");
		Scanner input=new Scanner(System.in);
		System.out.println(">>>>>>>>>>>>>>>>>>>>LOGIN PAGE<<<<<<<<<<<<<<<<<<<<");
		System.out.println("\nUsername:");
		username=input.nextLine();
		System.out.println("\nPassword:");
		password=input.nextLine(); 
		try
		{
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String line;
			String username1="",password1="";
			char ch;
			int i=0;
			while((line=br.readLine())!=null)
			{
				
			    i=0;
				while((ch=line.charAt(i))!=';')
				{
					username1+=ch;
					i++;
				}
				i++;
				while((ch=line.charAt(i))!=';')
				{
					password1+=ch;
					i++;
				}
				 
				if((username.equals(username1))&&(password.equals(password1)))
				{
					System.out.println("login successfully");
					Question.questionOption();
				}
				username1="";password1="";
				
				
			}
			
				
			
		}
		catch(IOException e)
		{
			System.out.println("IOException");
		}
		
	}
}
