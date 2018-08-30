package com.lxisoft.cast;
import java.util.*;
import java.io.*;
import com.lxisoft.person.*;

public class Comedian
{
	private String comedianName,dialogue;
	Scanner input=new Scanner(System.in);
	Properties p=new Properties();
	Random r=new Random();
	int ran=r.nextInt(20);
	public Comedian()throws Exception
	{
		comedianDetails();
	}
	public void comedianDetails()throws Exception
	{
		
		System.out.println("Enter the Comedian Name:");
		comedianName=input.nextLine();
		p.setProperty("Comedian",comedianName);
		p.store(new FileOutputStream("com/lxisoft/cast/castdata/Comedian/"+comedianName+".properties"),"inserted");
		
	}
	public void comedianDataView() throws Exception
	{

		FileReader reader=new FileReader("com/lxisoft/cast/castdata/Comedian/"+comedianName+".properties");
		p.load(reader);
		System.out.println(("Comedian:")+p.getProperty("Comedian"));
	}
	public void addComedianDialogue() throws Exception
	{
		System.out.println("Enter the Dialogue of Comedian:");
		dialogue=input.nextLine();
		p.setProperty("Dialogue"+ran+"",dialogue);
		p.store(new FileOutputStream("com/lxisoft/cast/castdata/Comedian/"+comedianName+".properties"),"inserted");
	
	}
	public void viewComedianDialogue() throws Exception
	{
		FileReader reader=new FileReader("com/lxisoft/cast/castdata/Comedian/"+comedianName+".properties");
		p.load(reader);
		System.out.println(("Comedian:")+p.getProperty("Dialogue"+ran+""));
	}
}