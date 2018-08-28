package com.lxisoft.cast;
import java.util.*;
import java.io.*;
import com.lxisoft.person.*;

public class Villain
{
	private String villainName;
	public Villain()throws Exception
	{
		villainDetails();
	}
	public void villainDetails()throws Exception
	{
		Properties p=new Properties();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Villain Name:");
		villainName=input.nextLine();
		p.setProperty("Villain",villainName);
		p.store(new FileOutputStream("com/lxisoft/cast/castdata/"+villainName+".properties"),"inserted");
		
	}
}