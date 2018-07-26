package com.lxisoft.quiz.quest;
import com.lxisoft.quiz.clear.*;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;
public class QuestionController
{
	private int totalmark=0;
	private QuestionView questionview;
	private Questions q;
	public QuestionController()
	{
		
		loadQuestion();
		
	}
	public void loadQuestion()
	{
	File fileQ=new File("./file/question1.txt");
	int mark=0;
	
	String que,Option1,Option2,Option3,Option4,line1,mark1,mark2,mark3,mark4;
	try{
		//Scanner sc = new Scanner(System.in);
		FileReader fr1 = new FileReader(fileQ);
		BufferedReader br1 = new BufferedReader(fr1);
				while((line1=br1.readLine())!=null)
				{
				String s[] = line1.split(";");
			    que=s[0];Option1=s[1];Option2=s[2];Option3=s[3];Option4=s[4];mark1=s[5];mark2=s[6];mark3=s[7];mark4=s[8];
				q=new Questions(que,Option1,Option2,Option3,Option4,mark1,mark2,mark3,mark4);	
				printQuestion();
			
				}	
				questionview.score(q.getTotalmark());
				if(totalmark>=15)
					{
						questionview.winStatus();
					}
				else
					{
						questionview.failedStatus();
					}
	}
	catch(IOException e){
			System.out.println("Error");	
		}
}

public void printQuestion()
{
	questionview=new QuestionView();
	questionview.printQuestionData(q.getQuestion(),q.getOption1(),q.getOption2(),q.getOption3(),q.getOption4());
	answerCheck();
	
	
}
public void answerCheck()
{
	int mark1,mark2,mark3,mark4;
	mark1=Integer.parseInt(q.getMark1());
	mark2=Integer.parseInt(q.getMark2());
	mark3=Integer.parseInt(q.getMark3());
	mark4=Integer.parseInt(q.getMark4());
	Scanner input=new Scanner(System.in);
	int option=input.nextInt();
	switch(option)
	{
		case 1:{
			totalmark+=mark1;break;
		}
		case 2:{
			totalmark+=mark2;break;
		}
		case 3:{
			totalmark+=mark3;break;
		}
		case 4:{
			totalmark+=mark4;break;
		}
	}
	q.setTotalmark(totalmark);
}
public void cls()
	{
		Cls clrscr=new Cls();
		try
		{
			clrscr.cls();
		}
		catch (IOException e)
		{
			
		}
		catch (InterruptedException e)
		{
			
		}
	}

}