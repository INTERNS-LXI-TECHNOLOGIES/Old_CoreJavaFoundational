package com.lxisoft.moviescript.person;
import java.io.*;
import java.util.*;
public class Hero
{
	String name;
	Properties p=new Properties();
	public Hero() throws Exception
	{
		heroDataWriter();
	}
	public void heroDataWriter() throws Exception
	{
		System.out.println("Enter Hero Name");
		Scanner input=new Scanner(System.in);
		name=input.nextLine();
		p.setProperty("Hero",name);
		p.store(new FileOutputStream("com/lxisoft/moviescript/person/hero/"+name+".properties"),"inserted");
		
	}
	public void heroDataView() throws Exception
	{
		FileReader fr=new FileReader("com/lxisoft/moviescript/person/hero/"+name+".properties");
		p.load(fr);
		System.out.println(("\t\t  Hero     : ")+p.getProperty("Hero"));
	}
}