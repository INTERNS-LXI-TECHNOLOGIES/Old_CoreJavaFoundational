package com.lxisoft.movieScript.registerdata.cast;
import java.util.*;
import java.io.*;
public class Cast{
Scanner sc;
Properties p;
String name;
public void dataInput(String temp)throws Exception
{
	p=new Properties();
	sc=new Scanner(System.in); 
	System.out.print("\n\nEnter the name of person:");
	name=sc.nextLine();
	p.setProperty("Name",name);
	System.out.print("\n\n Experince in industry:");
    p.setProperty("Experience",sc.nextLine());
	System.out.print("\n\n Payment amount:");
	p.setProperty("Payment",sc.nextLine());
	System.out.print("\n\n No.of Awards won:");
	p.setProperty("award",sc.nextLine());
	p.store(new FileWriter("com/lxisoft/movieScript/database/cast/"+name+"_"+temp+".properties"),"inserted data");
}
}