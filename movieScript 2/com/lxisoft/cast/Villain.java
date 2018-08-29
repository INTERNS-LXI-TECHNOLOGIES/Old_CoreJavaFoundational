package com.lxisoft.cast;
import java.util.*;
import java.io.*;
import com.lxisoft.person.*;

public class Villain
{
	private String villainName;
	Properties p=new Properties();;
	public Villain()throws Exception
	{
		villainDetails();
	}
	public void villainDetails()throws Exception
	{
	
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Villain Name:");
		villainName=input.nextLine();
		p.setProperty("Villain",villainName);
		p.store(new FileOutputStream("com/lxisoft/cast/castdata/Villain/"+villainName+".properties"),"inserted");
		
	}
	public void villainDataView() throws Exception
	{
	
		FileReader reader=new FileReader("com/lxisoft/cast/castdata/Villain/"+villainName+".properties");
		p.load(reader);
		System.out.println(("Villain:")+p.getProperty("Villain"));
	}
}