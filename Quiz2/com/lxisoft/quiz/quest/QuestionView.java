package com.lxisoft.quiz.quest;
public class QuestionView
{
	
	public void printQuestionData(String que,String Option1,String Option2,String Option3,String Option4)
	{
		System.out.println("\n\n"+que);
		System.out.println("\n\n");
		System.out.println("1: "+Option1);
		System.out.println("2: "+Option2);
		System.out.println("3: "+Option3);
		System.out.println("4: "+Option4);
		System.out.println("Enter your correct option:\n\n");
	}
public void score(int totalmark)
{
	System.out.println("YOUR SCORE IS         "+totalmark+" out of 200");
	System.out.println("****************************************");	
	System.out.println("\n"+"\n"+"\n");
	
}
public void winStatus()
{
	System.out.println("YOU HAVE SUCCESSFULLY CLEARED THE TEST");
	System.out.println("\n"+"\n"+"\n");
	System.out.println("****************************************");
}
public void failedStatus()
{
	System.out.println("YOU HAVE FAILED......BETTER LUCK NEXT TIME");
	System.out.println("\n");
	System.out.println("****************************************");
}
}