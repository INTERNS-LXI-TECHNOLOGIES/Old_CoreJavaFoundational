package com.lxisoft.intern.quiz;
import java.util.*;
import java.io.*;
public class Question
{
      String question;
     String [] options = new String[4];
     String answer;
	 static BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
	 static Scanner in = new Scanner(System.in);
  
  public void readQuestion()
    { 
    	try{ 
	 	System.out.println("Enter the question:");
	 	this.question = input.readLine();
	 	}
	 	catch(IOException e)
	 	{}
    }
  public void createOption()
    {
	       try{
     	      System.out.println("option 1:");
     	      this.options[0] = input.readLine();
     	      System.out.println("option 2:");
     	      this.options[1] = input.readLine();
     	      System.out.println("option 3:");
     	      this.options[2] = input.readLine();
     	      System.out.println("option4:");
     	      this.options[3]= input.readLine();
     	      }catch(IOException e){}
    	 
    }
  public void createAnswer()
    {  try{
    	System.out.println("answer:");
    	answer = input.readLine();
    	//setAnswer(answer);
        }catch(IOException e){}
    }

}