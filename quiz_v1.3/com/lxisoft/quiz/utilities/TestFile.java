package com.lxisoft.quiz.utilities;
import com.lxisoft.quiz.utilities.Utility;
import java.io.*;
import java.util.*;
public class TestFile
{
	static String n;
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
	Utility u=new Utility();
	u.createFile("file1.txt");
	
	u.writeToFile("file1.txt","hello");
	for(int i=0;i<5;i++)
	{
		n=sc.nextLine();
	u.writeToFile("file1.txt",n);
	}
	String h=u.readFromFile("file1.txt");
	System.out.println(h);
	

	}
	
}