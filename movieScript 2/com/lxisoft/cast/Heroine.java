package com.lxisoft.cast;
import java.util.*;
import java.io.*;
import com.lxisoft.person.*;

public class Heroine
{
	private String heroineName;
	Properties p=new Properties();;
	public Heroine()throws Exception
	{
		heroineDetails();
	}
	public void heroineDetails()throws Exception
	{

		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Heroine Name:");
		heroineName=input.nextLine();
		p.setProperty("Heroine",heroineName);
		p.store(new FileOutputStream("com/lxisoft/cast/castdata/Heroine/"+heroineName+".properties"),"inserted");
		
	}
	public void heroineDataView() throws Exception
	{

		FileReader reader=new FileReader("com/lxisoft/cast/castdata/Heroine/"+heroineName+".properties");
		p.load(reader);
		System.out.println(("Heroine:")+p.getProperty("Heroine"));
	}
}