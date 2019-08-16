package com.lxisoft.intern.quiz;
import java.io.*;
import java.util.*;
public class Quiz
{
	ArrayList <Question> questionslist = new ArrayList<Question>();
	static BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
    static Scanner in = new Scanner(System.in);
	public void createQuestion()
	{
		
		System.out.println("Enter the number of the questions:");
		int a=in.nextInt();
		for (int i=0;i<a;i++)
		 {
			Question q = new Question();
			q.readQuestion();
			q.createOption();
			q.createAnswer();
            questionslist.add(q);
		
		}
	}
	  public void displayQuiz()
  {
  	String c=null;
  	 for (int i=0;i<questionslist.size();i++)
  	  {
  	  System.out.println("Question:");	
	  System.out.println(questionslist.get(i).question);
	  System.out.println("  ----------options-----------");
      System.out.println("\ta:"+questionslist.get(i).options[0]+"\t\tb:"+questionslist.get(i).options[1]);
      System.out.println("\tc:"+questionslist.get(i).options[2]+"\t\td:"+questionslist.get(i).options[3]);
      System.out.println("Choose any option:");
      try{c = input.readLine();}catch(IOException e){}
      String b = questionslist.get(i).answer;
      if (c.equals(b))
      {
      	System.out.println("TRUE");
      }else{
      	System.out.println("FALSE");
           }


         }
	
  }
}	