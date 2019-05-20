package com.lxisoft.eg;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Tdd
{
	public static void main(String[] args)
	{
		/*Shop shop=new Shop();
		shop.phoneDetails();*/
		TreeSet <Eg> e=new TreeSet <Eg>(new Sort()); 
		Eg e1=new Eg("redmi","15000","7");
		Eg e2=new Eg("redmi","15000","7");
		e.add(e1);
		e.add(e2);
		//System.out.println(p1);
		//System.out.println(p2);
		System.out.println(e.toString());
	
	}
	
}