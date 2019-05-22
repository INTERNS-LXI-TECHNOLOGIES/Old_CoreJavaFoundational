package com.lxisoft.collection;
import java.util.*;
import java.io.*;
public class Tdd
{
	public static void main(String [] args)
	{
		TreeSet<Phone> set=new TreeSet<Phone>();
		Phone p1=new Phone("Htc","Desire");
		Phone p2=new Phone("Htc","Desire");
		set.add(p1);
		set.add(p2);
		for(Phone p:set)
		{  
    	System.out.println(p.brand+" "+p.name);  
		}
}
}
