package com.lxisoft.quiz.quizGame;
import com.lxisoft.quiz.user.User;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Question
{
	public static void questionOption()
	{
		
		String question="",option="",answer="",answer1="";
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<GAME STARTING>>>>>>>>>>>>>>>>>>>>>>>>\n");
		File file=new File("./com/lxisoft/quiz/file/quest.txt");
		int mark=0;
			
			try
			{
				FileReader fr=new FileReader(file);
				BufferedReader br=new BufferedReader(fr);
				String line;
				char que;
				int i=0;
				int num=1;
				while((line=br.readLine())!=null)
				{
					
					System.out.print(num+":");
					i=0;
					while((que=line.charAt(i))!=';')
					{
						question+=que;
						i++;
						
					}
					System.out.println(question);
					System.out.println();
					i++;
					while((que=line.charAt(i))!=';')
					{
						option+=que;
						i++;
						
					}
					i++;
					System.out.println(option);
					System.out.println();
					System.out.println("Enter your option");
					Scanner input=new Scanner(System.in);
					answer=input.nextLine();
					while((que=line.charAt(i))!=';')
					{
						answer1+=que;
						i++;
						
					}
					if(answer.equals(answer1))
					{
						mark++;
					}
					question="";option="";answer1="";answer="";
					num++;
					
				
				}
			System.out.println(" Score : "+mark+" Out of 5");
			if(mark>2)
			{
				System.out.println("Congrats................\n Your Score is: "+mark+"You pass the Quiz.....");
			}
			}
	
			catch(IOException e)
			{
				System.out.println("IOException");
			}
		
	}
}