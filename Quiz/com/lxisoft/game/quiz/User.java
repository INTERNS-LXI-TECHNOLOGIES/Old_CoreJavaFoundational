package com.lxisoft.game.quiz;
import com.lxisoft.game.quiz.*;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.*;
import java.util.*;
public class User
{

	public void login()
	{
		String username,password;
		String file="D:/workspace/Team1/Quiz/doc.txt";
		Scanner input=new Scanner(System.in);
		System.out.println("LOGIN PAGE");
		System.out.println("\nEnter Username:");
		username=input.nextLine();
		System.out.println("\nEnter Password:");
		password=input.nextLine(); 
		try
		{
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String line;
			String username1="",password1="";
			char up;
			int i=0;
			while((line=br.readLine())!=null)
			{
				
			    i=0;
				while((up=line.charAt(i))!=';')
				{
					username1+=up;
					i++;
				}
				i++;
				while((up=line.charAt(i))!=';')
				{
					password1+=up;
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
