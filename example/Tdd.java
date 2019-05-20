package com.lxisoft.example;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Tdd
{
	public static void main(String[] args)
	{
		
		/*Shop shop=new Shop();
		shop.phoneDetails();*/
		HashSet <Example> e=new HashSet <Example>(); 
		Example e1=new Example("redmi","15000","7");
		Example e2=new Example("redmi","15000","7");
		e.add(e1);
		e.add(e2);
		//System.out.println(p1);
		//System.out.println(p2);
		System.out.println(e.hashCode());
		System.out.println(e.toString());
		/*Iterator itr=e.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
	
	}
	
}