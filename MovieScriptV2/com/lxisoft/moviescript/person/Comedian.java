package com.lxisoft.moviescript.person;
import java.io.*;
import java.util.*;
public class Comedian
{
	String name;
	Properties p=new Properties();
	public Comedian() throws Exception
	{
		//setName("HeroineName");
		comedianDataWriter();
	}
	public void comedianDataWriter() throws Exception
	{
		System.out.println("Enter Comedian Name");
		Scanner input=new Scanner(System.in);
		name=input.nextLine();
		p.setProperty("Comedian",name);
		p.store(new FileOutputStream("com/lxisoft/moviescript/person/comedian/"+name+".properties"),"inserted");
		
	}
	public void comedianDataView() throws Exception
	{
		FileReader fr=new FileReader("com/lxisoft/moviescript/person/comedian/"+name+".properties");
		p.load(fr);
		System.out.println(("\t\t  Comedian    : ")+p.getProperty("Comedian"));
	}
}