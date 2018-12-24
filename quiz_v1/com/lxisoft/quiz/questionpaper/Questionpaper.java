package com.lxisoft.quiz.questionpaper;
import java.io.*;
import java.util.*;
import com.lxisoft.quiz.questionpaper.Questions;
public class Questionpaper
{
	ArrayList<Questions> questions=new ArrayList<Questions>();
	int count,Mark=0;
	
	String temp;
	public void createQuestionPaper()
	{
	try
	{
		File quizFile=new File("D:\\lxi_projects\\java programs\\quiz_v1\\quizfile.csv");
		FileReader fr=new FileReader(quizFile);
		BufferedReader br=new BufferedReader(fr);
		String s=br.readLine();
			while(s!=null)
			{
				
				String stringarray[]=s.split(",");
				for(int i=0;i<5;i++)
				
				System.out.println(stringarray[i]);
				System.out.println("Enter your answer:\n");
				Scanner sc=new Scanner(System.in);
				String readAnswer=sc.nextLine();
				if(readAnswer.equals(stringarray[5]))
				{
					count++;
					Mark=Mark+2;
				}
					
				s=br.readLine();
			}
			System.out.println();
			System.out.println("You are sucessfully completed.........");
			if(Mark>0)
				System.out.println("Status : Pass");
			else
				System.out.println("Status : Failed");
			System.out.println("The no of questions answered is:\n"+count);
			System.out.println("Mark Scored :"+Mark);
			if(Mark>=9)
				System.out.println("Grade A");
			else if(Mark<9 && Mark>=7)
				System.out.println("Grade B");
			else if(Mark<7 && Mark>=5)
				System.out.println("Grade C");
			else if(Mark<5)
			{
				System.out.println("Failed");
			}
				
				
	
		
		
		
	}
	catch(IOException e)
	{
		
	}
	}
	
}