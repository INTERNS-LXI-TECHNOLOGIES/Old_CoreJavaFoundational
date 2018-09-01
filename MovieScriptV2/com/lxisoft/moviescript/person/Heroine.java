package com.lxisoft.moviescript.person;
import java.io.*;
import java.util.*;
public class Heroine
{
	String name;
	Properties p=new Properties();
	public Heroine() throws Exception
	{
		//setName("HeroineName");
		heroineDataWriter();
	}
	public void heroineDataWriter() throws Exception
	{
		System.out.println("Enter Heroine Name");
		Scanner input=new Scanner(System.in);
		name=input.nextLine();
		p.setProperty("Heroine",name);
		p.store(new FileOutputStream("com/lxisoft/moviescript/person/Heroine/"+name+".properties"),"inserted");
		
	}
	public void heroineDataView() throws Exception
	{
		FileReader fr=new FileReader("com/lxisoft/moviescript/person/Heroine/"+name+".properties");
		p.load(fr);
		System.out.println(("\t\t  Heroine    : ")+p.getProperty("Heroine"));
	}
}