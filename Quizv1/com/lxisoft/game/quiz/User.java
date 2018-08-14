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
		Question q;
		String username,password;
		String file="D:/workspace/Team1/Quiz/doc.txt";
		Scanner input=new Scanner(System.in);
		System.out.println("<<<<<<<<<<<<<<<<<<LOGIN PAGE>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("\nEnter Username:");
		username=input.nextLine();
		System.out.println("\nEnter Password:");
		password=input.nextLine(); 
		try
		{
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String line;
			while((line=br.readLine())!=null)
			{
				String up[]=line.split(";");
				if((username.equals(up[0]))&&(password.equals(up[1])))
				{
					System.out.println("\nlogin successfull");
					q=new Question();
					q.questionOption();
					
				}
			}
			
				
			
		}
		catch(IOException e)
		{
			System.out.println("IOException");
		}
		
	}
}
