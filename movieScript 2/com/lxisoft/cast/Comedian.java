package com.lxisoft.cast;
import java.util.*;
import java.io.*;
import com.lxisoft.person.*;

public class Comedian
{
	private String comedianName;
	public Comedian()throws Exception
	{
		comedianDetails();
	}
	public void comedianDetails()throws Exception
	{
		Properties p=new Properties();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Hero Name:");
		comedianName=input.nextLine();
		p.setProperty("Comedian",comedianName);
		p.store(new FileOutputStream("com/lxisoft/cast/castdata/"+comedianName+".properties"),"inserted");
		
	}
}