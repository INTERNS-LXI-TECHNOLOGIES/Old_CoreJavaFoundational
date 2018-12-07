package com.lxisoft.quiz.questionpaper;
import java.io.*;
import java.util.*;
import com.lxisoft.quiz.questionpaper.Questions;
public class Questionpaper
{
	ArrayList<Questions> questions=new ArrayList<Questions>();
	int count;
	String temp;
	public void createQuestionPaper()
	{
	try
	{
		File quizFile=new File("D:\\lxi_projects\\java programs\\quiz_v1\\quizfile.csv");
		FileReader fr=new FileReader(quizFile);
		BufferedReader br=new BufferedReader(fr);
		String s=br.readLine();
		
			File answerFile=new File("answerFile.csv");
			answerFile.createNewFile();
			
			
			
			FileWriter fw=new FileWriter(answerFile);
			BufferedWriter bw=new BufferedWriter(fw);
			while(s!=null)
			{
				
				String stringarray[]=s.split(",");
				for(String temp:stringarray)
				System.out.println(temp);
				System.out.println("Enter your answer:\n");
				Scanner sc=new Scanner(System.in);
				String readAnswer=sc.nextLine();

					bw.write(readAnswer);
					
				s=br.readLine();
			}
			
			File answer=new File("D:\\lxi_projects\\java programs\\quiz_v1\\answer.csv");
			FileReader fr1=new FileReader(answer);
			BufferedReader br1=new BufferedReader(fr1);
			String s1=br1.readLine();
			
			while(s1!=null)
			{
				
				String stringarray1[]=s1.split(",");
				for(String temp1:stringarray1)
					if(temp1==temp)
						count=count+1;
					else
						s1=br1.readLine();
			}
			System.out.println("The no of questions answered is:\n"+count);
		bw.flush();
		bw.close();
		
		
	}
	catch(IOException e)
	{
		
	}
	}
	
}