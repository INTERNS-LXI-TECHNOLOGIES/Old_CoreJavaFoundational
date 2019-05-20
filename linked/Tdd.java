package com.lxisoft.linked;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Tdd
{
	public static void main(String[] args)
	{
		
		/*Shop shop=new Shop();
		shop.phoneDetails();*/
		LinkedHashSet <Linked> l=new LinkedHashSet <Linked>(); 
		Linked l1=new Linked("redmi","15000","7");
		Linked l2=new Linked("edmi","15000","7");
		l.add(l1);
		l.add(l2);
		//System.out.println(p1);
		//System.out.println(p2);
		System.out.println(l.hashCode());
		System.out.println(l.toString());
	}
	
}