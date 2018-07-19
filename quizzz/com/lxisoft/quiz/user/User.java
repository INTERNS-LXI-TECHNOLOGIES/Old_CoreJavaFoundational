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
		try
		{
			File file=new File("./com/lxisoft/quiz/file/doc.txt");
			Scanner input=new Scanner(System.in);
			System.out.println(">>>>>>>>>>>>>>>>>>>>LOGIN <<<<<<<<<<<<<<<<<<<<<<<");
			System.out.println("\nUsername:");
			username=input.nextLine();
			System.out.println("\nPassword:");
			password=input.nextLine(); 
			System.out.println(" ");
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String st;
			//String username1="",password1="";
			//char ch;
			//int i=0;
			while((st=br.readLine())!=null)
			{
				
			/* //file reading using charAt; 
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
				}*/ //File reading using split;
				String s[]=st.split(";");
				if((username.equals(s[0]))&&(password.equals(s[1])))
				{
					System.out.println("login successfully");
					Question.questionOption();
				}
				
				/*else
				{
					System.out.println("Try again...Mismatch in Username or Password");
				}*/
				//username1="";password1="";			
			}
			
		}
		catch(IOException e)
		{
			System.out.println("IOException");
		}
		
	}
}
