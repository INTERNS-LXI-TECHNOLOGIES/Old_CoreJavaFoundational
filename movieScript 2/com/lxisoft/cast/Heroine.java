package com.lxisoft.cast;
import java.util.*;
import java.io.*;
import com.lxisoft.person.*;

public class Heroine
{
	private String heroineName,dialogue;
	Scanner input=new Scanner(System.in);
	Properties p=new Properties();
	Random r=new Random();
	int ran=r.nextInt(20);
	public Heroine()throws Exception
	{
		heroineDetails();
	}
	public void heroineDetails()throws Exception
	{
		
		System.out.println("Enter the Heroine Name:");
		heroineName=input.nextLine();
		p.setProperty("Heroine",heroineName);
		p.store(new FileOutputStream("com/lxisoft/cast/castdata/Heroine/"+heroineName+".properties",true),"Updated");	
	}
	public void heroineDataView() throws Exception
	{
		FileReader reader=new FileReader("com/lxisoft/cast/castdata/Heroine/"+heroineName+".properties");
		p.load(reader);
		System.out.println(("Heroine:")+p.getProperty("Heroine"));
	}
	public void addHeroineDialogue() throws Exception
	{
		System.out.println("Enter the Dialogue of Heroine:");
		dialogue=input.nextLine();
		p.setProperty("Dialogue"+ran+"",dialogue);
		p.store(new FileOutputStream("com/lxisoft/cast/castdata/Hero/"+heroineName+".properties",true),"");
	
	}
	public void viewHeroineDialogue() throws Exception
	{
		FileReader reader=new FileReader("com/lxisoft/cast/castdata/Hero/"+heroineName+".properties");
		p.load(reader);
		System.out.println(("Hero:")+p.getProperty("Dialogue"+ran+""));
	}
}