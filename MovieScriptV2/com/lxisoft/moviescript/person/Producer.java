package com.lxisoft.moviescript.person;
import java.io.*;
import java.util.*;
public class Producer 
{
	String name;
	Properties p=new Properties();
	public Producer() throws Exception
	{
		//setName("HeroineName");
		producerDataWriter();
	}
	public void producerDataWriter() throws Exception
	{
		System.out.println("Enter Producer Name");
		Scanner input=new Scanner(System.in);
		name=input.nextLine();
		p.setProperty("Producer",name);
		p.store(new FileOutputStream("com/lxisoft/moviescript/person/producer/"+name+".properties"),"inserted");
		
	}
	public void producerDataView() throws Exception
	{
		FileReader fr=new FileReader("com/lxisoft/moviescript/person/producer/"+name+".properties");
		p.load(fr);
		System.out.println(("\t\t  Producer   : ")+p.getProperty("Producer"));
	}
}