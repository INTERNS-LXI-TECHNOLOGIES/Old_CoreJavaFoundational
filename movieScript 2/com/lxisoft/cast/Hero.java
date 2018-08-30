package com.lxisoft.cast;
import java.util.*;
import java.io.*;
import com.lxisoft.person.*;

public class Hero extends Person
{
	private String heroName,dialogue;
	Properties p=new Properties();
	Scanner input=new Scanner(System.in);
	Random r=new Random();
	int ran=r.nextInt(20);
	public Hero()throws Exception
	{
		heroDetails();
	}
	public void heroDetails()throws Exception
	{
		System.out.println("Enter the Hero Name:");
		heroName=input.nextLine();
		p.setProperty("Hero",heroName);
		p.store(new FileOutputStream("com/lxisoft/cast/castdata/Hero/"+heroName+".properties"),"inserted");
		
	}
	public void heroDataView() throws Exception
	{
		FileReader reader=new FileReader("com/lxisoft/cast/castdata/Hero/"+heroName+".properties");
		p.load(reader);
		System.out.println(("Hero:")+p.getProperty("Hero"));
	}
	public void addHeroDialogue() throws Exception
	{
		System.out.println("Enter the Dialogue of Hero:");
		dialogue=input.nextLine();
		p.setProperty("Dialogue"+ran+"",dialogue);
		p.store(new FileOutputStream("com/lxisoft/cast/castdata/Hero/"+heroName+".properties"),"inserted");
	
	}
	public void viewHeroDialogue() throws Exception
	{
		FileReader reader=new FileReader("com/lxisoft/cast/castdata/Hero/"+heroName+".properties");
		p.load(reader);
		System.out.println(("Hero:")+p.getProperty("Dialogue"+ran+""));
	}
}