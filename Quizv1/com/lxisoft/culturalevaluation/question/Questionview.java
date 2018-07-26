package com.lxisoft.culturalevaluation.question;
public class Questionview
{
	public void printDataFile(String question1)
	{
		System.out.println("\n"+question1);
		System.out.println("A: Strongly Disagreee");
		System.out.println("B: Disagree");
		System.out.println("C: Agree");
		System.out.println("D: Strongly Agree");

	}
	public void addOption()
	{
		System.out.println("\nEnter your answer");
	}
	public void printMark(int mark)
	{
		System.out.println("\n\nTotal mark Scored:  "+mark);
	}
}