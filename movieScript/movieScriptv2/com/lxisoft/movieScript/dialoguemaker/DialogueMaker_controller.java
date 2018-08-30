package com.lxisoft.movieScript.dialoguemaker;
import java.io.*;
import java.util.*;
public class DialogueMaker_controller{
	public static String filename;
	public static String dialoguedata;
	public static Properties p;
	public static Scanner data;
	public static Random r;
	public void dialogueMaker(int selection,String name)throws Exception
	{
		
		switch(selection)
		{
			case 0:
		
			
			case 1:
			filename=filenameFetcher(name,"hero");
			dialogueWriter(filename);
			break;
			case 2:
			filename=filenameFetcher(name,"heroine");
			
			break;
			case 3:
			filename=filenameFetcher(name,"villain");
			
			break;
			case 4:
			filename=filenameFetcher(name,"comedian");
			
			break;
			
		}
	
	}
	public String filenameFetcher(String name,String type)
	{
		return name+"_"+type;
	}
	public void dialogueWriter(String file)throws Exception
	{	p=new Properties();
		data=new Scanner(System.in);
		r=new Random();
		int ran=r.nextInt(10);
		
		p.setProperty("dialogue"+ran+"",data.nextLine());
		p.store(new FileWriter("com/lxisoft/movieScript/database/cast/"+file+".properties",true),"updated data");
		
	}
}