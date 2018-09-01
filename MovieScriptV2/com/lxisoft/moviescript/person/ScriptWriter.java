package com.lxisoft.moviescript.person;
import java.io.*;
import java.util.*;
public class ScriptWriter
{
	String name;
	Properties p=new Properties();
	public ScriptWriter() throws Exception
	{
		scriptwriterDataWriter();
	}
	public void scriptwriterDataWriter() throws Exception
	{
		System.out.println("Enter ScriptWriter Name");
		Scanner input=new Scanner(System.in);
		name=input.nextLine();
		p.setProperty("ScriptWriter",name);
		p.store(new FileOutputStream("com/lxisoft/moviescript/person/scriptwriter/"+name+".properties"),"inserted");
		
	}
	public void scriptwriterDataView() throws Exception
	{
		FileReader fr=new FileReader("com/lxisoft/moviescript/person/scriptwriter/"+name+".properties");
		p.load(fr);
		System.out.println(("\t\t  ScriptWriter : ")+p.getProperty("ScriptWriter"));
	}
}