package com.lxisoft.game.quiz;
import com.lxisoft.game.quiz.*;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.*;
import java.util.*;

public class Question
{
	 
	public static void questionOption()
	{
		
		String question="",option="",answer="";
		System.out.println("GAME STARTING");
		String file="D:/workspace/Team1/Quiz/question.txt";
		for(int ln=1;ln<=10;ln++)
		{
			System.out.println(ln+":");
			try
			{
				FileReader fr=new FileReader(file);
				BufferedReader br=new BufferedReader(fr);
				String line;
				char qu;
				int i=0;
				while((line=br.readLine())!=null)
				{
					i=0;
					while((qu=line.charAt(i))!=';')
					{
						question+=qu;
						i++;
						
					}
					System.out.println(question);
					
					i++;
					while((qu=line.charAt(i))!=';')
					{
						option+=qu;
						i++;
						
					}
					System.out.println(option);
					
					System.out.println("Enter your option");
					Scanner input=new Scanner(System.in);
					answer=input.nextLine();
					
					
				
				}
			}
			catch(IOException e)
			{
				System.out.println("IOException");
			}
		}
	}
}