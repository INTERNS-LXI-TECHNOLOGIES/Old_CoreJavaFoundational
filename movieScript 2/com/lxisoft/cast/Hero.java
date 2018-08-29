package com.lxisoft.cast;
import java.util.*;
import java.io.*;
import com.lxisoft.person.*;

public class Hero extends Person
{
	private String heroName;
	Properties p=new Properties();
	public Hero()throws Exception
	{
		heroDetails();
	}
	public void heroDetails()throws Exception
	{
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Hero Name:");
		heroName=input.nextLine();
		p.setProperty("Hero",heroName);
		p.store(new FileOutputStream("com/lxisoft/cast/castdata/Hero/"+heroName+".properties"),"inserted");
		
	}
	public void heroDataView() throws Exception
	{
		//p=new Properties();
		FileReader reader=new FileReader("com/lxisoft/cast/castdata/Hero/"+heroName+".properties");
		p.load(reader);
		System.out.println(("Hero:")+p.getProperty("Hero"));
	}
	
}