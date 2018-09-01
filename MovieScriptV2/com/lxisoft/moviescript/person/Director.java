package com.lxisoft.moviescript.person;
import java.io.*;
import java.util.*;
public class Director
{
	String name;
	Properties p=new Properties();
	public Director() throws Exception
	{
		//setName("HeroineName");
		directorDataWriter();
	}
	public void directorDataWriter() throws Exception
	{
		System.out.println("Enter Director Name");
		Scanner input=new Scanner(System.in);
		name=input.nextLine();
		p.setProperty("Director",name);
		p.store(new FileOutputStream("com/lxisoft/moviescript/person/director/"+name+".properties"),"inserted");
		
	}
	public void directorDataView() throws Exception
	{
		FileReader fr=new FileReader("com/lxisoft/moviescript/person/director/"+name+".properties");
		p.load(fr); 
		System.out.println(("\t\t  Director    : ")+p.getProperty("Director"));
	}
}