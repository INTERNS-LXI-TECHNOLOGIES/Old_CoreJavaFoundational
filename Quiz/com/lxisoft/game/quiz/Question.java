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
		
		String question="",option="",answer="",answer1="";
		System.out.println("GAME STARTING\n");
		String file="D:/workspace/Team1/Quiz/question.txt";
		int mark=0;
			
			try
			{
				FileReader fr=new FileReader(file);
				BufferedReader br=new BufferedReader(fr);
				String line;
				char qu;
				int i=0;
				int ln=1;
				while((line=br.readLine())!=null)
				{
					
					System.out.print(ln+":");
					i=0;
					while((qu=line.charAt(i))!=';')
					{
						question+=qu;
						i++;
						
					}
					System.out.println(question);
					System.out.println();
					i++;
					while((qu=line.charAt(i))!=';')
					{
						option+=qu;
						i++;
						
					}
					i++;
					System.out.println(option);
					System.out.println();
					System.out.println("Enter your option");
					Scanner input=new Scanner(System.in);
					answer=input.nextLine();
					while((qu=line.charAt(i))!=';')
					{
						answer1+=qu;
						i++;
						
					}
					if(answer.equals(answer1))
					{
						mark++;
					}
					question="";option="";answer1="";answer="";
					ln++;
					
				
				}
			System.out.println("Your Score is: "+mark+" Out of 5");
			}
	
			catch(IOException e)
			{
				System.out.println("IOException");
			}
		
	}
}