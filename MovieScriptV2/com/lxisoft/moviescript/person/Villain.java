package com.lxisoft.moviescript.person;
import java.io.*;
import java.util.*;
public class Villain
{
	String name;
	Properties p=new Properties();
	public Villain() throws Exception
	{
		//setName("HeroineName");
		villainDataWriter();
	}
	public void villainDataWriter() throws Exception
	{
		System.out.println("Enter Villain Name");
		Scanner input=new Scanner(System.in);
		name=input.nextLine();
		p.setProperty("Villain",name);
		p.store(new FileOutputStream("com/lxisoft/moviescript/person/villain/"+name+".properties"),"inserted");
		
	}
	public void villainDataView() throws Exception
	{
		FileReader fr=new FileReader("com/lxisoft/moviescript/person/villain/"+name+".properties");
		p.load(fr);
		System.out.println(("\t\t  Villain    : ")+p.getProperty("Villain"));
	}
}