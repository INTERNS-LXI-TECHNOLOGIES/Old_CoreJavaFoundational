package com.lxisoft.hashMap;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Tdd
{
	public static void main(String[] args)
	{
		String key=null;
		String price=null;
		HashMap <String,String> m=new HashMap <String,String>(); 
		m.put("Oppo","20000");
		m.put("Samsung","17000");
		m.put("Redmi","15000");
		System.out.println(m.get("Oppo"));
		//m.remove("Oppo");
		System.out.println(m.toString());
	
	}
	
}