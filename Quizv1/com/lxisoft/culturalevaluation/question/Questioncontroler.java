package com.lxisoft.culturalevaluation.question;
import com.lxisoft.culturalevaluation.user.*;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;
public class Questioncontroler
{
	private Questionmodel quemod;
	private Questionview queview;
	int totalmark=0;
	public Questioncontroler()
	{
		loadqueFile();
	}
	public void loadqueFile()
	{
		String file="./com/lxisoft/culturalevaluation/database/question.txt";
		try
		{
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String line,question,option1,option2,option3,option4;
			while((line=br.readLine())!=null)
			{
				String up[]=line.split(";");
				question=up[0];
				option1=up[1];
				option2=up[2];
				option3=up[3];
				option4=up[4];
				quemod=new Questionmodel(question,option1,option2,option3,option4);
				questionPrint();
			}	
			queview.printMark(quemod.getMark());
			
		}	
		catch(IOException e)
		{
			System.out.println("IOException");
		}
	}
	public void calculateMark()
	{
		int mark1,mark2,mark3,mark4;
		mark1=Integer.parseInt(quemod.getOption1());
		mark2=Integer.parseInt(quemod.getOption2());
		mark3=Integer.parseInt(quemod.getOption3());
		mark4=Integer.parseInt(quemod.getOption4());
		queview.addOption();
		Scanner input=new Scanner(System.in);
		String option=input.nextLine();
		switch(option)
		{
			case "A":
			{
				totalmark+=mark1;
				break;
			}
			case "B":
			{
				totalmark+=mark2;
				break;
			}
			case "C":
			{
				totalmark+=mark3;
				break;
			}
			case "D":
			{
				totalmark+=mark4;
				break;
			}
		}
		quemod.setMark(totalmark);
	}
	
	public void questionPrint()
	{
		queview=new Questionview();
		queview.printDataFile(quemod.getQuestion());
		calculateMark();
	}
	
}