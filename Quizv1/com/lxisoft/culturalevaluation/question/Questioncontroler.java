package com.lxisoft.culturalevaluation.question;
import com.lxisoft.culturalevaluation.user.*;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
public class Questioncontroler
{
	private Questionmodel quemod;
	private Questionview queview;
	public Questioncontroler()
	{
		loadqueFile();
	}
	public void loadqueFile()
	{
		String file="D:/workspace/Team1/Quiz/question.txt";
		try
		{
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String line,question,answer,option1,option2,option3,option4;
			while((line=br.readLine())!=null)
			{
				String up[]=line.split(";");
				question=up[0];
				option1=up[1];
				option2=up[2];
				option3=up[3];
				option4=up[4];
				answer=up[5];
				quemod=new Questionmodel(question,option1,option2,option3,option4,answer);
				questionPrint();
				
				//chooseAnswer();
			}	
		}	
		catch(IOException e)
		{
			System.out.println("IOException");
		}
	}
	public void questionPrint()
	{
		queview=new Questionview();
		queview.printDataFile(quemod.getQuestion(),quemod.getOption1(),quemod.getOption2(),quemod.getOption3(),quemod.getOption4(),quemod.getAnswer());
	}
}