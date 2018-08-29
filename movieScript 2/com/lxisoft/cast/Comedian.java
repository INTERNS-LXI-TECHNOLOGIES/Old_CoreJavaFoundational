package com.lxisoft.cast;
import java.util.*;
import java.io.*;
import com.lxisoft.person.*;

public class Comedian
{
	private String comedianName;
	Properties p=new Properties();;
	public Comedian()throws Exception
	{
		comedianDetails();
	}
	public void comedianDetails()throws Exception
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Comedian Name:");
		comedianName=input.nextLine();
		p.setProperty("Comedian",comedianName);
		p.store(new FileOutputStream("com/lxisoft/cast/castdata/Comedian/"+comedianName+".properties"),"inserted");
		
	}
	public void comedianDataView() throws Exception
	{

		FileReader reader=new FileReader("com/lxisoft/cast/castdata/Comedian/"+comedianName+".properties");
		p.load(reader);
		System.out.println(("Comedian:")+p.getProperty("Comedian"));
	}
}