package com.lxisoft.moviescript.person;
import java.io.*;
import java.util.*;
public class Cameraman
{
	String name;
	Properties p=new Properties();
	public Cameraman() throws Exception
	{
		//setName("HeroineName");
		cameramanDataWriter();
	}
	public void cameramanDataWriter() throws Exception
	{
		System.out.println("Enter Cameraman Name");
		Scanner input=new Scanner(System.in);
		name=input.nextLine();
		p.setProperty("Cameraman",name);
		p.store(new FileOutputStream("com/lxisoft/moviescript/person/cameraman/"+name+".properties"),"inserted");
		
	}
	public void cameramanDataView() throws Exception
	{
		FileReader fr=new FileReader("com/lxisoft/moviescript/person/cameraman/"+name+".properties");
		p.load(fr);
		System.out.println(("\t\t  Cameraman  : ")+p.getProperty("Cameraman"));
	}
}