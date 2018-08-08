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
		
		String answer;
		System.out.println("\nGAME STARTING\n");
		String file="D:/workspace/Team1/Quiz/question.txt";
		int mark=0;
			
			try
			{
				FileReader fr=new FileReader(file);
				BufferedReader br=new BufferedReader(fr);
				String line;
				int Qno=1;
				while((line=br.readLine())!=null)
				{
					String up[]=line.split(";");
					System.out.print(Qno+" : ");
					System.out.println(up[0]);
					for(int i=1;i<5;i++)
					{
					System.out.println();	
					System.out.println(up[i]);
					}
					System.out.println("\nEnter your option");
					Scanner input=new Scanner(System.in);
					answer=input.nextLine();
					if(answer.equals(up[5]))
					{
						mark++;
					}
					Qno++;
				
				}
			System.out.println("\nYour Score is: "+mark+" Out of 5");
			}
	
			catch(IOException e)
			{
				System.out.println("IOException");
			}
		
	}
}