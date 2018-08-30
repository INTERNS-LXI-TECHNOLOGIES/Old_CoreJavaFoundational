package com.lxisoft.cast;
import java.util.*;
import java.io.*;
import com.lxisoft.person.*;

public class Villain
{
	private String villainName,dialogue;
	Scanner input=new Scanner(System.in);
	Properties p=new Properties();
	Random r=new Random();
	int ran=r.nextInt(20);
	public Villain()throws Exception
	{
		villainDetails();
	}
	public void villainDetails()throws Exception
	{
	
		
		System.out.println("Enter the Villain Name:");
		villainName=input.nextLine();
		p.setProperty("Villain",villainName);
		p.store(new FileOutputStream("com/lxisoft/cast/castdata/Villain/"+villainName+".properties"),"inserted");
		
	}
	public void villainDataView() throws Exception
	{
	
		FileReader reader=new FileReader("com/lxisoft/cast/castdata/Villain/"+villainName+".properties");
		p.load(reader);
		System.out.println(("Villain:")+p.getProperty("Villain"));
	}
	public void addVillainDialogue() throws Exception
	{
		System.out.println("Enter the Dialogue of Villain:");
		dialogue=input.nextLine();
		p.setProperty("Dialogue"+ran+"",dialogue);
		p.store(new FileOutputStream("com/lxisoft/cast/castdata/Villain/"+villainName+".properties"),"inserted");
	
	}
	public void viewVillainDialogue() throws Exception
	{
		FileReader reader=new FileReader("com/lxisoft/cast/castdata/Villain/"+villainName+".properties");
		p.load(reader);
		System.out.println(("Villain:")+p.getProperty("Dialogue"+ran+""));
	}
}