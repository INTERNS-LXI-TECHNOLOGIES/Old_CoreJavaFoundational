package com.lxisoft.cast;
import java.util.*;
import java.io.*;
import com.lxisoft.person.*;

public class Hero extends Person
{
	private String heroName;
	public Hero()throws Exception
	{
		heroDetails();
	}
	public void heroDetails()throws Exception
	{
		Properties p=new Properties();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Hero Name:");
		heroName=input.nextLine();
		p.setProperty("Hero",heroName);
		p.store(new FileOutputStream("com/lxisoft/cast/castdata/"+heroName+".properties"),"inserted");
		
	}
}