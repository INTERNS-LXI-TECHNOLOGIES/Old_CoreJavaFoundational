package com.lxisoft.cast;
import java.util.*;
import java.io.*;
import com.lxisoft.person.*;

public class Heroine
{
	private String heroineName;
	public Heroine()throws Exception
	{
		heroineDetails();
	}
	public void heroineDetails()throws Exception
	{
		Properties p=new Properties();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Heroine Name:");
		heroineName=input.nextLine();
		p.setProperty("Heroine",heroineName);
		p.store(new FileOutputStream("com/lxisoft/cast/castdata/"+heroineName+".properties"),"inserted");
		
	}
}