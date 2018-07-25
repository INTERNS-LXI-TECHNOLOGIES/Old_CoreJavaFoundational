package com.lxisoft.culturalevaluation.question;
import java.util.Scanner;

public class QuestionView
{
	public void printError(String errorMsg)
	{
		System.out.println("Error : "+errorMsg);
	}
	public char ask(QuestionModel question)
	{
		System.out.println(question);
		System.out.print("Your choice : ");
		return(new Scanner(System.in).next().charAt(0));
	}
}