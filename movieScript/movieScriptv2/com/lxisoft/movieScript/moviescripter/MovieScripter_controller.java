package com.lxisoft.movieScript.moviescripter;
import java.io.*;
import java.util.*;
public class MovieScripter_controller
{
	Random random;
	Properties p1,p2;
	public void scriptWriter(String key,String value)throws Exception
	{
		p1=new Properties();
		p1.setProperty(key,value);
		p1.store(new FileWriter("com/lxisoft/movieScript/database/script/script.properties",true),"scripted data");
	}
	public void scriptWriter(String filename)throws Exception
	{
		scriptWriter("person",filename);
		random=new Random();
		int ran=random.nextInt(3);
		p2=new Properties();
		FileReader fr=new FileReader("com/lxisoft/movieScript/database/cast/"+filename+".properties");
		p2.load(fr);
		scriptWriter("dialogue",p2.getProperty("dialogue"+ran+""));
	}
	public void scriptPrinter()throws Exception
	{
		
		p2=new Properties();
		p1=new Properties();
		
		p1.load(new FileInputStream("com/lxisoft/movieScript/database/script/script.properties"));
		p1.list(System.out);
		
	}
	}