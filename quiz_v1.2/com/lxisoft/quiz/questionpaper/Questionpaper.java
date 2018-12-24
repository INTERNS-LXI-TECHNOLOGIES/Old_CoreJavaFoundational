package com.lxisoft.quiz.questionpaper;
import com.lxisoft.quiz.questionpaper.question.Question;
import java.io.*;
import java.util.*;
public class Questionpaper
{
	ArrayList<Question> questions=new ArrayList<Question>();
	
	
	public void createQuestionpaper()
	{
		
			
			
			for(int i=0;i<10;i++)
			{
				questions.add(new Question());
				questions.get(i).createQuestions();
			}
			
			
		
	}
}